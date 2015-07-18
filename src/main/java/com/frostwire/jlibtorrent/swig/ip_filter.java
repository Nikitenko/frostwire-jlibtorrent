/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class ip_filter {
  private long swigCPtr;
  private boolean swigCMemOwn;

  protected ip_filter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ip_filter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_ip_filter(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void add_rule(address first, address last, long flags) {
    libtorrent_jni.ip_filter_add_rule(swigCPtr, this, address.getCPtr(first), first, address.getCPtr(last), last, flags);
  }

  public int access(address addr) {
    return libtorrent_jni.ip_filter_access(swigCPtr, this, address.getCPtr(addr), addr);
  }

  public ip_filter() {
    this(libtorrent_jni.new_ip_filter(), true);
  }

  public enum access_flags {
    blocked(libtorrent_jni.ip_filter_blocked_get());

    public final int swigValue() {
      return swigValue;
    }

    public static access_flags swigToEnum(int swigValue) {
      access_flags[] swigValues = access_flags.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (access_flags swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + access_flags.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private access_flags() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private access_flags(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private access_flags(access_flags swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
