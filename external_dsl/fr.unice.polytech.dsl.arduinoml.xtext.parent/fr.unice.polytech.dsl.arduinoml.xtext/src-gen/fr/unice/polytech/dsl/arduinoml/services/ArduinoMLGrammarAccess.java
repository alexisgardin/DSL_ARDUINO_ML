/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.dsl.arduinoml.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ArduinoMLGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.dsl.arduinoml.ArduinoML.Action");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cActionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cValueKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValueSIGNALEnumRuleCall_2_1_0 = (RuleCall)cValueAssignment_2_1.eContents().get(0);
		private final Keyword cActuatorKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cActuatorAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cActuatorActuatorCrossReference_4_0 = (CrossReference)cActuatorAssignment_4.eContents().get(0);
		private final RuleCall cActuatorActuatorEStringParserRuleCall_4_0_1 = (RuleCall)cActuatorActuatorCrossReference_4_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Action:
		//	'Action'
		//	'{' ('value' value=SIGNAL)?
		//	'actuator' actuator=[Actuator|EString]
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Action' '{' ('value' value=SIGNAL)? 'actuator' actuator=[Actuator|EString] '}'
		public Group getGroup() { return cGroup; }
		
		//'Action'
		public Keyword getActionKeyword_0() { return cActionKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//('value' value=SIGNAL)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'value'
		public Keyword getValueKeyword_2_0() { return cValueKeyword_2_0; }
		
		//value=SIGNAL
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }
		
		//SIGNAL
		public RuleCall getValueSIGNALEnumRuleCall_2_1_0() { return cValueSIGNALEnumRuleCall_2_1_0; }
		
		//'actuator'
		public Keyword getActuatorKeyword_3() { return cActuatorKeyword_3; }
		
		//actuator=[Actuator|EString]
		public Assignment getActuatorAssignment_4() { return cActuatorAssignment_4; }
		
		//[Actuator|EString]
		public CrossReference getActuatorActuatorCrossReference_4_0() { return cActuatorActuatorCrossReference_4_0; }
		
		//EString
		public RuleCall getActuatorActuatorEStringParserRuleCall_4_0_1() { return cActuatorActuatorEStringParserRuleCall_4_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class ActuatorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.dsl.arduinoml.ArduinoML.Actuator");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActuatorAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cActuatorKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cPinKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cPinAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cPinEIntParserRuleCall_4_1_0 = (RuleCall)cPinAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Actuator:
		//	{Actuator}
		//	'Actuator'
		//	name=EString
		//	'{' ('pin' pin=EInt)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Actuator} 'Actuator' name=EString '{' ('pin' pin=EInt)? '}'
		public Group getGroup() { return cGroup; }
		
		//{Actuator}
		public Action getActuatorAction_0() { return cActuatorAction_0; }
		
		//'Actuator'
		public Keyword getActuatorKeyword_1() { return cActuatorKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('pin' pin=EInt)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'pin'
		public Keyword getPinKeyword_4_0() { return cPinKeyword_4_0; }
		
		//pin=EInt
		public Assignment getPinAssignment_4_1() { return cPinAssignment_4_1; }
		
		//EInt
		public RuleCall getPinEIntParserRuleCall_4_1_0() { return cPinEIntParserRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.dsl.arduinoml.ArduinoML.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.dsl.arduinoml.ArduinoML.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt ecore::EInt:
		//	'-'? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	
	public class SIGNALElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "fr.unice.polytech.dsl.arduinoml.ArduinoML.SIGNAL");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cHIGHEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cHIGHHIGHKeyword_0_0 = (Keyword)cHIGHEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLOWEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLOWLOWKeyword_1_0 = (Keyword)cLOWEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum SIGNAL:
		//	HIGH | LOW;
		public EnumRule getRule() { return rule; }
		
		//HIGH | LOW
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//HIGH
		public EnumLiteralDeclaration getHIGHEnumLiteralDeclaration_0() { return cHIGHEnumLiteralDeclaration_0; }
		
		//'HIGH'
		public Keyword getHIGHHIGHKeyword_0_0() { return cHIGHHIGHKeyword_0_0; }
		
		//LOW
		public EnumLiteralDeclaration getLOWEnumLiteralDeclaration_1() { return cLOWEnumLiteralDeclaration_1; }
		
		//'LOW'
		public Keyword getLOWLOWKeyword_1_0() { return cLOWLOWKeyword_1_0; }
	}
	
	private final ActionElements pAction;
	private final SIGNALElements eSIGNAL;
	private final ActuatorElements pActuator;
	private final EStringElements pEString;
	private final EIntElements pEInt;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ArduinoMLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pAction = new ActionElements();
		this.eSIGNAL = new SIGNALElements();
		this.pActuator = new ActuatorElements();
		this.pEString = new EStringElements();
		this.pEInt = new EIntElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.unice.polytech.dsl.arduinoml.ArduinoML".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Action:
	//	'Action'
	//	'{' ('value' value=SIGNAL)?
	//	'actuator' actuator=[Actuator|EString]
	//	'}';
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//enum SIGNAL:
	//	HIGH | LOW;
	public SIGNALElements getSIGNALAccess() {
		return eSIGNAL;
	}
	
	public EnumRule getSIGNALRule() {
		return getSIGNALAccess().getRule();
	}
	
	//Actuator:
	//	{Actuator}
	//	'Actuator'
	//	name=EString
	//	'{' ('pin' pin=EInt)?
	//	'}';
	public ActuatorElements getActuatorAccess() {
		return pActuator;
	}
	
	public ParserRule getActuatorRule() {
		return getActuatorAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	'-'? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}