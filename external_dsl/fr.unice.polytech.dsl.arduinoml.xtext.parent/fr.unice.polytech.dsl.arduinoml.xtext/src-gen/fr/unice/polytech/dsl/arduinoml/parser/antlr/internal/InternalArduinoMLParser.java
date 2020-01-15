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
import fr.unice.polytech.dsl.arduinoml.services.ArduinoMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArduinoMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Action'", "'{'", "'value'", "'actuator'", "'}'", "'-'", "'HIGH'", "'LOW'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalArduinoMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalArduinoMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalArduinoMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalArduinoML.g"; }



     	private ArduinoMLGrammarAccess grammarAccess;

        public InternalArduinoMLParser(TokenStream input, ArduinoMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Action";
       	}

       	@Override
       	protected ArduinoMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAction"
    // InternalArduinoML.g:65:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalArduinoML.g:65:47: (iv_ruleAction= ruleAction EOF )
            // InternalArduinoML.g:66:2: iv_ruleAction= ruleAction EOF
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
    // InternalArduinoML.g:72:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}' ) ;
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
            // InternalArduinoML.g:78:2: ( (otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalArduinoML.g:79:2: (otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalArduinoML.g:79:2: (otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalArduinoML.g:80:3: otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalArduinoML.g:88:3: (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalArduinoML.g:89:4: otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getValueKeyword_2_0());
                    			
                    // InternalArduinoML.g:93:4: ( (lv_value_3_0= ruleSIGNAL ) )
                    // InternalArduinoML.g:94:5: (lv_value_3_0= ruleSIGNAL )
                    {
                    // InternalArduinoML.g:94:5: (lv_value_3_0= ruleSIGNAL )
                    // InternalArduinoML.g:95:6: lv_value_3_0= ruleSIGNAL
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getValueSIGNALEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_value_3_0=ruleSIGNAL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"fr.unice.polytech.dsl.arduinoml.ArduinoML.SIGNAL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getActuatorKeyword_3());
            		
            // InternalArduinoML.g:117:3: ( ( ruleEString ) )
            // InternalArduinoML.g:118:4: ( ruleEString )
            {
            // InternalArduinoML.g:118:4: ( ruleEString )
            // InternalArduinoML.g:119:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_4_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEString"
    // InternalArduinoML.g:141:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalArduinoML.g:141:47: (iv_ruleEString= ruleEString EOF )
            // InternalArduinoML.g:142:2: iv_ruleEString= ruleEString EOF
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
    // InternalArduinoML.g:148:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:154:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalArduinoML.g:155:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalArduinoML.g:155:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalArduinoML.g:156:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:164:3: this_ID_1= RULE_ID
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
    // InternalArduinoML.g:175:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalArduinoML.g:175:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalArduinoML.g:176:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalArduinoML.g:182:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:188:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalArduinoML.g:189:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalArduinoML.g:189:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalArduinoML.g:190:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalArduinoML.g:190:3: (kw= '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalArduinoML.g:191:4: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_9); 

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
    // InternalArduinoML.g:208:1: ruleSIGNAL returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) ;
    public final Enumerator ruleSIGNAL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalArduinoML.g:214:2: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) )
            // InternalArduinoML.g:215:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            {
            // InternalArduinoML.g:215:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalArduinoML.g:216:3: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalArduinoML.g:216:3: (enumLiteral_0= 'HIGH' )
                    // InternalArduinoML.g:217:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoML.g:224:3: (enumLiteral_1= 'LOW' )
                    {
                    // InternalArduinoML.g:224:3: (enumLiteral_1= 'LOW' )
                    // InternalArduinoML.g:225:4: enumLiteral_1= 'LOW'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});

}