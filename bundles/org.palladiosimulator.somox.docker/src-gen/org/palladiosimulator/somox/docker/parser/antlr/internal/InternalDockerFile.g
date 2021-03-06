/*
 * generated by Xtext 2.21.0
 */
grammar InternalDockerFile;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.palladiosimulator.somox.docker.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.palladiosimulator.somox.docker.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.palladiosimulator.somox.docker.services.DockerFileGrammarAccess;

}

@parser::members {

 	private DockerFileGrammarAccess grammarAccess;

    public InternalDockerFileParser(TokenStream input, DockerFileGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Dockerfile";
   	}

   	@Override
   	protected DockerFileGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDockerfile
entryRuleDockerfile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDockerfileRule()); }
	iv_ruleDockerfile=ruleDockerfile
	{ $current=$iv_ruleDockerfile.current; }
	EOF;

// Rule Dockerfile
ruleDockerfile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getDockerfileAccess().getInstructionsInstructionParserRuleCall_0());
			}
			lv_instructions_0_0=ruleInstruction
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getDockerfileRule());
				}
				add(
					$current,
					"instructions",
					lv_instructions_0_0,
					"org.palladiosimulator.somox.docker.DockerFile.Instruction");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

// Entry rule entryRuleInstruction
entryRuleInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstructionRule()); }
	iv_ruleInstruction=ruleInstruction
	{ $current=$iv_ruleInstruction.current; }
	EOF;

// Rule Instruction
ruleInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getAddParserRuleCall_0());
		}
		this_Add_0=ruleAdd
		{
			$current = $this_Add_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getCmdParserRuleCall_1());
		}
		this_Cmd_1=ruleCmd
		{
			$current = $this_Cmd_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getCopyParserRuleCall_2());
		}
		this_Copy_2=ruleCopy
		{
			$current = $this_Copy_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getEntrypointParserRuleCall_3());
		}
		this_Entrypoint_3=ruleEntrypoint
		{
			$current = $this_Entrypoint_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getExposeParserRuleCall_4());
		}
		this_Expose_4=ruleExpose
		{
			$current = $this_Expose_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getEnvParserRuleCall_5());
		}
		this_Env_5=ruleEnv
		{
			$current = $this_Env_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getFromParserRuleCall_6());
		}
		this_From_6=ruleFrom
		{
			$current = $this_From_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getMaintainerParserRuleCall_7());
		}
		this_Maintainer_7=ruleMaintainer
		{
			$current = $this_Maintainer_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getOnbuildParserRuleCall_8());
		}
		this_Onbuild_8=ruleOnbuild
		{
			$current = $this_Onbuild_8.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getRunParserRuleCall_9());
		}
		this_Run_9=ruleRun
		{
			$current = $this_Run_9.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getUserParserRuleCall_10());
		}
		this_User_10=ruleUser
		{
			$current = $this_User_10.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getVolumeParserRuleCall_11());
		}
		this_Volume_11=ruleVolume
		{
			$current = $this_Volume_11.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getWorkdirParserRuleCall_12());
		}
		this_Workdir_12=ruleWorkdir
		{
			$current = $this_Workdir_12.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCmd
entryRuleCmd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCmdRule()); }
	iv_ruleCmd=ruleCmd
	{ $current=$iv_ruleCmd.current; }
	EOF;

// Rule Cmd
ruleCmd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CMD'
		{
			newLeafNode(otherlv_0, grammarAccess.getCmdAccess().getCMDKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getCmdAccess().getJSON_ARRAYParserRuleCall_1_0());
			}
			this_JSON_ARRAY_1=ruleJSON_ARRAY
			{
				$current = $this_JSON_ARRAY_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			(
				(
					{
						$current = forceCreateModelElement(
							grammarAccess.getCmdAccess().getCmdAction_1_1_0(),
							$current);
					}
				)
				this_ONE_SPACE_AND_WHATEVER_3=RULE_ONE_SPACE_AND_WHATEVER
				{
					newLeafNode(this_ONE_SPACE_AND_WHATEVER_3, grammarAccess.getCmdAccess().getONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1());
				}
			)
		)
	)
;

// Entry rule entryRuleCopy
entryRuleCopy returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCopyRule()); }
	iv_ruleCopy=ruleCopy
	{ $current=$iv_ruleCopy.current; }
	EOF;

// Rule Copy
ruleCopy returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='COPY'
		{
			newLeafNode(otherlv_0, grammarAccess.getCopyAccess().getCOPYKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getCopyAccess().getJSON_ARRAYParserRuleCall_1_0());
			}
			this_JSON_ARRAY_1=ruleJSON_ARRAY
			{
				$current = $this_JSON_ARRAY_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getCopyAccess().getSource_leftAddSourceParserRuleCall_1_1_0_0());
						}
						lv_source_left_2_0=ruleAddSource
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getCopyRule());
							}
							set(
								$current,
								"source_left",
								lv_source_left_2_0,
								"org.palladiosimulator.somox.docker.DockerFile.AddSource");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						lv_dest_3_0=RULE_ONE_SPACE_AND_WHATEVER
						{
							newLeafNode(lv_dest_3_0, grammarAccess.getCopyAccess().getDestONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCopyRule());
							}
							setWithLastConsumed(
								$current,
								"dest",
								lv_dest_3_0,
								"org.palladiosimulator.somox.docker.DockerFile.ONE_SPACE_AND_WHATEVER");
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRuleEntrypoint
entryRuleEntrypoint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntrypointRule()); }
	iv_ruleEntrypoint=ruleEntrypoint
	{ $current=$iv_ruleEntrypoint.current; }
	EOF;

// Rule Entrypoint
ruleEntrypoint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ENTRYPOINT'
		{
			newLeafNode(otherlv_0, grammarAccess.getEntrypointAccess().getENTRYPOINTKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getEntrypointAccess().getJSON_ARRAYParserRuleCall_1_0());
			}
			this_JSON_ARRAY_1=ruleJSON_ARRAY
			{
				$current = $this_JSON_ARRAY_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			(
				(
					{
						$current = forceCreateModelElement(
							grammarAccess.getEntrypointAccess().getCmdAction_1_1_0(),
							$current);
					}
				)
				this_ONE_SPACE_AND_WHATEVER_3=RULE_ONE_SPACE_AND_WHATEVER
				{
					newLeafNode(this_ONE_SPACE_AND_WHATEVER_3, grammarAccess.getEntrypointAccess().getONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1());
				}
			)
		)
	)
;

// Entry rule entryRuleVolume
entryRuleVolume returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVolumeRule()); }
	iv_ruleVolume=ruleVolume
	{ $current=$iv_ruleVolume.current; }
	EOF;

// Rule Volume
ruleVolume returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='VOLUME'
		{
			newLeafNode(otherlv_0, grammarAccess.getVolumeAccess().getVOLUMEKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getVolumeAccess().getJSON_ARRAYParserRuleCall_1_0());
			}
			this_JSON_ARRAY_1=ruleJSON_ARRAY
			{
				$current = $this_JSON_ARRAY_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			(
				(
					{
						$current = forceCreateModelElement(
							grammarAccess.getVolumeAccess().getVolumeAction_1_1_0(),
							$current);
					}
				)
				this_ONE_SPACE_AND_WHATEVER_3=RULE_ONE_SPACE_AND_WHATEVER
				{
					newLeafNode(this_ONE_SPACE_AND_WHATEVER_3, grammarAccess.getVolumeAccess().getONE_SPACE_AND_WHATEVERTerminalRuleCall_1_1_1());
				}
			)
		)
	)
;

// Entry rule entryRuleUser
entryRuleUser returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUserRule()); }
	iv_ruleUser=ruleUser
	{ $current=$iv_ruleUser.current; }
	EOF;

// Rule User
ruleUser returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='USER'
		{
			newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUSERKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUserRule());
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
;

// Entry rule entryRuleOnbuild
entryRuleOnbuild returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOnbuildRule()); }
	iv_ruleOnbuild=ruleOnbuild
	{ $current=$iv_ruleOnbuild.current; }
	EOF;

// Rule Onbuild
ruleOnbuild returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ONBUILD'
		{
			newLeafNode(otherlv_0, grammarAccess.getOnbuildAccess().getONBUILDKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOnbuildAccess().getInstructionInstructionParserRuleCall_1_0());
				}
				lv_instruction_1_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOnbuildRule());
					}
					set(
						$current,
						"instruction",
						lv_instruction_1_0,
						"org.palladiosimulator.somox.docker.DockerFile.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFrom
entryRuleFrom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFromRule()); }
	iv_ruleFrom=ruleFrom
	{ $current=$iv_ruleFrom.current; }
	EOF;

// Rule From
ruleFrom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='FROM'
		{
			newLeafNode(otherlv_0, grammarAccess.getFromAccess().getFROMKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFromAccess().getNameVALID_IMAGE_NAMEParserRuleCall_1_0());
				}
				lv_name_1_0=ruleVALID_IMAGE_NAME
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFromRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.palladiosimulator.somox.docker.DockerFile.VALID_IMAGE_NAME");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=':'
			{
				newLeafNode(otherlv_2, grammarAccess.getFromAccess().getColonKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFromAccess().getTagVALID_IMAGE_TAGParserRuleCall_2_1_0());
					}
					lv_tag_3_0=ruleVALID_IMAGE_TAG
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFromRule());
						}
						set(
							$current,
							"tag",
							lv_tag_3_0,
							"org.palladiosimulator.somox.docker.DockerFile.VALID_IMAGE_TAG");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleMaintainer
entryRuleMaintainer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMaintainerRule()); }
	iv_ruleMaintainer=ruleMaintainer
	{ $current=$iv_ruleMaintainer.current; }
	EOF;

// Rule Maintainer
ruleMaintainer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='MAINTAINER'
		{
			newLeafNode(otherlv_0, grammarAccess.getMaintainerAccess().getMAINTAINERKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ONE_SPACE_AND_WHATEVER
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMaintainerAccess().getNameONE_SPACE_AND_WHATEVERTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMaintainerRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.palladiosimulator.somox.docker.DockerFile.ONE_SPACE_AND_WHATEVER");
				}
			)
		)
	)
;

// Entry rule entryRuleEnv
entryRuleEnv returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnvRule()); }
	iv_ruleEnv=ruleEnv
	{ $current=$iv_ruleEnv.current; }
	EOF;

// Rule Env
ruleEnv returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ENV'
		{
			newLeafNode(otherlv_0, grammarAccess.getEnvAccess().getENVKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getEnvAccess().getEnvWithSpaceParserRuleCall_1_0());
			}
			this_EnvWithSpace_1=ruleEnvWithSpace
			{
				$current = $this_EnvWithSpace_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getEnvAccess().getEnvWithEqualParserRuleCall_1_1());
			}
			this_EnvWithEqual_2=ruleEnvWithEqual
			{
				$current = $this_EnvWithEqual_2.current;
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleExpose
entryRuleExpose returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExposeRule()); }
	iv_ruleExpose=ruleExpose
	{ $current=$iv_ruleExpose.current; }
	EOF;

// Rule Expose
ruleExpose returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='EXPOSE'
		{
			newLeafNode(otherlv_0, grammarAccess.getExposeAccess().getEXPOSEKeyword_0());
		}
		(
			(
				lv_ports_1_0=RULE_ONE_SPACE_AND_WHATEVER
				{
					newLeafNode(lv_ports_1_0, grammarAccess.getExposeAccess().getPortsONE_SPACE_AND_WHATEVERTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExposeRule());
					}
					setWithLastConsumed(
						$current,
						"ports",
						lv_ports_1_0,
						"org.palladiosimulator.somox.docker.DockerFile.ONE_SPACE_AND_WHATEVER");
				}
			)
		)
	)
;

// Entry rule entryRuleJSON_ARRAY
entryRuleJSON_ARRAY returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJSON_ARRAYRule()); }
	iv_ruleJSON_ARRAY=ruleJSON_ARRAY
	{ $current=$iv_ruleJSON_ARRAY.current; }
	EOF;

// Rule JSON_ARRAY
ruleJSON_ARRAY returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getJSON_ARRAYAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				lv_head_1_0=RULE_STRING
				{
					newLeafNode(lv_head_1_0, grammarAccess.getJSON_ARRAYAccess().getHeadSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJSON_ARRAYRule());
					}
					setWithLastConsumed(
						$current,
						"head",
						lv_head_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getJSON_ARRAYAccess().getTailSTRING_PREFIXED_WITH_COMMAParserRuleCall_2_0());
				}
				lv_tail_2_0=ruleSTRING_PREFIXED_WITH_COMMA
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getJSON_ARRAYRule());
					}
					add(
						$current,
						"tail",
						lv_tail_2_0,
						"org.palladiosimulator.somox.docker.DockerFile.STRING_PREFIXED_WITH_COMMA");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3=']'
		{
			newLeafNode(otherlv_3, grammarAccess.getJSON_ARRAYAccess().getRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleEnvWithSpace
entryRuleEnvWithSpace returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnvWithSpaceRule()); }
	iv_ruleEnvWithSpace=ruleEnvWithSpace
	{ $current=$iv_ruleEnvWithSpace.current; }
	EOF;

// Rule EnvWithSpace
ruleEnvWithSpace returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_key_0_0=RULE_ID
				{
					newLeafNode(lv_key_0_0, grammarAccess.getEnvWithSpaceAccess().getKeyIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnvWithSpaceRule());
					}
					addWithLastConsumed(
						$current,
						"key",
						lv_key_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_value_1_0=RULE_ONE_SPACE_AND_WHATEVER
				{
					newLeafNode(lv_value_1_0, grammarAccess.getEnvWithSpaceAccess().getValueONE_SPACE_AND_WHATEVERTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnvWithSpaceRule());
					}
					addWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.palladiosimulator.somox.docker.DockerFile.ONE_SPACE_AND_WHATEVER");
				}
			)
		)
	)
;

// Entry rule entryRuleEnvWithEqual
entryRuleEnvWithEqual returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnvWithEqualRule()); }
	iv_ruleEnvWithEqual=ruleEnvWithEqual
	{ $current=$iv_ruleEnvWithEqual.current; }
	EOF;

// Rule EnvWithEqual
ruleEnvWithEqual returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_key_0_0=RULE_ID
				{
					newLeafNode(lv_key_0_0, grammarAccess.getEnvWithEqualAccess().getKeyIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnvWithEqualRule());
					}
					addWithLastConsumed(
						$current,
						"key",
						lv_key_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_value_1_0=RULE_ENV_VALUE_WITH_EQUAL
				{
					newLeafNode(lv_value_1_0, grammarAccess.getEnvWithEqualAccess().getValueENV_VALUE_WITH_EQUALTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnvWithEqualRule());
					}
					addWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.palladiosimulator.somox.docker.DockerFile.ENV_VALUE_WITH_EQUAL");
				}
			)
		)
	)+
;

// Entry rule entryRuleWorkdir
entryRuleWorkdir returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWorkdirRule()); }
	iv_ruleWorkdir=ruleWorkdir
	{ $current=$iv_ruleWorkdir.current; }
	EOF;

// Rule Workdir
ruleWorkdir returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='WORKDIR'
		{
			newLeafNode(otherlv_0, grammarAccess.getWorkdirAccess().getWORKDIRKeyword_0());
		}
		(
			(
				lv_path_1_0=RULE_ONE_SPACE_AND_WHATEVER
				{
					newLeafNode(lv_path_1_0, grammarAccess.getWorkdirAccess().getPathONE_SPACE_AND_WHATEVERTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkdirRule());
					}
					setWithLastConsumed(
						$current,
						"path",
						lv_path_1_0,
						"org.palladiosimulator.somox.docker.DockerFile.ONE_SPACE_AND_WHATEVER");
				}
			)
		)
	)
;

// Entry rule entryRuleAdd
entryRuleAdd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAddRule()); }
	iv_ruleAdd=ruleAdd
	{ $current=$iv_ruleAdd.current; }
	EOF;

// Rule Add
ruleAdd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ADD'
		{
			newLeafNode(otherlv_0, grammarAccess.getAddAccess().getADDKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAddAccess().getSource_leftAddSourceParserRuleCall_1_0());
				}
				lv_source_left_1_0=ruleAddSource
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAddRule());
					}
					set(
						$current,
						"source_left",
						lv_source_left_1_0,
						"org.palladiosimulator.somox.docker.DockerFile.AddSource");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_dest_2_0=RULE_ONE_SPACE_AND_WHATEVER
				{
					newLeafNode(lv_dest_2_0, grammarAccess.getAddAccess().getDestONE_SPACE_AND_WHATEVERTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAddRule());
					}
					setWithLastConsumed(
						$current,
						"dest",
						lv_dest_2_0,
						"org.palladiosimulator.somox.docker.DockerFile.ONE_SPACE_AND_WHATEVER");
				}
			)
		)
	)
;

// Entry rule entryRuleAddSource
entryRuleAddSource returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAddSourceRule()); }
	iv_ruleAddSource=ruleAddSource
	{ $current=$iv_ruleAddSource.current.getText(); }
	EOF;

// Rule AddSource
ruleAddSource returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAddSourceAccess().getVALID_RELATIVE_PATHParserRuleCall_0());
		}
		this_VALID_RELATIVE_PATH_0=ruleVALID_RELATIVE_PATH
		{
			$current.merge(this_VALID_RELATIVE_PATH_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAddSourceAccess().getVALID_URLParserRuleCall_1());
		}
		this_VALID_URL_1=ruleVALID_URL
		{
			$current.merge(this_VALID_URL_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAddSourceAccess().getFullStopKeyword_2());
		}
	)
;

// Entry rule entryRuleRun
entryRuleRun returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRunRule()); }
	iv_ruleRun=ruleRun
	{ $current=$iv_ruleRun.current; }
	EOF;

// Rule Run
ruleRun returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='RUN'
			{
				newLeafNode(otherlv_0, grammarAccess.getRunAccess().getRUNKeyword_0_0());
			}
			{
				newCompositeNode(grammarAccess.getRunAccess().getRunWithShellParserRuleCall_0_1());
			}
			this_RunWithShell_1=ruleRunWithShell
			{
				$current = $this_RunWithShell_1.current;
				afterParserOrEnumRuleCall();
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getRunAccess().getRunWithNoShellParserRuleCall_1());
		}
		this_RunWithNoShell_2=ruleRunWithNoShell
		{
			$current = $this_RunWithNoShell_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRunWithShell
entryRuleRunWithShell returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRunWithShellRule()); }
	iv_ruleRunWithShell=ruleRunWithShell
	{ $current=$iv_ruleRunWithShell.current; }
	EOF;

// Rule RunWithShell
ruleRunWithShell returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_command_0_0=RULE_ONE_SPACE_AND_WHATEVER
			{
				newLeafNode(lv_command_0_0, grammarAccess.getRunWithShellAccess().getCommandONE_SPACE_AND_WHATEVERTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getRunWithShellRule());
				}
				setWithLastConsumed(
					$current,
					"command",
					lv_command_0_0,
					"org.palladiosimulator.somox.docker.DockerFile.ONE_SPACE_AND_WHATEVER");
			}
		)
	)
;

// Entry rule entryRuleRunWithNoShell
entryRuleRunWithNoShell returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRunWithNoShellRule()); }
	iv_ruleRunWithNoShell=ruleRunWithNoShell
	{ $current=$iv_ruleRunWithNoShell.current; }
	EOF;

// Rule RunWithNoShell
ruleRunWithNoShell returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getRunWithNoShellAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				lv_executable_1_0=RULE_STRING
				{
					newLeafNode(lv_executable_1_0, grammarAccess.getRunWithNoShellAccess().getExecutableSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRunWithNoShellRule());
					}
					setWithLastConsumed(
						$current,
						"executable",
						lv_executable_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRunWithNoShellAccess().getParamsSTRING_PREFIXED_WITH_COMMAParserRuleCall_2_0());
				}
				lv_params_2_0=ruleSTRING_PREFIXED_WITH_COMMA
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRunWithNoShellRule());
					}
					add(
						$current,
						"params",
						lv_params_2_0,
						"org.palladiosimulator.somox.docker.DockerFile.STRING_PREFIXED_WITH_COMMA");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3=']'
		{
			newLeafNode(otherlv_3, grammarAccess.getRunWithNoShellAccess().getRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleSTRING_PREFIXED_WITH_COMMA
entryRuleSTRING_PREFIXED_WITH_COMMA returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSTRING_PREFIXED_WITH_COMMARule()); }
	iv_ruleSTRING_PREFIXED_WITH_COMMA=ruleSTRING_PREFIXED_WITH_COMMA
	{ $current=$iv_ruleSTRING_PREFIXED_WITH_COMMA.current.getText(); }
	EOF;

// Rule STRING_PREFIXED_WITH_COMMA
ruleSTRING_PREFIXED_WITH_COMMA returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw=','
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSTRING_PREFIXED_WITH_COMMAAccess().getCommaKeyword_0());
		}
		this_STRING_1=RULE_STRING
		{
			$current.merge(this_STRING_1);
		}
		{
			newLeafNode(this_STRING_1, grammarAccess.getSTRING_PREFIXED_WITH_COMMAAccess().getSTRINGTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleVALID_RELATIVE_PATH
entryRuleVALID_RELATIVE_PATH returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVALID_RELATIVE_PATHRule()); }
	iv_ruleVALID_RELATIVE_PATH=ruleVALID_RELATIVE_PATH
	{ $current=$iv_ruleVALID_RELATIVE_PATH.current.getText(); }
	EOF;

// Rule VALID_RELATIVE_PATH
ruleVALID_RELATIVE_PATH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_ID_0=RULE_ID
			{
				$current.merge(this_ID_0);
			}
			{
				newLeafNode(this_ID_0, grammarAccess.getVALID_RELATIVE_PATHAccess().getIDTerminalRuleCall_0_0());
			}
			(
				kw='/'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getVALID_RELATIVE_PATHAccess().getSolidusKeyword_0_1_0());
				}
				this_ID_2=RULE_ID
				{
					$current.merge(this_ID_2);
				}
				{
					newLeafNode(this_ID_2, grammarAccess.getVALID_RELATIVE_PATHAccess().getIDTerminalRuleCall_0_1_1());
				}
			)*
		)
		(
			kw='*'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getVALID_RELATIVE_PATHAccess().getAsteriskKeyword_1());
			}
		)?
	)
;

// Entry rule entryRuleVALID_URL
entryRuleVALID_URL returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVALID_URLRule()); }
	iv_ruleVALID_URL=ruleVALID_URL
	{ $current=$iv_ruleVALID_URL.current.getText(); }
	EOF;

// Rule VALID_URL
ruleVALID_URL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='http://'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVALID_URLAccess().getHttpKeyword_0());
		}
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getVALID_URLAccess().getIDTerminalRuleCall_1());
		}
		(
			(
				kw='/'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getVALID_URLAccess().getSolidusKeyword_2_0_0());
				}
				    |
				kw='.'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getVALID_URLAccess().getFullStopKeyword_2_0_1());
				}
			)
			this_ID_4=RULE_ID
			{
				$current.merge(this_ID_4);
			}
			{
				newLeafNode(this_ID_4, grammarAccess.getVALID_URLAccess().getIDTerminalRuleCall_2_1());
			}
		)*
	)
;

// Entry rule entryRuleVALID_IMAGE_NAME
entryRuleVALID_IMAGE_NAME returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVALID_IMAGE_NAMERule()); }
	iv_ruleVALID_IMAGE_NAME=ruleVALID_IMAGE_NAME
	{ $current=$iv_ruleVALID_IMAGE_NAME.current.getText(); }
	EOF;

// Rule VALID_IMAGE_NAME
ruleVALID_IMAGE_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getVALID_IMAGE_NAMEAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='/'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getVALID_IMAGE_NAMEAccess().getSolidusKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getVALID_IMAGE_NAMEAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleVALID_IMAGE_TAG
entryRuleVALID_IMAGE_TAG returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVALID_IMAGE_TAGRule()); }
	iv_ruleVALID_IMAGE_TAG=ruleVALID_IMAGE_TAG
	{ $current=$iv_ruleVALID_IMAGE_TAG.current.getText(); }
	EOF;

// Rule VALID_IMAGE_TAG
ruleVALID_IMAGE_TAG returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_ID_0=RULE_ID
			{
				$current.merge(this_ID_0);
			}
			{
				newLeafNode(this_ID_0, grammarAccess.getVALID_IMAGE_TAGAccess().getIDTerminalRuleCall_0_0());
			}
			    |
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getVALID_IMAGE_TAGAccess().getINTTerminalRuleCall_0_1());
			}
			    |
			this_STRING_2=RULE_STRING
			{
				$current.merge(this_STRING_2);
			}
			{
				newLeafNode(this_STRING_2, grammarAccess.getVALID_IMAGE_TAGAccess().getSTRINGTerminalRuleCall_0_2());
			}
		)
		(
			this_ID_3=RULE_ID
			{
				$current.merge(this_ID_3);
			}
			{
				newLeafNode(this_ID_3, grammarAccess.getVALID_IMAGE_TAGAccess().getIDTerminalRuleCall_1_0());
			}
			    |
			this_INT_4=RULE_INT
			{
				$current.merge(this_INT_4);
			}
			{
				newLeafNode(this_INT_4, grammarAccess.getVALID_IMAGE_TAGAccess().getINTTerminalRuleCall_1_1());
			}
			    |
			this_STRING_5=RULE_STRING
			{
				$current.merge(this_STRING_5);
			}
			{
				newLeafNode(this_STRING_5, grammarAccess.getVALID_IMAGE_TAGAccess().getSTRINGTerminalRuleCall_1_2());
			}
			    |
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getVALID_IMAGE_TAGAccess().getHyphenMinusKeyword_1_3());
			}
			    |
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getVALID_IMAGE_TAGAccess().getFullStopKeyword_1_4());
			}
		)*
	)
;

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ONE_SPACE_AND_WHATEVER : ' ' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ENV_VALUE_WITH_EQUAL : '=' ~(('\n'|'\r'|' '))* ' '?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
