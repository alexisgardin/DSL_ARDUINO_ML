/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.dsl.arduinoml.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.unice.polytech.dsl.arduinoml.ide.contentassist.antlr.internal.InternalAMLParser;
import fr.unice.polytech.dsl.arduinoml.services.AMLGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class AMLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(AMLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, AMLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getStateAccess().getActionsAlternatives_2_0(), "rule__State__ActionsAlternatives_2_0");
			builder.put(grammarAccess.getStateAccess().getActionsAlternatives_3_0(), "rule__State__ActionsAlternatives_3_0");
			builder.put(grammarAccess.getMultipleElementConditionAccess().getConditionsAlternatives_1_0(), "rule__MultipleElementCondition__ConditionsAlternatives_1_0");
			builder.put(grammarAccess.getMultipleElementConditionAccess().getConditionsAlternatives_2_1_0(), "rule__MultipleElementCondition__ConditionsAlternatives_2_1_0");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getSIGNALAccess().getAlternatives(), "rule__SIGNAL__Alternatives");
			builder.put(grammarAccess.getOPERATORAccess().getAlternatives(), "rule__OPERATOR__Alternatives");
			builder.put(grammarAccess.getCOMPARATORAccess().getAlternatives(), "rule__COMPARATOR__Alternatives");
			builder.put(grammarAccess.getAppAccess().getGroup(), "rule__App__Group__0");
			builder.put(grammarAccess.getAppAccess().getGroup_4(), "rule__App__Group_4__0");
			builder.put(grammarAccess.getAppAccess().getGroup_5(), "rule__App__Group_5__0");
			builder.put(grammarAccess.getAppAccess().getGroup_8(), "rule__App__Group_8__0");
			builder.put(grammarAccess.getAppAccess().getGroup_9(), "rule__App__Group_9__0");
			builder.put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
			builder.put(grammarAccess.getBinaryActionAccess().getGroup(), "rule__BinaryAction__Group__0");
			builder.put(grammarAccess.getBinaryActionAccess().getGroup_1(), "rule__BinaryAction__Group_1__0");
			builder.put(grammarAccess.getAnalogActionAccess().getGroup(), "rule__AnalogAction__Group__0");
			builder.put(grammarAccess.getAnalogActionAccess().getGroup_1(), "rule__AnalogAction__Group_1__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
			builder.put(grammarAccess.getMultipleElementConditionAccess().getGroup(), "rule__MultipleElementCondition__Group__0");
			builder.put(grammarAccess.getMultipleElementConditionAccess().getGroup_2(), "rule__MultipleElementCondition__Group_2__0");
			builder.put(grammarAccess.getSingleElementConditionAccess().getGroup(), "rule__SingleElementCondition__Group__0");
			builder.put(grammarAccess.getValueElementConditionAccess().getGroup(), "rule__ValueElementCondition__Group__0");
			builder.put(grammarAccess.getBinarySensorAccess().getGroup(), "rule__BinarySensor__Group__0");
			builder.put(grammarAccess.getAnalogSensorAccess().getGroup(), "rule__AnalogSensor__Group__0");
			builder.put(grammarAccess.getAnalogActuatorAccess().getGroup(), "rule__AnalogActuator__Group__0");
			builder.put(grammarAccess.getBinaryActuatorAccess().getGroup(), "rule__BinaryActuator__Group__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getEFloatAccess().getGroup(), "rule__EFloat__Group__0");
			builder.put(grammarAccess.getEFloatAccess().getGroup_1(), "rule__EFloat__Group_1__0");
			builder.put(grammarAccess.getAppAccess().getNameAssignment_1(), "rule__App__NameAssignment_1");
			builder.put(grammarAccess.getAppAccess().getBricksAssignment_4_2(), "rule__App__BricksAssignment_4_2");
			builder.put(grammarAccess.getAppAccess().getBricksAssignment_4_3(), "rule__App__BricksAssignment_4_3");
			builder.put(grammarAccess.getAppAccess().getBricksAssignment_5_2(), "rule__App__BricksAssignment_5_2");
			builder.put(grammarAccess.getAppAccess().getBricksAssignment_5_3(), "rule__App__BricksAssignment_5_3");
			builder.put(grammarAccess.getAppAccess().getBricksAssignment_8_2(), "rule__App__BricksAssignment_8_2");
			builder.put(grammarAccess.getAppAccess().getBricksAssignment_8_3(), "rule__App__BricksAssignment_8_3");
			builder.put(grammarAccess.getAppAccess().getBricksAssignment_9_2(), "rule__App__BricksAssignment_9_2");
			builder.put(grammarAccess.getAppAccess().getBricksAssignment_9_3(), "rule__App__BricksAssignment_9_3");
			builder.put(grammarAccess.getAppAccess().getStatesAssignment_12(), "rule__App__StatesAssignment_12");
			builder.put(grammarAccess.getAppAccess().getStatesAssignment_13(), "rule__App__StatesAssignment_13");
			builder.put(grammarAccess.getAppAccess().getInitialAssignment_15(), "rule__App__InitialAssignment_15");
			builder.put(grammarAccess.getStateAccess().getNameAssignment_0(), "rule__State__NameAssignment_0");
			builder.put(grammarAccess.getStateAccess().getActionsAssignment_2(), "rule__State__ActionsAssignment_2");
			builder.put(grammarAccess.getStateAccess().getActionsAssignment_3(), "rule__State__ActionsAssignment_3");
			builder.put(grammarAccess.getStateAccess().getTransitionAssignment_4(), "rule__State__TransitionAssignment_4");
			builder.put(grammarAccess.getBinaryActionAccess().getActuatorAssignment_1_0(), "rule__BinaryAction__ActuatorAssignment_1_0");
			builder.put(grammarAccess.getBinaryActionAccess().getActionValueAssignment_1_2(), "rule__BinaryAction__ActionValueAssignment_1_2");
			builder.put(grammarAccess.getAnalogActionAccess().getActuatorAssignment_1_0(), "rule__AnalogAction__ActuatorAssignment_1_0");
			builder.put(grammarAccess.getAnalogActionAccess().getActionValueAssignment_1_2(), "rule__AnalogAction__ActionValueAssignment_1_2");
			builder.put(grammarAccess.getTransitionAccess().getConditionAssignment_2(), "rule__Transition__ConditionAssignment_2");
			builder.put(grammarAccess.getTransitionAccess().getNextAssignment_4(), "rule__Transition__NextAssignment_4");
			builder.put(grammarAccess.getMultipleElementConditionAccess().getConditionsAssignment_1(), "rule__MultipleElementCondition__ConditionsAssignment_1");
			builder.put(grammarAccess.getMultipleElementConditionAccess().getOperatorsAssignment_2_0(), "rule__MultipleElementCondition__OperatorsAssignment_2_0");
			builder.put(grammarAccess.getMultipleElementConditionAccess().getConditionsAssignment_2_1(), "rule__MultipleElementCondition__ConditionsAssignment_2_1");
			builder.put(grammarAccess.getSingleElementConditionAccess().getSensorAssignment_1(), "rule__SingleElementCondition__SensorAssignment_1");
			builder.put(grammarAccess.getSingleElementConditionAccess().getValueAssignment_3(), "rule__SingleElementCondition__ValueAssignment_3");
			builder.put(grammarAccess.getValueElementConditionAccess().getSensorAssignment_1(), "rule__ValueElementCondition__SensorAssignment_1");
			builder.put(grammarAccess.getValueElementConditionAccess().getComparatorAssignment_2(), "rule__ValueElementCondition__ComparatorAssignment_2");
			builder.put(grammarAccess.getValueElementConditionAccess().getValueAssignment_3(), "rule__ValueElementCondition__ValueAssignment_3");
			builder.put(grammarAccess.getBinarySensorAccess().getNameAssignment_1(), "rule__BinarySensor__NameAssignment_1");
			builder.put(grammarAccess.getBinarySensorAccess().getPinAssignment_3(), "rule__BinarySensor__PinAssignment_3");
			builder.put(grammarAccess.getAnalogSensorAccess().getNameAssignment_1(), "rule__AnalogSensor__NameAssignment_1");
			builder.put(grammarAccess.getAnalogSensorAccess().getPinAssignment_3(), "rule__AnalogSensor__PinAssignment_3");
			builder.put(grammarAccess.getAnalogActuatorAccess().getNameAssignment_1(), "rule__AnalogActuator__NameAssignment_1");
			builder.put(grammarAccess.getAnalogActuatorAccess().getPinAssignment_3(), "rule__AnalogActuator__PinAssignment_3");
			builder.put(grammarAccess.getBinaryActuatorAccess().getNameAssignment_1(), "rule__BinaryActuator__NameAssignment_1");
			builder.put(grammarAccess.getBinaryActuatorAccess().getPinAssignment_3(), "rule__BinaryActuator__PinAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private AMLGrammarAccess grammarAccess;

	@Override
	protected InternalAMLParser createParser() {
		InternalAMLParser result = new InternalAMLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
