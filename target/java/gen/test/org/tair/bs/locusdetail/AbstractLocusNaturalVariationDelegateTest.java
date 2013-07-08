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
 * Test the LocusNaturalVariationDelegate class.
 * </p>
 * <p>
 * Note that all the test cases defined here run independently, because JUnit
 * does not guarantee the execution order of the test cases in any way.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractLocusNaturalVariationDelegateTest {
  /** Define a class logger. */
  protected static Logger logger = Logger.getLogger(AbstractLocusNaturalVariationDelegateTest.class);
  /** Subsystem name in database.properties file */
  protected String subsystem = "org.tair.db.locusdetail";
  /** Boolean saved off for later comparison in update tests */
  protected Boolean originalBooleanValue = null;
  /** Delegate created at class level for sharing between methods */
  protected LocusNaturalVariationDelegate delegate = null;

  /**
   * Set up the test by creating the class under test (CUT).
   * 
   * @throws InvalidParametersException when an invalid parameter prevents the
   *       creation of an object
   * @throws DelegateException when a problem occurs during object creation
   */
  @Before
  public void setUp() {
    delegate = LocusdetailDelegateFactory.getLocusNaturalVariationDelegate();
    // Clear any existing caches of objects using the memory manager set in
    // the creation of the delegate.
    clearCaches();
    assertTrue("No delegate created", delegate != null);
  }
  
  /**
   * Helper method to clear caches for any objects used in the test
   */
  protected void clearCaches() {
    // Primary class LocusNaturalVariationProxy cache
    IDaoManager manager = DaoManagerFactory.getManager(getSubsystem());
    if (manager != null) {
      manager.clearCache(org.tair.db.locusdetail.LocusNaturalVariationProxy.class.getName());
    }

    // Clear nested object caches
    
    // Child LocusNaturalVariationEcotype cache
    IDaoManager LocusNaturalVariationEcotypeManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (LocusNaturalVariationEcotypeManager != null) {
      LocusNaturalVariationEcotypeManager.clearCache(org.tair.db.locusdetail.LocusNaturalVariationEcotype.class.getName());
    }
  }

  /**
   * Get a test key for the create method or primary key for a LocusNaturalVariation. 
   * This is abstract; the generated modifiable class must implement this method
   * for read-only classes.
   *
   * @param objectNumber the sequential counter that identifies the object to
   *                     return a key for in the implementation
   * @return ${property.typename} key value
   */
  abstract protected java.lang.Long getTestKeyLocusTairObjectId(int objectNumber);

  /**
   * Get a test key for the create method or primary key for a LocusNaturalVariation. 
   * This is abstract; the generated modifiable class must implement this method
   * for read-only classes.
   *
   * @param objectNumber the sequential counter that identifies the object to
   *                     return a key for in the implementation
   * @return ${property.typename} key value
   */
  abstract protected java.lang.String getTestKeyPolymorphismName(int objectNumber);

  /**
   * <p>
   * Create some number of new SpeciesVariant objects and return them in a list.  
   * This is a helper method that the concrete subclass needs to implement. It
   * returns the "child" corresponding to the superclass.
   * </p>
   * <ul>
   * <li>Create the list to return as a CopyOnWriteArrayList&lt;BsSpeciesVariant&gt;</li>
   * <li>Generate any required objects linked to this object other than the 
   * parent by calling the appropriate delegate's create method</li>
   * <li>Create the sub-key as an integer for ordered subkeys or a random string
   * for unordered subkeys</li>
   * <li>Generate random values for any primitive data members</li>
   * <li>Create the BsSpeciesVariant by calling delegate.createBs${foreignDto.name}</li>
   * <li>Add the new child to the list</li>
   * </ul>
   * <p>
   * Key type: CompositeKey
   * </p>
   * @param parent the parent LocusNaturalVariation
   * @param count the number of objects to create
   * @return the stored object
   * @throws DelegateException when there is a problem creating an object
   * @throws InvalidParametersException when there is some problem with the 
   *                                    input parameters for creating an object
   */
  abstract protected List<org.tair.bs.basic.BsSpeciesVariant> createReferenceEcotypeBasicSpeciesVariant(int count) 
      throws DelegateException, InvalidParametersException; // create 4
      

  /**
   * Test method for getObject
   * 
   * @throws java.sql.SQLException when there is a problem querying a collection 
   *                               property
   */
  @Test
  public void testGetObject() throws java.sql.SQLException {
    // Get the CompositeKey by using the key factory,
    // supplying the appropriate key attributes using
    // test accessor methods. 
    com.poesys.db.pk.CompositePrimaryKey key = 
      (com.poesys.db.pk.CompositePrimaryKey)org.tair.db.locusdetail.LocusdetailFactory.getLocusNaturalVariationPrimaryKey(getTestKeyLocusTairObjectId(0), getTestKeyPolymorphismName(0));
    assertTrue("No key generated from concrete implementation", key != null);
    
    // Query the object.
    BsLocusNaturalVariation object = delegate.getObject(key);
    assertTrue("Couldn't get object", object != null);
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
    List<BsLocusNaturalVariation> objects = delegate.getAllObjects(100);
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
  protected BsLocusNaturalVariation queryStoredObject(com.poesys.db.pk.CompositePrimaryKey key)
      throws DelegateException {
    // Clear the caches, then query the saved object and test it.
    clearCaches();

    BsLocusNaturalVariation queriedObject = delegate.getObject(key);
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
