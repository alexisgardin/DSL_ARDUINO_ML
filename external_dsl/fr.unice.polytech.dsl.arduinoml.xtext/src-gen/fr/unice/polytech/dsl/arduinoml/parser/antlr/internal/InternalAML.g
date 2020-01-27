/*
 * generated by Xtext 2.14.0
 */
grammar InternalAML;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package fr.unice.polytech.dsl.arduinoml.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fr.unice.polytech.dsl.arduinoml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.unice.polytech.dsl.arduinoml.services.AMLGrammarAccess;

}

@parser::members {

 	private AMLGrammarAccess grammarAccess;

    public InternalAMLParser(TokenStream input, AMLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "App";
   	}

   	@Override
   	protected AMLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleApp
entryRuleApp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAppRule()); }
	iv_ruleApp=ruleApp
	{ $current=$iv_ruleApp.current; }
	EOF;

// Rule App
ruleApp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='App'
		{
			newLeafNode(otherlv_0, grammarAccess.getAppAccess().getAppKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAppRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"fr.unice.polytech.dsl.arduinoml.AML.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='sensors'
		{
			newLeafNode(otherlv_2, grammarAccess.getAppAccess().getSensorsKeyword_2());
		}
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getAppAccess().getColonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAppAccess().getBricksSensorParserRuleCall_4_0());
				}
				lv_bricks_4_0=ruleSensor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAppRule());
					}
					add(
						$current,
						"bricks",
						lv_bricks_4_0,
						"fr.unice.polytech.dsl.arduinoml.AML.Sensor");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAppAccess().getBricksSensorParserRuleCall_5_0());
				}
				lv_bricks_5_0=ruleSensor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAppRule());
					}
					add(
						$current,
						"bricks",
						lv_bricks_5_0,
						"fr.unice.polytech.dsl.arduinoml.AML.Sensor");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='actuators'
		{
			newLeafNode(otherlv_6, grammarAccess.getAppAccess().getActuatorsKeyword_6());
		}
		otherlv_7=':'
		{
			newLeafNode(otherlv_7, grammarAccess.getAppAccess().getColonKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAppAccess().getBricksActuatorParserRuleCall_8_0());
				}
				lv_bricks_8_0=ruleActuator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAppRule());
					}
					add(
						$current,
						"bricks",
						lv_bricks_8_0,
						"fr.unice.polytech.dsl.arduinoml.AML.Actuator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAppAccess().getBricksActuatorParserRuleCall_9_0());
				}
				lv_bricks_9_0=ruleActuator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAppRule());
					}
					add(
						$current,
						"bricks",
						lv_bricks_9_0,
						"fr.unice.polytech.dsl.arduinoml.AML.Actuator");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_10='states'
		{
			newLeafNode(otherlv_10, grammarAccess.getAppAccess().getStatesKeyword_10());
		}
		otherlv_11=':'
		{
			newLeafNode(otherlv_11, grammarAccess.getAppAccess().getColonKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_12_0());
				}
				lv_states_12_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAppRule());
					}
					add(
						$current,
						"states",
						lv_states_12_0,
						"fr.unice.polytech.dsl.arduinoml.AML.State");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_13_0());
				}
				lv_states_13_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAppRule());
					}
					add(
						$current,
						"states",
						lv_states_13_0,
						"fr.unice.polytech.dsl.arduinoml.AML.State");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_14='initial'
		{
			newLeafNode(otherlv_14, grammarAccess.getAppAccess().getInitialKeyword_14());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAppRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getAppAccess().getInitialStateCrossReference_15_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_0_0());
				}
				lv_name_0_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"fr.unice.polytech.dsl.arduinoml.AML.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_2_0());
				}
				lv_actions_2_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					add(
						$current,
						"actions",
						lv_actions_2_0,
						"fr.unice.polytech.dsl.arduinoml.AML.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0());
				}
				lv_actions_3_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					add(
						$current,
						"actions",
						lv_actions_3_0,
						"fr.unice.polytech.dsl.arduinoml.AML.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getTransitionTransitionParserRuleCall_4_0());
				}
				lv_transition_4_0=ruleTransition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					set(
						$current,
						"transition",
						lv_transition_4_0,
						"fr.unice.polytech.dsl.arduinoml.AML.Transition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getActionAccess().getActionAction_0(),
					$current);
			}
		)
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getActionRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_1_0_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_2='->'
			{
				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getActionAccess().getValueSIGNALEnumRuleCall_1_2_0());
					}
					lv_value_3_0=ruleSIGNAL
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getActionRule());
						}
						set(
							$current,
							"value",
							lv_value_3_0,
							"fr.unice.polytech.dsl.arduinoml.AML.SIGNAL");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current; }
	EOF;

// Rule Transition
ruleTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='if'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getIfKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getSensorSensorCrossReference_1_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='is'
		{
			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getIsKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getValueSIGNALEnumRuleCall_3_0());
				}
				lv_value_3_0=ruleSIGNAL
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionRule());
					}
					set(
						$current,
						"value",
						lv_value_3_0,
						"fr.unice.polytech.dsl.arduinoml.AML.SIGNAL");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='->'
		{
			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getNextStateCrossReference_5_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSensor
entryRuleSensor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSensorRule()); }
	iv_ruleSensor=ruleSensor
	{ $current=$iv_ruleSensor.current; }
	EOF;

// Rule Sensor
ruleSensor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSensorAccess().getSensorAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSensorRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"fr.unice.polytech.dsl.arduinoml.AML.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='->'
		{
			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getHyphenMinusGreaterThanSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSensorAccess().getPinEIntParserRuleCall_3_0());
				}
				lv_pin_3_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSensorRule());
					}
					set(
						$current,
						"pin",
						lv_pin_3_0,
						"fr.unice.polytech.dsl.arduinoml.AML.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleActuator
entryRuleActuator returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActuatorRule()); }
	iv_ruleActuator=ruleActuator
	{ $current=$iv_ruleActuator.current; }
	EOF;

// Rule Actuator
ruleActuator returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getActuatorAccess().getActuatorAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getActuatorAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActuatorRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"fr.unice.polytech.dsl.arduinoml.AML.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='->'
		{
			newLeafNode(otherlv_2, grammarAccess.getActuatorAccess().getHyphenMinusGreaterThanSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getActuatorAccess().getPinEIntParserRuleCall_3_0());
				}
				lv_pin_3_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActuatorRule());
					}
					set(
						$current,
						"pin",
						lv_pin_3_0,
						"fr.unice.polytech.dsl.arduinoml.AML.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Rule SIGNAL
ruleSIGNAL returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='HIGH'
			{
				$current = grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='LOW'
			{
				$current = grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
