/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.dsl.arduinoml


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ArduinoMLStandaloneSetup extends ArduinoMLStandaloneSetupGenerated {

	def static void doSetup() {
		new ArduinoMLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
