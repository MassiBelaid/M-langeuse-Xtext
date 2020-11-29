/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Model");
		private final Assignment cFeaturesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cFeaturesFeatureParserRuleCall_0 = (RuleCall)cFeaturesAssignment.eContents().get(0);
		
		//Model:
		//	features+=Feature+;
		@Override public ParserRule getRule() { return rule; }
		
		//features+=Feature+
		public Assignment getFeaturesAssignment() { return cFeaturesAssignment; }
		
		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_0() { return cFeaturesFeatureParserRuleCall_0; }
	}
	public class TaskElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Task");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTaskKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFeaturesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFeaturesFeatureParserRuleCall_3_0 = (RuleCall)cFeaturesAssignment_3.eContents().get(0);
		private final Keyword cEndKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Task:
		//	'Task' name=ID ':'
		//	features+=Feature+
		//	'end.';
		@Override public ParserRule getRule() { return rule; }
		
		//'Task' name=ID ':' features+=Feature+ 'end.'
		public Group getGroup() { return cGroup; }
		
		//'Task'
		public Keyword getTaskKeyword_0() { return cTaskKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//features+=Feature+
		public Assignment getFeaturesAssignment_3() { return cFeaturesAssignment_3; }
		
		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_3_0() { return cFeaturesFeatureParserRuleCall_3_0; }
		
		//'end.'
		public Keyword getEndKeyword_4() { return cEndKeyword_4; }
	}
	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Feature");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cScanParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMoveParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cFiltParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cSuckParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cBlowParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cOpenParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cShutParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cWaitParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		
		//Feature:
		//	Scan | Move | Filt | Suck | Blow | Open | Shut | Wait;
		@Override public ParserRule getRule() { return rule; }
		
		//Scan | Move | Filt | Suck | Blow | Open | Shut | Wait
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Scan
		public RuleCall getScanParserRuleCall_0() { return cScanParserRuleCall_0; }
		
		//Move
		public RuleCall getMoveParserRuleCall_1() { return cMoveParserRuleCall_1; }
		
		//Filt
		public RuleCall getFiltParserRuleCall_2() { return cFiltParserRuleCall_2; }
		
		//Suck
		public RuleCall getSuckParserRuleCall_3() { return cSuckParserRuleCall_3; }
		
		//Blow
		public RuleCall getBlowParserRuleCall_4() { return cBlowParserRuleCall_4; }
		
		//Open
		public RuleCall getOpenParserRuleCall_5() { return cOpenParserRuleCall_5; }
		
		//Shut
		public RuleCall getShutParserRuleCall_6() { return cShutParserRuleCall_6; }
		
		//Wait
		public RuleCall getWaitParserRuleCall_7() { return cWaitParserRuleCall_7; }
	}
	public class ScanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Scan");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFunAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cFunScanKeyword_0_0 = (Keyword)cFunAssignment_0.eContents().get(0);
		private final Assignment cCompAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCompComparaisonParserRuleCall_1_0 = (RuleCall)cCompAssignment_1.eContents().get(0);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueINTTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValuereturnAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValuereturnINTTerminalRuleCall_4_0 = (RuleCall)cValuereturnAssignment_4.eContents().get(0);
		
		//Scan:
		//	fun='scan' comp=Comparaison value=INT ':' valuereturn=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//fun='scan' comp=Comparaison value=INT ':' valuereturn=INT
		public Group getGroup() { return cGroup; }
		
		//fun='scan'
		public Assignment getFunAssignment_0() { return cFunAssignment_0; }
		
		//'scan'
		public Keyword getFunScanKeyword_0_0() { return cFunScanKeyword_0_0; }
		
		//comp=Comparaison
		public Assignment getCompAssignment_1() { return cCompAssignment_1; }
		
		//Comparaison
		public RuleCall getCompComparaisonParserRuleCall_1_0() { return cCompComparaisonParserRuleCall_1_0; }
		
		//value=INT
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_2_0() { return cValueINTTerminalRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//valuereturn=INT
		public Assignment getValuereturnAssignment_4() { return cValuereturnAssignment_4; }
		
		//INT
		public RuleCall getValuereturnINTTerminalRuleCall_4_0() { return cValuereturnINTTerminalRuleCall_4_0; }
	}
	public class MoveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Move");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFunAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cFunMoveKeyword_0_0 = (Keyword)cFunAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cCompAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cCompComparaisonParserRuleCall_2_0_0 = (RuleCall)cCompAssignment_2_0.eContents().get(0);
		private final Assignment cValuereturnAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValuereturnINTTerminalRuleCall_2_1_0 = (RuleCall)cValuereturnAssignment_2_1.eContents().get(0);
		
		//Move:
		//	fun='move' value=INT (comp=Comparaison valuereturn=INT)*;
		@Override public ParserRule getRule() { return rule; }
		
		//fun='move' value=INT (comp=Comparaison valuereturn=INT)*
		public Group getGroup() { return cGroup; }
		
		//fun='move'
		public Assignment getFunAssignment_0() { return cFunAssignment_0; }
		
		//'move'
		public Keyword getFunMoveKeyword_0_0() { return cFunMoveKeyword_0_0; }
		
		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
		
		//(comp=Comparaison valuereturn=INT)*
		public Group getGroup_2() { return cGroup_2; }
		
		//comp=Comparaison
		public Assignment getCompAssignment_2_0() { return cCompAssignment_2_0; }
		
		//Comparaison
		public RuleCall getCompComparaisonParserRuleCall_2_0_0() { return cCompComparaisonParserRuleCall_2_0_0; }
		
		//valuereturn=INT
		public Assignment getValuereturnAssignment_2_1() { return cValuereturnAssignment_2_1; }
		
		//INT
		public RuleCall getValuereturnINTTerminalRuleCall_2_1_0() { return cValuereturnINTTerminalRuleCall_2_1_0; }
	}
	public class FiltElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Filt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFunAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cFunFiltKeyword_0_0 = (Keyword)cFunAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cCompAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cCompComparaisonParserRuleCall_2_0_0 = (RuleCall)cCompAssignment_2_0.eContents().get(0);
		private final Assignment cValuereturnAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValuereturnINTTerminalRuleCall_2_1_0 = (RuleCall)cValuereturnAssignment_2_1.eContents().get(0);
		
		//Filt:
		//	fun='filt' value=INT (comp=Comparaison valuereturn=INT)*;
		@Override public ParserRule getRule() { return rule; }
		
		//fun='filt' value=INT (comp=Comparaison valuereturn=INT)*
		public Group getGroup() { return cGroup; }
		
		//fun='filt'
		public Assignment getFunAssignment_0() { return cFunAssignment_0; }
		
		//'filt'
		public Keyword getFunFiltKeyword_0_0() { return cFunFiltKeyword_0_0; }
		
		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
		
		//(comp=Comparaison valuereturn=INT)*
		public Group getGroup_2() { return cGroup_2; }
		
		//comp=Comparaison
		public Assignment getCompAssignment_2_0() { return cCompAssignment_2_0; }
		
		//Comparaison
		public RuleCall getCompComparaisonParserRuleCall_2_0_0() { return cCompComparaisonParserRuleCall_2_0_0; }
		
		//valuereturn=INT
		public Assignment getValuereturnAssignment_2_1() { return cValuereturnAssignment_2_1; }
		
		//INT
		public RuleCall getValuereturnINTTerminalRuleCall_2_1_0() { return cValuereturnINTTerminalRuleCall_2_1_0; }
	}
	public class ComparaisonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Comparaison");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cLessThanSignKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cLessThanSignEqualsSignKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cGreaterThanSignEqualsSignKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cEqualsSignEqualsSignKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cExclamationMarkEqualsSignKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		
		//Comparaison:
		//	'<' | '>' | '<=' | '>=' | '==' | '!=';
		@Override public ParserRule getRule() { return rule; }
		
		//'<' | '>' | '<=' | '>=' | '==' | '!='
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'<'
		public Keyword getLessThanSignKeyword_0() { return cLessThanSignKeyword_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_1() { return cGreaterThanSignKeyword_1; }
		
		//'<='
		public Keyword getLessThanSignEqualsSignKeyword_2() { return cLessThanSignEqualsSignKeyword_2; }
		
		//'>='
		public Keyword getGreaterThanSignEqualsSignKeyword_3() { return cGreaterThanSignEqualsSignKeyword_3; }
		
		//'=='
		public Keyword getEqualsSignEqualsSignKeyword_4() { return cEqualsSignEqualsSignKeyword_4; }
		
		//'!='
		public Keyword getExclamationMarkEqualsSignKeyword_5() { return cExclamationMarkEqualsSignKeyword_5; }
	}
	public class SuckElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Suck");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFunAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cFunSuckKeyword_0_0 = (Keyword)cFunAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cValueINTTerminalRuleCall_1_0_0 = (RuleCall)cValueAssignment_1_0.eContents().get(0);
		private final Assignment cValeurAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cValeurDOUBLETerminalRuleCall_1_1_0 = (RuleCall)cValeurAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cCompAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cCompComparaisonParserRuleCall_2_0_0 = (RuleCall)cCompAssignment_2_0.eContents().get(0);
		private final Assignment cValuereturnAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValuereturnINTTerminalRuleCall_2_1_0 = (RuleCall)cValuereturnAssignment_2_1.eContents().get(0);
		
		//Suck:
		//	fun='suck' (value=INT | valeur=DOUBLE) (comp=Comparaison valuereturn=INT)*;
		@Override public ParserRule getRule() { return rule; }
		
		//fun='suck' (value=INT | valeur=DOUBLE) (comp=Comparaison valuereturn=INT)*
		public Group getGroup() { return cGroup; }
		
		//fun='suck'
		public Assignment getFunAssignment_0() { return cFunAssignment_0; }
		
		//'suck'
		public Keyword getFunSuckKeyword_0_0() { return cFunSuckKeyword_0_0; }
		
		//(value=INT | valeur=DOUBLE)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//value=INT
		public Assignment getValueAssignment_1_0() { return cValueAssignment_1_0; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0_0() { return cValueINTTerminalRuleCall_1_0_0; }
		
		//valeur=DOUBLE
		public Assignment getValeurAssignment_1_1() { return cValeurAssignment_1_1; }
		
		//DOUBLE
		public RuleCall getValeurDOUBLETerminalRuleCall_1_1_0() { return cValeurDOUBLETerminalRuleCall_1_1_0; }
		
		//(comp=Comparaison valuereturn=INT)*
		public Group getGroup_2() { return cGroup_2; }
		
		//comp=Comparaison
		public Assignment getCompAssignment_2_0() { return cCompAssignment_2_0; }
		
		//Comparaison
		public RuleCall getCompComparaisonParserRuleCall_2_0_0() { return cCompComparaisonParserRuleCall_2_0_0; }
		
		//valuereturn=INT
		public Assignment getValuereturnAssignment_2_1() { return cValuereturnAssignment_2_1; }
		
		//INT
		public RuleCall getValuereturnINTTerminalRuleCall_2_1_0() { return cValuereturnINTTerminalRuleCall_2_1_0; }
	}
	public class BlowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Blow");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFunAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cFunBlowKeyword_0_0 = (Keyword)cFunAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cValueINTTerminalRuleCall_1_0_0 = (RuleCall)cValueAssignment_1_0.eContents().get(0);
		private final Assignment cValeurAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cValeurDOUBLETerminalRuleCall_1_1_0 = (RuleCall)cValeurAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cCompAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cCompComparaisonParserRuleCall_2_0_0 = (RuleCall)cCompAssignment_2_0.eContents().get(0);
		private final Assignment cValuereturnAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValuereturnINTTerminalRuleCall_2_1_0 = (RuleCall)cValuereturnAssignment_2_1.eContents().get(0);
		
		//Blow:
		//	fun='blow' (value=INT | valeur=DOUBLE) (comp=Comparaison valuereturn=INT)*;
		@Override public ParserRule getRule() { return rule; }
		
		//fun='blow' (value=INT | valeur=DOUBLE) (comp=Comparaison valuereturn=INT)*
		public Group getGroup() { return cGroup; }
		
		//fun='blow'
		public Assignment getFunAssignment_0() { return cFunAssignment_0; }
		
		//'blow'
		public Keyword getFunBlowKeyword_0_0() { return cFunBlowKeyword_0_0; }
		
		//(value=INT | valeur=DOUBLE)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//value=INT
		public Assignment getValueAssignment_1_0() { return cValueAssignment_1_0; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0_0() { return cValueINTTerminalRuleCall_1_0_0; }
		
		//valeur=DOUBLE
		public Assignment getValeurAssignment_1_1() { return cValeurAssignment_1_1; }
		
		//DOUBLE
		public RuleCall getValeurDOUBLETerminalRuleCall_1_1_0() { return cValeurDOUBLETerminalRuleCall_1_1_0; }
		
		//(comp=Comparaison valuereturn=INT)*
		public Group getGroup_2() { return cGroup_2; }
		
		//comp=Comparaison
		public Assignment getCompAssignment_2_0() { return cCompAssignment_2_0; }
		
		//Comparaison
		public RuleCall getCompComparaisonParserRuleCall_2_0_0() { return cCompComparaisonParserRuleCall_2_0_0; }
		
		//valuereturn=INT
		public Assignment getValuereturnAssignment_2_1() { return cValuereturnAssignment_2_1; }
		
		//INT
		public RuleCall getValuereturnINTTerminalRuleCall_2_1_0() { return cValuereturnINTTerminalRuleCall_2_1_0; }
	}
	public class OpenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Open");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFunAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cFunOpenKeyword_0_0 = (Keyword)cFunAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cCompAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cCompComparaisonParserRuleCall_2_0_0 = (RuleCall)cCompAssignment_2_0.eContents().get(0);
		private final Assignment cValuereturnAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValuereturnINTTerminalRuleCall_2_1_0 = (RuleCall)cValuereturnAssignment_2_1.eContents().get(0);
		
		//Open:
		//	fun='open' value=INT (comp=Comparaison valuereturn=INT)*;
		@Override public ParserRule getRule() { return rule; }
		
		//fun='open' value=INT (comp=Comparaison valuereturn=INT)*
		public Group getGroup() { return cGroup; }
		
		//fun='open'
		public Assignment getFunAssignment_0() { return cFunAssignment_0; }
		
		//'open'
		public Keyword getFunOpenKeyword_0_0() { return cFunOpenKeyword_0_0; }
		
		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
		
		//(comp=Comparaison valuereturn=INT)*
		public Group getGroup_2() { return cGroup_2; }
		
		//comp=Comparaison
		public Assignment getCompAssignment_2_0() { return cCompAssignment_2_0; }
		
		//Comparaison
		public RuleCall getCompComparaisonParserRuleCall_2_0_0() { return cCompComparaisonParserRuleCall_2_0_0; }
		
		//valuereturn=INT
		public Assignment getValuereturnAssignment_2_1() { return cValuereturnAssignment_2_1; }
		
		//INT
		public RuleCall getValuereturnINTTerminalRuleCall_2_1_0() { return cValuereturnINTTerminalRuleCall_2_1_0; }
	}
	public class ShutElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Shut");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFunAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cFunShutKeyword_0_0 = (Keyword)cFunAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cCompAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cCompComparaisonParserRuleCall_2_0_0 = (RuleCall)cCompAssignment_2_0.eContents().get(0);
		private final Assignment cValuereturnAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValuereturnINTTerminalRuleCall_2_1_0 = (RuleCall)cValuereturnAssignment_2_1.eContents().get(0);
		
		//Shut:
		//	fun='shut' value=INT (comp=Comparaison valuereturn=INT)*;
		@Override public ParserRule getRule() { return rule; }
		
		//fun='shut' value=INT (comp=Comparaison valuereturn=INT)*
		public Group getGroup() { return cGroup; }
		
		//fun='shut'
		public Assignment getFunAssignment_0() { return cFunAssignment_0; }
		
		//'shut'
		public Keyword getFunShutKeyword_0_0() { return cFunShutKeyword_0_0; }
		
		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
		
		//(comp=Comparaison valuereturn=INT)*
		public Group getGroup_2() { return cGroup_2; }
		
		//comp=Comparaison
		public Assignment getCompAssignment_2_0() { return cCompAssignment_2_0; }
		
		//Comparaison
		public RuleCall getCompComparaisonParserRuleCall_2_0_0() { return cCompComparaisonParserRuleCall_2_0_0; }
		
		//valuereturn=INT
		public Assignment getValuereturnAssignment_2_1() { return cValuereturnAssignment_2_1; }
		
		//INT
		public RuleCall getValuereturnINTTerminalRuleCall_2_1_0() { return cValuereturnINTTerminalRuleCall_2_1_0; }
	}
	public class WaitElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Wait");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFunAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cFunWaitKeyword_0_0 = (Keyword)cFunAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cCompAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cCompComparaisonParserRuleCall_2_0_0 = (RuleCall)cCompAssignment_2_0.eContents().get(0);
		private final Assignment cValuereturnAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValuereturnINTTerminalRuleCall_2_1_0 = (RuleCall)cValuereturnAssignment_2_1.eContents().get(0);
		
		//Wait:
		//	fun='wait' value=INT (comp=Comparaison valuereturn=INT)*;
		@Override public ParserRule getRule() { return rule; }
		
		//fun='wait' value=INT (comp=Comparaison valuereturn=INT)*
		public Group getGroup() { return cGroup; }
		
		//fun='wait'
		public Assignment getFunAssignment_0() { return cFunAssignment_0; }
		
		//'wait'
		public Keyword getFunWaitKeyword_0_0() { return cFunWaitKeyword_0_0; }
		
		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
		
		//(comp=Comparaison valuereturn=INT)*
		public Group getGroup_2() { return cGroup_2; }
		
		//comp=Comparaison
		public Assignment getCompAssignment_2_0() { return cCompAssignment_2_0; }
		
		//Comparaison
		public RuleCall getCompComparaisonParserRuleCall_2_0_0() { return cCompComparaisonParserRuleCall_2_0_0; }
		
		//valuereturn=INT
		public Assignment getValuereturnAssignment_2_1() { return cValuereturnAssignment_2_1; }
		
		//INT
		public RuleCall getValuereturnINTTerminalRuleCall_2_1_0() { return cValuereturnINTTerminalRuleCall_2_1_0; }
	}
	
	
	private final ModelElements pModel;
	private final TaskElements pTask;
	private final FeatureElements pFeature;
	private final ScanElements pScan;
	private final MoveElements pMove;
	private final FiltElements pFilt;
	private final ComparaisonElements pComparaison;
	private final TerminalRule tDOUBLE;
	private final SuckElements pSuck;
	private final BlowElements pBlow;
	private final OpenElements pOpen;
	private final ShutElements pShut;
	private final WaitElements pWait;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pTask = new TaskElements();
		this.pFeature = new FeatureElements();
		this.pScan = new ScanElements();
		this.pMove = new MoveElements();
		this.pFilt = new FiltElements();
		this.pComparaison = new ComparaisonElements();
		this.tDOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.DOUBLE");
		this.pSuck = new SuckElements();
		this.pBlow = new BlowElements();
		this.pOpen = new OpenElements();
		this.pShut = new ShutElements();
		this.pWait = new WaitElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	features+=Feature+;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Task:
	//	'Task' name=ID ':'
	//	features+=Feature+
	//	'end.';
	public TaskElements getTaskAccess() {
		return pTask;
	}
	
	public ParserRule getTaskRule() {
		return getTaskAccess().getRule();
	}
	
	//Feature:
	//	Scan | Move | Filt | Suck | Blow | Open | Shut | Wait;
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}
	
	//Scan:
	//	fun='scan' comp=Comparaison value=INT ':' valuereturn=INT;
	public ScanElements getScanAccess() {
		return pScan;
	}
	
	public ParserRule getScanRule() {
		return getScanAccess().getRule();
	}
	
	//Move:
	//	fun='move' value=INT (comp=Comparaison valuereturn=INT)*;
	public MoveElements getMoveAccess() {
		return pMove;
	}
	
	public ParserRule getMoveRule() {
		return getMoveAccess().getRule();
	}
	
	//Filt:
	//	fun='filt' value=INT (comp=Comparaison valuereturn=INT)*;
	public FiltElements getFiltAccess() {
		return pFilt;
	}
	
	public ParserRule getFiltRule() {
		return getFiltAccess().getRule();
	}
	
	//Comparaison:
	//	'<' | '>' | '<=' | '>=' | '==' | '!=';
	public ComparaisonElements getComparaisonAccess() {
		return pComparaison;
	}
	
	public ParserRule getComparaisonRule() {
		return getComparaisonAccess().getRule();
	}
	
	//terminal DOUBLE:
	//	INT '.' INT;
	public TerminalRule getDOUBLERule() {
		return tDOUBLE;
	}
	
	//Suck:
	//	fun='suck' (value=INT | valeur=DOUBLE) (comp=Comparaison valuereturn=INT)*;
	public SuckElements getSuckAccess() {
		return pSuck;
	}
	
	public ParserRule getSuckRule() {
		return getSuckAccess().getRule();
	}
	
	//Blow:
	//	fun='blow' (value=INT | valeur=DOUBLE) (comp=Comparaison valuereturn=INT)*;
	public BlowElements getBlowAccess() {
		return pBlow;
	}
	
	public ParserRule getBlowRule() {
		return getBlowAccess().getRule();
	}
	
	//Open:
	//	fun='open' value=INT (comp=Comparaison valuereturn=INT)*;
	public OpenElements getOpenAccess() {
		return pOpen;
	}
	
	public ParserRule getOpenRule() {
		return getOpenAccess().getRule();
	}
	
	//Shut:
	//	fun='shut' value=INT (comp=Comparaison valuereturn=INT)*;
	public ShutElements getShutAccess() {
		return pShut;
	}
	
	public ParserRule getShutRule() {
		return getShutAccess().getRule();
	}
	
	//Wait:
	//	fun='wait' value=INT (comp=Comparaison valuereturn=INT)*;
	public WaitElements getWaitAccess() {
		return pWait;
	}
	
	public ParserRule getWaitRule() {
		return getWaitAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
