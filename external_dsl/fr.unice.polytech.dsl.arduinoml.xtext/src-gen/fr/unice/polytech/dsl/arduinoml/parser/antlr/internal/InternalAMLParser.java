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
    // InternalAML.g:72:1: ruleApp returns [EObject current=null] : (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'sensors' otherlv_3= ':' (otherlv_4= 'binary' otherlv_5= ':' ( (lv_bricks_6_0= ruleBinarySensor ) ) ( (lv_bricks_7_0= ruleBinarySensor ) )* )? (otherlv_8= 'analog' otherlv_9= ':' ( (lv_bricks_10_0= ruleAnalogSensor ) ) ( (lv_bricks_11_0= ruleAnalogSensor ) )* )? otherlv_12= 'actuators' otherlv_13= ':' (otherlv_14= 'binary' otherlv_15= ':' ( (lv_bricks_16_0= ruleBinaryActuator ) ) ( (lv_bricks_17_0= ruleBinaryActuator ) )* )? (otherlv_18= 'analog' otherlv_19= ':' ( (lv_bricks_20_0= ruleAnalogActuator ) ) ( (lv_bricks_21_0= ruleAnalogActuator ) )* )? otherlv_22= 'states' otherlv_23= ':' ( (lv_states_24_0= ruleState ) ) ( (lv_states_25_0= ruleState ) )* otherlv_26= 'initial' ( ( ruleEString ) ) ) ;
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
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_bricks_6_0 = null;

        EObject lv_bricks_7_0 = null;

        EObject lv_bricks_10_0 = null;

        EObject lv_bricks_11_0 = null;

        EObject lv_bricks_16_0 = null;

        EObject lv_bricks_17_0 = null;

        EObject lv_bricks_20_0 = null;

        EObject lv_bricks_21_0 = null;

        EObject lv_states_24_0 = null;

        EObject lv_states_25_0 = null;



        	enterRule();

        try {
            // InternalAML.g:78:2: ( (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'sensors' otherlv_3= ':' (otherlv_4= 'binary' otherlv_5= ':' ( (lv_bricks_6_0= ruleBinarySensor ) ) ( (lv_bricks_7_0= ruleBinarySensor ) )* )? (otherlv_8= 'analog' otherlv_9= ':' ( (lv_bricks_10_0= ruleAnalogSensor ) ) ( (lv_bricks_11_0= ruleAnalogSensor ) )* )? otherlv_12= 'actuators' otherlv_13= ':' (otherlv_14= 'binary' otherlv_15= ':' ( (lv_bricks_16_0= ruleBinaryActuator ) ) ( (lv_bricks_17_0= ruleBinaryActuator ) )* )? (otherlv_18= 'analog' otherlv_19= ':' ( (lv_bricks_20_0= ruleAnalogActuator ) ) ( (lv_bricks_21_0= ruleAnalogActuator ) )* )? otherlv_22= 'states' otherlv_23= ':' ( (lv_states_24_0= ruleState ) ) ( (lv_states_25_0= ruleState ) )* otherlv_26= 'initial' ( ( ruleEString ) ) ) )
            // InternalAML.g:79:2: (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'sensors' otherlv_3= ':' (otherlv_4= 'binary' otherlv_5= ':' ( (lv_bricks_6_0= ruleBinarySensor ) ) ( (lv_bricks_7_0= ruleBinarySensor ) )* )? (otherlv_8= 'analog' otherlv_9= ':' ( (lv_bricks_10_0= ruleAnalogSensor ) ) ( (lv_bricks_11_0= ruleAnalogSensor ) )* )? otherlv_12= 'actuators' otherlv_13= ':' (otherlv_14= 'binary' otherlv_15= ':' ( (lv_bricks_16_0= ruleBinaryActuator ) ) ( (lv_bricks_17_0= ruleBinaryActuator ) )* )? (otherlv_18= 'analog' otherlv_19= ':' ( (lv_bricks_20_0= ruleAnalogActuator ) ) ( (lv_bricks_21_0= ruleAnalogActuator ) )* )? otherlv_22= 'states' otherlv_23= ':' ( (lv_states_24_0= ruleState ) ) ( (lv_states_25_0= ruleState ) )* otherlv_26= 'initial' ( ( ruleEString ) ) )
            {
            // InternalAML.g:79:2: (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'sensors' otherlv_3= ':' (otherlv_4= 'binary' otherlv_5= ':' ( (lv_bricks_6_0= ruleBinarySensor ) ) ( (lv_bricks_7_0= ruleBinarySensor ) )* )? (otherlv_8= 'analog' otherlv_9= ':' ( (lv_bricks_10_0= ruleAnalogSensor ) ) ( (lv_bricks_11_0= ruleAnalogSensor ) )* )? otherlv_12= 'actuators' otherlv_13= ':' (otherlv_14= 'binary' otherlv_15= ':' ( (lv_bricks_16_0= ruleBinaryActuator ) ) ( (lv_bricks_17_0= ruleBinaryActuator ) )* )? (otherlv_18= 'analog' otherlv_19= ':' ( (lv_bricks_20_0= ruleAnalogActuator ) ) ( (lv_bricks_21_0= ruleAnalogActuator ) )* )? otherlv_22= 'states' otherlv_23= ':' ( (lv_states_24_0= ruleState ) ) ( (lv_states_25_0= ruleState ) )* otherlv_26= 'initial' ( ( ruleEString ) ) )
            // InternalAML.g:80:3: otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'sensors' otherlv_3= ':' (otherlv_4= 'binary' otherlv_5= ':' ( (lv_bricks_6_0= ruleBinarySensor ) ) ( (lv_bricks_7_0= ruleBinarySensor ) )* )? (otherlv_8= 'analog' otherlv_9= ':' ( (lv_bricks_10_0= ruleAnalogSensor ) ) ( (lv_bricks_11_0= ruleAnalogSensor ) )* )? otherlv_12= 'actuators' otherlv_13= ':' (otherlv_14= 'binary' otherlv_15= ':' ( (lv_bricks_16_0= ruleBinaryActuator ) ) ( (lv_bricks_17_0= ruleBinaryActuator ) )* )? (otherlv_18= 'analog' otherlv_19= ':' ( (lv_bricks_20_0= ruleAnalogActuator ) ) ( (lv_bricks_21_0= ruleAnalogActuator ) )* )? otherlv_22= 'states' otherlv_23= ':' ( (lv_states_24_0= ruleState ) ) ( (lv_states_25_0= ruleState ) )* otherlv_26= 'initial' ( ( ruleEString ) )
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
            		
            otherlv_13=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_13, grammarAccess.getAppAccess().getColonKeyword_7());
            		
            // InternalAML.g:215:3: (otherlv_14= 'binary' otherlv_15= ':' ( (lv_bricks_16_0= ruleBinaryActuator ) ) ( (lv_bricks_17_0= ruleBinaryActuator ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAML.g:216:4: otherlv_14= 'binary' otherlv_15= ':' ( (lv_bricks_16_0= ruleBinaryActuator ) ) ( (lv_bricks_17_0= ruleBinaryActuator ) )*
                    {
                    otherlv_14=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_14, grammarAccess.getAppAccess().getBinaryKeyword_8_0());
                    			
                    otherlv_15=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getAppAccess().getColonKeyword_8_1());
                    			
                    // InternalAML.g:224:4: ( (lv_bricks_16_0= ruleBinaryActuator ) )
                    // InternalAML.g:225:5: (lv_bricks_16_0= ruleBinaryActuator )
                    {
                    // InternalAML.g:225:5: (lv_bricks_16_0= ruleBinaryActuator )
                    // InternalAML.g:226:6: lv_bricks_16_0= ruleBinaryActuator
                    {

                    						newCompositeNode(grammarAccess.getAppAccess().getBricksBinaryActuatorParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_bricks_16_0=ruleBinaryActuator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAppRule());
                    						}
                    						add(
                    							current,
                    							"bricks",
                    							lv_bricks_16_0,
                    							"fr.unice.polytech.dsl.arduinoml.AML.BinaryActuator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAML.g:243:4: ( (lv_bricks_17_0= ruleBinaryActuator ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalAML.g:244:5: (lv_bricks_17_0= ruleBinaryActuator )
                    	    {
                    	    // InternalAML.g:244:5: (lv_bricks_17_0= ruleBinaryActuator )
                    	    // InternalAML.g:245:6: lv_bricks_17_0= ruleBinaryActuator
                    	    {

                    	    						newCompositeNode(grammarAccess.getAppAccess().getBricksBinaryActuatorParserRuleCall_8_3_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_bricks_17_0=ruleBinaryActuator();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAppRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"bricks",
                    	    							lv_bricks_17_0,
                    	    							"fr.unice.polytech.dsl.arduinoml.AML.BinaryActuator");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAML.g:263:3: (otherlv_18= 'analog' otherlv_19= ':' ( (lv_bricks_20_0= ruleAnalogActuator ) ) ( (lv_bricks_21_0= ruleAnalogActuator ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAML.g:264:4: otherlv_18= 'analog' otherlv_19= ':' ( (lv_bricks_20_0= ruleAnalogActuator ) ) ( (lv_bricks_21_0= ruleAnalogActuator ) )*
                    {
                    otherlv_18=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_18, grammarAccess.getAppAccess().getAnalogKeyword_9_0());
                    			
                    otherlv_19=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getAppAccess().getColonKeyword_9_1());
                    			
                    // InternalAML.g:272:4: ( (lv_bricks_20_0= ruleAnalogActuator ) )
                    // InternalAML.g:273:5: (lv_bricks_20_0= ruleAnalogActuator )
                    {
                    // InternalAML.g:273:5: (lv_bricks_20_0= ruleAnalogActuator )
                    // InternalAML.g:274:6: lv_bricks_20_0= ruleAnalogActuator
                    {

                    						newCompositeNode(grammarAccess.getAppAccess().getBricksAnalogActuatorParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_bricks_20_0=ruleAnalogActuator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAppRule());
                    						}
                    						add(
                    							current,
                    							"bricks",
                    							lv_bricks_20_0,
                    							"fr.unice.polytech.dsl.arduinoml.AML.AnalogActuator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAML.g:291:4: ( (lv_bricks_21_0= ruleAnalogActuator ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalAML.g:292:5: (lv_bricks_21_0= ruleAnalogActuator )
                    	    {
                    	    // InternalAML.g:292:5: (lv_bricks_21_0= ruleAnalogActuator )
                    	    // InternalAML.g:293:6: lv_bricks_21_0= ruleAnalogActuator
                    	    {

                    	    						newCompositeNode(grammarAccess.getAppAccess().getBricksAnalogActuatorParserRuleCall_9_3_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_bricks_21_0=ruleAnalogActuator();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAppRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"bricks",
                    	    							lv_bricks_21_0,
                    	    							"fr.unice.polytech.dsl.arduinoml.AML.AnalogActuator");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_22=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_22, grammarAccess.getAppAccess().getStatesKeyword_10());
            		
            otherlv_23=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_23, grammarAccess.getAppAccess().getColonKeyword_11());
            		
            // InternalAML.g:319:3: ( (lv_states_24_0= ruleState ) )
            // InternalAML.g:320:4: (lv_states_24_0= ruleState )
            {
            // InternalAML.g:320:4: (lv_states_24_0= ruleState )
            // InternalAML.g:321:5: lv_states_24_0= ruleState
            {

            					newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_12);
            lv_states_24_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_24_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAML.g:338:3: ( (lv_states_25_0= ruleState ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAML.g:339:4: (lv_states_25_0= ruleState )
            	    {
            	    // InternalAML.g:339:4: (lv_states_25_0= ruleState )
            	    // InternalAML.g:340:5: lv_states_25_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_states_25_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAppRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_25_0,
            	    						"fr.unice.polytech.dsl.arduinoml.AML.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_26=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_26, grammarAccess.getAppAccess().getInitialKeyword_14());
            		
            // InternalAML.g:361:3: ( ( ruleEString ) )
            // InternalAML.g:362:4: ( ruleEString )
            {
            // InternalAML.g:362:4: ( ruleEString )
            // InternalAML.g:363:5: ruleEString
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
    // InternalAML.g:381:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalAML.g:381:46: (iv_ruleState= ruleState EOF )
            // InternalAML.g:382:2: iv_ruleState= ruleState EOF
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
    // InternalAML.g:388:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( (lv_actions_2_1= ruleBinaryAction | lv_actions_2_2= ruleAnalogAction ) ) ) ( ( (lv_actions_3_1= ruleBinaryAction | lv_actions_3_2= ruleAnalogAction ) ) )* ( (lv_transition_4_0= ruleTransition ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_actions_2_1 = null;

        EObject lv_actions_2_2 = null;

        EObject lv_actions_3_1 = null;

        EObject lv_actions_3_2 = null;

        EObject lv_transition_4_0 = null;



        	enterRule();

        try {
            // InternalAML.g:394:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( (lv_actions_2_1= ruleBinaryAction | lv_actions_2_2= ruleAnalogAction ) ) ) ( ( (lv_actions_3_1= ruleBinaryAction | lv_actions_3_2= ruleAnalogAction ) ) )* ( (lv_transition_4_0= ruleTransition ) ) ) )
            // InternalAML.g:395:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( (lv_actions_2_1= ruleBinaryAction | lv_actions_2_2= ruleAnalogAction ) ) ) ( ( (lv_actions_3_1= ruleBinaryAction | lv_actions_3_2= ruleAnalogAction ) ) )* ( (lv_transition_4_0= ruleTransition ) ) )
            {
            // InternalAML.g:395:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( (lv_actions_2_1= ruleBinaryAction | lv_actions_2_2= ruleAnalogAction ) ) ) ( ( (lv_actions_3_1= ruleBinaryAction | lv_actions_3_2= ruleAnalogAction ) ) )* ( (lv_transition_4_0= ruleTransition ) ) )
            // InternalAML.g:396:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( (lv_actions_2_1= ruleBinaryAction | lv_actions_2_2= ruleAnalogAction ) ) ) ( ( (lv_actions_3_1= ruleBinaryAction | lv_actions_3_2= ruleAnalogAction ) ) )* ( (lv_transition_4_0= ruleTransition ) )
            {
            // InternalAML.g:396:3: ( (lv_name_0_0= ruleEString ) )
            // InternalAML.g:397:4: (lv_name_0_0= ruleEString )
            {
            // InternalAML.g:397:4: (lv_name_0_0= ruleEString )
            // InternalAML.g:398:5: lv_name_0_0= ruleEString
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
            		
            // InternalAML.g:419:3: ( ( (lv_actions_2_1= ruleBinaryAction | lv_actions_2_2= ruleAnalogAction ) ) )
            // InternalAML.g:420:4: ( (lv_actions_2_1= ruleBinaryAction | lv_actions_2_2= ruleAnalogAction ) )
            {
            // InternalAML.g:420:4: ( (lv_actions_2_1= ruleBinaryAction | lv_actions_2_2= ruleAnalogAction ) )
            // InternalAML.g:421:5: (lv_actions_2_1= ruleBinaryAction | lv_actions_2_2= ruleAnalogAction )
            {
            // InternalAML.g:421:5: (lv_actions_2_1= ruleBinaryAction | lv_actions_2_2= ruleAnalogAction )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==19) ) {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3==RULE_INT||LA10_3==22) ) {
                        alt10=2;
                    }
                    else if ( ((LA10_3>=24 && LA10_3<=25)) ) {
                        alt10=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==RULE_ID) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==19) ) {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3==RULE_INT||LA10_3==22) ) {
                        alt10=2;
                    }
                    else if ( ((LA10_3>=24 && LA10_3<=25)) ) {
                        alt10=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAML.g:422:6: lv_actions_2_1= ruleBinaryAction
                    {

                    						newCompositeNode(grammarAccess.getStateAccess().getActionsBinaryActionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_actions_2_1=ruleBinaryAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_2_1,
                    							"fr.unice.polytech.dsl.arduinoml.AML.BinaryAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalAML.g:438:6: lv_actions_2_2= ruleAnalogAction
                    {

                    						newCompositeNode(grammarAccess.getStateAccess().getActionsAnalogActionParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_13);
                    lv_actions_2_2=ruleAnalogAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_2_2,
                    							"fr.unice.polytech.dsl.arduinoml.AML.AnalogAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalAML.g:456:3: ( ( (lv_actions_3_1= ruleBinaryAction | lv_actions_3_2= ruleAnalogAction ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAML.g:457:4: ( (lv_actions_3_1= ruleBinaryAction | lv_actions_3_2= ruleAnalogAction ) )
            	    {
            	    // InternalAML.g:457:4: ( (lv_actions_3_1= ruleBinaryAction | lv_actions_3_2= ruleAnalogAction ) )
            	    // InternalAML.g:458:5: (lv_actions_3_1= ruleBinaryAction | lv_actions_3_2= ruleAnalogAction )
            	    {
            	    // InternalAML.g:458:5: (lv_actions_3_1= ruleBinaryAction | lv_actions_3_2= ruleAnalogAction )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==RULE_STRING) ) {
            	        int LA11_1 = input.LA(2);

            	        if ( (LA11_1==19) ) {
            	            int LA11_3 = input.LA(3);

            	            if ( (LA11_3==RULE_INT||LA11_3==22) ) {
            	                alt11=2;
            	            }
            	            else if ( ((LA11_3>=24 && LA11_3<=25)) ) {
            	                alt11=1;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 11, 3, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 11, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA11_0==RULE_ID) ) {
            	        int LA11_2 = input.LA(2);

            	        if ( (LA11_2==19) ) {
            	            int LA11_3 = input.LA(3);

            	            if ( (LA11_3==RULE_INT||LA11_3==22) ) {
            	                alt11=2;
            	            }
            	            else if ( ((LA11_3>=24 && LA11_3<=25)) ) {
            	                alt11=1;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 11, 3, input);

            	                throw nvae;
            	            }
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 11, 2, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalAML.g:459:6: lv_actions_3_1= ruleBinaryAction
            	            {

            	            						newCompositeNode(grammarAccess.getStateAccess().getActionsBinaryActionParserRuleCall_3_0_0());
            	            					
            	            pushFollow(FOLLOW_13);
            	            lv_actions_3_1=ruleBinaryAction();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getStateRule());
            	            						}
            	            						add(
            	            							current,
            	            							"actions",
            	            							lv_actions_3_1,
            	            							"fr.unice.polytech.dsl.arduinoml.AML.BinaryAction");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalAML.g:475:6: lv_actions_3_2= ruleAnalogAction
            	            {

            	            						newCompositeNode(grammarAccess.getStateAccess().getActionsAnalogActionParserRuleCall_3_0_1());
            	            					
            	            pushFollow(FOLLOW_13);
            	            lv_actions_3_2=ruleAnalogAction();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getStateRule());
            	            						}
            	            						add(
            	            							current,
            	            							"actions",
            	            							lv_actions_3_2,
            	            							"fr.unice.polytech.dsl.arduinoml.AML.AnalogAction");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalAML.g:493:3: ( (lv_transition_4_0= ruleTransition ) )
            // InternalAML.g:494:4: (lv_transition_4_0= ruleTransition )
            {
            // InternalAML.g:494:4: (lv_transition_4_0= ruleTransition )
            // InternalAML.g:495:5: lv_transition_4_0= ruleTransition
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


    // $ANTLR start "entryRuleBinaryAction"
    // InternalAML.g:516:1: entryRuleBinaryAction returns [EObject current=null] : iv_ruleBinaryAction= ruleBinaryAction EOF ;
    public final EObject entryRuleBinaryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryAction = null;


        try {
            // InternalAML.g:516:53: (iv_ruleBinaryAction= ruleBinaryAction EOF )
            // InternalAML.g:517:2: iv_ruleBinaryAction= ruleBinaryAction EOF
            {
             newCompositeNode(grammarAccess.getBinaryActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryAction=ruleBinaryAction();

            state._fsp--;

             current =iv_ruleBinaryAction; 
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
    // $ANTLR end "entryRuleBinaryAction"


    // $ANTLR start "ruleBinaryAction"
    // InternalAML.g:523:1: ruleBinaryAction returns [EObject current=null] : ( () ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_actionValue_3_0= ruleSIGNAL ) ) ) ) ;
    public final EObject ruleBinaryAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_actionValue_3_0 = null;



        	enterRule();

        try {
            // InternalAML.g:529:2: ( ( () ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_actionValue_3_0= ruleSIGNAL ) ) ) ) )
            // InternalAML.g:530:2: ( () ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_actionValue_3_0= ruleSIGNAL ) ) ) )
            {
            // InternalAML.g:530:2: ( () ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_actionValue_3_0= ruleSIGNAL ) ) ) )
            // InternalAML.g:531:3: () ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_actionValue_3_0= ruleSIGNAL ) ) )
            {
            // InternalAML.g:531:3: ()
            // InternalAML.g:532:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBinaryActionAccess().getBinaryActionAction_0(),
            					current);
            			

            }

            // InternalAML.g:538:3: ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_actionValue_3_0= ruleSIGNAL ) ) )
            // InternalAML.g:539:4: ( ( ruleEString ) ) otherlv_2= '->' ( (lv_actionValue_3_0= ruleSIGNAL ) )
            {
            // InternalAML.g:539:4: ( ( ruleEString ) )
            // InternalAML.g:540:5: ( ruleEString )
            {
            // InternalAML.g:540:5: ( ruleEString )
            // InternalAML.g:541:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getBinaryActionRule());
            						}
            					

            						newCompositeNode(grammarAccess.getBinaryActionAccess().getActuatorActuatorCrossReference_1_0_0());
            					
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_15); 

            				newLeafNode(otherlv_2, grammarAccess.getBinaryActionAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
            			
            // InternalAML.g:559:4: ( (lv_actionValue_3_0= ruleSIGNAL ) )
            // InternalAML.g:560:5: (lv_actionValue_3_0= ruleSIGNAL )
            {
            // InternalAML.g:560:5: (lv_actionValue_3_0= ruleSIGNAL )
            // InternalAML.g:561:6: lv_actionValue_3_0= ruleSIGNAL
            {

            						newCompositeNode(grammarAccess.getBinaryActionAccess().getActionValueSIGNALEnumRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_2);
            lv_actionValue_3_0=ruleSIGNAL();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBinaryActionRule());
            						}
            						set(
            							current,
            							"actionValue",
            							lv_actionValue_3_0,
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
    // $ANTLR end "ruleBinaryAction"


    // $ANTLR start "entryRuleAnalogAction"
    // InternalAML.g:583:1: entryRuleAnalogAction returns [EObject current=null] : iv_ruleAnalogAction= ruleAnalogAction EOF ;
    public final EObject entryRuleAnalogAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalogAction = null;


        try {
            // InternalAML.g:583:53: (iv_ruleAnalogAction= ruleAnalogAction EOF )
            // InternalAML.g:584:2: iv_ruleAnalogAction= ruleAnalogAction EOF
            {
             newCompositeNode(grammarAccess.getAnalogActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnalogAction=ruleAnalogAction();

            state._fsp--;

             current =iv_ruleAnalogAction; 
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
    // $ANTLR end "entryRuleAnalogAction"


    // $ANTLR start "ruleAnalogAction"
    // InternalAML.g:590:1: ruleAnalogAction returns [EObject current=null] : ( () ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_actionValue_3_0= ruleEInt ) ) ) ) ;
    public final EObject ruleAnalogAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_actionValue_3_0 = null;



        	enterRule();

        try {
            // InternalAML.g:596:2: ( ( () ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_actionValue_3_0= ruleEInt ) ) ) ) )
            // InternalAML.g:597:2: ( () ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_actionValue_3_0= ruleEInt ) ) ) )
            {
            // InternalAML.g:597:2: ( () ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_actionValue_3_0= ruleEInt ) ) ) )
            // InternalAML.g:598:3: () ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_actionValue_3_0= ruleEInt ) ) )
            {
            // InternalAML.g:598:3: ()
            // InternalAML.g:599:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnalogActionAccess().getAnalogActionAction_0(),
            					current);
            			

            }

            // InternalAML.g:605:3: ( ( ( ruleEString ) ) otherlv_2= '->' ( (lv_actionValue_3_0= ruleEInt ) ) )
            // InternalAML.g:606:4: ( ( ruleEString ) ) otherlv_2= '->' ( (lv_actionValue_3_0= ruleEInt ) )
            {
            // InternalAML.g:606:4: ( ( ruleEString ) )
            // InternalAML.g:607:5: ( ruleEString )
            {
            // InternalAML.g:607:5: ( ruleEString )
            // InternalAML.g:608:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getAnalogActionRule());
            						}
            					

            						newCompositeNode(grammarAccess.getAnalogActionAccess().getActuatorActuatorCrossReference_1_0_0());
            					
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_16); 

            				newLeafNode(otherlv_2, grammarAccess.getAnalogActionAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
            			
            // InternalAML.g:626:4: ( (lv_actionValue_3_0= ruleEInt ) )
            // InternalAML.g:627:5: (lv_actionValue_3_0= ruleEInt )
            {
            // InternalAML.g:627:5: (lv_actionValue_3_0= ruleEInt )
            // InternalAML.g:628:6: lv_actionValue_3_0= ruleEInt
            {

            						newCompositeNode(grammarAccess.getAnalogActionAccess().getActionValueEIntParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_2);
            lv_actionValue_3_0=ruleEInt();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getAnalogActionRule());
            						}
            						set(
            							current,
            							"actionValue",
            							lv_actionValue_3_0,
            							"fr.unice.polytech.dsl.arduinoml.AML.EInt");
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
    // $ANTLR end "ruleAnalogAction"


    // $ANTLR start "entryRuleTransition"
    // InternalAML.g:650:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalAML.g:650:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalAML.g:651:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalAML.g:657:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleMultipleElementCondition ) ) otherlv_3= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalAML.g:663:2: ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleMultipleElementCondition ) ) otherlv_3= '->' ( ( ruleEString ) ) ) )
            // InternalAML.g:664:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleMultipleElementCondition ) ) otherlv_3= '->' ( ( ruleEString ) ) )
            {
            // InternalAML.g:664:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleMultipleElementCondition ) ) otherlv_3= '->' ( ( ruleEString ) ) )
            // InternalAML.g:665:3: () otherlv_1= 'if' ( (lv_condition_2_0= ruleMultipleElementCondition ) ) otherlv_3= '->' ( ( ruleEString ) )
            {
            // InternalAML.g:665:3: ()
            // InternalAML.g:666:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getIfKeyword_1());
            		
            // InternalAML.g:676:3: ( (lv_condition_2_0= ruleMultipleElementCondition ) )
            // InternalAML.g:677:4: (lv_condition_2_0= ruleMultipleElementCondition )
            {
            // InternalAML.g:677:4: (lv_condition_2_0= ruleMultipleElementCondition )
            // InternalAML.g:678:5: lv_condition_2_0= ruleMultipleElementCondition
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getConditionMultipleElementConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
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
            		
            // InternalAML.g:699:3: ( ( ruleEString ) )
            // InternalAML.g:700:4: ( ruleEString )
            {
            // InternalAML.g:700:4: ( ruleEString )
            // InternalAML.g:701:5: ruleEString
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
    // InternalAML.g:719:1: entryRuleMultipleElementCondition returns [EObject current=null] : iv_ruleMultipleElementCondition= ruleMultipleElementCondition EOF ;
    public final EObject entryRuleMultipleElementCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleElementCondition = null;


        try {
            // InternalAML.g:719:65: (iv_ruleMultipleElementCondition= ruleMultipleElementCondition EOF )
            // InternalAML.g:720:2: iv_ruleMultipleElementCondition= ruleMultipleElementCondition EOF
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
    // InternalAML.g:726:1: ruleMultipleElementCondition returns [EObject current=null] : ( () ( ( (lv_conditions_1_1= ruleSingleElementCondition | lv_conditions_1_2= ruleValueElementCondition ) ) ) ( ( (lv_operators_2_0= ruleOPERATOR ) ) ( ( (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition ) ) ) )* ) ;
    public final EObject ruleMultipleElementCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_conditions_1_1 = null;

        EObject lv_conditions_1_2 = null;

        Enumerator lv_operators_2_0 = null;

        EObject lv_conditions_3_1 = null;

        EObject lv_conditions_3_2 = null;



        	enterRule();

        try {
            // InternalAML.g:732:2: ( ( () ( ( (lv_conditions_1_1= ruleSingleElementCondition | lv_conditions_1_2= ruleValueElementCondition ) ) ) ( ( (lv_operators_2_0= ruleOPERATOR ) ) ( ( (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition ) ) ) )* ) )
            // InternalAML.g:733:2: ( () ( ( (lv_conditions_1_1= ruleSingleElementCondition | lv_conditions_1_2= ruleValueElementCondition ) ) ) ( ( (lv_operators_2_0= ruleOPERATOR ) ) ( ( (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition ) ) ) )* )
            {
            // InternalAML.g:733:2: ( () ( ( (lv_conditions_1_1= ruleSingleElementCondition | lv_conditions_1_2= ruleValueElementCondition ) ) ) ( ( (lv_operators_2_0= ruleOPERATOR ) ) ( ( (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition ) ) ) )* )
            // InternalAML.g:734:3: () ( ( (lv_conditions_1_1= ruleSingleElementCondition | lv_conditions_1_2= ruleValueElementCondition ) ) ) ( ( (lv_operators_2_0= ruleOPERATOR ) ) ( ( (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition ) ) ) )*
            {
            // InternalAML.g:734:3: ()
            // InternalAML.g:735:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMultipleElementConditionAccess().getMultipleElementConditionAction_0(),
            					current);
            			

            }

            // InternalAML.g:741:3: ( ( (lv_conditions_1_1= ruleSingleElementCondition | lv_conditions_1_2= ruleValueElementCondition ) ) )
            // InternalAML.g:742:4: ( (lv_conditions_1_1= ruleSingleElementCondition | lv_conditions_1_2= ruleValueElementCondition ) )
            {
            // InternalAML.g:742:4: ( (lv_conditions_1_1= ruleSingleElementCondition | lv_conditions_1_2= ruleValueElementCondition ) )
            // InternalAML.g:743:5: (lv_conditions_1_1= ruleSingleElementCondition | lv_conditions_1_2= ruleValueElementCondition )
            {
            // InternalAML.g:743:5: (lv_conditions_1_1= ruleSingleElementCondition | lv_conditions_1_2= ruleValueElementCondition )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                int LA13_1 = input.LA(2);

                if ( ((LA13_1>=28 && LA13_1<=30)) ) {
                    alt13=2;
                }
                else if ( (LA13_1==21) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==RULE_ID) ) {
                int LA13_2 = input.LA(2);

                if ( ((LA13_2>=28 && LA13_2<=30)) ) {
                    alt13=2;
                }
                else if ( (LA13_2==21) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalAML.g:744:6: lv_conditions_1_1= ruleSingleElementCondition
                    {

                    						newCompositeNode(grammarAccess.getMultipleElementConditionAccess().getConditionsSingleElementConditionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_17);
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
                    // InternalAML.g:760:6: lv_conditions_1_2= ruleValueElementCondition
                    {

                    						newCompositeNode(grammarAccess.getMultipleElementConditionAccess().getConditionsValueElementConditionParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_17);
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

            // InternalAML.g:778:3: ( ( (lv_operators_2_0= ruleOPERATOR ) ) ( ( (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition ) ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=26 && LA15_0<=27)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAML.g:779:4: ( (lv_operators_2_0= ruleOPERATOR ) ) ( ( (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition ) ) )
            	    {
            	    // InternalAML.g:779:4: ( (lv_operators_2_0= ruleOPERATOR ) )
            	    // InternalAML.g:780:5: (lv_operators_2_0= ruleOPERATOR )
            	    {
            	    // InternalAML.g:780:5: (lv_operators_2_0= ruleOPERATOR )
            	    // InternalAML.g:781:6: lv_operators_2_0= ruleOPERATOR
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

            	    // InternalAML.g:798:4: ( ( (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition ) ) )
            	    // InternalAML.g:799:5: ( (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition ) )
            	    {
            	    // InternalAML.g:799:5: ( (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition ) )
            	    // InternalAML.g:800:6: (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition )
            	    {
            	    // InternalAML.g:800:6: (lv_conditions_3_1= ruleSingleElementCondition | lv_conditions_3_2= ruleValueElementCondition )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==RULE_STRING) ) {
            	        int LA14_1 = input.LA(2);

            	        if ( ((LA14_1>=28 && LA14_1<=30)) ) {
            	            alt14=2;
            	        }
            	        else if ( (LA14_1==21) ) {
            	            alt14=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 14, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA14_0==RULE_ID) ) {
            	        int LA14_2 = input.LA(2);

            	        if ( ((LA14_2>=28 && LA14_2<=30)) ) {
            	            alt14=2;
            	        }
            	        else if ( (LA14_2==21) ) {
            	            alt14=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 14, 2, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalAML.g:801:7: lv_conditions_3_1= ruleSingleElementCondition
            	            {

            	            							newCompositeNode(grammarAccess.getMultipleElementConditionAccess().getConditionsSingleElementConditionParserRuleCall_2_1_0_0());
            	            						
            	            pushFollow(FOLLOW_17);
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
            	            // InternalAML.g:817:7: lv_conditions_3_2= ruleValueElementCondition
            	            {

            	            							newCompositeNode(grammarAccess.getMultipleElementConditionAccess().getConditionsValueElementConditionParserRuleCall_2_1_0_1());
            	            						
            	            pushFollow(FOLLOW_17);
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
            	    break loop15;
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
    // InternalAML.g:840:1: entryRuleSingleElementCondition returns [EObject current=null] : iv_ruleSingleElementCondition= ruleSingleElementCondition EOF ;
    public final EObject entryRuleSingleElementCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleElementCondition = null;


        try {
            // InternalAML.g:840:63: (iv_ruleSingleElementCondition= ruleSingleElementCondition EOF )
            // InternalAML.g:841:2: iv_ruleSingleElementCondition= ruleSingleElementCondition EOF
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
    // InternalAML.g:847:1: ruleSingleElementCondition returns [EObject current=null] : ( () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSIGNAL ) ) ) ;
    public final EObject ruleSingleElementCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAML.g:853:2: ( ( () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSIGNAL ) ) ) )
            // InternalAML.g:854:2: ( () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSIGNAL ) ) )
            {
            // InternalAML.g:854:2: ( () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSIGNAL ) ) )
            // InternalAML.g:855:3: () ( ( ruleEString ) ) otherlv_2= 'is' ( (lv_value_3_0= ruleSIGNAL ) )
            {
            // InternalAML.g:855:3: ()
            // InternalAML.g:856:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSingleElementConditionAccess().getSingleElementConditionAction_0(),
            					current);
            			

            }

            // InternalAML.g:862:3: ( ( ruleEString ) )
            // InternalAML.g:863:4: ( ruleEString )
            {
            // InternalAML.g:863:4: ( ruleEString )
            // InternalAML.g:864:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleElementConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSingleElementConditionAccess().getSensorBinarySensorCrossReference_1_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSingleElementConditionAccess().getIsKeyword_2());
            		
            // InternalAML.g:882:3: ( (lv_value_3_0= ruleSIGNAL ) )
            // InternalAML.g:883:4: (lv_value_3_0= ruleSIGNAL )
            {
            // InternalAML.g:883:4: (lv_value_3_0= ruleSIGNAL )
            // InternalAML.g:884:5: lv_value_3_0= ruleSIGNAL
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
    // InternalAML.g:905:1: entryRuleValueElementCondition returns [EObject current=null] : iv_ruleValueElementCondition= ruleValueElementCondition EOF ;
    public final EObject entryRuleValueElementCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueElementCondition = null;


        try {
            // InternalAML.g:905:62: (iv_ruleValueElementCondition= ruleValueElementCondition EOF )
            // InternalAML.g:906:2: iv_ruleValueElementCondition= ruleValueElementCondition EOF
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
    // InternalAML.g:912:1: ruleValueElementCondition returns [EObject current=null] : ( () ( ( ruleEString ) ) ( (lv_comparator_2_0= ruleCOMPARATOR ) ) ( (lv_value_3_0= ruleEFloat ) ) ) ;
    public final EObject ruleValueElementCondition() throws RecognitionException {
        EObject current = null;

        Enumerator lv_comparator_2_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAML.g:918:2: ( ( () ( ( ruleEString ) ) ( (lv_comparator_2_0= ruleCOMPARATOR ) ) ( (lv_value_3_0= ruleEFloat ) ) ) )
            // InternalAML.g:919:2: ( () ( ( ruleEString ) ) ( (lv_comparator_2_0= ruleCOMPARATOR ) ) ( (lv_value_3_0= ruleEFloat ) ) )
            {
            // InternalAML.g:919:2: ( () ( ( ruleEString ) ) ( (lv_comparator_2_0= ruleCOMPARATOR ) ) ( (lv_value_3_0= ruleEFloat ) ) )
            // InternalAML.g:920:3: () ( ( ruleEString ) ) ( (lv_comparator_2_0= ruleCOMPARATOR ) ) ( (lv_value_3_0= ruleEFloat ) )
            {
            // InternalAML.g:920:3: ()
            // InternalAML.g:921:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueElementConditionAccess().getValueElementConditionAction_0(),
            					current);
            			

            }

            // InternalAML.g:927:3: ( ( ruleEString ) )
            // InternalAML.g:928:4: ( ruleEString )
            {
            // InternalAML.g:928:4: ( ruleEString )
            // InternalAML.g:929:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueElementConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getValueElementConditionAccess().getSensorAnalogSensorCrossReference_1_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAML.g:943:3: ( (lv_comparator_2_0= ruleCOMPARATOR ) )
            // InternalAML.g:944:4: (lv_comparator_2_0= ruleCOMPARATOR )
            {
            // InternalAML.g:944:4: (lv_comparator_2_0= ruleCOMPARATOR )
            // InternalAML.g:945:5: lv_comparator_2_0= ruleCOMPARATOR
            {

            					newCompositeNode(grammarAccess.getValueElementConditionAccess().getComparatorCOMPARATOREnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalAML.g:962:3: ( (lv_value_3_0= ruleEFloat ) )
            // InternalAML.g:963:4: (lv_value_3_0= ruleEFloat )
            {
            // InternalAML.g:963:4: (lv_value_3_0= ruleEFloat )
            // InternalAML.g:964:5: lv_value_3_0= ruleEFloat
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
    // InternalAML.g:985:1: entryRuleBinarySensor returns [EObject current=null] : iv_ruleBinarySensor= ruleBinarySensor EOF ;
    public final EObject entryRuleBinarySensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinarySensor = null;


        try {
            // InternalAML.g:985:53: (iv_ruleBinarySensor= ruleBinarySensor EOF )
            // InternalAML.g:986:2: iv_ruleBinarySensor= ruleBinarySensor EOF
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
    // InternalAML.g:992:1: ruleBinarySensor returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEString ) ) ) ;
    public final EObject ruleBinarySensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_pin_3_0 = null;



        	enterRule();

        try {
            // InternalAML.g:998:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEString ) ) ) )
            // InternalAML.g:999:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEString ) ) )
            {
            // InternalAML.g:999:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEString ) ) )
            // InternalAML.g:1000:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEString ) )
            {
            // InternalAML.g:1000:3: ()
            // InternalAML.g:1001:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBinarySensorAccess().getBinarySensorAction_0(),
            					current);
            			

            }

            // InternalAML.g:1007:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAML.g:1008:4: (lv_name_1_0= ruleEString )
            {
            // InternalAML.g:1008:4: (lv_name_1_0= ruleEString )
            // InternalAML.g:1009:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBinarySensorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_2=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getBinarySensorAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalAML.g:1030:3: ( (lv_pin_3_0= ruleEString ) )
            // InternalAML.g:1031:4: (lv_pin_3_0= ruleEString )
            {
            // InternalAML.g:1031:4: (lv_pin_3_0= ruleEString )
            // InternalAML.g:1032:5: lv_pin_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBinarySensorAccess().getPinEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_pin_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinarySensorRule());
            					}
            					set(
            						current,
            						"pin",
            						lv_pin_3_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.EString");
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
    // InternalAML.g:1053:1: entryRuleAnalogSensor returns [EObject current=null] : iv_ruleAnalogSensor= ruleAnalogSensor EOF ;
    public final EObject entryRuleAnalogSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalogSensor = null;


        try {
            // InternalAML.g:1053:53: (iv_ruleAnalogSensor= ruleAnalogSensor EOF )
            // InternalAML.g:1054:2: iv_ruleAnalogSensor= ruleAnalogSensor EOF
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
    // InternalAML.g:1060:1: ruleAnalogSensor returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEString ) ) ) ;
    public final EObject ruleAnalogSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_pin_3_0 = null;



        	enterRule();

        try {
            // InternalAML.g:1066:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEString ) ) ) )
            // InternalAML.g:1067:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEString ) ) )
            {
            // InternalAML.g:1067:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEString ) ) )
            // InternalAML.g:1068:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEString ) )
            {
            // InternalAML.g:1068:3: ()
            // InternalAML.g:1069:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnalogSensorAccess().getAnalogSensorAction_0(),
            					current);
            			

            }

            // InternalAML.g:1075:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAML.g:1076:4: (lv_name_1_0= ruleEString )
            {
            // InternalAML.g:1076:4: (lv_name_1_0= ruleEString )
            // InternalAML.g:1077:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAnalogSensorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_2=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAnalogSensorAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalAML.g:1098:3: ( (lv_pin_3_0= ruleEString ) )
            // InternalAML.g:1099:4: (lv_pin_3_0= ruleEString )
            {
            // InternalAML.g:1099:4: (lv_pin_3_0= ruleEString )
            // InternalAML.g:1100:5: lv_pin_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAnalogSensorAccess().getPinEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_pin_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnalogSensorRule());
            					}
            					set(
            						current,
            						"pin",
            						lv_pin_3_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.EString");
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


    // $ANTLR start "entryRuleAnalogActuator"
    // InternalAML.g:1121:1: entryRuleAnalogActuator returns [EObject current=null] : iv_ruleAnalogActuator= ruleAnalogActuator EOF ;
    public final EObject entryRuleAnalogActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalogActuator = null;


        try {
            // InternalAML.g:1121:55: (iv_ruleAnalogActuator= ruleAnalogActuator EOF )
            // InternalAML.g:1122:2: iv_ruleAnalogActuator= ruleAnalogActuator EOF
            {
             newCompositeNode(grammarAccess.getAnalogActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnalogActuator=ruleAnalogActuator();

            state._fsp--;

             current =iv_ruleAnalogActuator; 
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
    // $ANTLR end "entryRuleAnalogActuator"


    // $ANTLR start "ruleAnalogActuator"
    // InternalAML.g:1128:1: ruleAnalogActuator returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEString ) ) ) ;
    public final EObject ruleAnalogActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_pin_3_0 = null;



        	enterRule();

        try {
            // InternalAML.g:1134:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEString ) ) ) )
            // InternalAML.g:1135:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEString ) ) )
            {
            // InternalAML.g:1135:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEString ) ) )
            // InternalAML.g:1136:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEString ) )
            {
            // InternalAML.g:1136:3: ()
            // InternalAML.g:1137:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnalogActuatorAccess().getAnalogActuatorAction_0(),
            					current);
            			

            }

            // InternalAML.g:1143:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAML.g:1144:4: (lv_name_1_0= ruleEString )
            {
            // InternalAML.g:1144:4: (lv_name_1_0= ruleEString )
            // InternalAML.g:1145:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAnalogActuatorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnalogActuatorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAnalogActuatorAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalAML.g:1166:3: ( (lv_pin_3_0= ruleEString ) )
            // InternalAML.g:1167:4: (lv_pin_3_0= ruleEString )
            {
            // InternalAML.g:1167:4: (lv_pin_3_0= ruleEString )
            // InternalAML.g:1168:5: lv_pin_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAnalogActuatorAccess().getPinEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_pin_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnalogActuatorRule());
            					}
            					set(
            						current,
            						"pin",
            						lv_pin_3_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.EString");
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
    // $ANTLR end "ruleAnalogActuator"


    // $ANTLR start "entryRuleBinaryActuator"
    // InternalAML.g:1189:1: entryRuleBinaryActuator returns [EObject current=null] : iv_ruleBinaryActuator= ruleBinaryActuator EOF ;
    public final EObject entryRuleBinaryActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryActuator = null;


        try {
            // InternalAML.g:1189:55: (iv_ruleBinaryActuator= ruleBinaryActuator EOF )
            // InternalAML.g:1190:2: iv_ruleBinaryActuator= ruleBinaryActuator EOF
            {
             newCompositeNode(grammarAccess.getBinaryActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryActuator=ruleBinaryActuator();

            state._fsp--;

             current =iv_ruleBinaryActuator; 
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
    // $ANTLR end "entryRuleBinaryActuator"


    // $ANTLR start "ruleBinaryActuator"
    // InternalAML.g:1196:1: ruleBinaryActuator returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEString ) ) ) ;
    public final EObject ruleBinaryActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_pin_3_0 = null;



        	enterRule();

        try {
            // InternalAML.g:1202:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEString ) ) ) )
            // InternalAML.g:1203:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEString ) ) )
            {
            // InternalAML.g:1203:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEString ) ) )
            // InternalAML.g:1204:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_pin_3_0= ruleEString ) )
            {
            // InternalAML.g:1204:3: ()
            // InternalAML.g:1205:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBinaryActuatorAccess().getBinaryActuatorAction_0(),
            					current);
            			

            }

            // InternalAML.g:1211:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAML.g:1212:4: (lv_name_1_0= ruleEString )
            {
            // InternalAML.g:1212:4: (lv_name_1_0= ruleEString )
            // InternalAML.g:1213:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBinaryActuatorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryActuatorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getBinaryActuatorAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalAML.g:1234:3: ( (lv_pin_3_0= ruleEString ) )
            // InternalAML.g:1235:4: (lv_pin_3_0= ruleEString )
            {
            // InternalAML.g:1235:4: (lv_pin_3_0= ruleEString )
            // InternalAML.g:1236:5: lv_pin_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBinaryActuatorAccess().getPinEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_pin_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryActuatorRule());
            					}
            					set(
            						current,
            						"pin",
            						lv_pin_3_0,
            						"fr.unice.polytech.dsl.arduinoml.AML.EString");
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
    // $ANTLR end "ruleBinaryActuator"


    // $ANTLR start "entryRuleEString"
    // InternalAML.g:1257:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAML.g:1257:47: (iv_ruleEString= ruleEString EOF )
            // InternalAML.g:1258:2: iv_ruleEString= ruleEString EOF
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
    // InternalAML.g:1264:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAML.g:1270:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAML.g:1271:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAML.g:1271:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalAML.g:1272:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAML.g:1280:3: this_ID_1= RULE_ID
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
    // InternalAML.g:1291:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalAML.g:1291:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalAML.g:1292:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalAML.g:1298:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalAML.g:1304:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalAML.g:1305:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalAML.g:1305:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalAML.g:1306:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalAML.g:1306:3: (kw= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAML.g:1307:4: kw= '-'
                    {
                    kw=(Token)match(input,22,FOLLOW_20); 

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
    // InternalAML.g:1324:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalAML.g:1324:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalAML.g:1325:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalAML.g:1331:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT )+ )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalAML.g:1337:2: ( (this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT )+ )? ) )
            // InternalAML.g:1338:2: (this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT )+ )? )
            {
            // InternalAML.g:1338:2: (this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT )+ )? )
            // InternalAML.g:1339:3: this_INT_0= RULE_INT (kw= '.' (this_INT_2= RULE_INT )+ )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0());
            		
            // InternalAML.g:1346:3: (kw= '.' (this_INT_2= RULE_INT )+ )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAML.g:1347:4: kw= '.' (this_INT_2= RULE_INT )+
                    {
                    kw=(Token)match(input,23,FOLLOW_20); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_1_0());
                    			
                    // InternalAML.g:1352:4: (this_INT_2= RULE_INT )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_INT) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalAML.g:1353:5: this_INT_2= RULE_INT
                    	    {
                    	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_22); 

                    	    					current.merge(this_INT_2);
                    	    				

                    	    					newLeafNode(this_INT_2, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
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
    // InternalAML.g:1366:1: ruleSIGNAL returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) ;
    public final Enumerator ruleSIGNAL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAML.g:1372:2: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) )
            // InternalAML.g:1373:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            {
            // InternalAML.g:1373:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            else if ( (LA20_0==25) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalAML.g:1374:3: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalAML.g:1374:3: (enumLiteral_0= 'HIGH' )
                    // InternalAML.g:1375:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAML.g:1382:3: (enumLiteral_1= 'LOW' )
                    {
                    // InternalAML.g:1382:3: (enumLiteral_1= 'LOW' )
                    // InternalAML.g:1383:4: enumLiteral_1= 'LOW'
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
    // InternalAML.g:1393:1: ruleOPERATOR returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleOPERATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAML.g:1399:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // InternalAML.g:1400:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // InternalAML.g:1400:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            else if ( (LA21_0==27) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalAML.g:1401:3: (enumLiteral_0= 'and' )
                    {
                    // InternalAML.g:1401:3: (enumLiteral_0= 'and' )
                    // InternalAML.g:1402:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getOPERATORAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOPERATORAccess().getAndEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAML.g:1409:3: (enumLiteral_1= 'or' )
                    {
                    // InternalAML.g:1409:3: (enumLiteral_1= 'or' )
                    // InternalAML.g:1410:4: enumLiteral_1= 'or'
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
    // InternalAML.g:1420:1: ruleCOMPARATOR returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) ) ;
    public final Enumerator ruleCOMPARATOR() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAML.g:1426:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) ) )
            // InternalAML.g:1427:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) )
            {
            // InternalAML.g:1427:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt22=1;
                }
                break;
            case 29:
                {
                alt22=2;
                }
                break;
            case 30:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalAML.g:1428:3: (enumLiteral_0= '=' )
                    {
                    // InternalAML.g:1428:3: (enumLiteral_0= '=' )
                    // InternalAML.g:1429:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARATORAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCOMPARATORAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAML.g:1436:3: (enumLiteral_1= '<' )
                    {
                    // InternalAML.g:1436:3: (enumLiteral_1= '<' )
                    // InternalAML.g:1437:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getCOMPARATORAccess().getINFERIOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCOMPARATORAccess().getINFERIOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAML.g:1444:3: (enumLiteral_2= '>' )
                    {
                    // InternalAML.g:1444:3: (enumLiteral_2= '>' )
                    // InternalAML.g:1445:4: enumLiteral_2= '>'
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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000028030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000042L});

}