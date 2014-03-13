package com.r00lerz.ruleDef.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.r00lerz.ruleDef.services.RuleDefGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRuleDefParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bigger than'", "'smaller than'", "' '", "'.'"
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
    public String getGrammarFileName() { return "../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g"; }


     
     	private RuleDefGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RuleDefGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleBusinessRule"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:60:1: entryRuleBusinessRule : ruleBusinessRule EOF ;
    public final void entryRuleBusinessRule() throws RecognitionException {
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:61:1: ( ruleBusinessRule EOF )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:62:1: ruleBusinessRule EOF
            {
             before(grammarAccess.getBusinessRuleRule()); 
            pushFollow(FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule61);
            ruleBusinessRule();

            state._fsp--;

             after(grammarAccess.getBusinessRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessRule68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBusinessRule"


    // $ANTLR start "ruleBusinessRule"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:69:1: ruleBusinessRule : ( ( rule__BusinessRule__Group__0 ) ) ;
    public final void ruleBusinessRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:73:2: ( ( ( rule__BusinessRule__Group__0 ) ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:74:1: ( ( rule__BusinessRule__Group__0 ) )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:74:1: ( ( rule__BusinessRule__Group__0 ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:75:1: ( rule__BusinessRule__Group__0 )
            {
             before(grammarAccess.getBusinessRuleAccess().getGroup()); 
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:76:1: ( rule__BusinessRule__Group__0 )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:76:2: rule__BusinessRule__Group__0
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__0_in_ruleBusinessRule94);
            rule__BusinessRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBusinessRule"


    // $ANTLR start "entryRuleValue"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:88:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:89:1: ( ruleValue EOF )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:90:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue121);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:97:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:101:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:102:1: ( ( rule__Value__Alternatives ) )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:102:1: ( ( rule__Value__Alternatives ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:103:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:104:1: ( rule__Value__Alternatives )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:104:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue154);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleColumnValue"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:116:1: entryRuleColumnValue : ruleColumnValue EOF ;
    public final void entryRuleColumnValue() throws RecognitionException {
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:117:1: ( ruleColumnValue EOF )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:118:1: ruleColumnValue EOF
            {
             before(grammarAccess.getColumnValueRule()); 
            pushFollow(FOLLOW_ruleColumnValue_in_entryRuleColumnValue181);
            ruleColumnValue();

            state._fsp--;

             after(grammarAccess.getColumnValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnValue188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumnValue"


    // $ANTLR start "ruleColumnValue"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:125:1: ruleColumnValue : ( ( rule__ColumnValue__Group__0 ) ) ;
    public final void ruleColumnValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:129:2: ( ( ( rule__ColumnValue__Group__0 ) ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:130:1: ( ( rule__ColumnValue__Group__0 ) )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:130:1: ( ( rule__ColumnValue__Group__0 ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:131:1: ( rule__ColumnValue__Group__0 )
            {
             before(grammarAccess.getColumnValueAccess().getGroup()); 
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:132:1: ( rule__ColumnValue__Group__0 )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:132:2: rule__ColumnValue__Group__0
            {
            pushFollow(FOLLOW_rule__ColumnValue__Group__0_in_ruleColumnValue214);
            rule__ColumnValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnValue"


    // $ANTLR start "entryRuleColumnName"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:144:1: entryRuleColumnName : ruleColumnName EOF ;
    public final void entryRuleColumnName() throws RecognitionException {
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:145:1: ( ruleColumnName EOF )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:146:1: ruleColumnName EOF
            {
             before(grammarAccess.getColumnNameRule()); 
            pushFollow(FOLLOW_ruleColumnName_in_entryRuleColumnName241);
            ruleColumnName();

            state._fsp--;

             after(grammarAccess.getColumnNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnName248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumnName"


    // $ANTLR start "ruleColumnName"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:153:1: ruleColumnName : ( ( rule__ColumnName__NameAssignment ) ) ;
    public final void ruleColumnName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:157:2: ( ( ( rule__ColumnName__NameAssignment ) ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:158:1: ( ( rule__ColumnName__NameAssignment ) )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:158:1: ( ( rule__ColumnName__NameAssignment ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:159:1: ( rule__ColumnName__NameAssignment )
            {
             before(grammarAccess.getColumnNameAccess().getNameAssignment()); 
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:160:1: ( rule__ColumnName__NameAssignment )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:160:2: rule__ColumnName__NameAssignment
            {
            pushFollow(FOLLOW_rule__ColumnName__NameAssignment_in_ruleColumnName274);
            rule__ColumnName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getColumnNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnName"


    // $ANTLR start "entryRuleTableName"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:172:1: entryRuleTableName : ruleTableName EOF ;
    public final void entryRuleTableName() throws RecognitionException {
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:173:1: ( ruleTableName EOF )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:174:1: ruleTableName EOF
            {
             before(grammarAccess.getTableNameRule()); 
            pushFollow(FOLLOW_ruleTableName_in_entryRuleTableName301);
            ruleTableName();

            state._fsp--;

             after(grammarAccess.getTableNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableName308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTableName"


    // $ANTLR start "ruleTableName"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:181:1: ruleTableName : ( ( rule__TableName__NameAssignment ) ) ;
    public final void ruleTableName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:185:2: ( ( ( rule__TableName__NameAssignment ) ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:186:1: ( ( rule__TableName__NameAssignment ) )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:186:1: ( ( rule__TableName__NameAssignment ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:187:1: ( rule__TableName__NameAssignment )
            {
             before(grammarAccess.getTableNameAccess().getNameAssignment()); 
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:188:1: ( rule__TableName__NameAssignment )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:188:2: rule__TableName__NameAssignment
            {
            pushFollow(FOLLOW_rule__TableName__NameAssignment_in_ruleTableName334);
            rule__TableName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTableNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableName"


    // $ANTLR start "entryRuleStaticValue"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:200:1: entryRuleStaticValue : ruleStaticValue EOF ;
    public final void entryRuleStaticValue() throws RecognitionException {
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:201:1: ( ruleStaticValue EOF )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:202:1: ruleStaticValue EOF
            {
             before(grammarAccess.getStaticValueRule()); 
            pushFollow(FOLLOW_ruleStaticValue_in_entryRuleStaticValue361);
            ruleStaticValue();

            state._fsp--;

             after(grammarAccess.getStaticValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticValue368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStaticValue"


    // $ANTLR start "ruleStaticValue"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:209:1: ruleStaticValue : ( ( rule__StaticValue__NameAssignment ) ) ;
    public final void ruleStaticValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:213:2: ( ( ( rule__StaticValue__NameAssignment ) ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:214:1: ( ( rule__StaticValue__NameAssignment ) )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:214:1: ( ( rule__StaticValue__NameAssignment ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:215:1: ( rule__StaticValue__NameAssignment )
            {
             before(grammarAccess.getStaticValueAccess().getNameAssignment()); 
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:216:1: ( rule__StaticValue__NameAssignment )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:216:2: rule__StaticValue__NameAssignment
            {
            pushFollow(FOLLOW_rule__StaticValue__NameAssignment_in_ruleStaticValue394);
            rule__StaticValue__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStaticValueAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStaticValue"


    // $ANTLR start "entryRuleOperator"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:228:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:229:1: ( ruleOperator EOF )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:230:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator421);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:237:1: ruleOperator : ( ( rule__Operator__OperatorNameAssignment ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:241:2: ( ( ( rule__Operator__OperatorNameAssignment ) ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:242:1: ( ( rule__Operator__OperatorNameAssignment ) )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:242:1: ( ( rule__Operator__OperatorNameAssignment ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:243:1: ( rule__Operator__OperatorNameAssignment )
            {
             before(grammarAccess.getOperatorAccess().getOperatorNameAssignment()); 
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:244:1: ( rule__Operator__OperatorNameAssignment )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:244:2: rule__Operator__OperatorNameAssignment
            {
            pushFollow(FOLLOW_rule__Operator__OperatorNameAssignment_in_ruleOperator454);
            rule__Operator__OperatorNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getOperatorNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "rule__Value__Alternatives"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:256:1: rule__Value__Alternatives : ( ( ( rule__Value__ValueAssignment_0 ) ) | ( ruleColumnValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:260:1: ( ( ( rule__Value__ValueAssignment_0 ) ) | ( ruleColumnValue ) )
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
                    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:261:1: ( ( rule__Value__ValueAssignment_0 ) )
                    {
                    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:261:1: ( ( rule__Value__ValueAssignment_0 ) )
                    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:262:1: ( rule__Value__ValueAssignment_0 )
                    {
                     before(grammarAccess.getValueAccess().getValueAssignment_0()); 
                    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:263:1: ( rule__Value__ValueAssignment_0 )
                    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:263:2: rule__Value__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Value__ValueAssignment_0_in_rule__Value__Alternatives490);
                    rule__Value__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:267:6: ( ruleColumnValue )
                    {
                    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:267:6: ( ruleColumnValue )
                    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:268:1: ruleColumnValue
                    {
                     before(grammarAccess.getValueAccess().getColumnValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleColumnValue_in_rule__Value__Alternatives508);
                    ruleColumnValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getColumnValueParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Operator__OperatorNameAlternatives_0"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:278:1: rule__Operator__OperatorNameAlternatives_0 : ( ( 'bigger than' ) | ( 'smaller than' ) );
    public final void rule__Operator__OperatorNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:282:1: ( ( 'bigger than' ) | ( 'smaller than' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:283:1: ( 'bigger than' )
                    {
                    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:283:1: ( 'bigger than' )
                    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:284:1: 'bigger than'
                    {
                     before(grammarAccess.getOperatorAccess().getOperatorNameBiggerThanKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Operator__OperatorNameAlternatives_0541); 
                     after(grammarAccess.getOperatorAccess().getOperatorNameBiggerThanKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:291:6: ( 'smaller than' )
                    {
                    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:291:6: ( 'smaller than' )
                    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:292:1: 'smaller than'
                    {
                     before(grammarAccess.getOperatorAccess().getOperatorNameSmallerThanKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Operator__OperatorNameAlternatives_0561); 
                     after(grammarAccess.getOperatorAccess().getOperatorNameSmallerThanKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__OperatorNameAlternatives_0"


    // $ANTLR start "rule__BusinessRule__Group__0"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:306:1: rule__BusinessRule__Group__0 : rule__BusinessRule__Group__0__Impl rule__BusinessRule__Group__1 ;
    public final void rule__BusinessRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:310:1: ( rule__BusinessRule__Group__0__Impl rule__BusinessRule__Group__1 )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:311:2: rule__BusinessRule__Group__0__Impl rule__BusinessRule__Group__1
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__0__Impl_in_rule__BusinessRule__Group__0593);
            rule__BusinessRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group__1_in_rule__BusinessRule__Group__0596);
            rule__BusinessRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__0"


    // $ANTLR start "rule__BusinessRule__Group__0__Impl"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:318:1: rule__BusinessRule__Group__0__Impl : ( ( rule__BusinessRule__ColumnvalueAssignment_0 ) ) ;
    public final void rule__BusinessRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:322:1: ( ( ( rule__BusinessRule__ColumnvalueAssignment_0 ) ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:323:1: ( ( rule__BusinessRule__ColumnvalueAssignment_0 ) )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:323:1: ( ( rule__BusinessRule__ColumnvalueAssignment_0 ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:324:1: ( rule__BusinessRule__ColumnvalueAssignment_0 )
            {
             before(grammarAccess.getBusinessRuleAccess().getColumnvalueAssignment_0()); 
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:325:1: ( rule__BusinessRule__ColumnvalueAssignment_0 )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:325:2: rule__BusinessRule__ColumnvalueAssignment_0
            {
            pushFollow(FOLLOW_rule__BusinessRule__ColumnvalueAssignment_0_in_rule__BusinessRule__Group__0__Impl623);
            rule__BusinessRule__ColumnvalueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getColumnvalueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__0__Impl"


    // $ANTLR start "rule__BusinessRule__Group__1"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:335:1: rule__BusinessRule__Group__1 : rule__BusinessRule__Group__1__Impl rule__BusinessRule__Group__2 ;
    public final void rule__BusinessRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:339:1: ( rule__BusinessRule__Group__1__Impl rule__BusinessRule__Group__2 )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:340:2: rule__BusinessRule__Group__1__Impl rule__BusinessRule__Group__2
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__1__Impl_in_rule__BusinessRule__Group__1653);
            rule__BusinessRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group__2_in_rule__BusinessRule__Group__1656);
            rule__BusinessRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__1"


    // $ANTLR start "rule__BusinessRule__Group__1__Impl"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:347:1: rule__BusinessRule__Group__1__Impl : ( ' ' ) ;
    public final void rule__BusinessRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:351:1: ( ( ' ' ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:352:1: ( ' ' )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:352:1: ( ' ' )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:353:1: ' '
            {
             before(grammarAccess.getBusinessRuleAccess().getSpaceKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__BusinessRule__Group__1__Impl684); 
             after(grammarAccess.getBusinessRuleAccess().getSpaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__1__Impl"


    // $ANTLR start "rule__BusinessRule__Group__2"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:366:1: rule__BusinessRule__Group__2 : rule__BusinessRule__Group__2__Impl rule__BusinessRule__Group__3 ;
    public final void rule__BusinessRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:370:1: ( rule__BusinessRule__Group__2__Impl rule__BusinessRule__Group__3 )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:371:2: rule__BusinessRule__Group__2__Impl rule__BusinessRule__Group__3
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__2__Impl_in_rule__BusinessRule__Group__2715);
            rule__BusinessRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group__3_in_rule__BusinessRule__Group__2718);
            rule__BusinessRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__2"


    // $ANTLR start "rule__BusinessRule__Group__2__Impl"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:378:1: rule__BusinessRule__Group__2__Impl : ( ( rule__BusinessRule__OperatorAssignment_2 ) ) ;
    public final void rule__BusinessRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:382:1: ( ( ( rule__BusinessRule__OperatorAssignment_2 ) ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:383:1: ( ( rule__BusinessRule__OperatorAssignment_2 ) )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:383:1: ( ( rule__BusinessRule__OperatorAssignment_2 ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:384:1: ( rule__BusinessRule__OperatorAssignment_2 )
            {
             before(grammarAccess.getBusinessRuleAccess().getOperatorAssignment_2()); 
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:385:1: ( rule__BusinessRule__OperatorAssignment_2 )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:385:2: rule__BusinessRule__OperatorAssignment_2
            {
            pushFollow(FOLLOW_rule__BusinessRule__OperatorAssignment_2_in_rule__BusinessRule__Group__2__Impl745);
            rule__BusinessRule__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getOperatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__2__Impl"


    // $ANTLR start "rule__BusinessRule__Group__3"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:395:1: rule__BusinessRule__Group__3 : rule__BusinessRule__Group__3__Impl rule__BusinessRule__Group__4 ;
    public final void rule__BusinessRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:399:1: ( rule__BusinessRule__Group__3__Impl rule__BusinessRule__Group__4 )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:400:2: rule__BusinessRule__Group__3__Impl rule__BusinessRule__Group__4
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__3__Impl_in_rule__BusinessRule__Group__3775);
            rule__BusinessRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group__4_in_rule__BusinessRule__Group__3778);
            rule__BusinessRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__3"


    // $ANTLR start "rule__BusinessRule__Group__3__Impl"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:407:1: rule__BusinessRule__Group__3__Impl : ( ' ' ) ;
    public final void rule__BusinessRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:411:1: ( ( ' ' ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:412:1: ( ' ' )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:412:1: ( ' ' )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:413:1: ' '
            {
             before(grammarAccess.getBusinessRuleAccess().getSpaceKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__BusinessRule__Group__3__Impl806); 
             after(grammarAccess.getBusinessRuleAccess().getSpaceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__3__Impl"


    // $ANTLR start "rule__BusinessRule__Group__4"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:426:1: rule__BusinessRule__Group__4 : rule__BusinessRule__Group__4__Impl ;
    public final void rule__BusinessRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:430:1: ( rule__BusinessRule__Group__4__Impl )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:431:2: rule__BusinessRule__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__4__Impl_in_rule__BusinessRule__Group__4837);
            rule__BusinessRule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__4"


    // $ANTLR start "rule__BusinessRule__Group__4__Impl"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:437:1: rule__BusinessRule__Group__4__Impl : ( ( rule__BusinessRule__ValueAssignment_4 ) ) ;
    public final void rule__BusinessRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:441:1: ( ( ( rule__BusinessRule__ValueAssignment_4 ) ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:442:1: ( ( rule__BusinessRule__ValueAssignment_4 ) )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:442:1: ( ( rule__BusinessRule__ValueAssignment_4 ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:443:1: ( rule__BusinessRule__ValueAssignment_4 )
            {
             before(grammarAccess.getBusinessRuleAccess().getValueAssignment_4()); 
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:444:1: ( rule__BusinessRule__ValueAssignment_4 )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:444:2: rule__BusinessRule__ValueAssignment_4
            {
            pushFollow(FOLLOW_rule__BusinessRule__ValueAssignment_4_in_rule__BusinessRule__Group__4__Impl864);
            rule__BusinessRule__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__Group__4__Impl"


    // $ANTLR start "rule__ColumnValue__Group__0"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:464:1: rule__ColumnValue__Group__0 : rule__ColumnValue__Group__0__Impl rule__ColumnValue__Group__1 ;
    public final void rule__ColumnValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:468:1: ( rule__ColumnValue__Group__0__Impl rule__ColumnValue__Group__1 )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:469:2: rule__ColumnValue__Group__0__Impl rule__ColumnValue__Group__1
            {
            pushFollow(FOLLOW_rule__ColumnValue__Group__0__Impl_in_rule__ColumnValue__Group__0904);
            rule__ColumnValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColumnValue__Group__1_in_rule__ColumnValue__Group__0907);
            rule__ColumnValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnValue__Group__0"


    // $ANTLR start "rule__ColumnValue__Group__0__Impl"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:476:1: rule__ColumnValue__Group__0__Impl : ( ( rule__ColumnValue__TablenameAssignment_0 ) ) ;
    public final void rule__ColumnValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:480:1: ( ( ( rule__ColumnValue__TablenameAssignment_0 ) ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:481:1: ( ( rule__ColumnValue__TablenameAssignment_0 ) )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:481:1: ( ( rule__ColumnValue__TablenameAssignment_0 ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:482:1: ( rule__ColumnValue__TablenameAssignment_0 )
            {
             before(grammarAccess.getColumnValueAccess().getTablenameAssignment_0()); 
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:483:1: ( rule__ColumnValue__TablenameAssignment_0 )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:483:2: rule__ColumnValue__TablenameAssignment_0
            {
            pushFollow(FOLLOW_rule__ColumnValue__TablenameAssignment_0_in_rule__ColumnValue__Group__0__Impl934);
            rule__ColumnValue__TablenameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnValueAccess().getTablenameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnValue__Group__0__Impl"


    // $ANTLR start "rule__ColumnValue__Group__1"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:493:1: rule__ColumnValue__Group__1 : rule__ColumnValue__Group__1__Impl rule__ColumnValue__Group__2 ;
    public final void rule__ColumnValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:497:1: ( rule__ColumnValue__Group__1__Impl rule__ColumnValue__Group__2 )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:498:2: rule__ColumnValue__Group__1__Impl rule__ColumnValue__Group__2
            {
            pushFollow(FOLLOW_rule__ColumnValue__Group__1__Impl_in_rule__ColumnValue__Group__1964);
            rule__ColumnValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColumnValue__Group__2_in_rule__ColumnValue__Group__1967);
            rule__ColumnValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnValue__Group__1"


    // $ANTLR start "rule__ColumnValue__Group__1__Impl"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:505:1: rule__ColumnValue__Group__1__Impl : ( '.' ) ;
    public final void rule__ColumnValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:509:1: ( ( '.' ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:510:1: ( '.' )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:510:1: ( '.' )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:511:1: '.'
            {
             before(grammarAccess.getColumnValueAccess().getFullStopKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__ColumnValue__Group__1__Impl995); 
             after(grammarAccess.getColumnValueAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnValue__Group__1__Impl"


    // $ANTLR start "rule__ColumnValue__Group__2"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:524:1: rule__ColumnValue__Group__2 : rule__ColumnValue__Group__2__Impl ;
    public final void rule__ColumnValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:528:1: ( rule__ColumnValue__Group__2__Impl )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:529:2: rule__ColumnValue__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ColumnValue__Group__2__Impl_in_rule__ColumnValue__Group__21026);
            rule__ColumnValue__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnValue__Group__2"


    // $ANTLR start "rule__ColumnValue__Group__2__Impl"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:535:1: rule__ColumnValue__Group__2__Impl : ( ( rule__ColumnValue__ColumnameAssignment_2 ) ) ;
    public final void rule__ColumnValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:539:1: ( ( ( rule__ColumnValue__ColumnameAssignment_2 ) ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:540:1: ( ( rule__ColumnValue__ColumnameAssignment_2 ) )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:540:1: ( ( rule__ColumnValue__ColumnameAssignment_2 ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:541:1: ( rule__ColumnValue__ColumnameAssignment_2 )
            {
             before(grammarAccess.getColumnValueAccess().getColumnameAssignment_2()); 
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:542:1: ( rule__ColumnValue__ColumnameAssignment_2 )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:542:2: rule__ColumnValue__ColumnameAssignment_2
            {
            pushFollow(FOLLOW_rule__ColumnValue__ColumnameAssignment_2_in_rule__ColumnValue__Group__2__Impl1053);
            rule__ColumnValue__ColumnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnValueAccess().getColumnameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnValue__Group__2__Impl"


    // $ANTLR start "rule__BusinessRule__ColumnvalueAssignment_0"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:559:1: rule__BusinessRule__ColumnvalueAssignment_0 : ( ruleColumnValue ) ;
    public final void rule__BusinessRule__ColumnvalueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:563:1: ( ( ruleColumnValue ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:564:1: ( ruleColumnValue )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:564:1: ( ruleColumnValue )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:565:1: ruleColumnValue
            {
             before(grammarAccess.getBusinessRuleAccess().getColumnvalueColumnValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleColumnValue_in_rule__BusinessRule__ColumnvalueAssignment_01094);
            ruleColumnValue();

            state._fsp--;

             after(grammarAccess.getBusinessRuleAccess().getColumnvalueColumnValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__ColumnvalueAssignment_0"


    // $ANTLR start "rule__BusinessRule__OperatorAssignment_2"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:574:1: rule__BusinessRule__OperatorAssignment_2 : ( ruleOperator ) ;
    public final void rule__BusinessRule__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:578:1: ( ( ruleOperator ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:579:1: ( ruleOperator )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:579:1: ( ruleOperator )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:580:1: ruleOperator
            {
             before(grammarAccess.getBusinessRuleAccess().getOperatorOperatorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOperator_in_rule__BusinessRule__OperatorAssignment_21125);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getBusinessRuleAccess().getOperatorOperatorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__OperatorAssignment_2"


    // $ANTLR start "rule__BusinessRule__ValueAssignment_4"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:589:1: rule__BusinessRule__ValueAssignment_4 : ( ruleValue ) ;
    public final void rule__BusinessRule__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:593:1: ( ( ruleValue ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:594:1: ( ruleValue )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:594:1: ( ruleValue )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:595:1: ruleValue
            {
             before(grammarAccess.getBusinessRuleAccess().getValueValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__BusinessRule__ValueAssignment_41156);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getBusinessRuleAccess().getValueValueParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessRule__ValueAssignment_4"


    // $ANTLR start "rule__Value__ValueAssignment_0"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:604:1: rule__Value__ValueAssignment_0 : ( ruleStaticValue ) ;
    public final void rule__Value__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:608:1: ( ( ruleStaticValue ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:609:1: ( ruleStaticValue )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:609:1: ( ruleStaticValue )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:610:1: ruleStaticValue
            {
             before(grammarAccess.getValueAccess().getValueStaticValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStaticValue_in_rule__Value__ValueAssignment_01187);
            ruleStaticValue();

            state._fsp--;

             after(grammarAccess.getValueAccess().getValueStaticValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValueAssignment_0"


    // $ANTLR start "rule__ColumnValue__TablenameAssignment_0"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:619:1: rule__ColumnValue__TablenameAssignment_0 : ( ruleTableName ) ;
    public final void rule__ColumnValue__TablenameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:623:1: ( ( ruleTableName ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:624:1: ( ruleTableName )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:624:1: ( ruleTableName )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:625:1: ruleTableName
            {
             before(grammarAccess.getColumnValueAccess().getTablenameTableNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTableName_in_rule__ColumnValue__TablenameAssignment_01218);
            ruleTableName();

            state._fsp--;

             after(grammarAccess.getColumnValueAccess().getTablenameTableNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnValue__TablenameAssignment_0"


    // $ANTLR start "rule__ColumnValue__ColumnameAssignment_2"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:634:1: rule__ColumnValue__ColumnameAssignment_2 : ( ruleColumnName ) ;
    public final void rule__ColumnValue__ColumnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:638:1: ( ( ruleColumnName ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:639:1: ( ruleColumnName )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:639:1: ( ruleColumnName )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:640:1: ruleColumnName
            {
             before(grammarAccess.getColumnValueAccess().getColumnameColumnNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleColumnName_in_rule__ColumnValue__ColumnameAssignment_21249);
            ruleColumnName();

            state._fsp--;

             after(grammarAccess.getColumnValueAccess().getColumnameColumnNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnValue__ColumnameAssignment_2"


    // $ANTLR start "rule__ColumnName__NameAssignment"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:649:1: rule__ColumnName__NameAssignment : ( RULE_ID ) ;
    public final void rule__ColumnName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:653:1: ( ( RULE_ID ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:654:1: ( RULE_ID )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:654:1: ( RULE_ID )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:655:1: RULE_ID
            {
             before(grammarAccess.getColumnNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ColumnName__NameAssignment1280); 
             after(grammarAccess.getColumnNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnName__NameAssignment"


    // $ANTLR start "rule__TableName__NameAssignment"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:664:1: rule__TableName__NameAssignment : ( RULE_ID ) ;
    public final void rule__TableName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:668:1: ( ( RULE_ID ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:669:1: ( RULE_ID )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:669:1: ( RULE_ID )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:670:1: RULE_ID
            {
             before(grammarAccess.getTableNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TableName__NameAssignment1311); 
             after(grammarAccess.getTableNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableName__NameAssignment"


    // $ANTLR start "rule__StaticValue__NameAssignment"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:679:1: rule__StaticValue__NameAssignment : ( RULE_INT ) ;
    public final void rule__StaticValue__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:683:1: ( ( RULE_INT ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:684:1: ( RULE_INT )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:684:1: ( RULE_INT )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:685:1: RULE_INT
            {
             before(grammarAccess.getStaticValueAccess().getNameINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StaticValue__NameAssignment1342); 
             after(grammarAccess.getStaticValueAccess().getNameINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticValue__NameAssignment"


    // $ANTLR start "rule__Operator__OperatorNameAssignment"
    // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:694:1: rule__Operator__OperatorNameAssignment : ( ( rule__Operator__OperatorNameAlternatives_0 ) ) ;
    public final void rule__Operator__OperatorNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:698:1: ( ( ( rule__Operator__OperatorNameAlternatives_0 ) ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:699:1: ( ( rule__Operator__OperatorNameAlternatives_0 ) )
            {
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:699:1: ( ( rule__Operator__OperatorNameAlternatives_0 ) )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:700:1: ( rule__Operator__OperatorNameAlternatives_0 )
            {
             before(grammarAccess.getOperatorAccess().getOperatorNameAlternatives_0()); 
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:701:1: ( rule__Operator__OperatorNameAlternatives_0 )
            // ../com.r00lerz.ruleDef.ui/src-gen/com/r00lerz/ruleDef/ui/contentassist/antlr/internal/InternalRuleDef.g:701:2: rule__Operator__OperatorNameAlternatives_0
            {
            pushFollow(FOLLOW_rule__Operator__OperatorNameAlternatives_0_in_rule__Operator__OperatorNameAssignment1373);
            rule__Operator__OperatorNameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getOperatorNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__OperatorNameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessRule68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__0_in_ruleBusinessRule94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnValue_in_entryRuleColumnValue181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnValue188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnValue__Group__0_in_ruleColumnValue214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnName_in_entryRuleColumnName241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnName248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnName__NameAssignment_in_ruleColumnName274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableName_in_entryRuleTableName301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableName308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableName__NameAssignment_in_ruleTableName334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticValue_in_entryRuleStaticValue361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticValue368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StaticValue__NameAssignment_in_ruleStaticValue394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__OperatorNameAssignment_in_ruleOperator454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__ValueAssignment_0_in_rule__Value__Alternatives490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnValue_in_rule__Value__Alternatives508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Operator__OperatorNameAlternatives_0541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Operator__OperatorNameAlternatives_0561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__0__Impl_in_rule__BusinessRule__Group__0593 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__1_in_rule__BusinessRule__Group__0596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__ColumnvalueAssignment_0_in_rule__BusinessRule__Group__0__Impl623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__1__Impl_in_rule__BusinessRule__Group__1653 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__2_in_rule__BusinessRule__Group__1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BusinessRule__Group__1__Impl684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__2__Impl_in_rule__BusinessRule__Group__2715 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__3_in_rule__BusinessRule__Group__2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__OperatorAssignment_2_in_rule__BusinessRule__Group__2__Impl745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__3__Impl_in_rule__BusinessRule__Group__3775 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__4_in_rule__BusinessRule__Group__3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BusinessRule__Group__3__Impl806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__4__Impl_in_rule__BusinessRule__Group__4837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__ValueAssignment_4_in_rule__BusinessRule__Group__4__Impl864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnValue__Group__0__Impl_in_rule__ColumnValue__Group__0904 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ColumnValue__Group__1_in_rule__ColumnValue__Group__0907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnValue__TablenameAssignment_0_in_rule__ColumnValue__Group__0__Impl934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnValue__Group__1__Impl_in_rule__ColumnValue__Group__1964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ColumnValue__Group__2_in_rule__ColumnValue__Group__1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ColumnValue__Group__1__Impl995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnValue__Group__2__Impl_in_rule__ColumnValue__Group__21026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnValue__ColumnameAssignment_2_in_rule__ColumnValue__Group__2__Impl1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnValue_in_rule__BusinessRule__ColumnvalueAssignment_01094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__BusinessRule__OperatorAssignment_21125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__BusinessRule__ValueAssignment_41156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticValue_in_rule__Value__ValueAssignment_01187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableName_in_rule__ColumnValue__TablenameAssignment_01218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnName_in_rule__ColumnValue__ColumnameAssignment_21249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ColumnName__NameAssignment1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TableName__NameAssignment1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StaticValue__NameAssignment1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__OperatorNameAlternatives_0_in_rule__Operator__OperatorNameAssignment1373 = new BitSet(new long[]{0x0000000000000002L});

}