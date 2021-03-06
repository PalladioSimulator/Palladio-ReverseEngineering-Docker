/*
 * generated by Xtext 2.21.0
 */
package org.palladiosimulator.somox.docker.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.palladiosimulator.somox.docker.ui.internal.DockerActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DockerFileExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(DockerActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		DockerActivator activator = DockerActivator.getInstance();
		return activator != null ? activator.getInjector(DockerActivator.ORG_PALLADIOSIMULATOR_SOMOX_DOCKER_DOCKERFILE) : null;
	}

}
