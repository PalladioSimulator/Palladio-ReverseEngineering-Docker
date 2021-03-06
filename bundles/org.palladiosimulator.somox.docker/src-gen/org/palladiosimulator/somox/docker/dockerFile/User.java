/**
 * generated by Xtext 2.21.0
 */
package org.palladiosimulator.somox.docker.dockerFile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.somox.docker.dockerFile.User#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.somox.docker.dockerFile.DockerFilePackage#getUser()
 * @model
 * @generated
 */
public interface User extends Instruction
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.palladiosimulator.somox.docker.dockerFile.DockerFilePackage#getUser_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.palladiosimulator.somox.docker.dockerFile.User#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // User
