/**
 * generated by Xtext 2.21.0
 */
package org.palladiosimulator.somox.docker.dockerFile.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.somox.docker.dockerFile.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.somox.docker.dockerFile.DockerFilePackage
 * @generated
 */
public class DockerFileAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DockerFilePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DockerFileAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DockerFilePackage.eINSTANCE;
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
  protected DockerFileSwitch<Adapter> modelSwitch =
    new DockerFileSwitch<Adapter>()
    {
      @Override
      public Adapter caseDockerfile(Dockerfile object)
      {
        return createDockerfileAdapter();
      }
      @Override
      public Adapter caseInstruction(Instruction object)
      {
        return createInstructionAdapter();
      }
      @Override
      public Adapter caseCmd(Cmd object)
      {
        return createCmdAdapter();
      }
      @Override
      public Adapter caseAddDestination(AddDestination object)
      {
        return createAddDestinationAdapter();
      }
      @Override
      public Adapter caseEntrypoint(Entrypoint object)
      {
        return createEntrypointAdapter();
      }
      @Override
      public Adapter caseVolume(Volume object)
      {
        return createVolumeAdapter();
      }
      @Override
      public Adapter caseUser(User object)
      {
        return createUserAdapter();
      }
      @Override
      public Adapter caseOnbuild(Onbuild object)
      {
        return createOnbuildAdapter();
      }
      @Override
      public Adapter caseFrom(From object)
      {
        return createFromAdapter();
      }
      @Override
      public Adapter caseMaintainer(Maintainer object)
      {
        return createMaintainerAdapter();
      }
      @Override
      public Adapter caseEnv(Env object)
      {
        return createEnvAdapter();
      }
      @Override
      public Adapter caseExpose(Expose object)
      {
        return createExposeAdapter();
      }
      @Override
      public Adapter caseJSON_ARRAY(JSON_ARRAY object)
      {
        return createJSON_ARRAYAdapter();
      }
      @Override
      public Adapter caseEnvWithSpace(EnvWithSpace object)
      {
        return createEnvWithSpaceAdapter();
      }
      @Override
      public Adapter caseEnvWithEqual(EnvWithEqual object)
      {
        return createEnvWithEqualAdapter();
      }
      @Override
      public Adapter caseWorkdir(Workdir object)
      {
        return createWorkdirAdapter();
      }
      @Override
      public Adapter caseRun(Run object)
      {
        return createRunAdapter();
      }
      @Override
      public Adapter caseRunWithShell(RunWithShell object)
      {
        return createRunWithShellAdapter();
      }
      @Override
      public Adapter caseRunWithNoShell(RunWithNoShell object)
      {
        return createRunWithNoShellAdapter();
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
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.dockerFile.Dockerfile <em>Dockerfile</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.dockerFile.Dockerfile
   * @generated
   */
  public Adapter createDockerfileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.dockerFile.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.dockerFile.Instruction
   * @generated
   */
  public Adapter createInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.dockerFile.Cmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.dockerFile.Cmd
   * @generated
   */
  public Adapter createCmdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.dockerFile.AddDestination <em>Add Destination</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.dockerFile.AddDestination
   * @generated
   */
  public Adapter createAddDestinationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.dockerFile.Entrypoint <em>Entrypoint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.dockerFile.Entrypoint
   * @generated
   */
  public Adapter createEntrypointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.dockerFile.Volume <em>Volume</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.dockerFile.Volume
   * @generated
   */
  public Adapter createVolumeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.dockerFile.User <em>User</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.dockerFile.User
   * @generated
   */
  public Adapter createUserAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.dockerFile.Onbuild <em>Onbuild</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.dockerFile.Onbuild
   * @generated
   */
  public Adapter createOnbuildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.dockerFile.From <em>From</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.dockerFile.From
   * @generated
   */
  public Adapter createFromAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.dockerFile.Maintainer <em>Maintainer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.dockerFile.Maintainer
   * @generated
   */
  public Adapter createMaintainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.dockerFile.Env <em>Env</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.dockerFile.Env
   * @generated
   */
  public Adapter createEnvAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.dockerFile.Expose <em>Expose</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.dockerFile.Expose
   * @generated
   */
  public Adapter createExposeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.dockerFile.JSON_ARRAY <em>JSON ARRAY</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.dockerFile.JSON_ARRAY
   * @generated
   */
  public Adapter createJSON_ARRAYAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.dockerFile.EnvWithSpace <em>Env With Space</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.dockerFile.EnvWithSpace
   * @generated
   */
  public Adapter createEnvWithSpaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.dockerFile.EnvWithEqual <em>Env With Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.dockerFile.EnvWithEqual
   * @generated
   */
  public Adapter createEnvWithEqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.dockerFile.Workdir <em>Workdir</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.dockerFile.Workdir
   * @generated
   */
  public Adapter createWorkdirAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.dockerFile.Run <em>Run</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.dockerFile.Run
   * @generated
   */
  public Adapter createRunAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.dockerFile.RunWithShell <em>Run With Shell</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.dockerFile.RunWithShell
   * @generated
   */
  public Adapter createRunWithShellAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.palladiosimulator.somox.docker.dockerFile.RunWithNoShell <em>Run With No Shell</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.palladiosimulator.somox.docker.dockerFile.RunWithNoShell
   * @generated
   */
  public Adapter createRunWithNoShellAdapter()
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

} //DockerFileAdapterFactory
