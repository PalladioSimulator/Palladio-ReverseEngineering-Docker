/*
 * generated by Xtext 2.21.0
 */
package org.palladiosimulator.somox.docker.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.palladiosimulator.somox.docker.services.DockerFileGrammarAccess;

@SuppressWarnings("all")
public class DockerFileSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DockerFileGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Cmd_Copy_Entrypoint_Volume_CMDKeyword_0_or_COPYKeyword_0_or_ENTRYPOINTKeyword_0_or_VOLUMEKeyword_0;
	protected AbstractElementAlias match_Cmd_Entrypoint___CMDKeyword_0_ONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1___or___ENTRYPOINTKeyword_0_ONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DockerFileGrammarAccess) access;
		match_Cmd_Copy_Entrypoint_Volume_CMDKeyword_0_or_COPYKeyword_0_or_ENTRYPOINTKeyword_0_or_VOLUMEKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCmdAccess().getCMDKeyword_0()), new TokenAlias(false, false, grammarAccess.getCopyAccess().getCOPYKeyword_0()), new TokenAlias(false, false, grammarAccess.getEntrypointAccess().getENTRYPOINTKeyword_0()), new TokenAlias(false, false, grammarAccess.getVolumeAccess().getVOLUMEKeyword_0()));
		match_Cmd_Entrypoint___CMDKeyword_0_ONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1___or___ENTRYPOINTKeyword_0_ONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getCmdAccess().getCMDKeyword_0()), new TokenAlias(false, false, grammarAccess.getCmdAccess().getONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEntrypointAccess().getENTRYPOINTKeyword_0()), new TokenAlias(false, false, grammarAccess.getEntrypointAccess().getONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1())));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getONE_SPACE_AND_WHATEVERRule())
			return getONE_SPACE_AND_WHATEVERToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ONE_SPACE_AND_WHATEVER: ' '!('\n' | '\r')*  ('\r'? '\n')?;
	 */
	protected String getONE_SPACE_AND_WHATEVERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Cmd_Copy_Entrypoint_Volume_CMDKeyword_0_or_COPYKeyword_0_or_ENTRYPOINTKeyword_0_or_VOLUMEKeyword_0.equals(syntax))
				emit_Cmd_Copy_Entrypoint_Volume_CMDKeyword_0_or_COPYKeyword_0_or_ENTRYPOINTKeyword_0_or_VOLUMEKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Cmd_Entrypoint___CMDKeyword_0_ONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1___or___ENTRYPOINTKeyword_0_ONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1__.equals(syntax))
				emit_Cmd_Entrypoint___CMDKeyword_0_ONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1___or___ENTRYPOINTKeyword_0_ONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'CMD' | 'COPY' | 'ENTRYPOINT' | 'VOLUME'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '[' head=STRING
	 */
	protected void emit_Cmd_Copy_Entrypoint_Volume_CMDKeyword_0_or_COPYKeyword_0_or_ENTRYPOINTKeyword_0_or_VOLUMEKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('CMD' ONE_SPACE_AND_WHATEVER) | ('ENTRYPOINT' ONE_SPACE_AND_WHATEVER)
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Cmd_Entrypoint___CMDKeyword_0_ONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1___or___ENTRYPOINTKeyword_0_ONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
