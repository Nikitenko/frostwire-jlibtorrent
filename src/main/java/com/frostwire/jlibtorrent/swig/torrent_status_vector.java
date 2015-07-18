/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class torrent_status_vector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected torrent_status_vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(torrent_status_vector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_torrent_status_vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public torrent_status_vector() {
    this(libtorrent_jni.new_torrent_status_vector(), true);
  }

  public long size() {
    return libtorrent_jni.torrent_status_vector_size(swigCPtr, this);
  }

  public long capacity() {
    return libtorrent_jni.torrent_status_vector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    libtorrent_jni.torrent_status_vector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return libtorrent_jni.torrent_status_vector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.torrent_status_vector_clear(swigCPtr, this);
  }

  public void add(torrent_status x) {
    libtorrent_jni.torrent_status_vector_add(swigCPtr, this, torrent_status.getCPtr(x), x);
  }

  public torrent_status get(int i) {
    return new torrent_status(libtorrent_jni.torrent_status_vector_get(swigCPtr, this, i), false);
  }

  public void set(int i, torrent_status val) {
    libtorrent_jni.torrent_status_vector_set(swigCPtr, this, i, torrent_status.getCPtr(val), val);
  }

}
