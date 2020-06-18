/**
 * generated by Xtext 2.21.0
 */
package org.palladiosimulator.somox.docker.compose.composeFile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Networks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.Networks#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.Networks#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.Networks#getDriver_opts <em>Driver opts</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.Networks#getAttachable <em>Attachable</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.Networks#getEnable_ipv6 <em>Enable ipv6</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.Networks#getIpam <em>Ipam</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.Networks#getInternal <em>Internal</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.Networks#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.Networks#getExternal <em>External</em>}</li>
 *   <li>{@link org.palladiosimulator.somox.docker.compose.composeFile.Networks#getCustomName <em>Custom Name</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage#getNetworks()
 * @model
 * @generated
 */
public interface Networks extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage#getNetworks_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.palladiosimulator.somox.docker.compose.composeFile.Networks#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Driver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Driver</em>' attribute.
   * @see #setDriver(String)
   * @see org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage#getNetworks_Driver()
   * @model
   * @generated
   */
  String getDriver();

  /**
   * Sets the value of the '{@link org.palladiosimulator.somox.docker.compose.composeFile.Networks#getDriver <em>Driver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Driver</em>' attribute.
   * @see #getDriver()
   * @generated
   */
  void setDriver(String value);

  /**
   * Returns the value of the '<em><b>Driver opts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Driver opts</em>' containment reference.
   * @see #setDriver_opts(Mapping)
   * @see org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage#getNetworks_Driver_opts()
   * @model containment="true"
   * @generated
   */
  Mapping getDriver_opts();

  /**
   * Sets the value of the '{@link org.palladiosimulator.somox.docker.compose.composeFile.Networks#getDriver_opts <em>Driver opts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Driver opts</em>' containment reference.
   * @see #getDriver_opts()
   * @generated
   */
  void setDriver_opts(Mapping value);

  /**
   * Returns the value of the '<em><b>Attachable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attachable</em>' attribute.
   * @see #setAttachable(String)
   * @see org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage#getNetworks_Attachable()
   * @model
   * @generated
   */
  String getAttachable();

  /**
   * Sets the value of the '{@link org.palladiosimulator.somox.docker.compose.composeFile.Networks#getAttachable <em>Attachable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attachable</em>' attribute.
   * @see #getAttachable()
   * @generated
   */
  void setAttachable(String value);

  /**
   * Returns the value of the '<em><b>Enable ipv6</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enable ipv6</em>' attribute.
   * @see #setEnable_ipv6(String)
   * @see org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage#getNetworks_Enable_ipv6()
   * @model
   * @generated
   */
  String getEnable_ipv6();

  /**
   * Sets the value of the '{@link org.palladiosimulator.somox.docker.compose.composeFile.Networks#getEnable_ipv6 <em>Enable ipv6</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enable ipv6</em>' attribute.
   * @see #getEnable_ipv6()
   * @generated
   */
  void setEnable_ipv6(String value);

  /**
   * Returns the value of the '<em><b>Ipam</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ipam</em>' containment reference.
   * @see #setIpam(Ipam)
   * @see org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage#getNetworks_Ipam()
   * @model containment="true"
   * @generated
   */
  Ipam getIpam();

  /**
   * Sets the value of the '{@link org.palladiosimulator.somox.docker.compose.composeFile.Networks#getIpam <em>Ipam</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ipam</em>' containment reference.
   * @see #getIpam()
   * @generated
   */
  void setIpam(Ipam value);

  /**
   * Returns the value of the '<em><b>Internal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Internal</em>' attribute.
   * @see #setInternal(String)
   * @see org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage#getNetworks_Internal()
   * @model
   * @generated
   */
  String getInternal();

  /**
   * Sets the value of the '{@link org.palladiosimulator.somox.docker.compose.composeFile.Networks#getInternal <em>Internal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Internal</em>' attribute.
   * @see #getInternal()
   * @generated
   */
  void setInternal(String value);

  /**
   * Returns the value of the '<em><b>Labels</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Labels</em>' containment reference.
   * @see #setLabels(ListOrMapping)
   * @see org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage#getNetworks_Labels()
   * @model containment="true"
   * @generated
   */
  ListOrMapping getLabels();

  /**
   * Sets the value of the '{@link org.palladiosimulator.somox.docker.compose.composeFile.Networks#getLabels <em>Labels</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Labels</em>' containment reference.
   * @see #getLabels()
   * @generated
   */
  void setLabels(ListOrMapping value);

  /**
   * Returns the value of the '<em><b>External</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>External</em>' attribute.
   * @see #setExternal(String)
   * @see org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage#getNetworks_External()
   * @model
   * @generated
   */
  String getExternal();

  /**
   * Sets the value of the '{@link org.palladiosimulator.somox.docker.compose.composeFile.Networks#getExternal <em>External</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>External</em>' attribute.
   * @see #getExternal()
   * @generated
   */
  void setExternal(String value);

  /**
   * Returns the value of the '<em><b>Custom Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom Name</em>' attribute.
   * @see #setCustomName(String)
   * @see org.palladiosimulator.somox.docker.compose.composeFile.ComposeFilePackage#getNetworks_CustomName()
   * @model
   * @generated
   */
  String getCustomName();

  /**
   * Sets the value of the '{@link org.palladiosimulator.somox.docker.compose.composeFile.Networks#getCustomName <em>Custom Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Custom Name</em>' attribute.
   * @see #getCustomName()
   * @generated
   */
  void setCustomName(String value);

} // Networks
