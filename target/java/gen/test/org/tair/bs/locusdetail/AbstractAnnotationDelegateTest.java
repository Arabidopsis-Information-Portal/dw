/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDelegateTest.vsl

package org.tair.bs.locusdetail;


import static org.junit.Assert.assertTrue;
import org.junit.After;

import com.poesys.db.connection.ConnectionException;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.poesys.bs.delegate.DelegateException;
import com.poesys.db.InvalidParametersException;
import com.poesys.db.dao.DaoManagerFactory;
import com.poesys.db.dao.IDaoManager;


/**
 * <p>
 * Test the AnnotationDelegate class.
 * </p>
 * <p>
 * Note that all the test cases defined here run independently, because JUnit
 * does not guarantee the execution order of the test cases in any way.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractAnnotationDelegateTest {
  /** Define a class logger. */
  protected static Logger logger = Logger.getLogger(AbstractAnnotationDelegateTest.class);
  /** Subsystem name in database.properties file */
  protected String subsystem = "org.tair.db.locusdetail";
  /** Boolean saved off for later comparison in update tests */
  protected Boolean originalBooleanValue = null;
  /** Delegate created at class level for sharing between methods */
  protected AnnotationDelegate delegate = null;

  /**
   * Set up the test by creating the class under test (CUT).
   * 
   * @throws InvalidParametersException when an invalid parameter prevents the
   *       creation of an object
   * @throws DelegateException when a problem occurs during object creation
   */
  @Before
  public void setUp() {
    delegate = LocusdetailDelegateFactory.getAnnotationDelegate();
    // Clear any existing caches of objects using the memory manager set in
    // the creation of the delegate.
    clearCaches();
    assertTrue("No delegate created", delegate != null);
  }
  
  /**
   * Helper method to clear caches for any objects used in the test
   */
  protected void clearCaches() {
    // Primary class AnnotationProxy cache
    IDaoManager manager = DaoManagerFactory.getManager(getSubsystem());
    if (manager != null) {
      manager.clearCache(org.tair.db.locusdetail.AnnotationProxy.class.getName());
    }

    // Clear nested object caches
    
    // Child LocusGeneModelAnnotation cache
    IDaoManager LocusGeneModelAnnotationManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (LocusGeneModelAnnotationManager != null) {
      LocusGeneModelAnnotationManager.clearCache(org.tair.db.locusdetail.LocusGeneModelAnnotation.class.getName());
    }
    
    // Child LocusAnnotation cache
    IDaoManager LocusAnnotationManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (LocusAnnotationManager != null) {
      LocusAnnotationManager.clearCache(org.tair.db.locusdetail.LocusAnnotation.class.getName());
    }
  }

  /**
   * Get a test key for the create method or primary key for a Annotation. 
   * This is abstract; the generated modifiable class must implement this method
   * for read-only classes.
   *
   * @param objectNumber the sequential counter that identifies the object to
   *                     return a key for in the implementation
   * @return ${property.typename} key value
   */
  abstract protected java.lang.String getTestKeyCategory(int objectNumber);

  /**
   * Get a test key for the create method or primary key for a Annotation. 
   * This is abstract; the generated modifiable class must implement this method
   * for read-only classes.
   *
   * @param objectNumber the sequential counter that identifies the object to
   *                     return a key for in the implementation
   * @return ${property.typename} key value
   */
  abstract protected java.lang.String getTestKeyRelationshipType(int objectNumber);

  /**
   * Get a test key for the create method or primary key for a Annotation. 
   * This is abstract; the generated modifiable class must implement this method
   * for read-only classes.
   *
   * @param objectNumber the sequential counter that identifies the object to
   *                     return a key for in the implementation
   * @return ${property.typename} key value
   */
  abstract protected java.lang.String getTestKeyKeyword(int objectNumber);

  /**
   * Get a test key for the create method or primary key for a Annotation. 
   * This is abstract; the generated modifiable class must implement this method
   * for read-only classes.
   *
   * @param objectNumber the sequential counter that identifies the object to
   *                     return a key for in the implementation
   * @return ${property.typename} key value
   */
  abstract protected java.lang.String getTestKeyEvidenceCode(int objectNumber);

  /**
   * Get a test key for the create method or primary key for a Annotation. 
   * This is abstract; the generated modifiable class must implement this method
   * for read-only classes.
   *
   * @param objectNumber the sequential counter that identifies the object to
   *                     return a key for in the implementation
   * @return ${property.typename} key value
   */
  abstract protected java.lang.String getTestKeyEvidenceWith(int objectNumber);

  /**
   * Get a test key for the create method or primary key for a Annotation. 
   * This is abstract; the generated modifiable class must implement this method
   * for read-only classes.
   *
   * @param objectNumber the sequential counter that identifies the object to
   *                     return a key for in the implementation
   * @return ${property.typename} key value
   */
  abstract protected java.lang.String getTestKeyReference(int objectNumber);


  /**
   * Test method for getObject
   * 
   * @throws java.sql.SQLException when there is a problem querying a collection 
   *                               property
   */
  @Test
  public void testGetObject() throws java.sql.SQLException {
    // Get the NaturalKey by using the key factory,
    // supplying the appropriate key attributes using
    // test accessor methods. 
    com.poesys.db.pk.NaturalPrimaryKey key = 
      (com.poesys.db.pk.NaturalPrimaryKey)org.tair.db.locusdetail.LocusdetailFactory.getAnnotationPrimaryKey(getTestKeyCategory(0), getTestKeyEvidenceCode(0), getTestKeyEvidenceWith(0), getTestKeyKeyword(0), getTestKeyReference(0), getTestKeyRelationshipType(0));
    assertTrue("No key generated from concrete implementation", key != null);
    
    // Query the object.
    BsAnnotation object = delegate.getObject(key);
    assertTrue("Couldn't get object", object != null);
    
    // Testing lazy loading of model Collection property
    java.util.Collection<org.tair.bs.locusdetail.BsLocusGeneModel> model = 
      object.getModel();
    assertTrue("model not lazily loaded", model != null);
    
    // Testing lazy loading of locus Collection property
    java.util.Collection<org.tair.bs.locusdetail.BsLocusDetail> locus = 
      object.getLocus();
    assertTrue("locus not lazily loaded", locus != null);
  }

  /**
   * <p>
   * Test method for getAllObjects
   * </p>
   *
   * @throws InvalidParametersException when an invalid parameter prevents the
   *       creation of an object
   * @throws DelegateException when a problem occurs during object creation
   */
  @Test
  public void testGetAllObjects() 
       throws InvalidParametersException, DelegateException {
    // Query all the objects.
    List<BsAnnotation> objects = delegate.getAllObjects(100);
    assertTrue("Couldn't create list", objects != null);
    // The list should not be empty.
    assertTrue("List of all objects empty", objects.size() != 0);
  }

  /**
   * A helper method that queried a previously stored object identified by its
   * primary key. The method returns the queried object for further testing
   * after performing structural tests on the object.
   * 
   * @param key the primary key of the object to retrieve
   * @return the object
   * @throws DelegateException when there is a problem querying the object
   */
  protected BsAnnotation queryStoredObject(com.poesys.db.pk.NaturalPrimaryKey key)
      throws DelegateException {
    // Clear the caches, then query the saved object and test it.
    clearCaches();

    BsAnnotation queriedObject = delegate.getObject(key);
    assertTrue("Object not found", queriedObject != null);
    return queriedObject;
  }

  /**
   * Return the database access subsystem name to use to look up access
   * properties in the database.properties file. The concrete implementation
   * should override this method to provide a different subsystem name if
   * needed.
   * 
   * @return the database access subsystem name
   */
  protected String getSubsystem() {
    return subsystem;
  }
  
  /**
   * Flush all resources associated with connections.
   * 
   * @throws ConnectionException when there is a problem flushing resources
   */
  @After
  public void tearDown() throws ConnectionException {
    delegate.flush();
  }
}