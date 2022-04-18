package org.xtext.example.mydsl2.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl2.services.TrustworthyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTrustworthyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Room'", "'with'", "'sensor'", "'and'", "'preset'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalTrustworthyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTrustworthyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTrustworthyParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTrustworthy.g"; }



     	private TrustworthyGrammarAccess grammarAccess;

        public InternalTrustworthyParser(TokenStream input, TrustworthyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected TrustworthyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalTrustworthy.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTrustworthy.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalTrustworthy.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTrustworthy.g:71:1: ruleModel returns [EObject current=null] : ( (lv_rooms_0_0= ruleRoom ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_rooms_0_0 = null;



        	enterRule();

        try {
            // InternalTrustworthy.g:77:2: ( ( (lv_rooms_0_0= ruleRoom ) )* )
            // InternalTrustworthy.g:78:2: ( (lv_rooms_0_0= ruleRoom ) )*
            {
            // InternalTrustworthy.g:78:2: ( (lv_rooms_0_0= ruleRoom ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTrustworthy.g:79:3: (lv_rooms_0_0= ruleRoom )
            	    {
            	    // InternalTrustworthy.g:79:3: (lv_rooms_0_0= ruleRoom )
            	    // InternalTrustworthy.g:80:4: lv_rooms_0_0= ruleRoom
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getRoomsRoomParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_rooms_0_0=ruleRoom();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"rooms",
            	    					lv_rooms_0_0,
            	    					"org.xtext.example.mydsl2.Trustworthy.Room");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRoom"
    // InternalTrustworthy.g:100:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalTrustworthy.g:100:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalTrustworthy.g:101:2: iv_ruleRoom= ruleRoom EOF
            {
             newCompositeNode(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoom=ruleRoom();

            state._fsp--;

             current =iv_ruleRoom; 
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
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalTrustworthy.g:107:1: ruleRoom returns [EObject current=null] : ( (otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) ) | ( () otherlv_3= 'with' ( (lv_sensors_4_0= ruleSensor ) )* ) ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_sensors_4_0 = null;



        	enterRule();

        try {
            // InternalTrustworthy.g:113:2: ( ( (otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) ) | ( () otherlv_3= 'with' ( (lv_sensors_4_0= ruleSensor ) )* ) ) )
            // InternalTrustworthy.g:114:2: ( (otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) ) | ( () otherlv_3= 'with' ( (lv_sensors_4_0= ruleSensor ) )* ) )
            {
            // InternalTrustworthy.g:114:2: ( (otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) ) | ( () otherlv_3= 'with' ( (lv_sensors_4_0= ruleSensor ) )* ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTrustworthy.g:115:3: (otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // InternalTrustworthy.g:115:3: (otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) )
                    // InternalTrustworthy.g:116:4: otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getRoomAccess().getRoomKeyword_0_0());
                    			
                    // InternalTrustworthy.g:120:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalTrustworthy.g:121:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalTrustworthy.g:121:5: (lv_name_1_0= RULE_ID )
                    // InternalTrustworthy.g:122:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getRoomAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRoomRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTrustworthy.g:140:3: ( () otherlv_3= 'with' ( (lv_sensors_4_0= ruleSensor ) )* )
                    {
                    // InternalTrustworthy.g:140:3: ( () otherlv_3= 'with' ( (lv_sensors_4_0= ruleSensor ) )* )
                    // InternalTrustworthy.g:141:4: () otherlv_3= 'with' ( (lv_sensors_4_0= ruleSensor ) )*
                    {
                    // InternalTrustworthy.g:141:4: ()
                    // InternalTrustworthy.g:142:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRoomAccess().getSensorPartAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getWithKeyword_1_1());
                    			
                    // InternalTrustworthy.g:152:4: ( (lv_sensors_4_0= ruleSensor ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_INT) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalTrustworthy.g:153:5: (lv_sensors_4_0= ruleSensor )
                    	    {
                    	    // InternalTrustworthy.g:153:5: (lv_sensors_4_0= ruleSensor )
                    	    // InternalTrustworthy.g:154:6: lv_sensors_4_0= ruleSensor
                    	    {

                    	    						newCompositeNode(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_1_2_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_sensors_4_0=ruleSensor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRoomRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"sensors",
                    	    							lv_sensors_4_0,
                    	    							"org.xtext.example.mydsl2.Trustworthy.Sensor");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


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
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleSensor"
    // InternalTrustworthy.g:176:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalTrustworthy.g:176:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalTrustworthy.g:177:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalTrustworthy.g:183:1: ruleSensor returns [EObject current=null] : ( ( (lv_amount_0_0= RULE_INT ) ) otherlv_1= 'sensor' otherlv_2= 'and' ( (lv_preset_3_0= RULE_ID ) ) otherlv_4= 'preset' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token lv_amount_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_preset_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTrustworthy.g:189:2: ( ( ( (lv_amount_0_0= RULE_INT ) ) otherlv_1= 'sensor' otherlv_2= 'and' ( (lv_preset_3_0= RULE_ID ) ) otherlv_4= 'preset' ) )
            // InternalTrustworthy.g:190:2: ( ( (lv_amount_0_0= RULE_INT ) ) otherlv_1= 'sensor' otherlv_2= 'and' ( (lv_preset_3_0= RULE_ID ) ) otherlv_4= 'preset' )
            {
            // InternalTrustworthy.g:190:2: ( ( (lv_amount_0_0= RULE_INT ) ) otherlv_1= 'sensor' otherlv_2= 'and' ( (lv_preset_3_0= RULE_ID ) ) otherlv_4= 'preset' )
            // InternalTrustworthy.g:191:3: ( (lv_amount_0_0= RULE_INT ) ) otherlv_1= 'sensor' otherlv_2= 'and' ( (lv_preset_3_0= RULE_ID ) ) otherlv_4= 'preset'
            {
            // InternalTrustworthy.g:191:3: ( (lv_amount_0_0= RULE_INT ) )
            // InternalTrustworthy.g:192:4: (lv_amount_0_0= RULE_INT )
            {
            // InternalTrustworthy.g:192:4: (lv_amount_0_0= RULE_INT )
            // InternalTrustworthy.g:193:5: lv_amount_0_0= RULE_INT
            {
            lv_amount_0_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_amount_0_0, grammarAccess.getSensorAccess().getAmountINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amount",
            						lv_amount_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getAndKeyword_2());
            		
            // InternalTrustworthy.g:217:3: ( (lv_preset_3_0= RULE_ID ) )
            // InternalTrustworthy.g:218:4: (lv_preset_3_0= RULE_ID )
            {
            // InternalTrustworthy.g:218:4: (lv_preset_3_0= RULE_ID )
            // InternalTrustworthy.g:219:5: lv_preset_3_0= RULE_ID
            {
            lv_preset_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_preset_3_0, grammarAccess.getSensorAccess().getPresetIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"preset",
            						lv_preset_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getPresetKeyword_4());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});

}