/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.dsl.arduinoml.serializer;

import com.google.inject.Inject;
import fr.unice.polytech.dsl.arduinoml.Actuator;
import fr.unice.polytech.dsl.arduinoml.ArduinomlPackage;
import fr.unice.polytech.dsl.arduinoml.services.ArduinoMLGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class ArduinoMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ArduinoMLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ArduinomlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ArduinomlPackage.ACTION:
				sequence_Action(context, (fr.unice.polytech.dsl.arduinoml.Action) semanticObject); 
				return; 
			case ArduinomlPackage.ACTUATOR:
				sequence_Actuator(context, (Actuator) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (value=SIGNAL? actuator=[Actuator|EString])
	 */
	protected void sequence_Action(ISerializationContext context, fr.unice.polytech.dsl.arduinoml.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Actuator returns Actuator
	 *
	 * Constraint:
	 *     (name=EString pin=EInt?)
	 */
	protected void sequence_Actuator(ISerializationContext context, Actuator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}