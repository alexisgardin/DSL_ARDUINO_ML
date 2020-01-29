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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'App'", "'sensors'", "':'", "'actuators'", "'states'", "'initial'", "'->'", "'if'", "'is'", "'-'", "'HIGH'", "'LOW'", "'and'", "'or'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
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
    // InternalAML.g:72:1: ruleApp returns [EObject current=null] : (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'sensors' otherlv_3= ':' ( (lv_bricks_4_0= ruleSensor ) ) ( (lv_bricks_5_0= ruleSensor ) )* otherlv_6= 'actuators' otherlv_7= ':' ( (lv_bricks_8_0= ruleActuator ) ) ( (lv_bricks_9_0= ruleActuator ) )* otherlv_10= 'states' otherlv_11= ':' ( (lv_states_12_0= ruleState ) ) ( (lv_states_13_0= ruleState ) )* otherlv_14= 'initial' ( ( ruleEString ) ) ) ;
    public final EObject ruleApp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_bricks_4_0 = null;

        EObject lv_bricks_5_0 = null;

        EObject lv_bricks_8_0 = null;

        EObject lv_bricks_9_0 = null;

        EObject lv_states_12_0 = null;

        EObject lv_states_13_0 = null;



        	enterRule();

        try {
            // InternalAML.g:78:2: ( (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'sensors' otherlv_3= ':' ( (lv_bricks_4_0= ruleSensor ) ) ( (lv_bricks_5_0= ruleSensor ) )* otherlv_6= 'actuators' otherlv_7= ':' ( (lv_bricks_8_0= ruleActuator ) ) ( (lv_bricks_9_0= ruleActuator ) )* otherlv_10= 'states' otherlv_11= ':' ( (lv_states_12_0= ruleState ) ) ( (lv_states_13_0= ruleState ) )* otherlv_14= 'initial' ( ( ruleEString ) ) ) )
            // InternalAML.g:79:2: (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'sensors' otherlv_3= ':' ( (lv_bricks_4_0= ruleSensor ) ) ( (lv_bricks_5_0= ruleSensor ) )* otherlv_6= 'actuators' otherlv_7= ':' ( (lv_bricks_8_0= ruleActuator ) ) ( (lv_bricks_9_0= ruleActuator ) )* otherlv_10= 'states' otherlv_11= ':' ( (lv_states_12_0= ruleState ) ) ( (lv_states_13_0= ruleState ) )* otherlv_14= 'initial' ( ( ruleEString ) ) )
            {
            // InternalAML.g:79:2: (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'sensors' otherlv_3= ':' ( (lv_bricks_4_0= ruleSensor ) ) ( (lv_bricks_5_0= ruleSensor ) )* otherlv_6= 'actuators' otherlv_7= ':' ( (lv_bricks_8_0= ruleActuator ) ) ( (lv_bricks_9_0= ruleActuator ) )* otherlv_10= 'states' otherlv_11= ':' ( (lv_states_12_0= ruleState ) ) ( (lv_states_13_0= ruleState ) )* otherlv_14= 'initial' ( ( ruleEString ) ) )
            // InternalAML.g:80:3: otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'sensors' otherlv_3= ':' ( (lv_bricks_4_0= ruleSensor ) ) ( (lv_bricks_5_0= ruleSensor ) )* otherlv_6= 'actuators' otherlv_7= ':' ( (lv_bricks_8_0= ruleActuator ) ) ( (lv_bricks_9_0= ruleActuator ) )* otherlv_10= 'states' otherlv_11= ':' ( (lv_states_12_0= ruleState ) ) ( (lv_states_13_0= ruleState ) )* otherlv_14= 'initial' ( ( ruleEString ) )
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

            			newLeafNode(otherlv_2, grammarAccess.getAppAccess().getSensorsKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAppAccess().getColonKeyword_3());
            		
            // InternalAML.g:111:3: ( (lv_bricks_4_0= ruleSensor ) )
            // InternalAML.g:112:4: (lv_bricks_4_0= ruleSensor )
            {
            // InternalAML.g:112:4: (lv_bricks_4_0= ruleSensor )
            // InternalAML.g:113:5: lv_bricks_4_0= ruleSensor
            {

            					newCompositeNode(grammarAccess.getAppAccess().getBricksSensorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_bricks_4_0=ruleSensor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					add(
            						current,
            						"bricks",
            						lv_bricks_4_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.Sensor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAML.g:130:3: ( (lv_bricks_5_0= ruleSensor ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAML.g:131:4: (lv_bricks_5_0= ruleSensor )
            	    {
            	    // InternalAML.g:131:4: (lv_bricks_5_0= ruleSensor )
            	    // InternalAML.g:132:5: lv_bricks_5_0= ruleSensor
            	    {

            	    					newCompositeNode(grammarAccess.getAppAccess().getBricksSensorParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getAppAccess().getActuatorsKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getAppAccess().getColonKeyword_7());
            		
            // InternalAML.g:157:3: ( (lv_bricks_8_0= ruleActuator ) )
            // InternalAML.g:158:4: (lv_bricks_8_0= ruleActuator )
            {
            // InternalAML.g:158:4: (lv_bricks_8_0= ruleActuator )
            // InternalAML.g:159:5: lv_bricks_8_0= ruleActuator
            {

            					newCompositeNode(grammarAccess.getAppAccess().getBricksActuatorParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_bricks_8_0=ruleActuator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					add(
            						current,
            						"bricks",
            						lv_bricks_8_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.Actuator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAML.g:176:3: ( (lv_bricks_9_0= ruleActuator ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAML.g:177:4: (lv_bricks_9_0= ruleActuator )
            	    {
            	    // InternalAML.g:177:4: (lv_bricks_9_0= ruleActuator )
            	    // InternalAML.g:178:5: lv_bricks_9_0= ruleActuator
            	    {

            	    					newCompositeNode(grammarAccess.getAppAccess().getBricksActuatorParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_bricks_9_0=ruleActuator();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAppRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bricks",
            	    						lv_bricks_9_0,
            	    						"fr.unice.polytech.dsl.arduinoml.AML.Actuator");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getAppAccess().getStatesKeyword_10());
            		
            otherlv_11=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getAppAccess().getColonKeyword_11());
            		
            // InternalAML.g:203:3: ( (lv_states_12_0= ruleState ) )
            // InternalAML.g:204:4: (lv_states_12_0= ruleState )
            {
            // InternalAML.g:204:4: (lv_states_12_0= ruleState )
            // InternalAML.g:205:5: lv_states_12_0= ruleState
            {

            					newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_8);
            lv_states_12_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_12_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAML.g:222:3: ( (lv_states_13_0= ruleState ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAML.g:223:4: (lv_states_13_0= ruleState )
            	    {
            	    // InternalAML.g:223:4: (lv_states_13_0= ruleState )
            	    // InternalAML.g:224:5: lv_states_13_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_states_13_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAppRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_13_0,
            	    						"fr.unice.polytech.dsl.arduinoml.AML.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_14=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getAppAccess().getInitialKeyword_14());
            		
            // InternalAML.g:245:3: ( ( ruleEString ) )
            // InternalAML.g:246:4: ( ruleEString )
            {
            // InternalAML.g:246:4: ( ruleEString )
            // InternalAML.g:247:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAppRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAppAccess().getInitialStateCrossReference_15_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // InternalAML.g:265:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalAML.g:265:46: (iv_ruleState= ruleState EOF )
            // InternalAML.g:266:2: iv_ruleState= ruleState EOF
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
    // InternalAML.g:272:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_actions_2_0 = null;

        EObject lv_actions_3_0 = null;

        EObject lv_transition_4_0 = null;



        	enterRule();

        try {
            // InternalAML.g:278:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) ) )
            // InternalAML.g:279:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) )
            {
            // InternalAML.g:279:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) )
            // InternalAML.g:280:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) )
            {
            // InternalAML.g:280:3: ( (lv_name_0_0= ruleEString ) )
            // InternalAML.g:281:4: (lv_name_0_0= ruleEString )
            {
            // InternalAML.g:281:4: (lv_name_0_0= ruleEString )
            // InternalAML.g:282:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getColonKeyword_1());
            		
            // InternalAML.g:303:3: ( (lv_actions_2_0= ruleAction ) )
            // InternalAML.g:304:4: (lv_actions_2_0= ruleAction )
            {
            // InternalAML.g:304:4: (lv_actions_2_0= ruleAction )
            // InternalAML.g:305:5: lv_actions_2_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_actions_2_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_2_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAML.g:322:3: ( (lv_actions_3_0= ruleAction ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAML.g:323:4: (lv_actions_3_0= ruleAction )
            	    {
            	    // InternalAML.g:323:4: (lv_actions_3_0= ruleAction )
            	    // InternalAML.g:324:5: lv_actions_3_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_actions_3_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_3_0,
            	    						"fr.unice.polytech.dsl.arduinoml.AML.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalAML.g:341:3: ( (lv_transition_4_0= ruleTransition ) )
            // InternalAML.g:342:4: (lv_transition_4_0= ruleTransition )
            {
            // InternalAML.g:342:4: (lv_transition_4_0= ruleTransition )
            // InternalAML.g:343:5: lv_transition_4_0= ruleTransition
            {

            					newCompositeNode(grammarAccess.getStateAccess().getTransitionTransitionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_transition_4_0=ruleTransition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"transition",
            						lv_transition_4_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.Transition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // InternalAML.g:364:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalAML.g:364:47: (iv_ruleAction= ruleAction EOF )
            // InternalAML.g:365:2: iv_ruleAction= ruleAction EOF
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
    // InternalAML.g:371:1: ruleAction returns [EObject current=null] : ( () ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_value_3_0= ruleSIGNAL ) ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAML.g:377:2: ( ( () ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_value_3_0= ruleSIGNAL ) ) ) ) )
            // InternalAML.g:378:2: ( () ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_value_3_0= ruleSIGNAL ) ) ) )
            {
            // InternalAML.g:378:2: ( () ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_value_3_0= ruleSIGNAL ) ) ) )
            // InternalAML.g:379:3: () ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_value_3_0= ruleSIGNAL ) ) )
            {
            // InternalAML.g:379:3: ()
            // InternalAML.g:380:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalAML.g:386:3: ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_value_3_0= ruleSIGNAL ) ) )
            // InternalAML.g:387:4: ( ( ruleEString ) ) otherlv_2= '->' ( (lv_value_3_0= ruleSIGNAL ) )
            {
            // InternalAML.g:387:4: ( ( ruleEString ) )
            // InternalAML.g:388:5: ( ruleEString )
            {
            // InternalAML.g:388:5: ( ruleEString )
            // InternalAML.g:389:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getActionRule());
            						}
            					

            						newCompositeNode(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_1_0_0());
            					
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
            			
            // InternalAML.g:407:4: ( (lv_value_3_0= ruleSIGNAL ) )
            // InternalAML.g:408:5: (lv_value_3_0= ruleSIGNAL )
            {
            // InternalAML.g:408:5: (lv_value_3_0= ruleSIGNAL )
            // InternalAML.g:409:6: lv_value_3_0= ruleSIGNAL
            {

            						newCompositeNode(grammarAccess.getActionAccess().getValueSIGNALEnumRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_2);
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
    // InternalAML.g:431:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalAML.g:431:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalAML.g:432:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalAML.g:438:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleMultipleElementCondition ) ) otherlv_3= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalAML.g:444:2: ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleMultipleElementCondition ) ) otherlv_3= '->' ( ( ruleEString ) ) ) )
            // InternalAML.g:445:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleMultipleElementCondition ) ) otherlv_3= '->' ( ( ruleEString ) ) )
            {
            // InternalAML.g:445:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleMultipleElementCondition ) ) otherlv_3= '->' ( ( ruleEString ) ) )
            // InternalAML.g:446:3: () otherlv_1= 'if' ( (lv_condition_2_0= ruleMultipleElementCondition ) ) otherlv_3= '->' ( ( ruleEString ) )
            {
            // InternalAML.g:446:3: ()
            // InternalAML.g:447:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getIfKeyword_1());
            		
            // InternalAML.g:457:3: ( (lv_condition_2_0= ruleMultipleElementCondition ) )
            // InternalAML.g:458:4: (lv_condition_2_0= ruleMultipleElementCondition )
            {
            // InternalAML.g:458:4: (lv_condition_2_0= ruleMultipleElementCondition )
            // InternalAML.g:459:5: lv_condition_2_0= ruleMultipleElementCondition
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getConditionMultipleElementConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_condition_2_0=ruleMultipleElementCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.MultipleElementCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalAML.g:480:3: ( ( ruleEString ) )
            // InternalAML.g:481:4: ( ruleEString )
            {
            // InternalAML.g:481:4: ( ruleEString )
            // InternalAML.g:482:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getNextStateCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


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


    // $ANTLR start "entryRuleMultipleElementCondition"
    // InternalAML.g:500:1: entryRuleMultipleElementCondition returns [EObject current=null] : iv_ruleMultipleElementCondition= ruleMultipleElementCondition EOF ;
    public final EObject entryRuleMultipleElementCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleElementCondition = null;


        try {
            // InternalAML.g:500:65: (iv_ruleMultipleElementCondition= ruleMultipleElementCondition EOF )
            // InternalAML.g:501:2: iv_ruleMultipleElementCondition= ruleMultipleElementCondition EOF
            {
             newCompositeNode(grammarAccess.getMultipleElementConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultipleElementCondition=ruleMultipleElementCondition();

            state._fsp--;

             current =iv_ruleMultipleElementCondition; 
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
    // $ANTLR end "entryRuleMultipleElementCondition"


    // $ANTLR start "ruleMultipleElementCondition"
    // InternalAML.g:507:1: ruleMultipleElementCondition returns [EObject current=null] : ( () ( (lv_conditions_1_0= ruleSingleElementCondition ) ) ( ( (lv_operators_2_0= ruleOPERATOR ) ) ( (lv_conditions_3_0= ruleSingleElementCondition ) ) )* ) ;
    public final EObject ruleMultipleElementCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_conditions_1_0 = null;

        Enumerator lv_operators_2_0 = null;

        EObject lv_conditions_3_0 = null;



        	enterRule();

        try {
            // InternalAML.g:513:2: ( ( () ( (lv_conditions_1_0= ruleSingleElementCondition ) ) ( ( (lv_operators_2_0= ruleOPERATOR ) ) ( (lv_conditions_3_0= ruleSingleElementCondition ) ) )* ) )
            // InternalAML.g:514:2: ( () ( (lv_conditions_1_0= ruleSingleElementCondition ) ) ( ( (lv_operators_2_0= ruleOPERATOR ) ) ( (lv_conditions_3_0= ruleSingleElementCondition ) ) )* )
            {
            // InternalAML.g:514:2: ( () ( (lv_conditions_1_0= ruleSingleElementCondition ) ) ( ( (lv_operators_2_0= ruleOPERATOR ) ) ( (lv_conditions_3_0= ruleSingleElementCondition ) ) )* )
            // InternalAML.g:515:3: () ( (lv_conditions_1_0= ruleSingleElementCondition ) ) ( ( (lv_operators_2_0= ruleOPERATOR ) ) ( (lv_conditions_3_0= ruleSingleElementCondition ) ) )*
            {
            // InternalAML.g:515:3: ()
            // InternalAML.g:516:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMultipleElementConditionAccess().getMultipleElementConditionAction_0(),
            					current);
            			

            }

            // InternalAML.g:522:3: ( (lv_conditions_1_0= ruleSingleElementCondition ) )
            // InternalAML.g:523:4: (lv_conditions_1_0= ruleSingleElementCondition )
            {
            // InternalAML.g:523:4: (lv_conditions_1_0= ruleSingleElementCondition )
            // InternalAML.g:524:5: lv_conditions_1_0= ruleSingleElementCondition
            {

            					newCompositeNode(grammarAccess.getMultipleElementConditionAccess().getConditionsSingleElementConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_conditions_1_0=ruleSingleElementCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultipleElementConditionRule());
            					}
            					add(
            						current,
            						"conditions",
            						lv_conditions_1_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.SingleElementCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAML.g:541:3: ( ( (lv_operators_2_0= ruleOPERATOR ) ) ( (lv_conditions_3_0= ruleSingleElementCondition ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=23 && LA5_0<=24)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAML.g:542:4: ( (lv_operators_2_0= ruleOPERATOR ) ) ( (lv_conditions_3_0= ruleSingleElementCondition ) )
            	    {
            	    // InternalAML.g:542:4: ( (lv_operators_2_0= ruleOPERATOR ) )
            	    // InternalAML.g:543:5: (lv_operators_2_0= ruleOPERATOR )
            	    {
            	    // InternalAML.g:543:5: (lv_operators_2_0= ruleOPERATOR )
            	    // InternalAML.g:544:6: lv_operators_2_0= ruleOPERATOR
            	    {

            	    						newCompositeNode(grammarAccess.getMultipleElementConditionAccess().getOperatorsOPERATOREnumRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_operators_2_0=ruleOPERATOR();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultipleElementConditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operators",
            	    							lv_operators_2_0,
            	    							"fr.unice.polytech.dsl.arduinoml.AML.OPERATOR");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalAML.g:561:4: ( (lv_conditions_3_0= ruleSingleElementCondition ) )
            	    // InternalAML.g:562:5: (lv_conditions_3_0= ruleSingleElementCondition )
            	    {
            	    // InternalAML.g:562:5: (lv_conditions_3_0= ruleSingleElementCondition )
            	    // InternalAML.g:563:6: lv_conditions_3_0= ruleSingleElementCondition
            	    {

            	    						newCompositeNode(grammarAccess.getMultipleElementConditionAccess().getConditionsSingleElementConditionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_conditions_3_0=ruleSingleElementCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultipleElementConditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"conditions",
            	    							lv_conditions_3_0,
            	    							"fr.unice.polytech.dsl.arduinoml.AML.SingleElementCondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleMultipleElementCondition"


    // $ANTLR start "entryRuleSingleElementCondition"
    // InternalAML.g:585:1: entryRuleSingleElementCondition returns [EObject current=null] : iv_ruleSingleElementCondition= ruleSingleElementCondition EOF ;
    public final EObject entryRuleSingleElementCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleElementCondition = null;


        try {
            // InternalAML.g:585:63: (iv_ruleSingleElementCondition= ruleSingleElementCondition EOF )
            // InternalAML.g:586:2: iv_ruleSingleElementCondition= ruleSingleElementCondition EOF
            {
             newCompositeNode(grammarAccess.getSingleElementConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleElementCondition=ruleSingleElementCondition();

            state._fsp--;

             current =iv_ruleSingleElementCondition; 
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
    // $ANTLR end "entryRuleSingleElementCondition"


    // $ANTLR start "ruleSingleElementCondition"
    // InternalAML.g:592:1: ruleSingleElementCondition returns [EObject current=null] : ( () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSIGNAL ) ) ) ;
    public final EObject ruleSingleElementCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAML.g:598:2: ( ( () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSIGNAL ) ) ) )
            // InternalAML.g:599:2: ( () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSIGNAL ) ) )
            {
            // InternalAML.g:599:2: ( () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSIGNAL ) ) )
            // InternalAML.g:600:3: () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSIGNAL ) )
            {
            // InternalAML.g:600:3: ()
            // InternalAML.g:601:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSingleElementConditionAccess().getSingleElementConditionAction_0(),
            					current);
            			

            }

            // InternalAML.g:607:3: ( ( ruleEString ) )
            // InternalAML.g:608:4: ( ruleEString )
            {
            // InternalAML.g:608:4: ( ruleEString )
            // InternalAML.g:609:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleElementConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSingleElementConditionAccess().getSensorSensorCrossReference_1_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getSingleElementConditionAccess().getIsKeyword_2());
            		
            // InternalAML.g:627:3: ( (lv_value_3_0= ruleSIGNAL ) )
            // InternalAML.g:628:4: (lv_value_3_0= ruleSIGNAL )
            {
            // InternalAML.g:628:4: (lv_value_3_0= ruleSIGNAL )
            // InternalAML.g:629:5: lv_value_3_0= ruleSIGNAL
            {

            					newCompositeNode(grammarAccess.getSingleElementConditionAccess().getValueSIGNALEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleSIGNAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleElementConditionRule());
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
    // $ANTLR end "ruleSingleElementCondition"


    // $ANTLR start "entryRuleSensor"
    // InternalAML.g:650:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalAML.g:650:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalAML.g:651:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalAML.g:657:1: ruleSensor returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_pin_3_0 = null;



        	enterRule();

        try {
            // InternalAML.g:663:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) ) ) )
            // InternalAML.g:664:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) ) )
            {
            // InternalAML.g:664:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) ) )
            // InternalAML.g:665:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) )
            {
            // InternalAML.g:665:3: ()
            // InternalAML.g:666:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorAccess().getSensorAction_0(),
            					current);
            			

            }

            // InternalAML.g:672:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAML.g:673:4: (lv_name_1_0= ruleEString )
            {
            // InternalAML.g:673:4: (lv_name_1_0= ruleEString )
            // InternalAML.g:674:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalAML.g:695:3: ( (lv_pin_3_0= ruleEInt ) )
            // InternalAML.g:696:4: (lv_pin_3_0= ruleEInt )
            {
            // InternalAML.g:696:4: (lv_pin_3_0= ruleEInt )
            // InternalAML.g:697:5: lv_pin_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getPinEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_pin_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"pin",
            						lv_pin_3_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // InternalAML.g:718:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalAML.g:718:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalAML.g:719:2: iv_ruleActuator= ruleActuator EOF
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
    // InternalAML.g:725:1: ruleActuator returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) ) ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_pin_3_0 = null;



        	enterRule();

        try {
            // InternalAML.g:731:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) ) ) )
            // InternalAML.g:732:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) ) )
            {
            // InternalAML.g:732:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) ) )
            // InternalAML.g:733:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) )
            {
            // InternalAML.g:733:3: ()
            // InternalAML.g:734:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActuatorAccess().getActuatorAction_0(),
            					current);
            			

            }

            // InternalAML.g:740:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAML.g:741:4: (lv_name_1_0= ruleEString )
            {
            // InternalAML.g:741:4: (lv_name_1_0= ruleEString )
            // InternalAML.g:742:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getActuatorAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalAML.g:763:3: ( (lv_pin_3_0= ruleEInt ) )
            // InternalAML.g:764:4: (lv_pin_3_0= ruleEInt )
            {
            // InternalAML.g:764:4: (lv_pin_3_0= ruleEInt )
            // InternalAML.g:765:5: lv_pin_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getPinEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_pin_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorRule());
            					}
            					set(
            						current,
            						"pin",
            						lv_pin_3_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // InternalAML.g:786:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAML.g:786:47: (iv_ruleEString= ruleEString EOF )
            // InternalAML.g:787:2: iv_ruleEString= ruleEString EOF
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
    // InternalAML.g:793:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAML.g:799:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAML.g:800:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAML.g:800:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAML.g:801:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAML.g:809:3: this_ID_1= RULE_ID
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
    // InternalAML.g:820:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalAML.g:820:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalAML.g:821:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalAML.g:827:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalAML.g:833:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalAML.g:834:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalAML.g:834:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalAML.g:835:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalAML.g:835:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAML.g:836:4: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_15); 

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
    // InternalAML.g:853:1: ruleSIGNAL returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) ;
    public final Enumerator ruleSIGNAL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAML.g:859:2: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) )
            // InternalAML.g:860:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            {
            // InternalAML.g:860:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAML.g:861:3: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalAML.g:861:3: (enumLiteral_0= 'HIGH' )
                    // InternalAML.g:862:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAML.g:869:3: (enumLiteral_1= 'LOW' )
                    {
                    // InternalAML.g:869:3: (enumLiteral_1= 'LOW' )
                    // InternalAML.g:870:4: enumLiteral_1= 'LOW'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

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


    // $ANTLR start "ruleOPERATOR"
    // InternalAML.g:880:1: ruleOPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleOPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAML.g:886:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // InternalAML.g:887:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // InternalAML.g:887:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAML.g:888:3: (enumLiteral_0= 'and' )
                    {
                    // InternalAML.g:888:3: (enumLiteral_0= 'and' )
                    // InternalAML.g:889:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getOPERATORAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOPERATORAccess().getAndEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAML.g:896:3: (enumLiteral_1= 'or' )
                    {
                    // InternalAML.g:896:3: (enumLiteral_1= 'or' )
                    // InternalAML.g:897:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getOPERATORAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOPERATORAccess().getOrEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleOPERATOR"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});

}