/*
 * generated by Xtext 2.21.0
 */
package org.palladiosimulator.somox.docker.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DockerFileAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/palladiosimulator/somox/docker/parser/antlr/internal/InternalDockerFile.tokens");
	}
}
