/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.dsl.arduinoml.ide

import com.google.inject.Guice
import fr.unice.polytech.dsl.arduinoml.ArduinoMLRuntimeModule
import fr.unice.polytech.dsl.arduinoml.ArduinoMLStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ArduinoMLIdeSetup extends ArduinoMLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ArduinoMLRuntimeModule, new ArduinoMLIdeModule))
	}
	
}