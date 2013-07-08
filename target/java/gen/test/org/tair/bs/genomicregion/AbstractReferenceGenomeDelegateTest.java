/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDelegateTest.vsl

package org.tair.bs.genomicregion;


import static org.junit.Assert.assertTrue;
import org.junit.After;

import com.poesys.db.connection.ConnectionException;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.poesys.bs.delegate.DelegateException;
import com.poesys.db.InvalidParametersException;
import com.poesys.db.dao.DaoManagerFactory;
import com.poesys.db.dao.IDaoManager;


/**
 * <p>
 * Test the ReferenceGenomeDelegate class.
 * </p>
 * <p>
 * Note that all the test cases defined here run independently, because JUnit
 * does not guarantee the execution order of the test cases in any way.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractReferenceGenomeDelegateTest {
  /** Define a class logger. */
  protected static Logger logger = Logger.getLogger(AbstractReferenceGenomeDelegateTest.class);
  /** Subsystem name in database.properties file */
  protected String subsystem = "org.tair.db.genomicregion";
  /** Boolean saved off for later comparison in update tests */
  protected Boolean originalBooleanValue = null;
  /** Delegate created at class level for sharing between methods */
  protected ReferenceGenomeDelegate delegate = null;

  /**
   * Set up the test by creating the class under test (CUT).
   * 
   * @throws InvalidParametersException when an invalid parameter prevents the
   *       creation of an object
   * @throws DelegateException when a problem occurs during object creation
   */
  @Before
  public void setUp() {
    delegate = GenomicregionDelegateFactory.getReferenceGenomeDelegate();
    // Clear any existing caches of objects using the memory manager set in
    // the creation of the delegate.
    clearCaches();
    assertTrue("No delegate created", delegate != null);
  }
  
  /**
   * Helper method to clear caches for any objects used in the test
   */
  protected void clearCaches() {
    // Primary class ReferenceGenome cache
    IDaoManager manager = DaoManagerFactory.getManager(getSubsystem());
    if (manager != null) {
      manager.clearCache(org.tair.db.genomicregion.ReferenceGenome.class.getName());
    }
  }

  /**
   * Create some number of new ReferenceGenome objects and return them in a list.  
   * This is a helper method for writable children DTOs.
   * 
   * @param count the number of objects to create
   * @return the stored object
   * @throws InvalidParametersException when an invalid parameter prevents the
   *       creation of an object
   * @throws DelegateException when a problem occurs during object creation
   */
  protected List<org.tair.bs.genomicregion.BsReferenceGenome> createGenomicregionReferenceGenome(int count) 
      throws DelegateException, InvalidParametersException {
    List<org.tair.bs.genomicregion.BsReferenceGenome> objects = 
      new CopyOnWriteArrayList<org.tair.bs.genomicregion.BsReferenceGenome>();
    @SuppressWarnings("unused")
    java.util.Random r = new java.util.Random();

    // Create the required ReferenceVariantBasicSpeciesVariant objects.
    List<org.tair.bs.basic.BsSpeciesVariant> referenceVariantBasicSpeciesVariantObjects = createReferenceVariantBasicSpeciesVariant(count);    

    // Query the required TaxonBasicTaxon objects.
    List<org.tair.bs.basic.BsTaxon> taxonBasicTaxonObjects = createTaxonBasicTaxon(count);    
    
    for (int i = 0; i < count; i++) {
      java.lang.String accession = referenceVariantBasicSpeciesVariantObjects.get(i).getAccession();
      java.lang.String name = referenceVariantBasicSpeciesVariantObjects.get(i).getName();
      java.lang.Long referenceVariantTaxonId = referenceVariantBasicSpeciesVariantObjects.get(i).getTaxonId();
      java.lang.Long taxonTaxonId = taxonBasicTaxonObjects.get(i).getTaxonId();
      java.lang.String genome = 
        com.poesys.cartridges.db.utilities.StringUtilities.generateString();
      // Use random integer here because long might be out of range.
      java.sql.Timestamp dateEntered = new java.sql.Timestamp(r.nextInt(999999999));

      // Create the object.
      BsReferenceGenome object = null;
      try {
        object = delegate.createReferenceGenome(genome, dateEntered, taxonTaxonId, accession, name, referenceVariantTaxonId);
        // Add any required nested SpeciesVariant object.
        object.setReferenceVariant(referenceVariantBasicSpeciesVariantObjects.get(i));
        // Add any required nested Taxon object.
        object.setTaxon(taxonBasicTaxonObjects.get(i));
      } catch (InvalidParametersException e) {
        Object[] args = e.getParameters().toArray();
        String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
        throw new RuntimeException(message, e);
      } catch (DelegateException e) {
        throw new RuntimeException(e.getMessage(), e);
      }
        
      objects.add(object);
    }
    
    return objects;
  }

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
   * @param parent the parent ReferenceGenome
   * @param count the number of objects to create
   * @return the stored object
   * @throws DelegateException when there is a problem creating an object
   * @throws InvalidParametersException when there is some problem with the 
   *                                    input parameters for creating an object
   */
  abstract protected List<org.tair.bs.basic.BsSpeciesVariant> createReferenceVariantBasicSpeciesVariant(int count) 
      throws DelegateException, InvalidParametersException; // create 4
      
  /**
   * <p>
   * Create some number of new Taxon objects and return them in a list.  
   * This is a helper method that the concrete subclass needs to implement. It
   * returns the "child" corresponding to the superclass.
   * </p>
   * <ul>
   * <li>Create the list to return as a CopyOnWriteArrayList&lt;BsTaxon&gt;</li>
   * <li>Generate random values for any primitive data members</li>
   * <li>Create the BsTaxon by calling delegate.createBs${foreignDto.name}</li>
   * <li>Add the new child to the list</li>
   * </ul>
   * <p>
   * Key type: NaturalKey
   * </p>
   * @param count the number of objects to create
   * @return the stored object
   * @throws DelegateException when there is a problem creating an object
   * @throws InvalidParametersException when there is some problem with the 
   *                                    input parameters for creating an object
   */
  abstract protected List<org.tair.bs.basic.BsTaxon> createTaxonBasicTaxon(int count) 
      throws DelegateException, InvalidParametersException; // create 4
      
  /**
   * Test method for delegate insert
   */
  @Test
  public void testInsert() {
    // Create a new ReferenceGenome object to perform the test.
    List<BsReferenceGenome> objects = createGenomicregionReferenceGenome(1);
    assertTrue("No object created", objects.get(0) != null);
    delegate.insert(objects);
    com.poesys.db.pk.NaturalPrimaryKey key = 
      (com.poesys.db.pk.NaturalPrimaryKey)objects.get(0).getPrimaryKey();
    assertTrue("No key for inserted object", key != null);

    BsReferenceGenome queriedObject = queryStoredObject(key);
    assertTrue("No queried inserted object", queriedObject != null);
    assertTrue("Wrong object", objects.get(0).equals(queriedObject));
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsReferenceGenome object : objects) {
      object.delete();
    }

    delegate.deleteBatch(objects);
  }

  /**
   * Test method for getObject
   * 
   * @throws java.sql.SQLException when there is a problem querying a collection 
   *                               property
   */
  @Test
  public void testGetObject() throws java.sql.SQLException {
    // Create a new ReferenceGenome object to perform the test.
    List<BsReferenceGenome> objects = createGenomicregionReferenceGenome(1);
    assertTrue("No object created", objects.get(0) != null);
    delegate.insert(objects);
    com.poesys.db.pk.NaturalPrimaryKey key = 
      (com.poesys.db.pk.NaturalPrimaryKey)objects.get(0).getPrimaryKey();
    assertTrue("No key generated from concrete implementation", key != null);
    BsReferenceGenome insertedObject = objects.get(0);
    assertTrue("No comparison object for object query", insertedObject != null);
    
    // Query the object.
    BsReferenceGenome object = delegate.getObject(key);
    assertTrue("Couldn't get object", object != null);
    assertTrue("Wrong object", insertedObject.equals(object));
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsReferenceGenome o : objects) {
      o.delete();
    }

    delegate.deleteBatch(objects);
  }

  /**
   * <p>
   * Test method for getAllObjects
   * </p>
   * <p>
   * For this read/write class, the method ensures that there are objects to
   * query by inserting an object, querying, then deleting the object.
   * </p>
   *
   * @throws InvalidParametersException when an invalid parameter prevents the
   *       creation of an object
   * @throws DelegateException when a problem occurs during object creation
   */
  @Test
  public void testGetAllObjects() 
       throws InvalidParametersException, DelegateException {
    // Create a new ReferenceGenome object to perform the test.
    List<BsReferenceGenome> insertedObjects = createGenomicregionReferenceGenome(1);
    assertTrue("No object created", insertedObjects.get(0) != null);
    delegate.insert(insertedObjects);
    
    // Query all the objects.
    List<BsReferenceGenome> objects = delegate.getAllObjects(100);
    assertTrue("Couldn't create list", objects != null);
    // The list should not be empty.
    assertTrue("List of all objects empty", objects.size() != 0);
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsReferenceGenome o : insertedObjects) {
      o.delete();
    }

    delegate.deleteBatch(insertedObjects);
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
  protected BsReferenceGenome queryStoredObject(com.poesys.db.pk.NaturalPrimaryKey key)
      throws DelegateException {
    // Clear the caches, then query the saved object and test it.
    clearCaches();

    BsReferenceGenome queriedObject = delegate.getObject(key);
    assertTrue("Object not found", queriedObject != null);
    return queriedObject;
  }

  /**
   * A helper method that tests the stored existence of the object identified
   * by the pre-existing, saved primary key.
   * 
   * @param key the primary key (com.poesys.db.pk.NaturalPrimaryKey) of the object to check
   * @return true if the object is in the database, false if not
   * @throws DelegateException when there is a problem querying the object
   */
  protected boolean exists(com.poesys.db.pk.NaturalPrimaryKey key) throws DelegateException {
    // Clear the caches, then query the saved object and test it.
    clearCaches();

    BsReferenceGenome queriedObject = delegate.getObject(key);
    return queriedObject != null;
  }

  /**
   * Test the updating of the inserted object.
   */
  @Test
  public void testUpdate() {
    // Create a new ReferenceGenome object to perform the test.
    List<BsReferenceGenome> objects = createGenomicregionReferenceGenome(1);
    assertTrue("No object created", objects.get(0) != null);
    delegate.insert(objects);
    com.poesys.db.pk.NaturalPrimaryKey key = 
      (com.poesys.db.pk.NaturalPrimaryKey)objects.get(0).getPrimaryKey();
    assertTrue("No key for inserted object", key != null);
    BsReferenceGenome insertedObject = objects.get(0);
    assertTrue("No created object to update", insertedObject != null);
    
    // Update the inserted object and query it to test.
    updateColumn(insertedObject);
    delegate.update(insertedObject);
    BsReferenceGenome queriedObject = queryStoredObject(key);
    assertTrue("Object not updated", isColumnUpdated(queriedObject));
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsReferenceGenome object : objects) {
      object.delete();
    }

    delegate.deleteBatch(objects);
  }
  
  /**
   * Update the first mutable column with a new value.
   *
   * @param object the BsReferenceGenome object to update
   */
  protected void updateColumn(BsReferenceGenome object) {
    try {
      java.text.SimpleDateFormat format = 
        new java.text.SimpleDateFormat("M/d/yyyy HH:mm:ss");
      try {
        object.setDateEntered(new java.sql.Timestamp(format.parse("5/14/2009 10:55:30").getTime()));
      } catch (java.text.ParseException e) {
        assertTrue("Invalid timestamp", false);      
      }
    } catch (com.poesys.db.dto.DtoStatusException e) {
      org.junit.Assert.fail(e.getMessage());
    }
  }

  /**
   * Is the appropriate column in the input object set to the update value?
   *
   * @param object the BsReferenceGenome object to update
   * @return true if the column is updated, false if not
   * @see #updateColumn
   */
  protected boolean isColumnUpdated(BsReferenceGenome object) {
    boolean retVal = false;
    java.text.SimpleDateFormat format = 
      new java.text.SimpleDateFormat("M/d/yyyy HH:mm:ss");
    try {
      retVal = object.getDateEntered().equals(new java.sql.Timestamp(format.parse("5/14/2009 10:55:30").getTime()));
    } catch (java.text.ParseException e) {
      assertTrue("Invalid timestamp", false);      
    }
    return retVal;
  }

  /**
   * Is the appropriate column in the input object set to the updated value in 
   * the original object? This method is a helper for the batchUpdate test.
   *
   * @param original the original, updated BsReferenceGenome object
   * @param queried the queried BsReferenceGenome object
   * @return true if the column is updated, false if not
   */
  protected boolean isColumnUpdated(BsReferenceGenome original, BsReferenceGenome queried) {
    boolean retVal = true;
    retVal = 
      retVal && queried.getDateEntered().equals(original.getDateEntered());
    return retVal;
  }

  /**
   * Test method for batch update
   * 
   * @throws InvalidParametersException when an invalid parameter prevents the
   *       creation of an object
   * @throws DelegateException when a problem occurs during object creation
   */
  @Test
  public void testUpdateBatch() throws InvalidParametersException,
      DelegateException {
    List<BsReferenceGenome> objects = createGenomicregionReferenceGenome(2);
    delegate.insert(objects);
    // Allocate a map to hold the updated objects for later comparison.
    java.util.Map<com.poesys.db.pk.IPrimaryKey, BsReferenceGenome> map = 
      new java.util.TreeMap<com.poesys.db.pk.IPrimaryKey, BsReferenceGenome>();
    for (BsReferenceGenome object : objects) {
      updateColumn(object);
      // Add the object to the storage map.
      map.put(object.getPrimaryKey(), object);
    }
    delegate.updateBatch(objects);
    
    clearCaches();
    
    for (BsReferenceGenome object : objects) {
      BsReferenceGenome queriedObject = 
        queryStoredObject((com.poesys.db.pk.NaturalPrimaryKey)object.getPrimaryKey());
      BsReferenceGenome originalObject = map.get(object.getPrimaryKey());
      assertTrue("Object not updated", 
                 isColumnUpdated(originalObject, queriedObject));
    }
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsReferenceGenome object : objects) {
      object.delete();
    }

    delegate.deleteBatch(objects);
  }

  /**
   * Test method for delete
   * 
   * @throws InvalidParametersException when an invalid parameter prevents the
   *       creation of an object
   * @throws DelegateException when a problem occurs during object creation
   */
  @Test
  public void testDelete() throws InvalidParametersException,
      DelegateException {
    // Create a new ReferenceGenome object to perform the test.
    List<BsReferenceGenome> objects = createGenomicregionReferenceGenome(1);
    assertTrue("No object created", objects.get(0) != null);
    delegate.insert(objects);
    com.poesys.db.pk.NaturalPrimaryKey key = 
      (com.poesys.db.pk.NaturalPrimaryKey)objects.get(0).getPrimaryKey();
    assertTrue("No key for inserted object", key != null);
    BsReferenceGenome insertedObject = objects.get(0);
    assertTrue("No inserted object to delete", insertedObject != null);
    
    delegate.delete(insertedObject);
    assertTrue("object not deleted", !exists(key));
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsReferenceGenome object : objects) {
      object.delete();
    }

    delegate.deleteBatch(objects);
  }

  /**
   * Test method for deleteBatch
   * 
   * @throws InvalidParametersException when an invalid parameter prevents the
   *       creation of an object
   * @throws DelegateException when a problem occurs during object creation
   */
  @Test
  public void testDeleteBatch() throws InvalidParametersException,
      DelegateException {
    List<BsReferenceGenome> objects = createGenomicregionReferenceGenome(2);
    delegate.insert(objects);
    
    // Mark all the objects for delete.
    for (BsReferenceGenome object : objects) {
      object.delete();
    }

    delegate.deleteBatch(objects);

    for (BsReferenceGenome object : objects) {
      assertTrue("object not deleted", !exists((com.poesys.db.pk.NaturalPrimaryKey)object.getPrimaryKey()));
    }
  }

  /**
   * Test method for process()
   * 
   * @throws InvalidParametersException when an invalid parameter prevents the
   *       creation of an object
   * @throws DelegateException when a problem occurs during object creation
   */
  @Test
  public void testProcess() throws InvalidParametersException,
      DelegateException {
    // Create 3 rows--one to insert, one to update, one to delete.
    List<BsReferenceGenome> allObjects = createGenomicregionReferenceGenome(3);
    // Insert the first two rows to later update and delete.
    List<BsReferenceGenome> existingObjects = 
      new CopyOnWriteArrayList<BsReferenceGenome>();
    existingObjects.add(allObjects.get(0));
    existingObjects.add(allObjects.get(1));
    delegate.insert(existingObjects);
    updateColumn(existingObjects.get(0));
    existingObjects.get(1).delete();

    // Set the third object as the object to insert.
    List<BsReferenceGenome> insertObject = 
      new CopyOnWriteArrayList<BsReferenceGenome>();
    insertObject.add(allObjects.get(2));
    
    // Put it all together.
    List<BsReferenceGenome> objects = 
      new CopyOnWriteArrayList<BsReferenceGenome>(existingObjects);
    objects.addAll(insertObject);

    // Test the process method
    delegate.process(objects);

    // Verify the update
    BsReferenceGenome queriedObject = 
      queryStoredObject((com.poesys.db.pk.NaturalPrimaryKey)existingObjects.get(0).getPrimaryKey());
    assertTrue("Update not processed", isColumnUpdated(queriedObject));

    // Verify the delete
    assertTrue("object not deleted", !exists((com.poesys.db.pk.NaturalPrimaryKey)existingObjects.get(1).getPrimaryKey()));

    // Verify the insert
    assertTrue("object not inserted", exists((com.poesys.db.pk.NaturalPrimaryKey)insertObject.get(0).getPrimaryKey()));
    
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsReferenceGenome object : allObjects) {
      object.delete();
    }

    delegate.deleteBatch(allObjects);
  }

  /**
   * Test method for truncateTable
   */
  @Test
  public void testTruncateTable() {
    delegate.truncateTable("ReferenceGenome");
    List<BsReferenceGenome> objects = delegate.getAllObjects(100);
    assertTrue("Couldn't create list", objects != null);
    // The list should be empty.
    assertTrue("Table not truncated", objects.size() == 0);
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
