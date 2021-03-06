/**
 * generated by Xtext 2.21.0
 */
package org.palladiosimulator.somox.docker.compose.composeFile.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.somox.docker.compose.composeFile.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage
 * @generated
 */
public class ComposeFileSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ComposeFilePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComposeFileSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ComposeFilePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ComposeFilePackage.DOCKER_COMPOSE:
      {
        DockerCompose dockerCompose = (DockerCompose)theEObject;
        T result = caseDockerCompose(dockerCompose);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.SERVICE:
      {
        Service service = (Service)theEObject;
        T result = caseService(service);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.BUILD:
      {
        Build build = (Build)theEObject;
        T result = caseBuild(build);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.BUILD_LONG_SYNTAX:
      {
        BuildLongSyntax buildLongSyntax = (BuildLongSyntax)theEObject;
        T result = caseBuildLongSyntax(buildLongSyntax);
        if (result == null) result = caseBuild(buildLongSyntax);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.DEPLOY_CONFIGS:
      {
        DeployConfigs deployConfigs = (DeployConfigs)theEObject;
        T result = caseDeployConfigs(deployConfigs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.DEPLOY_CONFIGS_LONG_SYNTAX:
      {
        DeployConfigsLongSyntax deployConfigsLongSyntax = (DeployConfigsLongSyntax)theEObject;
        T result = caseDeployConfigsLongSyntax(deployConfigsLongSyntax);
        if (result == null) result = caseDeployConfigs(deployConfigsLongSyntax);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.CREDENTIAL_SPEC:
      {
        CredentialSpec credentialSpec = (CredentialSpec)theEObject;
        T result = caseCredentialSpec(credentialSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.DEPLOY:
      {
        Deploy deploy = (Deploy)theEObject;
        T result = caseDeploy(deploy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.PLACEMENT:
      {
        Placement placement = (Placement)theEObject;
        T result = casePlacement(placement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.RESTART_POLICY:
      {
        RestartPolicy restartPolicy = (RestartPolicy)theEObject;
        T result = caseRestartPolicy(restartPolicy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.CONFIG:
      {
        Config config = (Config)theEObject;
        T result = caseConfig(config);
        if (result == null) result = caseDeployConfigs(config);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.HEALTHCHECK:
      {
        Healthcheck healthcheck = (Healthcheck)theEObject;
        T result = caseHealthcheck(healthcheck);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.LOGGING:
      {
        Logging logging = (Logging)theEObject;
        T result = caseLogging(logging);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.PORTS:
      {
        Ports ports = (Ports)theEObject;
        T result = casePorts(ports);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.PORT_LONG_SYNTAX:
      {
        PortLongSyntax portLongSyntax = (PortLongSyntax)theEObject;
        T result = casePortLongSyntax(portLongSyntax);
        if (result == null) result = casePorts(portLongSyntax);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.SERVICE_SECRETS:
      {
        ServiceSecrets serviceSecrets = (ServiceSecrets)theEObject;
        T result = caseServiceSecrets(serviceSecrets);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.SERVICE_SECRETS_LONG_SYNTAX:
      {
        ServiceSecretsLongSyntax serviceSecretsLongSyntax = (ServiceSecretsLongSyntax)theEObject;
        T result = caseServiceSecretsLongSyntax(serviceSecretsLongSyntax);
        if (result == null) result = caseServiceSecrets(serviceSecretsLongSyntax);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.ULIMITS:
      {
        Ulimits ulimits = (Ulimits)theEObject;
        T result = caseUlimits(ulimits);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.SERVICE_VOLUMES:
      {
        ServiceVolumes serviceVolumes = (ServiceVolumes)theEObject;
        T result = caseServiceVolumes(serviceVolumes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.SERVICE_VOLUME_LONG_SYNTAX:
      {
        ServiceVolumeLongSyntax serviceVolumeLongSyntax = (ServiceVolumeLongSyntax)theEObject;
        T result = caseServiceVolumeLongSyntax(serviceVolumeLongSyntax);
        if (result == null) result = caseServiceVolumes(serviceVolumeLongSyntax);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.VOLUMES:
      {
        Volumes volumes = (Volumes)theEObject;
        T result = caseVolumes(volumes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.NETWORKS:
      {
        Networks networks = (Networks)theEObject;
        T result = caseNetworks(networks);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.IPAM:
      {
        Ipam ipam = (Ipam)theEObject;
        T result = caseIpam(ipam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.CONFIGS:
      {
        Configs configs = (Configs)theEObject;
        T result = caseConfigs(configs);
        if (result == null) result = caseDeployConfigs(configs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.SECRETS:
      {
        Secrets secrets = (Secrets)theEObject;
        T result = caseSecrets(secrets);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.VALUE_OR_LIST:
      {
        ValueOrList valueOrList = (ValueOrList)theEObject;
        T result = caseValueOrList(valueOrList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.LIST_OR_MAPPING:
      {
        ListOrMapping listOrMapping = (ListOrMapping)theEObject;
        T result = caseListOrMapping(listOrMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.LIST:
      {
        List list = (List)theEObject;
        T result = caseList(list);
        if (result == null) result = caseValueOrList(list);
        if (result == null) result = caseListOrMapping(list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.MAPPING:
      {
        Mapping mapping = (Mapping)theEObject;
        T result = caseMapping(mapping);
        if (result == null) result = caseListOrMapping(mapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.MAPPING_WITH_PREFIX_AND_COLON:
      {
        MappingWithPrefixAndColon mappingWithPrefixAndColon = (MappingWithPrefixAndColon)theEObject;
        T result = caseMappingWithPrefixAndColon(mappingWithPrefixAndColon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.MAPPING_WITHOUT_PREFIX_AND_COLON:
      {
        MappingWithoutPrefixAndColon mappingWithoutPrefixAndColon = (MappingWithoutPrefixAndColon)theEObject;
        T result = caseMappingWithoutPrefixAndColon(mappingWithoutPrefixAndColon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.MAPPING_WITH_PREFIX_AND_EQUAL:
      {
        MappingWithPrefixAndEqual mappingWithPrefixAndEqual = (MappingWithPrefixAndEqual)theEObject;
        T result = caseMappingWithPrefixAndEqual(mappingWithPrefixAndEqual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComposeFilePackage.MAPPING_WITHOUT_PREFIX_AND_EQUAL:
      {
        MappingWithoutPrefixAndEqual mappingWithoutPrefixAndEqual = (MappingWithoutPrefixAndEqual)theEObject;
        T result = caseMappingWithoutPrefixAndEqual(mappingWithoutPrefixAndEqual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Docker Compose</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Docker Compose</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDockerCompose(DockerCompose object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseService(Service object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Build</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Build</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuild(Build object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Build Long Syntax</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Build Long Syntax</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuildLongSyntax(BuildLongSyntax object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deploy Configs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deploy Configs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeployConfigs(DeployConfigs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deploy Configs Long Syntax</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deploy Configs Long Syntax</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeployConfigsLongSyntax(DeployConfigsLongSyntax object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Credential Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Credential Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCredentialSpec(CredentialSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deploy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deploy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeploy(Deploy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Placement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Placement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlacement(Placement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Restart Policy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Restart Policy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRestartPolicy(RestartPolicy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Config</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Config</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfig(Config object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Healthcheck</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Healthcheck</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHealthcheck(Healthcheck object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logging</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logging</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogging(Logging object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ports</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ports</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePorts(Ports object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Port Long Syntax</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Port Long Syntax</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePortLongSyntax(PortLongSyntax object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Secrets</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Secrets</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceSecrets(ServiceSecrets object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Secrets Long Syntax</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Secrets Long Syntax</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceSecretsLongSyntax(ServiceSecretsLongSyntax object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ulimits</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ulimits</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUlimits(Ulimits object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Volumes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Volumes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceVolumes(ServiceVolumes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Volume Long Syntax</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Volume Long Syntax</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceVolumeLongSyntax(ServiceVolumeLongSyntax object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Volumes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Volumes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVolumes(Volumes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Networks</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Networks</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNetworks(Networks object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ipam</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ipam</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIpam(Ipam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Configs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Configs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfigs(Configs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Secrets</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Secrets</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSecrets(Secrets object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Or List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Or List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueOrList(ValueOrList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Or Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Or Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListOrMapping(ListOrMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseList(List object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapping(Mapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping With Prefix And Colon</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping With Prefix And Colon</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMappingWithPrefixAndColon(MappingWithPrefixAndColon object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping Without Prefix And Colon</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping Without Prefix And Colon</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMappingWithoutPrefixAndColon(MappingWithoutPrefixAndColon object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping With Prefix And Equal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping With Prefix And Equal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMappingWithPrefixAndEqual(MappingWithPrefixAndEqual object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping Without Prefix And Equal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping Without Prefix And Equal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMappingWithoutPrefixAndEqual(MappingWithoutPrefixAndEqual object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ComposeFileSwitch
