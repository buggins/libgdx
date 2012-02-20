/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.utils.SharedLibraryLoader;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btSolverBodyObsolete {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btSolverBodyObsolete(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btSolverBodyObsolete obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btSolverBodyObsolete(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static {
    new SharedLibraryLoader().load("gdx-bullet");
  }

  public void setM_deltaLinearVelocity(btVector3 value) {
    gdxBulletJNI.btSolverBodyObsolete_m_deltaLinearVelocity_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_deltaLinearVelocity() {
    long cPtr = gdxBulletJNI.btSolverBodyObsolete_m_deltaLinearVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_deltaAngularVelocity(btVector3 value) {
    gdxBulletJNI.btSolverBodyObsolete_m_deltaAngularVelocity_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_deltaAngularVelocity() {
    long cPtr = gdxBulletJNI.btSolverBodyObsolete_m_deltaAngularVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_angularFactor(btVector3 value) {
    gdxBulletJNI.btSolverBodyObsolete_m_angularFactor_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_angularFactor() {
    long cPtr = gdxBulletJNI.btSolverBodyObsolete_m_angularFactor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_invMass(btVector3 value) {
    gdxBulletJNI.btSolverBodyObsolete_m_invMass_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_invMass() {
    long cPtr = gdxBulletJNI.btSolverBodyObsolete_m_invMass_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_originalBody(btRigidBody value) {
    gdxBulletJNI.btSolverBodyObsolete_m_originalBody_set(swigCPtr, this, btRigidBody.getCPtr(value), value);
  }

  public btRigidBody getM_originalBody() {
    long cPtr = gdxBulletJNI.btSolverBodyObsolete_m_originalBody_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btRigidBody(cPtr, false);
  }

  public void setM_pushVelocity(btVector3 value) {
    gdxBulletJNI.btSolverBodyObsolete_m_pushVelocity_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_pushVelocity() {
    long cPtr = gdxBulletJNI.btSolverBodyObsolete_m_pushVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_turnVelocity(btVector3 value) {
    gdxBulletJNI.btSolverBodyObsolete_m_turnVelocity_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_turnVelocity() {
    long cPtr = gdxBulletJNI.btSolverBodyObsolete_m_turnVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void getVelocityInLocalPointObsolete(Vector3 rel_pos, Vector3 velocity) {
    gdxBulletJNI.btSolverBodyObsolete_getVelocityInLocalPointObsolete(swigCPtr, this, rel_pos, velocity);
  }

  public void getAngularVelocity(Vector3 angVel) {
    gdxBulletJNI.btSolverBodyObsolete_getAngularVelocity(swigCPtr, this, angVel);
  }

  public void applyImpulse(Vector3 linearComponent, Vector3 angularComponent, float impulseMagnitude) {
    gdxBulletJNI.btSolverBodyObsolete_applyImpulse(swigCPtr, this, linearComponent, angularComponent, impulseMagnitude);
  }

  public void internalApplyPushImpulse(Vector3 linearComponent, Vector3 angularComponent, float impulseMagnitude) {
    gdxBulletJNI.btSolverBodyObsolete_internalApplyPushImpulse(swigCPtr, this, linearComponent, angularComponent, impulseMagnitude);
  }

  public void writebackVelocity() {
    gdxBulletJNI.btSolverBodyObsolete_writebackVelocity__SWIG_0(swigCPtr, this);
  }

  public void writebackVelocity(float timeStep) {
    gdxBulletJNI.btSolverBodyObsolete_writebackVelocity__SWIG_1(swigCPtr, this, timeStep);
  }

  public btSolverBodyObsolete() {
    this(gdxBulletJNI.new_btSolverBodyObsolete(), true);
  }

}