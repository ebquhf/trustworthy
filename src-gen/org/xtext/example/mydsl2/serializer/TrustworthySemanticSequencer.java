/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl2.serializer;

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
import org.xtext.example.mydsl2.services.TrustworthyGrammarAccess;
import org.xtext.example.mydsl2.trustworthy.Model;
import org.xtext.example.mydsl2.trustworthy.Room;
import org.xtext.example.mydsl2.trustworthy.Sensor;
import org.xtext.example.mydsl2.trustworthy.SensorPart;
import org.xtext.example.mydsl2.trustworthy.TrustworthyPackage;

@SuppressWarnings("all")
public class TrustworthySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TrustworthyGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TrustworthyPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TrustworthyPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case TrustworthyPackage.ROOM:
				sequence_Room(context, (Room) semanticObject); 
				return; 
			case TrustworthyPackage.SENSOR:
				sequence_Sensor(context, (Sensor) semanticObject); 
				return; 
			case TrustworthyPackage.SENSOR_PART:
				sequence_Room(context, (SensorPart) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     rooms+=Room+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Room returns Room
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Room(ISerializationContext context, Room semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TrustworthyPackage.Literals.ROOM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TrustworthyPackage.Literals.ROOM__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRoomAccess().getNameIDTerminalRuleCall_0_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Room returns SensorPart
	 *
	 * Constraint:
	 *     sensors+=Sensor*
	 */
	protected void sequence_Room(ISerializationContext context, SensorPart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sensor returns Sensor
	 *
	 * Constraint:
	 *     (amount=INT preset=ID)
	 */
	protected void sequence_Sensor(ISerializationContext context, Sensor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TrustworthyPackage.Literals.SENSOR__AMOUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TrustworthyPackage.Literals.SENSOR__AMOUNT));
			if (transientValues.isValueTransient(semanticObject, TrustworthyPackage.Literals.SENSOR__PRESET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TrustworthyPackage.Literals.SENSOR__PRESET));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSensorAccess().getAmountINTTerminalRuleCall_0_0(), semanticObject.getAmount());
		feeder.accept(grammarAccess.getSensorAccess().getPresetIDTerminalRuleCall_3_0(), semanticObject.getPreset());
		feeder.finish();
	}
	
	
}
