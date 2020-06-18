/**
 * generated by Xtext 2.21.0
 */
package org.palladiosimulator.somox.docker.compose.composeFile.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.somox.docker.compose.composeFile.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage
 * @generated
 */
public class ComposeFileAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ComposeFilePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComposeFileAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ComposeFilePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComposeFileSwitch<Adapter> modelSwitch =
    new ComposeFileSwitch<Adapter>()
    {
      @Override
      public Adapter caseDockerCompose(DockerCompose object)
      {
        return createDockerComposeAdapter();
      }
      @Override
      public Adapter caseService(Service object)
      {
        return createServiceAdapter();
      }
      @Override
      public Adapter caseBuild(Build object)
      {
        return createBuildAdapter();
      }
      @Override
      public Adapter caseBuildLongSyntax(BuildLongSyntax object)
      {
        return createBuildLongSyntaxAdapter();
      }
      @Override
      public Adapter caseDeployConfigs(DeployConfigs object)
      {
        return createDeployConfigsAdapter();
      }
      @Override
      public Adapter caseDeployConfigsLongSyntax(DeployConfigsLongSyntax object)
      {
        return createDeployConfigsLongSyntaxAdapter();
      }
      @Override
      public Adapter caseCredentialSpec(CredentialSpec object)
      {
        return createCredentialSpecAdapter();
      }
      @Override
      public Adapter caseDeploy(Deploy object)
      {
        return createDeployAdapter();
      }
      @Override
      public Adapter casePlacement(Placement object)
      {
        return createPlacementAdapter();
      }
      @Override
      public Adapter caseRestartPolicy(RestartPolicy object)
      {
        return createRestartPolicyAdapter();
      }
      @Override
      public Adapter caseConfig(Config object)
      {
        return createConfigAdapter();
      }
      @Override
      public Adapter caseHealthcheck(Healthcheck object)
      {
        return createHealthcheckAdapter();
      }
      @Override
      public Adapter caseLogging(Logging object)
      {
        return createLoggingAdapter();
      }
      @Override
      public Adapter casePorts(Ports object)
      {
        return createPortsAdapter();
      }
      @Override
      public Adapter casePortLongSyntax(PortLongSyntax object)
      {
        return createPortLongSyntaxAdapter();
      }
      @Override
      public Adapter caseServiceSecrets(ServiceSecrets object)
      {
        return createServiceSecretsAdapter();
      }
      @Override
      public Adapter caseServiceSecretsLongSyntax(ServiceSecretsLongSyntax object)
      {
        return createServiceSecretsLongSyntaxAdapter();
      }
      @Override
      public Adapter caseUlimits(Ulimits object)
      {
        return createUlimitsAdapter();
      }
      @Override
      public Adapter caseServiceVolumes(ServiceVolumes object)
      {
        return createServiceVolumesAdapter();
      }
      @Override
      public Adapter caseServiceVolumeLongSyntax(ServiceVolumeLongSyntax object)
      {
        return createServiceVolumeLongSyntaxAdapter();
      }
      @Override
      public Adapter caseVolumes(Volumes object)
      {
        return createVolumesAdapter();
      }
      @Override
      public Adapter caseNetworks(Networks object)
      {
        return createNetworksAdapter();
      }
      @Override
      public Adapter caseIpam(Ipam object)
      {
        return createIpamAdapter();
      }
      @Override
      public Adapter caseConfigs(Configs object)
      {
        return createConfigsAdapter();
      }
      @Override
      public Adapter caseSecrets(Secrets object)
      {
        return createSecretsAdapter();
      }
      @Override
      public Adapter caseValueOrList(ValueOrList object)
      {
        return createValueOrListAdapter();
      }
      @Override
      public Adapter caseListOrMapping(ListOrMapping object)
      {
        return createListOrMappingAdapter();
      }
      @Override
      public Adapter caseList(List object)
      {
        return createListAdapter();
      }
      @Override
      public Adapter caseMapping(Mapping object)
      {
        return createMappingAdapter();
      }
      @Override
      public Adapter caseMappingWithPrefixAndColon(MappingWithPrefixAndColon object)
      {
        return createMappingWithPrefixAndColonAdapter();
      }
      @Override
      public Adapter caseMappingWithoutPrefixAndColon(MappingWithoutPrefixAndColon object)
      {
        return createMappingWithoutPrefixAndColonAdapter();
      }
      @Override
      public Adapter caseMappingWithPrefixAndEqual(MappingWithPrefixAndEqual object)
      {
        return createMappingWithPrefixAndEqualAdapter();
      }
      @Override
      public Adapter caseMappingWithoutPrefixAndEqual(MappingWithoutPrefixAndEqual object)
      {
        return createMappingWithoutPrefixAndEqualAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.DockerCompose <em>Docker Compose</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.DockerCompose
   * @generated
   */
  public Adapter createDockerComposeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.Service
   * @generated
   */
  public Adapter createServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.Build <em>Build</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.Build
   * @generated
   */
  public Adapter createBuildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.BuildLongSyntax <em>Build Long Syntax</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.BuildLongSyntax
   * @generated
   */
  public Adapter createBuildLongSyntaxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.DeployConfigs <em>Deploy Configs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.DeployConfigs
   * @generated
   */
  public Adapter createDeployConfigsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.DeployConfigsLongSyntax <em>Deploy Configs Long Syntax</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.DeployConfigsLongSyntax
   * @generated
   */
  public Adapter createDeployConfigsLongSyntaxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.CredentialSpec <em>Credential Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.CredentialSpec
   * @generated
   */
  public Adapter createCredentialSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.Deploy <em>Deploy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.Deploy
   * @generated
   */
  public Adapter createDeployAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.Placement <em>Placement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.Placement
   * @generated
   */
  public Adapter createPlacementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.RestartPolicy <em>Restart Policy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.RestartPolicy
   * @generated
   */
  public Adapter createRestartPolicyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.Config <em>Config</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.Config
   * @generated
   */
  public Adapter createConfigAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.Healthcheck <em>Healthcheck</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.Healthcheck
   * @generated
   */
  public Adapter createHealthcheckAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.Logging <em>Logging</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.Logging
   * @generated
   */
  public Adapter createLoggingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.Ports <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.Ports
   * @generated
   */
  public Adapter createPortsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.PortLongSyntax <em>Port Long Syntax</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.PortLongSyntax
   * @generated
   */
  public Adapter createPortLongSyntaxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.ServiceSecrets <em>Service Secrets</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.ServiceSecrets
   * @generated
   */
  public Adapter createServiceSecretsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.ServiceSecretsLongSyntax <em>Service Secrets Long Syntax</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.ServiceSecretsLongSyntax
   * @generated
   */
  public Adapter createServiceSecretsLongSyntaxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.Ulimits <em>Ulimits</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.Ulimits
   * @generated
   */
  public Adapter createUlimitsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.ServiceVolumes <em>Service Volumes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.ServiceVolumes
   * @generated
   */
  public Adapter createServiceVolumesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.ServiceVolumeLongSyntax <em>Service Volume Long Syntax</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.ServiceVolumeLongSyntax
   * @generated
   */
  public Adapter createServiceVolumeLongSyntaxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.Volumes <em>Volumes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.Volumes
   * @generated
   */
  public Adapter createVolumesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.Networks <em>Networks</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.Networks
   * @generated
   */
  public Adapter createNetworksAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.Ipam <em>Ipam</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.Ipam
   * @generated
   */
  public Adapter createIpamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.Configs <em>Configs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.Configs
   * @generated
   */
  public Adapter createConfigsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.Secrets <em>Secrets</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.Secrets
   * @generated
   */
  public Adapter createSecretsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.ValueOrList <em>Value Or List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.ValueOrList
   * @generated
   */
  public Adapter createValueOrListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.ListOrMapping <em>List Or Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.ListOrMapping
   * @generated
   */
  public Adapter createListOrMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.List
   * @generated
   */
  public Adapter createListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.Mapping
   * @generated
   */
  public Adapter createMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.MappingWithPrefixAndColon <em>Mapping With Prefix And Colon</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.MappingWithPrefixAndColon
   * @generated
   */
  public Adapter createMappingWithPrefixAndColonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.MappingWithoutPrefixAndColon <em>Mapping Without Prefix And Colon</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.MappingWithoutPrefixAndColon
   * @generated
   */
  public Adapter createMappingWithoutPrefixAndColonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.MappingWithPrefixAndEqual <em>Mapping With Prefix And Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.MappingWithPrefixAndEqual
   * @generated
   */
  public Adapter createMappingWithPrefixAndEqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.compose.composeFile.MappingWithoutPrefixAndEqual <em>Mapping Without Prefix And Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.compose.composeFile.MappingWithoutPrefixAndEqual
   * @generated
   */
  public Adapter createMappingWithoutPrefixAndEqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ComposeFileAdapterFactory