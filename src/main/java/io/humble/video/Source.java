/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.humble.video;
import io.humble.ferry.*;
public class Source extends Container {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    IBuffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected Source(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.SWIGSourceUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected Source(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.SWIGSourceUpcast(cPtr),
     cMemoryOwn, ref);
    swigCPtr = cPtr;
  }
    
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  protected static long getCPtr(Source obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  protected long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new Source object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public Source copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new Source(swigCPtr, swigCMemOwn, getJavaRefCount());
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof Source)
      equal = (((Source)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  

  public static Source make() {
    long cPtr = VideoJNI.Source_make();
    return (cPtr == 0) ? null : new Source(cPtr, false);
  }

/**
 * {@inheritDoc}  
 */
  public Container.State getState() {
    return Container.State.swigToEnum(VideoJNI.Source_getState(swigCPtr, this));
  }

/**
 * {@inheritDoc}  
 */
  protected ContainerFormat getFormat() {
    long cPtr = VideoJNI.Source_getFormat(swigCPtr, this);
    return (cPtr == 0) ? null : new ContainerFormat(cPtr, false);
  }

/**
 * {@inheritDoc}  
 */
  public int close() {
    return VideoJNI.Source_close(swigCPtr, this);
  }

/**
 * {@inheritDoc}  
 */
  public KeyValueBag getMetaData() {
    long cPtr = VideoJNI.Source_getMetaData(swigCPtr, this);
    return (cPtr == 0) ? null : new KeyValueBag(cPtr, false);
  }

/**
 * {@inheritDoc}  
 */
  public long getFileSize() {
    return VideoJNI.Source_getFileSize(swigCPtr, this);
  }

}
