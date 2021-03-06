/*
 * generated by Xtext 2.21.0
 */
package org.palladiosimulator.somox.docker.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.palladiosimulator.somox.docker.parser.antlr.internal.InternalDockerFileParser;
import org.palladiosimulator.somox.docker.services.DockerFileGrammarAccess;

public class DockerFileParser extends AbstractAntlrParser {

	@Inject
	private DockerFileGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDockerFileParser createParser(XtextTokenStream stream) {
		return new InternalDockerFileParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Dockerfile";
	}

	public DockerFileGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DockerFileGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
