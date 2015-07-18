/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class peer_class_pool {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected peer_class_pool(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(peer_class_pool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_peer_class_pool(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public short new_peer_class(String label) {
    return libtorrent_jni.peer_class_pool_new_peer_class(swigCPtr, this, label);
  }

  public void decref(short c) {
    libtorrent_jni.peer_class_pool_decref(swigCPtr, this, c);
  }

  public void incref(short c) {
    libtorrent_jni.peer_class_pool_incref(swigCPtr, this, c);
  }

  public peer_class at(short c) {
    long cPtr = libtorrent_jni.peer_class_pool_at__SWIG_0(swigCPtr, this, c);
    return (cPtr == 0) ? null : new peer_class(cPtr, false);
  }

  public peer_class_pool() {
    this(libtorrent_jni.new_peer_class_pool(), true);
  }

}
