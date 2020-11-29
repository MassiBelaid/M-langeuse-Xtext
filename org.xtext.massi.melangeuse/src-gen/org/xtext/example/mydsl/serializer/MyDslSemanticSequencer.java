/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.Blow;
import org.xtext.example.mydsl.myDsl.Filt;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.Move;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Open;
import org.xtext.example.mydsl.myDsl.Scan;
import org.xtext.example.mydsl.myDsl.Shut;
import org.xtext.example.mydsl.myDsl.Suck;
import org.xtext.example.mydsl.myDsl.Task;
import org.xtext.example.mydsl.myDsl.Wait;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.BLOW:
				sequence_Blow(context, (Blow) semanticObject); 
				return; 
			case MyDslPackage.FILT:
				sequence_Filt(context, (Filt) semanticObject); 
				return; 
			case MyDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MyDslPackage.MOVE:
				sequence_Move(context, (Move) semanticObject); 
				return; 
			case MyDslPackage.OPEN:
				sequence_Open(context, (Open) semanticObject); 
				return; 
			case MyDslPackage.SCAN:
				sequence_Scan(context, (Scan) semanticObject); 
				return; 
			case MyDslPackage.SHUT:
				sequence_Shut(context, (Shut) semanticObject); 
				return; 
			case MyDslPackage.SUCK:
				sequence_Suck(context, (Suck) semanticObject); 
				return; 
			case MyDslPackage.TASK:
				sequence_Task(context, (Task) semanticObject); 
				return; 
			case MyDslPackage.WAIT:
				sequence_Wait(context, (Wait) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Feature returns Blow
	 *     Blow returns Blow
	 *
	 * Constraint:
	 *     (fun='blow' (value=INT | valeur=DOUBLE) (comp=Comparaison valuereturn=INT)*)
	 */
	protected void sequence_Blow(ISerializationContext context, Blow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Filt
	 *     Filt returns Filt
	 *
	 * Constraint:
	 *     (fun='filt' value=INT (comp=Comparaison valuereturn=INT)*)
	 */
	protected void sequence_Filt(ISerializationContext context, Filt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     features+=Feature+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Move
	 *     Move returns Move
	 *
	 * Constraint:
	 *     (fun='move' value=INT (comp=Comparaison valuereturn=INT)*)
	 */
	protected void sequence_Move(ISerializationContext context, Move semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Open
	 *     Open returns Open
	 *
	 * Constraint:
	 *     (fun='open' value=INT (comp=Comparaison valuereturn=INT)*)
	 */
	protected void sequence_Open(ISerializationContext context, Open semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Scan
	 *     Scan returns Scan
	 *
	 * Constraint:
	 *     (fun='scan' comp=Comparaison value=INT valuereturn=INT)
	 */
	protected void sequence_Scan(ISerializationContext context, Scan semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FEATURE__FUN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FEATURE__FUN));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FEATURE__COMP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FEATURE__COMP));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FEATURE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FEATURE__VALUE));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FEATURE__VALUERETURN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FEATURE__VALUERETURN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScanAccess().getFunScanKeyword_0_0(), semanticObject.getFun());
		feeder.accept(grammarAccess.getScanAccess().getCompComparaisonParserRuleCall_1_0(), semanticObject.getComp());
		feeder.accept(grammarAccess.getScanAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getScanAccess().getValuereturnINTTerminalRuleCall_4_0(), semanticObject.getValuereturn());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Shut
	 *     Shut returns Shut
	 *
	 * Constraint:
	 *     (fun='shut' value=INT (comp=Comparaison valuereturn=INT)*)
	 */
	protected void sequence_Shut(ISerializationContext context, Shut semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Suck
	 *     Suck returns Suck
	 *
	 * Constraint:
	 *     (fun='suck' (value=INT | valeur=DOUBLE) (comp=Comparaison valuereturn=INT)*)
	 */
	protected void sequence_Suck(ISerializationContext context, Suck semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Task returns Task
	 *
	 * Constraint:
	 *     (name=ID features+=Feature+)
	 */
	protected void sequence_Task(ISerializationContext context, Task semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Wait
	 *     Wait returns Wait
	 *
	 * Constraint:
	 *     (fun='wait' value=INT (comp=Comparaison valuereturn=INT)*)
	 */
	protected void sequence_Wait(ISerializationContext context, Wait semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
