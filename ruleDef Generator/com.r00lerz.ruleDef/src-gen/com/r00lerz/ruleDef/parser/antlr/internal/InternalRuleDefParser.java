package com.r00lerz.ruleDef.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.r00lerz.ruleDef.services.RuleDefGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRuleDefParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "' '", "'.'", "'bigger than'", "'smaller than'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalRuleDefParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRuleDefParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRuleDefParser.tokenNames; }
    public String getGrammarFileName() { return "../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g"; }



     	private RuleDefGrammarAccess grammarAccess;
     	
        public InternalRuleDefParser(TokenStream input, RuleDefGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "BusinessRule";	
       	}
       	
       	@Override
       	protected RuleDefGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleBusinessRule"
    // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:67:1: entryRuleBusinessRule returns [EObject current=null] : iv_ruleBusinessRule= ruleBusinessRule EOF ;
    public final EObject entryRuleBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessRule = null;


        try {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:68:2: (iv_ruleBusinessRule= ruleBusinessRule EOF )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:69:2: iv_ruleBusinessRule= ruleBusinessRule EOF
            {
             newCompositeNode(grammarAccess.getBusinessRuleRule()); 
            pushFollow(FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule75);
            iv_ruleBusinessRule=ruleBusinessRule();

            state._fsp--;

             current =iv_ruleBusinessRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessRule85); 

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
    // $ANTLR end "entryRuleBusinessRule"


    // $ANTLR start "ruleBusinessRule"
    // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:76:1: ruleBusinessRule returns [EObject current=null] : ( ( (lv_columnvalue_0_0= ruleColumnValue ) ) otherlv_1= ' ' ( (lv_operator_2_0= ruleOperator ) ) otherlv_3= ' ' ( (lv_value_4_0= ruleValue ) ) ) ;
    public final EObject ruleBusinessRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_columnvalue_0_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:79:28: ( ( ( (lv_columnvalue_0_0= ruleColumnValue ) ) otherlv_1= ' ' ( (lv_operator_2_0= ruleOperator ) ) otherlv_3= ' ' ( (lv_value_4_0= ruleValue ) ) ) )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:80:1: ( ( (lv_columnvalue_0_0= ruleColumnValue ) ) otherlv_1= ' ' ( (lv_operator_2_0= ruleOperator ) ) otherlv_3= ' ' ( (lv_value_4_0= ruleValue ) ) )
            {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:80:1: ( ( (lv_columnvalue_0_0= ruleColumnValue ) ) otherlv_1= ' ' ( (lv_operator_2_0= ruleOperator ) ) otherlv_3= ' ' ( (lv_value_4_0= ruleValue ) ) )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:80:2: ( (lv_columnvalue_0_0= ruleColumnValue ) ) otherlv_1= ' ' ( (lv_operator_2_0= ruleOperator ) ) otherlv_3= ' ' ( (lv_value_4_0= ruleValue ) )
            {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:80:2: ( (lv_columnvalue_0_0= ruleColumnValue ) )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:81:1: (lv_columnvalue_0_0= ruleColumnValue )
            {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:81:1: (lv_columnvalue_0_0= ruleColumnValue )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:82:3: lv_columnvalue_0_0= ruleColumnValue
            {
             
            	        newCompositeNode(grammarAccess.getBusinessRuleAccess().getColumnvalueColumnValueParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleColumnValue_in_ruleBusinessRule131);
            lv_columnvalue_0_0=ruleColumnValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBusinessRuleRule());
            	        }
                   		set(
                   			current, 
                   			"columnvalue",
                    		lv_columnvalue_0_0, 
                    		"ColumnValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleBusinessRule143); 

                	newLeafNode(otherlv_1, grammarAccess.getBusinessRuleAccess().getSpaceKeyword_1());
                
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:102:1: ( (lv_operator_2_0= ruleOperator ) )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:103:1: (lv_operator_2_0= ruleOperator )
            {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:103:1: (lv_operator_2_0= ruleOperator )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:104:3: lv_operator_2_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getBusinessRuleAccess().getOperatorOperatorParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleOperator_in_ruleBusinessRule164);
            lv_operator_2_0=ruleOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBusinessRuleRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_2_0, 
                    		"Operator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleBusinessRule176); 

                	newLeafNode(otherlv_3, grammarAccess.getBusinessRuleAccess().getSpaceKeyword_3());
                
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:124:1: ( (lv_value_4_0= ruleValue ) )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:125:1: (lv_value_4_0= ruleValue )
            {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:125:1: (lv_value_4_0= ruleValue )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:126:3: lv_value_4_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getBusinessRuleAccess().getValueValueParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleBusinessRule197);
            lv_value_4_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBusinessRuleRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"Value");
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
    // $ANTLR end "ruleBusinessRule"


    // $ANTLR start "entryRuleValue"
    // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:150:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:151:2: (iv_ruleValue= ruleValue EOF )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:152:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue233);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue243); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:159:1: ruleValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleStaticValue ) ) | this_ColumnValue_1= ruleColumnValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject this_ColumnValue_1 = null;


         enterRule(); 
            
        try {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:162:28: ( ( ( (lv_value_0_0= ruleStaticValue ) ) | this_ColumnValue_1= ruleColumnValue ) )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:163:1: ( ( (lv_value_0_0= ruleStaticValue ) ) | this_ColumnValue_1= ruleColumnValue )
            {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:163:1: ( ( (lv_value_0_0= ruleStaticValue ) ) | this_ColumnValue_1= ruleColumnValue )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:163:2: ( (lv_value_0_0= ruleStaticValue ) )
                    {
                    // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:163:2: ( (lv_value_0_0= ruleStaticValue ) )
                    // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:164:1: (lv_value_0_0= ruleStaticValue )
                    {
                    // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:164:1: (lv_value_0_0= ruleStaticValue )
                    // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:165:3: lv_value_0_0= ruleStaticValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getValueAccess().getValueStaticValueParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStaticValue_in_ruleValue289);
                    lv_value_0_0=ruleStaticValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValueRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_0_0, 
                            		"StaticValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:183:5: this_ColumnValue_1= ruleColumnValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getColumnValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleColumnValue_in_ruleValue317);
                    this_ColumnValue_1=ruleColumnValue();

                    state._fsp--;

                     
                            current = this_ColumnValue_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleColumnValue"
    // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:199:1: entryRuleColumnValue returns [EObject current=null] : iv_ruleColumnValue= ruleColumnValue EOF ;
    public final EObject entryRuleColumnValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnValue = null;


        try {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:200:2: (iv_ruleColumnValue= ruleColumnValue EOF )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:201:2: iv_ruleColumnValue= ruleColumnValue EOF
            {
             newCompositeNode(grammarAccess.getColumnValueRule()); 
            pushFollow(FOLLOW_ruleColumnValue_in_entryRuleColumnValue352);
            iv_ruleColumnValue=ruleColumnValue();

            state._fsp--;

             current =iv_ruleColumnValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnValue362); 

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
    // $ANTLR end "entryRuleColumnValue"


    // $ANTLR start "ruleColumnValue"
    // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:208:1: ruleColumnValue returns [EObject current=null] : ( ( (lv_tablename_0_0= ruleTableName ) ) otherlv_1= '.' ( (lv_columname_2_0= ruleColumnName ) ) ) ;
    public final EObject ruleColumnValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_tablename_0_0 = null;

        EObject lv_columname_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:211:28: ( ( ( (lv_tablename_0_0= ruleTableName ) ) otherlv_1= '.' ( (lv_columname_2_0= ruleColumnName ) ) ) )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:212:1: ( ( (lv_tablename_0_0= ruleTableName ) ) otherlv_1= '.' ( (lv_columname_2_0= ruleColumnName ) ) )
            {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:212:1: ( ( (lv_tablename_0_0= ruleTableName ) ) otherlv_1= '.' ( (lv_columname_2_0= ruleColumnName ) ) )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:212:2: ( (lv_tablename_0_0= ruleTableName ) ) otherlv_1= '.' ( (lv_columname_2_0= ruleColumnName ) )
            {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:212:2: ( (lv_tablename_0_0= ruleTableName ) )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:213:1: (lv_tablename_0_0= ruleTableName )
            {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:213:1: (lv_tablename_0_0= ruleTableName )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:214:3: lv_tablename_0_0= ruleTableName
            {
             
            	        newCompositeNode(grammarAccess.getColumnValueAccess().getTablenameTableNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTableName_in_ruleColumnValue408);
            lv_tablename_0_0=ruleTableName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getColumnValueRule());
            	        }
                   		set(
                   			current, 
                   			"tablename",
                    		lv_tablename_0_0, 
                    		"TableName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleColumnValue420); 

                	newLeafNode(otherlv_1, grammarAccess.getColumnValueAccess().getFullStopKeyword_1());
                
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:234:1: ( (lv_columname_2_0= ruleColumnName ) )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:235:1: (lv_columname_2_0= ruleColumnName )
            {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:235:1: (lv_columname_2_0= ruleColumnName )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:236:3: lv_columname_2_0= ruleColumnName
            {
             
            	        newCompositeNode(grammarAccess.getColumnValueAccess().getColumnameColumnNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleColumnName_in_ruleColumnValue441);
            lv_columname_2_0=ruleColumnName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getColumnValueRule());
            	        }
                   		set(
                   			current, 
                   			"columname",
                    		lv_columname_2_0, 
                    		"ColumnName");
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
    // $ANTLR end "ruleColumnValue"


    // $ANTLR start "entryRuleColumnName"
    // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:260:1: entryRuleColumnName returns [EObject current=null] : iv_ruleColumnName= ruleColumnName EOF ;
    public final EObject entryRuleColumnName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnName = null;


        try {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:261:2: (iv_ruleColumnName= ruleColumnName EOF )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:262:2: iv_ruleColumnName= ruleColumnName EOF
            {
             newCompositeNode(grammarAccess.getColumnNameRule()); 
            pushFollow(FOLLOW_ruleColumnName_in_entryRuleColumnName477);
            iv_ruleColumnName=ruleColumnName();

            state._fsp--;

             current =iv_ruleColumnName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnName487); 

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
    // $ANTLR end "entryRuleColumnName"


    // $ANTLR start "ruleColumnName"
    // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:269:1: ruleColumnName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleColumnName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:272:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:273:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:273:1: ( (lv_name_0_0= RULE_ID ) )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:274:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:274:1: (lv_name_0_0= RULE_ID )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:275:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumnName528); 

            			newLeafNode(lv_name_0_0, grammarAccess.getColumnNameAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColumnNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleColumnName"


    // $ANTLR start "entryRuleTableName"
    // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:299:1: entryRuleTableName returns [EObject current=null] : iv_ruleTableName= ruleTableName EOF ;
    public final EObject entryRuleTableName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableName = null;


        try {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:300:2: (iv_ruleTableName= ruleTableName EOF )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:301:2: iv_ruleTableName= ruleTableName EOF
            {
             newCompositeNode(grammarAccess.getTableNameRule()); 
            pushFollow(FOLLOW_ruleTableName_in_entryRuleTableName568);
            iv_ruleTableName=ruleTableName();

            state._fsp--;

             current =iv_ruleTableName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableName578); 

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
    // $ANTLR end "entryRuleTableName"


    // $ANTLR start "ruleTableName"
    // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:308:1: ruleTableName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTableName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:311:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:312:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:312:1: ( (lv_name_0_0= RULE_ID ) )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:313:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:313:1: (lv_name_0_0= RULE_ID )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:314:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTableName619); 

            			newLeafNode(lv_name_0_0, grammarAccess.getTableNameAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTableNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleTableName"


    // $ANTLR start "entryRuleStaticValue"
    // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:338:1: entryRuleStaticValue returns [EObject current=null] : iv_ruleStaticValue= ruleStaticValue EOF ;
    public final EObject entryRuleStaticValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticValue = null;


        try {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:339:2: (iv_ruleStaticValue= ruleStaticValue EOF )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:340:2: iv_ruleStaticValue= ruleStaticValue EOF
            {
             newCompositeNode(grammarAccess.getStaticValueRule()); 
            pushFollow(FOLLOW_ruleStaticValue_in_entryRuleStaticValue659);
            iv_ruleStaticValue=ruleStaticValue();

            state._fsp--;

             current =iv_ruleStaticValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticValue669); 

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
    // $ANTLR end "entryRuleStaticValue"


    // $ANTLR start "ruleStaticValue"
    // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:347:1: ruleStaticValue returns [EObject current=null] : ( (lv_name_0_0= RULE_INT ) ) ;
    public final EObject ruleStaticValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:350:28: ( ( (lv_name_0_0= RULE_INT ) ) )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:351:1: ( (lv_name_0_0= RULE_INT ) )
            {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:351:1: ( (lv_name_0_0= RULE_INT ) )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:352:1: (lv_name_0_0= RULE_INT )
            {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:352:1: (lv_name_0_0= RULE_INT )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:353:3: lv_name_0_0= RULE_INT
            {
            lv_name_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStaticValue710); 

            			newLeafNode(lv_name_0_0, grammarAccess.getStaticValueAccess().getNameINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStaticValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleStaticValue"


    // $ANTLR start "entryRuleOperator"
    // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:377:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:378:2: (iv_ruleOperator= ruleOperator EOF )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:379:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator750);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator760); 

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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:386:1: ruleOperator returns [EObject current=null] : ( ( (lv_OperatorName_0_1= 'bigger than' | lv_OperatorName_0_2= 'smaller than' ) ) ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token lv_OperatorName_0_1=null;
        Token lv_OperatorName_0_2=null;

         enterRule(); 
            
        try {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:389:28: ( ( ( (lv_OperatorName_0_1= 'bigger than' | lv_OperatorName_0_2= 'smaller than' ) ) ) )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:390:1: ( ( (lv_OperatorName_0_1= 'bigger than' | lv_OperatorName_0_2= 'smaller than' ) ) )
            {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:390:1: ( ( (lv_OperatorName_0_1= 'bigger than' | lv_OperatorName_0_2= 'smaller than' ) ) )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:391:1: ( (lv_OperatorName_0_1= 'bigger than' | lv_OperatorName_0_2= 'smaller than' ) )
            {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:391:1: ( (lv_OperatorName_0_1= 'bigger than' | lv_OperatorName_0_2= 'smaller than' ) )
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:392:1: (lv_OperatorName_0_1= 'bigger than' | lv_OperatorName_0_2= 'smaller than' )
            {
            // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:392:1: (lv_OperatorName_0_1= 'bigger than' | lv_OperatorName_0_2= 'smaller than' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:393:3: lv_OperatorName_0_1= 'bigger than'
                    {
                    lv_OperatorName_0_1=(Token)match(input,13,FOLLOW_13_in_ruleOperator804); 

                            newLeafNode(lv_OperatorName_0_1, grammarAccess.getOperatorAccess().getOperatorNameBiggerThanKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "OperatorName", lv_OperatorName_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../com.r00lerz.ruleDef/src-gen/com/r00lerz/ruleDef/parser/antlr/internal/InternalRuleDef.g:405:8: lv_OperatorName_0_2= 'smaller than'
                    {
                    lv_OperatorName_0_2=(Token)match(input,14,FOLLOW_14_in_ruleOperator833); 

                            newLeafNode(lv_OperatorName_0_2, grammarAccess.getOperatorAccess().getOperatorNameSmallerThanKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "OperatorName", lv_OperatorName_0_2, null);
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessRule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnValue_in_ruleBusinessRule131 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleBusinessRule143 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleBusinessRule164 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleBusinessRule176 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBusinessRule197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticValue_in_ruleValue289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnValue_in_ruleValue317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnValue_in_entryRuleColumnValue352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnValue362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableName_in_ruleColumnValue408 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleColumnValue420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleColumnName_in_ruleColumnValue441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnName_in_entryRuleColumnName477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnName487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumnName528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableName_in_entryRuleTableName568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableName578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTableName619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticValue_in_entryRuleStaticValue659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticValue669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStaticValue710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleOperator804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOperator833 = new BitSet(new long[]{0x0000000000000002L});

}