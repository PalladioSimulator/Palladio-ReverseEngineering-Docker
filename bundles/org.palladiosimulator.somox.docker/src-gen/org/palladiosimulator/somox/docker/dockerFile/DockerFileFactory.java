/**
 * generated by Xtext 2.21.0
 */
package org.palladiosimulator.somox.docker.dockerFile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.somox.docker.dockerFile.DockerFilePackage
 * @generated
 */
public interface DockerFileFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DockerFileFactory eINSTANCE = org.palladiosimulator.somox.docker.dockerFile.impl.DockerFileFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Dockerfile</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dockerfile</em>'.
   * @generated
   */
  Dockerfile createDockerfile();

  /**
   * Returns a new object of class '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction</em>'.
   * @generated
   */
  Instruction createInstruction();

  /**
   * Returns a new object of class '<em>Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cmd</em>'.
   * @generated
   */
  Cmd createCmd();

  /**
   * Returns a new object of class '<em>Add Destination</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Destination</em>'.
   * @generated
   */
  AddDestination createAddDestination();

  /**
   * Returns a new object of class '<em>Entrypoint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entrypoint</em>'.
   * @generated
   */
  Entrypoint createEntrypoint();

  /**
   * Returns a new object of class '<em>Volume</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Volume</em>'.
   * @generated
   */
  Volume createVolume();

  /**
   * Returns a new object of class '<em>User</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User</em>'.
   * @generated
   */
  User createUser();

  /**
   * Returns a new object of class '<em>Onbuild</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Onbuild</em>'.
   * @generated
   */
  Onbuild createOnbuild();

  /**
   * Returns a new object of class '<em>From</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>From</em>'.
   * @generated
   */
  From createFrom();

  /**
   * Returns a new object of class '<em>Maintainer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Maintainer</em>'.
   * @generated
   */
  Maintainer createMaintainer();

  /**
   * Returns a new object of class '<em>Env</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Env</em>'.
   * @generated
   */
  Env createEnv();

  /**
   * Returns a new object of class '<em>Expose</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expose</em>'.
   * @generated
   */
  Expose createExpose();

  /**
   * Returns a new object of class '<em>JSON ARRAY</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JSON ARRAY</em>'.
   * @generated
   */
  JSON_ARRAY createJSON_ARRAY();

  /**
   * Returns a new object of class '<em>Env With Space</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Env With Space</em>'.
   * @generated
   */
  EnvWithSpace createEnvWithSpace();

  /**
   * Returns a new object of class '<em>Env With Equal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Env With Equal</em>'.
   * @generated
   */
  EnvWithEqual createEnvWithEqual();

  /**
   * Returns a new object of class '<em>Workdir</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Workdir</em>'.
   * @generated
   */
  Workdir createWorkdir();

  /**
   * Returns a new object of class '<em>Run</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Run</em>'.
   * @generated
   */
  Run createRun();

  /**
   * Returns a new object of class '<em>Run With Shell</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Run With Shell</em>'.
   * @generated
   */
  RunWithShell createRunWithShell();

  /**
   * Returns a new object of class '<em>Run With No Shell</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Run With No Shell</em>'.
   * @generated
   */
  RunWithNoShell createRunWithNoShell();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DockerFilePackage getDockerFilePackage();

} //DockerFileFactory