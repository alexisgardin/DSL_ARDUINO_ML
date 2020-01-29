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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'App'", "'sensors'", "':'", "'binary'", "'analog'", "'actuators'", "'states'", "'initial'", "'->'", "'if'", "'is'", "'-'", "'.'", "'HIGH'", "'LOW'", "'and'", "'or'", "'='", "'<'", "'>'"
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
    public static final int T__30=30;
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
    // InternalAML.g:72:1: ruleApp returns [EObject current=null] : (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'sensors' otherlv_3= ':' (otherlv_4= 'binary' otherlv_5= ':' ( (lv_bricks_6_0= ruleBinarySensor ) ) ( (lv_bricks_7_0= ruleBinarySensor ) )* )? (otherlv_8= 'analog' otherlv_9= ':' ( (lv_bricks_10_0= ruleAnalogSensor ) ) ( (lv_bricks_11_0= ruleAnalogSensor ) )* )? otherlv_12= 'actuators' otherlv_13= ':' ( (lv_bricks_14_0= ruleActuator ) ) ( (lv_bricks_15_0= ruleActuator ) )* otherlv_16= 'states' otherlv_17= ':' ( (lv_states_18_0= ruleState ) ) ( (lv_states_19_0= ruleState ) )* otherlv_20= 'initial' ( ( ruleEString ) ) ) ;
    public final EObject ruleApp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_bricks_6_0 = null;

        EObject lv_bricks_7_0 = null;

        EObject lv_bricks_10_0 = null;

        EObject lv_bricks_11_0 = null;

        EObject lv_bricks_14_0 = null;

        EObject lv_bricks_15_0 = null;

        EObject lv_states_18_0 = null;

        EObject lv_states_19_0 = null;



        	enterRule();

        try {
            // InternalAML.g:78:2: ( (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'sensors' otherlv_3= ':' (otherlv_4= 'binary' otherlv_5= ':' ( (lv_bricks_6_0= ruleBinarySensor ) ) ( (lv_bricks_7_0= ruleBinarySensor ) )* )? (otherlv_8= 'analog' otherlv_9= ':' ( (lv_bricks_10_0= ruleAnalogSensor ) ) ( (lv_bricks_11_0= ruleAnalogSensor ) )* )? otherlv_12= 'actuators' otherlv_13= ':' ( (lv_bricks_14_0= ruleActuator ) ) ( (lv_bricks_15_0= ruleActuator ) )* otherlv_16= 'states' otherlv_17= ':' ( (lv_states_18_0= ruleState ) ) ( (lv_states_19_0= ruleState ) )* otherlv_20= 'initial' ( ( ruleEString ) ) ) )
            // InternalAML.g:79:2: (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'sensors' otherlv_3= ':' (otherlv_4= 'binary' otherlv_5= ':' ( (lv_bricks_6_0= ruleBinarySensor ) ) ( (lv_bricks_7_0= ruleBinarySensor ) )* )? (otherlv_8= 'analog' otherlv_9= ':' ( (lv_bricks_10_0= ruleAnalogSensor ) ) ( (lv_bricks_11_0= ruleAnalogSensor ) )* )? otherlv_12= 'actuators' otherlv_13= ':' ( (lv_bricks_14_0= ruleActuator ) ) ( (lv_bricks_15_0= ruleActuator ) )* otherlv_16= 'states' otherlv_17= ':' ( (lv_states_18_0= ruleState ) ) ( (lv_states_19_0= ruleState ) )* otherlv_20= 'initial' ( ( ruleEString ) ) )
            {
            // InternalAML.g:79:2: (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'sensors' otherlv_3= ':' (otherlv_4= 'binary' otherlv_5= ':' ( (lv_bricks_6_0= ruleBinarySensor ) ) ( (lv_bricks_7_0= ruleBinarySensor ) )* )? (otherlv_8= 'analog' otherlv_9= ':' ( (lv_bricks_10_0= ruleAnalogSensor ) ) ( (lv_bricks_11_0= ruleAnalogSensor ) )* )? otherlv_12= 'actuators' otherlv_13= ':' ( (lv_bricks_14_0= ruleActuator ) ) ( (lv_bricks_15_0= ruleActuator ) )* otherlv_16= 'states' otherlv_17= ':' ( (lv_states_18_0= ruleState ) ) ( (lv_states_19_0= ruleState ) )* otherlv_20= 'initial' ( ( ruleEString ) ) )
            // InternalAML.g:80:3: otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'sensors' otherlv_3= ':' (otherlv_4= 'binary' otherlv_5= ':' ( (lv_bricks_6_0= ruleBinarySensor ) ) ( (lv_bricks_7_0= ruleBinarySensor ) )* )? (otherlv_8= 'analog' otherlv_9= ':' ( (lv_bricks_10_0= ruleAnalogSensor ) ) ( (lv_bricks_11_0= ruleAnalogSensor ) )* )? otherlv_12= 'actuators' otherlv_13= ':' ( (lv_bricks_14_0= ruleActuator ) ) ( (lv_bricks_15_0= ruleActuator ) )* otherlv_16= 'states' otherlv_17= ':' ( (lv_states_18_0= ruleState ) ) ( (lv_states_19_0= ruleState ) )* otherlv_20= 'initial' ( ( ruleEString ) )
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
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAppAccess().getColonKeyword_3());
            		
            // InternalAML.g:111:3: (otherlv_4= 'binary' otherlv_5= ':' ( (lv_bricks_6_0= ruleBinarySensor ) ) ( (lv_bricks_7_0= ruleBinarySensor ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAML.g:112:4: otherlv_4= 'binary' otherlv_5= ':' ( (lv_bricks_6_0= ruleBinarySensor ) ) ( (lv_bricks_7_0= ruleBinarySensor ) )*
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getAppAccess().getBinaryKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getAppAccess().getColonKeyword_4_1());
                    			
                    // InternalAML.g:120:4: ( (lv_bricks_6_0= ruleBinarySensor ) )
                    // InternalAML.g:121:5: (lv_bricks_6_0= ruleBinarySensor )
                    {
                    // InternalAML.g:121:5: (lv_bricks_6_0= ruleBinarySensor )
                    // InternalAML.g:122:6: lv_bricks_6_0= ruleBinarySensor
                    {

                    						newCompositeNode(grammarAccess.getAppAccess().getBricksBinarySensorParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_bricks_6_0=ruleBinarySensor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAppRule());
                    						}
                    						add(
                    							current,
                    							"bricks",
                    							lv_bricks_6_0,
                    							"fr.unice.polytech.dsl.arduinoml.AML.BinarySensor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAML.g:139:4: ( (lv_bricks_7_0= ruleBinarySensor ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalAML.g:140:5: (lv_bricks_7_0= ruleBinarySensor )
                    	    {
                    	    // InternalAML.g:140:5: (lv_bricks_7_0= ruleBinarySensor )
                    	    // InternalAML.g:141:6: lv_bricks_7_0= ruleBinarySensor
                    	    {

                    	    						newCompositeNode(grammarAccess.getAppAccess().getBricksBinarySensorParserRuleCall_4_3_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_bricks_7_0=ruleBinarySensor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAppRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"bricks",
                    	    							lv_bricks_7_0,
                    	    							"fr.unice.polytech.dsl.arduinoml.AML.BinarySensor");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAML.g:159:3: (otherlv_8= 'analog' otherlv_9= ':' ( (lv_bricks_10_0= ruleAnalogSensor ) ) ( (lv_bricks_11_0= ruleAnalogSensor ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAML.g:160:4: otherlv_8= 'analog' otherlv_9= ':' ( (lv_bricks_10_0= ruleAnalogSensor ) ) ( (lv_bricks_11_0= ruleAnalogSensor ) )*
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getAppAccess().getAnalogKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getAppAccess().getColonKeyword_5_1());
                    			
                    // InternalAML.g:168:4: ( (lv_bricks_10_0= ruleAnalogSensor ) )
                    // InternalAML.g:169:5: (lv_bricks_10_0= ruleAnalogSensor )
                    {
                    // InternalAML.g:169:5: (lv_bricks_10_0= ruleAnalogSensor )
                    // InternalAML.g:170:6: lv_bricks_10_0= ruleAnalogSensor
                    {

                    						newCompositeNode(grammarAccess.getAppAccess().getBricksAnalogSensorParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_bricks_10_0=ruleAnalogSensor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAppRule());
                    						}
                    						add(
                    							current,
                    							"bricks",
                    							lv_bricks_10_0,
                    							"fr.unice.polytech.dsl.arduinoml.AML.AnalogSensor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAML.g:187:4: ( (lv_bricks_11_0= ruleAnalogSensor ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalAML.g:188:5: (lv_bricks_11_0= ruleAnalogSensor )
                    	    {
                    	    // InternalAML.g:188:5: (lv_bricks_11_0= ruleAnalogSensor )
                    	    // InternalAML.g:189:6: lv_bricks_11_0= ruleAnalogSensor
                    	    {

                    	    						newCompositeNode(grammarAccess.getAppAccess().getBricksAnalogSensorParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_bricks_11_0=ruleAnalogSensor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAppRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"bricks",
                    	    							lv_bricks_11_0,
                    	    							"fr.unice.polytech.dsl.arduinoml.AML.AnalogSensor");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_12, grammarAccess.getAppAccess().getActuatorsKeyword_6());
            		
            otherlv_13=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getAppAccess().getColonKeyword_7());
            		
            // InternalAML.g:215:3: ( (lv_bricks_14_0= ruleActuator ) )
            // InternalAML.g:216:4: (lv_bricks_14_0= ruleActuator )
            {
            // InternalAML.g:216:4: (lv_bricks_14_0= ruleActuator )
            // InternalAML.g:217:5: lv_bricks_14_0= ruleActuator
            {

            					newCompositeNode(grammarAccess.getAppAccess().getBricksActuatorParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_bricks_14_0=ruleActuator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					add(
            						current,
            						"bricks",
            						lv_bricks_14_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.Actuator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAML.g:234:3: ( (lv_bricks_15_0= ruleActuator ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAML.g:235:4: (lv_bricks_15_0= ruleActuator )
            	    {
            	    // InternalAML.g:235:4: (lv_bricks_15_0= ruleActuator )
            	    // InternalAML.g:236:5: lv_bricks_15_0= ruleActuator
            	    {

            	    					newCompositeNode(grammarAccess.getAppAccess().getBricksActuatorParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_bricks_15_0=ruleActuator();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAppRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bricks",
            	    						lv_bricks_15_0,
            	    						"fr.unice.polytech.dsl.arduinoml.AML.Actuator");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_16=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_16, grammarAccess.getAppAccess().getStatesKeyword_10());
            		
            otherlv_17=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_17, grammarAccess.getAppAccess().getColonKeyword_11());
            		
            // InternalAML.g:261:3: ( (lv_states_18_0= ruleState ) )
            // InternalAML.g:262:4: (lv_states_18_0= ruleState )
            {
            // InternalAML.g:262:4: (lv_states_18_0= ruleState )
            // InternalAML.g:263:5: lv_states_18_0= ruleState
            {

            					newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_10);
            lv_states_18_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_18_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAML.g:280:3: ( (lv_states_19_0= ruleState ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAML.g:281:4: (lv_states_19_0= ruleState )
            	    {
            	    // InternalAML.g:281:4: (lv_states_19_0= ruleState )
            	    // InternalAML.g:282:5: lv_states_19_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_20=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_20, grammarAccess.getAppAccess().getInitialKeyword_14());
            		
            // InternalAML.g:303:3: ( ( ruleEString ) )
            // InternalAML.g:304:4: ( ruleEString )
            {
            // InternalAML.g:304:4: ( ruleEString )
            // InternalAML.g:305:5: ruleEString
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
    // InternalAML.g:323:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalAML.g:323:46: (iv_ruleState= ruleState EOF )
            // InternalAML.g:324:2: iv_ruleState= ruleState EOF
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
    // InternalAML.g:330:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_actions_2_0 = null;

        EObject lv_actions_3_0 = null;

        EObject lv_transition_4_0 = null;



        	enterRule();

        try {
            // InternalAML.g:336:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) ) )
            // InternalAML.g:337:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) )
            {
            // InternalAML.g:337:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) ) )
            // InternalAML.g:338:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_actions_2_0= ruleAction ) ) ( (lv_actions_3_0= ruleAction ) )* ( (lv_transition_4_0= ruleTransition ) )
            {
            // InternalAML.g:338:3: ( (lv_name_0_0= ruleEString ) )
            // InternalAML.g:339:4: (lv_name_0_0= ruleEString )
            {
            // InternalAML.g:339:4: (lv_name_0_0= ruleEString )
            // InternalAML.g:340:5: lv_name_0_0= ruleEString
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
            		
            // InternalAML.g:361:3: ( (lv_actions_2_0= ruleAction ) )
            // InternalAML.g:362:4: (lv_actions_2_0= ruleAction )
            {
            // InternalAML.g:362:4: (lv_actions_2_0= ruleAction )
            // InternalAML.g:363:5: lv_actions_2_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalAML.g:380:3: ( (lv_actions_3_0= ruleAction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAML.g:381:4: (lv_actions_3_0= ruleAction )
            	    {
            	    // InternalAML.g:381:4: (lv_actions_3_0= ruleAction )
            	    // InternalAML.g:382:5: lv_actions_3_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    break loop7;
                }
            } while (true);

            // InternalAML.g:399:3: ( (lv_transition_4_0= ruleTransition ) )
            // InternalAML.g:400:4: (lv_transition_4_0= ruleTransition )
            {
            // InternalAML.g:400:4: (lv_transition_4_0= ruleTransition )
            // InternalAML.g:401:5: lv_transition_4_0= ruleTransition
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
    // InternalAML.g:422:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalAML.g:422:47: (iv_ruleAction= ruleAction EOF )
            // InternalAML.g:423:2: iv_ruleAction= ruleAction EOF
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
    // InternalAML.g:429:1: ruleAction returns [EObject current=null] : ( () ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_value_3_0= ruleSIGNAL ) ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAML.g:435:2: ( ( () ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_value_3_0= ruleSIGNAL ) ) ) ) )
            // InternalAML.g:436:2: ( () ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_value_3_0= ruleSIGNAL ) ) ) )
            {
            // InternalAML.g:436:2: ( () ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_value_3_0= ruleSIGNAL ) ) ) )
            // InternalAML.g:437:3: () ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_value_3_0= ruleSIGNAL ) ) )
            {
            // InternalAML.g:437:3: ()
            // InternalAML.g:438:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalAML.g:444:3: ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_value_3_0= ruleSIGNAL ) ) )
            // InternalAML.g:445:4: ( ( ruleEString ) ) otherlv_2= '->' ( (lv_value_3_0= ruleSIGNAL ) )
            {
            // InternalAML.g:445:4: ( ( ruleEString ) )
            // InternalAML.g:446:5: ( ruleEString )
            {
            // InternalAML.g:446:5: ( ruleEString )
            // InternalAML.g:447:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getActionRule());
            						}
            					

            						newCompositeNode(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_1_0_0());
            					
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_13); 

            				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
            			
            // InternalAML.g:465:4: ( (lv_value_3_0= ruleSIGNAL ) )
            // InternalAML.g:466:5: (lv_value_3_0= ruleSIGNAL )
            {
            // InternalAML.g:466:5: (lv_value_3_0= ruleSIGNAL )
            // InternalAML.g:467:6: lv_value_3_0= ruleSIGNAL
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
    // InternalAML.g:489:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalAML.g:489:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalAML.g:490:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalAML.g:496:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleMultipleElementCondition ) ) otherlv_3= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalAML.g:502:2: ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleMultipleElementCondition ) ) otherlv_3= '->' ( ( ruleEString ) ) ) )
            // InternalAML.g:503:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleMultipleElementCondition ) ) otherlv_3= '->' ( ( ruleEString ) ) )
            {
            // InternalAML.g:503:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleMultipleElementCondition ) ) otherlv_3= '->' ( ( ruleEString ) ) )
            // InternalAML.g:504:3: () otherlv_1= 'if' ( (lv_condition_2_0= ruleMultipleElementCondition ) ) otherlv_3= '->' ( ( ruleEString ) )
            {
            // InternalAML.g:504:3: ()
            // InternalAML.g:505:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getIfKeyword_1());
            		
            // InternalAML.g:515:3: ( (lv_condition_2_0= ruleMultipleElementCondition ) )
            // InternalAML.g:516:4: (lv_condition_2_0= ruleMultipleElementCondition )
            {
            // InternalAML.g:516:4: (lv_condition_2_0= ruleMultipleElementCondition )
            // InternalAML.g:517:5: lv_condition_2_0= ruleMultipleElementCondition
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getConditionMultipleElementConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_3=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalAML.g:538:3: ( ( ruleEString ) )
            // InternalAML.g:539:4: ( ruleEString )
            {
            // InternalAML.g:539:4: ( ruleEString )
            // InternalAML.g:540:5: ruleEString
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
    // InternalAML.g:558:1: entryRuleMultipleElementCondition returns [EObject current=null] : iv_ruleMultipleElementCondition= ruleMultipleElementCondition EOF ;
    public final EObject entryRuleMultipleElementCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleElementCondition = null;


        try {
            // InternalAML.g:558:65: (iv_ruleMultipleElementCondition= ruleMultipleElementCondition EOF )
            // InternalAML.g:559:2: iv_ruleMultipleElementCondition= ruleMultipleElementCondition EOF
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
    // InternalAML.g:565:1: ruleMultipleElementCondition returns [EObject current=null] : ( () ( ( (lv_conditions_1_1= ruleSingleElementCondition | lv_conditions_1_2= ruleValueElementCondition ) ) ) ( ( (lv_operators_2_0= ruleOPERATOR ) ) ( ( (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition ) ) ) )* ) ;
    public final EObject ruleMultipleElementCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_conditions_1_1 = null;

        EObject lv_conditions_1_2 = null;

        Enumerator lv_operators_2_0 = null;

        EObject lv_conditions_3_1 = null;

        EObject lv_conditions_3_2 = null;



        	enterRule();

        try {
            // InternalAML.g:571:2: ( ( () ( ( (lv_conditions_1_1= ruleSingleElementCondition | lv_conditions_1_2= ruleValueElementCondition ) ) ) ( ( (lv_operators_2_0= ruleOPERATOR ) ) ( ( (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition ) ) ) )* ) )
            // InternalAML.g:572:2: ( () ( ( (lv_conditions_1_1= ruleSingleElementCondition | lv_conditions_1_2= ruleValueElementCondition ) ) ) ( ( (lv_operators_2_0= ruleOPERATOR ) ) ( ( (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition ) ) ) )* )
            {
            // InternalAML.g:572:2: ( () ( ( (lv_conditions_1_1= ruleSingleElementCondition | lv_conditions_1_2= ruleValueElementCondition ) ) ) ( ( (lv_operators_2_0= ruleOPERATOR ) ) ( ( (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition ) ) ) )* )
            // InternalAML.g:573:3: () ( ( (lv_conditions_1_1= ruleSingleElementCondition | lv_conditions_1_2= ruleValueElementCondition ) ) ) ( ( (lv_operators_2_0= ruleOPERATOR ) ) ( ( (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition ) ) ) )*
            {
            // InternalAML.g:573:3: ()
            // InternalAML.g:574:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMultipleElementConditionAccess().getMultipleElementConditionAction_0(),
            					current);
            			

            }

            // InternalAML.g:580:3: ( ( (lv_conditions_1_1= ruleSingleElementCondition | lv_conditions_1_2= ruleValueElementCondition ) ) )
            // InternalAML.g:581:4: ( (lv_conditions_1_1= ruleSingleElementCondition | lv_conditions_1_2= ruleValueElementCondition ) )
            {
            // InternalAML.g:581:4: ( (lv_conditions_1_1= ruleSingleElementCondition | lv_conditions_1_2= ruleValueElementCondition ) )
            // InternalAML.g:582:5: (lv_conditions_1_1= ruleSingleElementCondition | lv_conditions_1_2= ruleValueElementCondition )
            {
            // InternalAML.g:582:5: (lv_conditions_1_1= ruleSingleElementCondition | lv_conditions_1_2= ruleValueElementCondition )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=28 && LA8_1<=30)) ) {
                    alt8=2;
                }
                else if ( (LA8_1==21) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_ID) ) {
                int LA8_2 = input.LA(2);

                if ( ((LA8_2>=28 && LA8_2<=30)) ) {
                    alt8=2;
                }
                else if ( (LA8_2==21) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAML.g:583:6: lv_conditions_1_1= ruleSingleElementCondition
                    {

                    						newCompositeNode(grammarAccess.getMultipleElementConditionAccess().getConditionsSingleElementConditionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_conditions_1_1=ruleSingleElementCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultipleElementConditionRule());
                    						}
                    						add(
                    							current,
                    							"conditions",
                    							lv_conditions_1_1,
                    							"fr.unice.polytech.dsl.arduinoml.AML.SingleElementCondition");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalAML.g:599:6: lv_conditions_1_2= ruleValueElementCondition
                    {

                    						newCompositeNode(grammarAccess.getMultipleElementConditionAccess().getConditionsValueElementConditionParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_14);
                    lv_conditions_1_2=ruleValueElementCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultipleElementConditionRule());
                    						}
                    						add(
                    							current,
                    							"conditions",
                    							lv_conditions_1_2,
                    							"fr.unice.polytech.dsl.arduinoml.AML.ValueElementCondition");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalAML.g:617:3: ( ( (lv_operators_2_0= ruleOPERATOR ) ) ( ( (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition ) ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=26 && LA10_0<=27)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAML.g:618:4: ( (lv_operators_2_0= ruleOPERATOR ) ) ( ( (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition ) ) )
            	    {
            	    // InternalAML.g:618:4: ( (lv_operators_2_0= ruleOPERATOR ) )
            	    // InternalAML.g:619:5: (lv_operators_2_0= ruleOPERATOR )
            	    {
            	    // InternalAML.g:619:5: (lv_operators_2_0= ruleOPERATOR )
            	    // InternalAML.g:620:6: lv_operators_2_0= ruleOPERATOR
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

            	    // InternalAML.g:637:4: ( ( (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition ) ) )
            	    // InternalAML.g:638:5: ( (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition ) )
            	    {
            	    // InternalAML.g:638:5: ( (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition ) )
            	    // InternalAML.g:639:6: (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition )
            	    {
            	    // InternalAML.g:639:6: (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==RULE_STRING) ) {
            	        int LA9_1 = input.LA(2);

            	        if ( ((LA9_1>=28 && LA9_1<=30)) ) {
            	            alt9=2;
            	        }
            	        else if ( (LA9_1==21) ) {
            	            alt9=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 9, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA9_0==RULE_ID) ) {
            	        int LA9_2 = input.LA(2);

            	        if ( ((LA9_2>=28 && LA9_2<=30)) ) {
            	            alt9=2;
            	        }
            	        else if ( (LA9_2==21) ) {
            	            alt9=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 9, 2, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalAML.g:640:7: lv_conditions_3_1= ruleSingleElementCondition
            	            {

            	            							newCompositeNode(grammarAccess.getMultipleElementConditionAccess().getConditionsSingleElementConditionParserRuleCall_2_1_0_0());
            	            						
            	            pushFollow(FOLLOW_14);
            	            lv_conditions_3_1=ruleSingleElementCondition();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getMultipleElementConditionRule());
            	            							}
            	            							add(
            	            								current,
            	            								"conditions",
            	            								lv_conditions_3_1,
            	            								"fr.unice.polytech.dsl.arduinoml.AML.SingleElementCondition");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalAML.g:656:7: lv_conditions_3_2= ruleValueElementCondition
            	            {

            	            							newCompositeNode(grammarAccess.getMultipleElementConditionAccess().getConditionsValueElementConditionParserRuleCall_2_1_0_1());
            	            						
            	            pushFollow(FOLLOW_14);
            	            lv_conditions_3_2=ruleValueElementCondition();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getMultipleElementConditionRule());
            	            							}
            	            							add(
            	            								current,
            	            								"conditions",
            	            								lv_conditions_3_2,
            	            								"fr.unice.polytech.dsl.arduinoml.AML.ValueElementCondition");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalAML.g:679:1: entryRuleSingleElementCondition returns [EObject current=null] : iv_ruleSingleElementCondition= ruleSingleElementCondition EOF ;
    public final EObject entryRuleSingleElementCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleElementCondition = null;


        try {
            // InternalAML.g:679:63: (iv_ruleSingleElementCondition= ruleSingleElementCondition EOF )
            // InternalAML.g:680:2: iv_ruleSingleElementCondition= ruleSingleElementCondition EOF
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
    // InternalAML.g:686:1: ruleSingleElementCondition returns [EObject current=null] : ( () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSIGNAL ) ) ) ;
    public final EObject ruleSingleElementCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAML.g:692:2: ( ( () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSIGNAL ) ) ) )
            // InternalAML.g:693:2: ( () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSIGNAL ) ) )
            {
            // InternalAML.g:693:2: ( () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSIGNAL ) ) )
            // InternalAML.g:694:3: () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSIGNAL ) )
            {
            // InternalAML.g:694:3: ()
            // InternalAML.g:695:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSingleElementConditionAccess().getSingleElementConditionAction_0(),
            					current);
            			

            }

            // InternalAML.g:701:3: ( ( ruleEString ) )
            // InternalAML.g:702:4: ( ruleEString )
            {
            // InternalAML.g:702:4: ( ruleEString )
            // InternalAML.g:703:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleElementConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSingleElementConditionAccess().getSensorBinarySensorCrossReference_1_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getSingleElementConditionAccess().getIsKeyword_2());
            		
            // InternalAML.g:721:3: ( (lv_value_3_0= ruleSIGNAL ) )
            // InternalAML.g:722:4: (lv_value_3_0= ruleSIGNAL )
            {
            // InternalAML.g:722:4: (lv_value_3_0= ruleSIGNAL )
            // InternalAML.g:723:5: lv_value_3_0= ruleSIGNAL
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


    // $ANTLR start "entryRuleValueElementCondition"
    // InternalAML.g:744:1: entryRuleValueElementCondition returns [EObject current=null] : iv_ruleValueElementCondition= ruleValueElementCondition EOF ;
    public final EObject entryRuleValueElementCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueElementCondition = null;


        try {
            // InternalAML.g:744:62: (iv_ruleValueElementCondition= ruleValueElementCondition EOF )
            // InternalAML.g:745:2: iv_ruleValueElementCondition= ruleValueElementCondition EOF
            {
             newCompositeNode(grammarAccess.getValueElementConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueElementCondition=ruleValueElementCondition();

            state._fsp--;

             current =iv_ruleValueElementCondition; 
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
    // $ANTLR end "entryRuleValueElementCondition"


    // $ANTLR start "ruleValueElementCondition"
    // InternalAML.g:751:1: ruleValueElementCondition returns [EObject current=null] : ( () ( ( ruleEString ) ) ( (lv_comparator_2_0= ruleCOMPARATOR ) ) ( (lv_value_3_0= ruleEFloat ) ) ) ;
    public final EObject ruleValueElementCondition() throws RecognitionException {
        EObject current = null;

        Enumerator lv_comparator_2_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAML.g:757:2: ( ( () ( ( ruleEString ) ) ( (lv_comparator_2_0= ruleCOMPARATOR ) ) ( (lv_value_3_0= ruleEFloat ) ) ) )
            // InternalAML.g:758:2: ( () ( ( ruleEString ) ) ( (lv_comparator_2_0= ruleCOMPARATOR ) ) ( (lv_value_3_0= ruleEFloat ) ) )
            {
            // InternalAML.g:758:2: ( () ( ( ruleEString ) ) ( (lv_comparator_2_0= ruleCOMPARATOR ) ) ( (lv_value_3_0= ruleEFloat ) ) )
            // InternalAML.g:759:3: () ( ( ruleEString ) ) ( (lv_comparator_2_0= ruleCOMPARATOR ) ) ( (lv_value_3_0= ruleEFloat ) )
            {
            // InternalAML.g:759:3: ()
            // InternalAML.g:760:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueElementConditionAccess().getValueElementConditionAction_0(),
            					current);
            			

            }

            // InternalAML.g:766:3: ( ( ruleEString ) )
            // InternalAML.g:767:4: ( ruleEString )
            {
            // InternalAML.g:767:4: ( ruleEString )
            // InternalAML.g:768:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueElementConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getValueElementConditionAccess().getSensorAnalogSensorCrossReference_1_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAML.g:782:3: ( (lv_comparator_2_0= ruleCOMPARATOR ) )
            // InternalAML.g:783:4: (lv_comparator_2_0= ruleCOMPARATOR )
            {
            // InternalAML.g:783:4: (lv_comparator_2_0= ruleCOMPARATOR )
            // InternalAML.g:784:5: lv_comparator_2_0= ruleCOMPARATOR
            {

            					newCompositeNode(grammarAccess.getValueElementConditionAccess().getComparatorCOMPARATOREnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_comparator_2_0=ruleCOMPARATOR();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValueElementConditionRule());
            					}
            					set(
            						current,
            						"comparator",
            						lv_comparator_2_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.COMPARATOR");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAML.g:801:3: ( (lv_value_3_0= ruleEFloat ) )
            // InternalAML.g:802:4: (lv_value_3_0= ruleEFloat )
            {
            // InternalAML.g:802:4: (lv_value_3_0= ruleEFloat )
            // InternalAML.g:803:5: lv_value_3_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getValueElementConditionAccess().getValueEFloatParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValueElementConditionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.EFloat");
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
    // $ANTLR end "ruleValueElementCondition"


    // $ANTLR start "entryRuleBinarySensor"
    // InternalAML.g:824:1: entryRuleBinarySensor returns [EObject current=null] : iv_ruleBinarySensor= ruleBinarySensor EOF ;
    public final EObject entryRuleBinarySensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinarySensor = null;


        try {
            // InternalAML.g:824:53: (iv_ruleBinarySensor= ruleBinarySensor EOF )
            // InternalAML.g:825:2: iv_ruleBinarySensor= ruleBinarySensor EOF
            {
             newCompositeNode(grammarAccess.getBinarySensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinarySensor=ruleBinarySensor();

            state._fsp--;

             current =iv_ruleBinarySensor; 
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
    // $ANTLR end "entryRuleBinarySensor"


    // $ANTLR start "ruleBinarySensor"
    // InternalAML.g:831:1: ruleBinarySensor returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) ) ) ;
    public final EObject ruleBinarySensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_pin_3_0 = null;



        	enterRule();

        try {
            // InternalAML.g:837:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) ) ) )
            // InternalAML.g:838:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) ) )
            {
            // InternalAML.g:838:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) ) )
            // InternalAML.g:839:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) )
            {
            // InternalAML.g:839:3: ()
            // InternalAML.g:840:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBinarySensorAccess().getBinarySensorAction_0(),
            					current);
            			

            }

            // InternalAML.g:846:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAML.g:847:4: (lv_name_1_0= ruleEString )
            {
            // InternalAML.g:847:4: (lv_name_1_0= ruleEString )
            // InternalAML.g:848:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBinarySensorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinarySensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getBinarySensorAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalAML.g:869:3: ( (lv_pin_3_0= ruleEInt ) )
            // InternalAML.g:870:4: (lv_pin_3_0= ruleEInt )
            {
            // InternalAML.g:870:4: (lv_pin_3_0= ruleEInt )
            // InternalAML.g:871:5: lv_pin_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getBinarySensorAccess().getPinEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_pin_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinarySensorRule());
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
    // $ANTLR end "ruleBinarySensor"


    // $ANTLR start "entryRuleAnalogSensor"
    // InternalAML.g:892:1: entryRuleAnalogSensor returns [EObject current=null] : iv_ruleAnalogSensor= ruleAnalogSensor EOF ;
    public final EObject entryRuleAnalogSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalogSensor = null;


        try {
            // InternalAML.g:892:53: (iv_ruleAnalogSensor= ruleAnalogSensor EOF )
            // InternalAML.g:893:2: iv_ruleAnalogSensor= ruleAnalogSensor EOF
            {
             newCompositeNode(grammarAccess.getAnalogSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnalogSensor=ruleAnalogSensor();

            state._fsp--;

             current =iv_ruleAnalogSensor; 
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
    // $ANTLR end "entryRuleAnalogSensor"


    // $ANTLR start "ruleAnalogSensor"
    // InternalAML.g:899:1: ruleAnalogSensor returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) ) ) ;
    public final EObject ruleAnalogSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_pin_3_0 = null;



        	enterRule();

        try {
            // InternalAML.g:905:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) ) ) )
            // InternalAML.g:906:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) ) )
            {
            // InternalAML.g:906:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) ) )
            // InternalAML.g:907:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) )
            {
            // InternalAML.g:907:3: ()
            // InternalAML.g:908:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnalogSensorAccess().getAnalogSensorAction_0(),
            					current);
            			

            }

            // InternalAML.g:914:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAML.g:915:4: (lv_name_1_0= ruleEString )
            {
            // InternalAML.g:915:4: (lv_name_1_0= ruleEString )
            // InternalAML.g:916:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAnalogSensorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnalogSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getAnalogSensorAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalAML.g:937:3: ( (lv_pin_3_0= ruleEInt ) )
            // InternalAML.g:938:4: (lv_pin_3_0= ruleEInt )
            {
            // InternalAML.g:938:4: (lv_pin_3_0= ruleEInt )
            // InternalAML.g:939:5: lv_pin_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getAnalogSensorAccess().getPinEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_pin_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnalogSensorRule());
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
    // $ANTLR end "ruleAnalogSensor"


    // $ANTLR start "entryRuleActuator"
    // InternalAML.g:960:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalAML.g:960:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalAML.g:961:2: iv_ruleActuator= ruleActuator EOF
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
    // InternalAML.g:967:1: ruleActuator returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) ) ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_pin_3_0 = null;



        	enterRule();

        try {
            // InternalAML.g:973:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) ) ) )
            // InternalAML.g:974:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) ) )
            {
            // InternalAML.g:974:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) ) )
            // InternalAML.g:975:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEInt ) )
            {
            // InternalAML.g:975:3: ()
            // InternalAML.g:976:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActuatorAccess().getActuatorAction_0(),
            					current);
            			

            }

            // InternalAML.g:982:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAML.g:983:4: (lv_name_1_0= ruleEString )
            {
            // InternalAML.g:983:4: (lv_name_1_0= ruleEString )
            // InternalAML.g:984:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_2=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getActuatorAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalAML.g:1005:3: ( (lv_pin_3_0= ruleEInt ) )
            // InternalAML.g:1006:4: (lv_pin_3_0= ruleEInt )
            {
            // InternalAML.g:1006:4: (lv_pin_3_0= ruleEInt )
            // InternalAML.g:1007:5: lv_pin_3_0= ruleEInt
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
    // InternalAML.g:1028:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAML.g:1028:47: (iv_ruleEString= ruleEString EOF )
            // InternalAML.g:1029:2: iv_ruleEString= ruleEString EOF
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
    // InternalAML.g:1035:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAML.g:1041:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAML.g:1042:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAML.g:1042:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAML.g:1043:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAML.g:1051:3: this_ID_1= RULE_ID
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
    // InternalAML.g:1062:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalAML.g:1062:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalAML.g:1063:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalAML.g:1069:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalAML.g:1075:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalAML.g:1076:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalAML.g:1076:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalAML.g:1077:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalAML.g:1077:3: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAML.g:1078:4: kw= '-'
                    {
                    kw=(Token)match(input,22,FOLLOW_17); 

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


    // $ANTLR start "entryRuleEFloat"
    // InternalAML.g:1095:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalAML.g:1095:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalAML.g:1096:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalAML.g:1102:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT )+ )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalAML.g:1108:2: ( (this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT )+ )? ) )
            // InternalAML.g:1109:2: (this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT )+ )? )
            {
            // InternalAML.g:1109:2: (this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT )+ )? )
            // InternalAML.g:1110:3: this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT )+ )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0());
            		
            // InternalAML.g:1117:3: (kw= '.' (this_INT_2= RULE_INT )+ )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAML.g:1118:4: kw= '.' (this_INT_2= RULE_INT )+
                    {
                    kw=(Token)match(input,23,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_1_0());
                    			
                    // InternalAML.g:1123:4: (this_INT_2= RULE_INT )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_INT) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalAML.g:1124:5: this_INT_2= RULE_INT
                    	    {
                    	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_20); 

                    	    					current.merge(this_INT_2);
                    	    				

                    	    					newLeafNode(this_INT_2, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "ruleSIGNAL"
    // InternalAML.g:1137:1: ruleSIGNAL returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) ;
    public final Enumerator ruleSIGNAL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAML.g:1143:2: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) )
            // InternalAML.g:1144:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            {
            // InternalAML.g:1144:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            else if ( (LA15_0==25) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalAML.g:1145:3: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalAML.g:1145:3: (enumLiteral_0= 'HIGH' )
                    // InternalAML.g:1146:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAML.g:1153:3: (enumLiteral_1= 'LOW' )
                    {
                    // InternalAML.g:1153:3: (enumLiteral_1= 'LOW' )
                    // InternalAML.g:1154:4: enumLiteral_1= 'LOW'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

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
    // InternalAML.g:1164:1: ruleOPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleOPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAML.g:1170:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // InternalAML.g:1171:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // InternalAML.g:1171:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            else if ( (LA16_0==27) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalAML.g:1172:3: (enumLiteral_0= 'and' )
                    {
                    // InternalAML.g:1172:3: (enumLiteral_0= 'and' )
                    // InternalAML.g:1173:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getOPERATORAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOPERATORAccess().getAndEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAML.g:1180:3: (enumLiteral_1= 'or' )
                    {
                    // InternalAML.g:1180:3: (enumLiteral_1= 'or' )
                    // InternalAML.g:1181:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

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


    // $ANTLR start "ruleCOMPARATOR"
    // InternalAML.g:1191:1: ruleCOMPARATOR returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) ) ;
    public final Enumerator ruleCOMPARATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAML.g:1197:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) ) )
            // InternalAML.g:1198:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) )
            {
            // InternalAML.g:1198:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt17=1;
                }
                break;
            case 29:
                {
                alt17=2;
                }
                break;
            case 30:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalAML.g:1199:3: (enumLiteral_0= '=' )
                    {
                    // InternalAML.g:1199:3: (enumLiteral_0= '=' )
                    // InternalAML.g:1200:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARATORAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCOMPARATORAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAML.g:1207:3: (enumLiteral_1= '<' )
                    {
                    // InternalAML.g:1207:3: (enumLiteral_1= '<' )
                    // InternalAML.g:1208:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARATORAccess().getINFERIOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCOMPARATORAccess().getINFERIOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAML.g:1215:3: (enumLiteral_2= '>' )
                    {
                    // InternalAML.g:1215:3: (enumLiteral_2= '>' )
                    // InternalAML.g:1216:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARATORAccess().getSUPERIOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCOMPARATORAccess().getSUPERIOREnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleCOMPARATOR"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000042L});

}