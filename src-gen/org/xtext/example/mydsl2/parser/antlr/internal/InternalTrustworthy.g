/*
 * generated by Xtext 2.24.0
 */
grammar InternalTrustworthy;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl2.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getRoomsRoomParserRuleCall_0());
			}
			lv_rooms_0_0=ruleRoom
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"rooms",
					lv_rooms_0_0,
					"org.xtext.example.mydsl2.Trustworthy.Room");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleRoom
entryRuleRoom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRoomRule()); }
	iv_ruleRoom=ruleRoom
	{ $current=$iv_ruleRoom.current; }
	EOF;

// Rule Room
ruleRoom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='Room'
			{
				newLeafNode(otherlv_0, grammarAccess.getRoomAccess().getRoomKeyword_0_0());
			}
			(
				(
					lv_name_1_0=RULE_ID
					{
						newLeafNode(lv_name_1_0, grammarAccess.getRoomAccess().getNameIDTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRoomRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getRoomAccess().getSensorPartAction_1_0(),
						$current);
				}
			)
			otherlv_3='with'
			{
				newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getWithKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRoomAccess().getSensorsSensorParserRuleCall_1_2_0());
					}
					lv_sensors_4_0=ruleSensor
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRoomRule());
						}
						add(
							$current,
							"sensors",
							lv_sensors_4_0,
							"org.xtext.example.mydsl2.Trustworthy.Sensor");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)
	)
;

// Entry rule entryRuleSensor
entryRuleSensor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSensorRule()); }
	iv_ruleSensor=ruleSensor
	{ $current=$iv_ruleSensor.current; }
	EOF;

// Rule Sensor
ruleSensor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_amount_0_0=RULE_INT
				{
					newLeafNode(lv_amount_0_0, grammarAccess.getSensorAccess().getAmountINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSensorRule());
					}
					setWithLastConsumed(
						$current,
						"amount",
						lv_amount_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_1='sensor'
		{
			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
		}
		otherlv_2='and'
		{
			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getAndKeyword_2());
		}
		(
			(
				lv_preset_3_0=RULE_ID
				{
					newLeafNode(lv_preset_3_0, grammarAccess.getSensorAccess().getPresetIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSensorRule());
					}
					setWithLastConsumed(
						$current,
						"preset",
						lv_preset_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4='preset'
		{
			newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getPresetKeyword_4());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
