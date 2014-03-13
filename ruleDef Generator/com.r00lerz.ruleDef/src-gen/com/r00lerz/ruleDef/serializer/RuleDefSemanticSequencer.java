package com.r00lerz.ruleDef.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.r00lerz.ruleDef.ruleDef.BusinessRule;
import com.r00lerz.ruleDef.ruleDef.ColumnName;
import com.r00lerz.ruleDef.ruleDef.ColumnValue;
import com.r00lerz.ruleDef.ruleDef.Operator;
import com.r00lerz.ruleDef.ruleDef.RuleDefPackage;
import com.r00lerz.ruleDef.ruleDef.StaticValue;
import com.r00lerz.ruleDef.ruleDef.TableName;
import com.r00lerz.ruleDef.ruleDef.Value;
import com.r00lerz.ruleDef.services.RuleDefGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class RuleDefSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RuleDefGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RuleDefPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RuleDefPackage.BUSINESS_RULE:
				if(context == grammarAccess.getBusinessRuleRule()) {
					sequence_BusinessRule(context, (BusinessRule) semanticObject); 
					return; 
				}
				else break;
			case RuleDefPackage.COLUMN_NAME:
				if(context == grammarAccess.getColumnNameRule()) {
					sequence_ColumnName(context, (ColumnName) semanticObject); 
					return; 
				}
				else break;
			case RuleDefPackage.COLUMN_VALUE:
				if(context == grammarAccess.getColumnValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_ColumnValue(context, (ColumnValue) semanticObject); 
					return; 
				}
				else break;
			case RuleDefPackage.OPERATOR:
				if(context == grammarAccess.getOperatorRule()) {
					sequence_Operator(context, (Operator) semanticObject); 
					return; 
				}
				else break;
			case RuleDefPackage.STATIC_VALUE:
				if(context == grammarAccess.getStaticValueRule()) {
					sequence_StaticValue(context, (StaticValue) semanticObject); 
					return; 
				}
				else break;
			case RuleDefPackage.TABLE_NAME:
				if(context == grammarAccess.getTableNameRule()) {
					sequence_TableName(context, (TableName) semanticObject); 
					return; 
				}
				else break;
			case RuleDefPackage.VALUE:
				if(context == grammarAccess.getValueRule()) {
					sequence_Value(context, (Value) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (columnvalue=ColumnValue operator=Operator value=Value)
	 */
	protected void sequence_BusinessRule(EObject context, BusinessRule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RuleDefPackage.Literals.BUSINESS_RULE__COLUMNVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDefPackage.Literals.BUSINESS_RULE__COLUMNVALUE));
			if(transientValues.isValueTransient(semanticObject, RuleDefPackage.Literals.BUSINESS_RULE__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDefPackage.Literals.BUSINESS_RULE__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, RuleDefPackage.Literals.BUSINESS_RULE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDefPackage.Literals.BUSINESS_RULE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBusinessRuleAccess().getColumnvalueColumnValueParserRuleCall_0_0(), semanticObject.getColumnvalue());
		feeder.accept(grammarAccess.getBusinessRuleAccess().getOperatorOperatorParserRuleCall_2_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getBusinessRuleAccess().getValueValueParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ColumnName(EObject context, ColumnName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RuleDefPackage.Literals.COLUMN_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDefPackage.Literals.COLUMN_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColumnNameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (tablename=TableName columname=ColumnName)
	 */
	protected void sequence_ColumnValue(EObject context, ColumnValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (OperatorName='bigger than' | OperatorName='smaller than')
	 */
	protected void sequence_Operator(EObject context, Operator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=INT
	 */
	protected void sequence_StaticValue(EObject context, StaticValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RuleDefPackage.Literals.STATIC_VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDefPackage.Literals.STATIC_VALUE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStaticValueAccess().getNameINTTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_TableName(EObject context, TableName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RuleDefPackage.Literals.TABLE_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDefPackage.Literals.TABLE_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTableNameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=StaticValue
	 */
	protected void sequence_Value(EObject context, Value semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RuleDefPackage.Literals.VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDefPackage.Literals.VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValueAccess().getValueStaticValueParserRuleCall_0_0(), semanticObject.getValue());
		feeder.finish();
	}
}
