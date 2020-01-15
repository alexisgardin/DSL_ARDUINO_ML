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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'App'", "'{'", "'sensors'", "'['", "','", "']'", "'actuators'", "'states'", "'initial'", "'}'", "'State'", "'actions'", "'transition'", "'Action'", "'value'", "'actuator'", "'Transition'", "'sensor'", "'next'", "'Sensor'", "'pin'", "'Actuator'", "'-'", "'HIGH'", "'LOW'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAML.g"; }



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




    // $ANTLR start "entryRuleApp"
    // InternalAML.g:65:1: entryRuleApp returns [EObject current=null] : iv_ruleApp= ruleApp EOF ;
    public final EObject entryRuleApp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApp = null;


        try {
            // InternalAML.g:65:44: (iv_ruleApp= ruleApp EOF )
            // InternalAML.g:66:2: iv_ruleApp= ruleApp EOF
            {
             newCompositeNode(grammarAccess.getAppRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApp=ruleApp();

            state._fsp--;

             current =iv_ruleApp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApp"


    // $ANTLR start "ruleApp"
    // InternalAML.g:72:1: ruleApp returns [EObject current=null] : (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sensors' otherlv_4= '[' ( (lv_bricks_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_bricks_7_0= ruleSensor ) ) )* otherlv_8= ']' otherlv_9= 'actuators' otherlv_10= '[' ( (lv_bricks_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_bricks_13_0= ruleActuator ) ) )* otherlv_14= ']' otherlv_15= 'states' otherlv_16= '[' ( (lv_states_17_0= ruleState ) ) (otherlv_18= ',' ( (lv_states_19_0= ruleState ) ) )* otherlv_20= ']' otherlv_21= 'initial' ( ( ruleEString ) ) otherlv_23= '}' ) ;
    public final EObject ruleApp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_bricks_5_0 = null;

        EObject lv_bricks_7_0 = null;

        EObject lv_bricks_11_0 = null;

        EObject lv_bricks_13_0 = null;

        EObject lv_states_17_0 = null;

        EObject lv_states_19_0 = null;



        	enterRule();

        try {
            // InternalAML.g:78:2: ( (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sensors' otherlv_4= '[' ( (lv_bricks_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_bricks_7_0= ruleSensor ) ) )* otherlv_8= ']' otherlv_9= 'actuators' otherlv_10= '[' ( (lv_bricks_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_bricks_13_0= ruleActuator ) ) )* otherlv_14= ']' otherlv_15= 'states' otherlv_16= '[' ( (lv_states_17_0= ruleState ) ) (otherlv_18= ',' ( (lv_states_19_0= ruleState ) ) )* otherlv_20= ']' otherlv_21= 'initial' ( ( ruleEString ) ) otherlv_23= '}' ) )
            // InternalAML.g:79:2: (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sensors' otherlv_4= '[' ( (lv_bricks_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_bricks_7_0= ruleSensor ) ) )* otherlv_8= ']' otherlv_9= 'actuators' otherlv_10= '[' ( (lv_bricks_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_bricks_13_0= ruleActuator ) ) )* otherlv_14= ']' otherlv_15= 'states' otherlv_16= '[' ( (lv_states_17_0= ruleState ) ) (otherlv_18= ',' ( (lv_states_19_0= ruleState ) ) )* otherlv_20= ']' otherlv_21= 'initial' ( ( ruleEString ) ) otherlv_23= '}' )
            {
            // InternalAML.g:79:2: (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sensors' otherlv_4= '[' ( (lv_bricks_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_bricks_7_0= ruleSensor ) ) )* otherlv_8= ']' otherlv_9= 'actuators' otherlv_10= '[' ( (lv_bricks_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_bricks_13_0= ruleActuator ) ) )* otherlv_14= ']' otherlv_15= 'states' otherlv_16= '[' ( (lv_states_17_0= ruleState ) ) (otherlv_18= ',' ( (lv_states_19_0= ruleState ) ) )* otherlv_20= ']' otherlv_21= 'initial' ( ( ruleEString ) ) otherlv_23= '}' )
            // InternalAML.g:80:3: otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'sensors' otherlv_4= '[' ( (lv_bricks_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_bricks_7_0= ruleSensor ) ) )* otherlv_8= ']' otherlv_9= 'actuators' otherlv_10= '[' ( (lv_bricks_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_bricks_13_0= ruleActuator ) ) )* otherlv_14= ']' otherlv_15= 'states' otherlv_16= '[' ( (lv_states_17_0= ruleState ) ) (otherlv_18= ',' ( (lv_states_19_0= ruleState ) ) )* otherlv_20= ']' otherlv_21= 'initial' ( ( ruleEString ) ) otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAppAccess().getAppKeyword_0());
            		
            // InternalAML.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAML.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalAML.g:85:4: (lv_name_1_0= ruleEString )
            // InternalAML.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAppAccess().getSensorsKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getAppAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalAML.g:115:3: ( (lv_bricks_5_0= ruleSensor ) )
            // InternalAML.g:116:4: (lv_bricks_5_0= ruleSensor )
            {
            // InternalAML.g:116:4: (lv_bricks_5_0= ruleSensor )
            // InternalAML.g:117:5: lv_bricks_5_0= ruleSensor
            {

            					newCompositeNode(grammarAccess.getAppAccess().getBricksSensorParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_bricks_5_0=ruleSensor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					add(
            						current,
            						"bricks",
            						lv_bricks_5_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.Sensor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAML.g:134:3: (otherlv_6= ',' ( (lv_bricks_7_0= ruleSensor ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAML.g:135:4: otherlv_6= ',' ( (lv_bricks_7_0= ruleSensor ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_6, grammarAccess.getAppAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalAML.g:139:4: ( (lv_bricks_7_0= ruleSensor ) )
            	    // InternalAML.g:140:5: (lv_bricks_7_0= ruleSensor )
            	    {
            	    // InternalAML.g:140:5: (lv_bricks_7_0= ruleSensor )
            	    // InternalAML.g:141:6: lv_bricks_7_0= ruleSensor
            	    {

            	    						newCompositeNode(grammarAccess.getAppAccess().getBricksSensorParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_bricks_7_0=ruleSensor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAppRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bricks",
            	    							lv_bricks_7_0,
            	    							"fr.unice.polytech.dsl.arduinoml.AML.Sensor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getAppAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getAppAccess().getActuatorsKeyword_8());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getAppAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalAML.g:171:3: ( (lv_bricks_11_0= ruleActuator ) )
            // InternalAML.g:172:4: (lv_bricks_11_0= ruleActuator )
            {
            // InternalAML.g:172:4: (lv_bricks_11_0= ruleActuator )
            // InternalAML.g:173:5: lv_bricks_11_0= ruleActuator
            {

            					newCompositeNode(grammarAccess.getAppAccess().getBricksActuatorParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_8);
            lv_bricks_11_0=ruleActuator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					add(
            						current,
            						"bricks",
            						lv_bricks_11_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.Actuator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAML.g:190:3: (otherlv_12= ',' ( (lv_bricks_13_0= ruleActuator ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAML.g:191:4: otherlv_12= ',' ( (lv_bricks_13_0= ruleActuator ) )
            	    {
            	    otherlv_12=(Token)match(input,15,FOLLOW_10); 

            	    				newLeafNode(otherlv_12, grammarAccess.getAppAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalAML.g:195:4: ( (lv_bricks_13_0= ruleActuator ) )
            	    // InternalAML.g:196:5: (lv_bricks_13_0= ruleActuator )
            	    {
            	    // InternalAML.g:196:5: (lv_bricks_13_0= ruleActuator )
            	    // InternalAML.g:197:6: lv_bricks_13_0= ruleActuator
            	    {

            	    						newCompositeNode(grammarAccess.getAppAccess().getBricksActuatorParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_bricks_13_0=ruleActuator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAppRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bricks",
            	    							lv_bricks_13_0,
            	    							"fr.unice.polytech.dsl.arduinoml.AML.Actuator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_14=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_14, grammarAccess.getAppAccess().getRightSquareBracketKeyword_12());
            		
            otherlv_15=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_15, grammarAccess.getAppAccess().getStatesKeyword_13());
            		
            otherlv_16=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_16, grammarAccess.getAppAccess().getLeftSquareBracketKeyword_14());
            		
            // InternalAML.g:227:3: ( (lv_states_17_0= ruleState ) )
            // InternalAML.g:228:4: (lv_states_17_0= ruleState )
            {
            // InternalAML.g:228:4: (lv_states_17_0= ruleState )
            // InternalAML.g:229:5: lv_states_17_0= ruleState
            {

            					newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_8);
            lv_states_17_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_17_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAML.g:246:3: (otherlv_18= ',' ( (lv_states_19_0= ruleState ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAML.g:247:4: otherlv_18= ',' ( (lv_states_19_0= ruleState ) )
            	    {
            	    otherlv_18=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_18, grammarAccess.getAppAccess().getCommaKeyword_16_0());
            	    			
            	    // InternalAML.g:251:4: ( (lv_states_19_0= ruleState ) )
            	    // InternalAML.g:252:5: (lv_states_19_0= ruleState )
            	    {
            	    // InternalAML.g:252:5: (lv_states_19_0= ruleState )
            	    // InternalAML.g:253:6: lv_states_19_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_16_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_states_19_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAppRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_19_0,
            	    							"fr.unice.polytech.dsl.arduinoml.AML.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_20=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_20, grammarAccess.getAppAccess().getRightSquareBracketKeyword_17());
            		
            otherlv_21=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_21, grammarAccess.getAppAccess().getInitialKeyword_18());
            		
            // InternalAML.g:279:3: ( ( ruleEString ) )
            // InternalAML.g:280:4: ( ruleEString )
            {
            // InternalAML.g:280:4: ( ruleEString )
            // InternalAML.g:281:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAppRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAppAccess().getInitialStateCrossReference_19_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_23=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getAppAccess().getRightCurlyBracketKeyword_20());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApp"


    // $ANTLR start "entryRuleState"
    // InternalAML.g:303:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalAML.g:303:46: (iv_ruleState= ruleState EOF )
            // InternalAML.g:304:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalAML.g:310:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '[' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= ']' otherlv_9= 'transition' ( (lv_transition_10_0= ruleTransition ) ) otherlv_11= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_actions_5_0 = null;

        EObject lv_actions_7_0 = null;

        EObject lv_transition_10_0 = null;



        	enterRule();

        try {
            // InternalAML.g:316:2: ( (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '[' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= ']' otherlv_9= 'transition' ( (lv_transition_10_0= ruleTransition ) ) otherlv_11= '}' ) )
            // InternalAML.g:317:2: (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '[' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= ']' otherlv_9= 'transition' ( (lv_transition_10_0= ruleTransition ) ) otherlv_11= '}' )
            {
            // InternalAML.g:317:2: (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '[' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= ']' otherlv_9= 'transition' ( (lv_transition_10_0= ruleTransition ) ) otherlv_11= '}' )
            // InternalAML.g:318:3: otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '[' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= ']' otherlv_9= 'transition' ( (lv_transition_10_0= ruleTransition ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalAML.g:322:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAML.g:323:4: (lv_name_1_0= ruleEString )
            {
            // InternalAML.g:323:4: (lv_name_1_0= ruleEString )
            // InternalAML.g:324:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getActionsKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getStateAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalAML.g:353:3: ( (lv_actions_5_0= ruleAction ) )
            // InternalAML.g:354:4: (lv_actions_5_0= ruleAction )
            {
            // InternalAML.g:354:4: (lv_actions_5_0= ruleAction )
            // InternalAML.g:355:5: lv_actions_5_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_actions_5_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_5_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAML.g:372:3: (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAML.g:373:4: otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_16); 

            	    				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalAML.g:377:4: ( (lv_actions_7_0= ruleAction ) )
            	    // InternalAML.g:378:5: (lv_actions_7_0= ruleAction )
            	    {
            	    // InternalAML.g:378:5: (lv_actions_7_0= ruleAction )
            	    // InternalAML.g:379:6: lv_actions_7_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_actions_7_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_7_0,
            	    							"fr.unice.polytech.dsl.arduinoml.AML.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getStateAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getStateAccess().getTransitionKeyword_8());
            		
            // InternalAML.g:405:3: ( (lv_transition_10_0= ruleTransition ) )
            // InternalAML.g:406:4: (lv_transition_10_0= ruleTransition )
            {
            // InternalAML.g:406:4: (lv_transition_10_0= ruleTransition )
            // InternalAML.g:407:5: lv_transition_10_0= ruleTransition
            {

            					newCompositeNode(grammarAccess.getStateAccess().getTransitionTransitionParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_14);
            lv_transition_10_0=ruleTransition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"transition",
            						lv_transition_10_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.Transition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleAction"
    // InternalAML.g:432:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalAML.g:432:47: (iv_ruleAction= ruleAction EOF )
            // InternalAML.g:433:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalAML.g:439:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAML.g:445:2: ( (otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalAML.g:446:2: (otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalAML.g:446:2: (otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalAML.g:447:3: otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAML.g:455:3: (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAML.g:456:4: otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getValueKeyword_2_0());
                    			
                    // InternalAML.g:460:4: ( (lv_value_3_0= ruleSIGNAL ) )
                    // InternalAML.g:461:5: (lv_value_3_0= ruleSIGNAL )
                    {
                    // InternalAML.g:461:5: (lv_value_3_0= ruleSIGNAL )
                    // InternalAML.g:462:6: lv_value_3_0= ruleSIGNAL
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getValueSIGNALEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_value_3_0=ruleSIGNAL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"fr.unice.polytech.dsl.arduinoml.AML.SIGNAL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getActuatorKeyword_3());
            		
            // InternalAML.g:484:3: ( ( ruleEString ) )
            // InternalAML.g:485:4: ( ruleEString )
            {
            // InternalAML.g:485:4: ( ruleEString )
            // InternalAML.g:486:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_4_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleTransition"
    // InternalAML.g:508:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalAML.g:508:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalAML.g:509:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalAML.g:515:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'Transition' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleSIGNAL ) ) )? otherlv_5= 'sensor' ( ( ruleEString ) ) otherlv_7= 'next' ( ( ruleEString ) ) otherlv_9= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalAML.g:521:2: ( ( () otherlv_1= 'Transition' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleSIGNAL ) ) )? otherlv_5= 'sensor' ( ( ruleEString ) ) otherlv_7= 'next' ( ( ruleEString ) ) otherlv_9= '}' ) )
            // InternalAML.g:522:2: ( () otherlv_1= 'Transition' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleSIGNAL ) ) )? otherlv_5= 'sensor' ( ( ruleEString ) ) otherlv_7= 'next' ( ( ruleEString ) ) otherlv_9= '}' )
            {
            // InternalAML.g:522:2: ( () otherlv_1= 'Transition' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleSIGNAL ) ) )? otherlv_5= 'sensor' ( ( ruleEString ) ) otherlv_7= 'next' ( ( ruleEString ) ) otherlv_9= '}' )
            // InternalAML.g:523:3: () otherlv_1= 'Transition' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleSIGNAL ) ) )? otherlv_5= 'sensor' ( ( ruleEString ) ) otherlv_7= 'next' ( ( ruleEString ) ) otherlv_9= '}'
            {
            // InternalAML.g:523:3: ()
            // InternalAML.g:524:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTransitionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAML.g:538:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleSIGNAL ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAML.g:539:4: otherlv_3= 'value' ( (lv_value_4_0= ruleSIGNAL ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getValueKeyword_3_0());
                    			
                    // InternalAML.g:543:4: ( (lv_value_4_0= ruleSIGNAL ) )
                    // InternalAML.g:544:5: (lv_value_4_0= ruleSIGNAL )
                    {
                    // InternalAML.g:544:5: (lv_value_4_0= ruleSIGNAL )
                    // InternalAML.g:545:6: lv_value_4_0= ruleSIGNAL
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getValueSIGNALEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_value_4_0=ruleSIGNAL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"fr.unice.polytech.dsl.arduinoml.AML.SIGNAL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getSensorKeyword_4());
            		
            // InternalAML.g:567:3: ( ( ruleEString ) )
            // InternalAML.g:568:4: ( ruleEString )
            {
            // InternalAML.g:568:4: ( ruleEString )
            // InternalAML.g:569:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getSensorSensorCrossReference_5_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getNextKeyword_6());
            		
            // InternalAML.g:587:3: ( ( ruleEString ) )
            // InternalAML.g:588:4: ( ruleEString )
            {
            // InternalAML.g:588:4: ( ruleEString )
            // InternalAML.g:589:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getNextStateCrossReference_7_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleSensor"
    // InternalAML.g:611:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalAML.g:611:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalAML.g:612:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalAML.g:618:1: ruleSensor returns [EObject current=null] : ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) otherlv_6= '}' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_pin_5_0 = null;



        	enterRule();

        try {
            // InternalAML.g:624:2: ( ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) otherlv_6= '}' ) )
            // InternalAML.g:625:2: ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) otherlv_6= '}' )
            {
            // InternalAML.g:625:2: ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) otherlv_6= '}' )
            // InternalAML.g:626:3: () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) otherlv_6= '}'
            {
            // InternalAML.g:626:3: ()
            // InternalAML.g:627:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorAccess().getSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
            		
            // InternalAML.g:637:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAML.g:638:4: (lv_name_2_0= ruleEString )
            {
            // InternalAML.g:638:4: (lv_name_2_0= ruleEString )
            // InternalAML.g:639:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getPinKeyword_4());
            		
            // InternalAML.g:664:3: ( (lv_pin_5_0= ruleEInt ) )
            // InternalAML.g:665:4: (lv_pin_5_0= ruleEInt )
            {
            // InternalAML.g:665:4: (lv_pin_5_0= ruleEInt )
            // InternalAML.g:666:5: lv_pin_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getPinEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_pin_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"pin",
            						lv_pin_5_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActuator"
    // InternalAML.g:691:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalAML.g:691:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalAML.g:692:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalAML.g:698:1: ruleActuator returns [EObject current=null] : ( () otherlv_1= 'Actuator' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) otherlv_6= '}' ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_pin_5_0 = null;



        	enterRule();

        try {
            // InternalAML.g:704:2: ( ( () otherlv_1= 'Actuator' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) otherlv_6= '}' ) )
            // InternalAML.g:705:2: ( () otherlv_1= 'Actuator' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) otherlv_6= '}' )
            {
            // InternalAML.g:705:2: ( () otherlv_1= 'Actuator' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) otherlv_6= '}' )
            // InternalAML.g:706:3: () otherlv_1= 'Actuator' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) otherlv_6= '}'
            {
            // InternalAML.g:706:3: ()
            // InternalAML.g:707:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActuatorAccess().getActuatorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActuatorAccess().getActuatorKeyword_1());
            		
            // InternalAML.g:717:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAML.g:718:4: (lv_name_2_0= ruleEString )
            {
            // InternalAML.g:718:4: (lv_name_2_0= ruleEString )
            // InternalAML.g:719:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getActuatorAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getActuatorAccess().getPinKeyword_4());
            		
            // InternalAML.g:744:3: ( (lv_pin_5_0= ruleEInt ) )
            // InternalAML.g:745:4: (lv_pin_5_0= ruleEInt )
            {
            // InternalAML.g:745:4: (lv_pin_5_0= ruleEInt )
            // InternalAML.g:746:5: lv_pin_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getPinEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_pin_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorRule());
            					}
            					set(
            						current,
            						"pin",
            						lv_pin_5_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getActuatorAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleEString"
    // InternalAML.g:771:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAML.g:771:47: (iv_ruleEString= ruleEString EOF )
            // InternalAML.g:772:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalAML.g:778:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAML.g:784:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAML.g:785:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAML.g:785:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAML.g:786:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAML.g:794:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalAML.g:805:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalAML.g:805:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalAML.g:806:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalAML.g:812:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalAML.g:818:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalAML.g:819:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalAML.g:819:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalAML.g:820:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalAML.g:820:3: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAML.g:821:4: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_27); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleSIGNAL"
    // InternalAML.g:838:1: ruleSIGNAL returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) ;
    public final Enumerator ruleSIGNAL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAML.g:844:2: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) )
            // InternalAML.g:845:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            {
            // InternalAML.g:845:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            else if ( (LA9_0==35) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAML.g:846:3: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalAML.g:846:3: (enumLiteral_0= 'HIGH' )
                    // InternalAML.g:847:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAML.g:854:3: (enumLiteral_1= 'LOW' )
                    {
                    // InternalAML.g:854:3: (enumLiteral_1= 'LOW' )
                    // InternalAML.g:855:4: enumLiteral_1= 'LOW'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSIGNAL"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});

}