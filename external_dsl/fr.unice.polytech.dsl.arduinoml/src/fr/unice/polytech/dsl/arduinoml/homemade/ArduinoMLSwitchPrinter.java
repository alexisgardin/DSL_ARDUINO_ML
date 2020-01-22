package fr.unice.polytech.dsl.arduinoml.homemade;

import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import fr.unice.polytech.dsl.arduinoml.*;
import fr.unice.polytech.dsl.arduinoml.App;
import fr.unice.polytech.dsl.arduinoml.util.ArduinomlSwitch;
import io.github.mosser.arduinoml.kernel.generator.ToWiring;
import io.github.mosser.arduinoml.kernel.generator.Visitor;

public class ArduinoMLSwitchPrinter extends ArduinomlSwitch<String> {

	private KernelAdapter kernelAdapter = new KernelAdapter();
	
	@Override
	protected String doSwitch(int classifierID, EObject theEObject) {
		if (classifierID == ArduinomlPackage.APP) {
			App app = (App) theEObject;
			String result = caseApp(app);
			return result;
		} else {
			return "";
		}
	}
	
	public String caseApp(App object) {
		System.out.println("The app name is : " + object.getName());
		io.github.mosser.arduinoml.kernel.App kernelApp = new io.github.mosser.arduinoml.kernel.App();
		kernelApp.setName(object.getName());
		kernelApp.setBricks(
				object.getBricks()
					.stream()
					.map(kernelAdapter::mapBrick)
					.collect(Collectors.toList()));
		kernelApp.setStates(kernelAdapter.mapStateList(object.getStates()));
		kernelApp.setInitial(
				kernelApp.getStates()
				.stream()
				.filter(state -> state.getName().equals(object.getInitial().getName()))
				.findFirst()
				.get());
		
		Visitor<StringBuffer> generator = new ToWiring();
		kernelApp.accept(generator);
		
		String arduinoCode = generator.getResult().toString();
		System.out.println(arduinoCode);
		return arduinoCode;
	}
	
}
