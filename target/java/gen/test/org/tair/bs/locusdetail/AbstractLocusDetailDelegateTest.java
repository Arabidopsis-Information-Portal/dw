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
 * Test the LocusDetailDelegate class.
 * </p>
 * <p>
 * Note that all the test cases defined here run independently, because JUnit
 * does not guarantee the execution order of the test cases in any way.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractLocusDetailDelegateTest {
  /** Define a class logger. */
  protected static Logger logger = Logger.getLogger(AbstractLocusDetailDelegateTest.class);
  /** Subsystem name in database.properties file */
  protected String subsystem = "org.tair.db.locusdetail";
  /** Boolean saved off for later comparison in update tests */
  protected Boolean originalBooleanValue = null;
  /** Delegate created at class level for sharing between methods */
  protected LocusDetailDelegate delegate = null;

  /**
   * Set up the test by creating the class under test (CUT).
   * 
   * @throws InvalidParametersException when an invalid parameter prevents the
   *       creation of an object
   * @throws DelegateException when a problem occurs during object creation
   */
  @Before
  public void setUp() {
    delegate = LocusdetailDelegateFactory.getLocusDetailDelegate();
    // Clear any existing caches of objects using the memory manager set in
    // the creation of the delegate.
    clearCaches();
    assertTrue("No delegate created", delegate != null);
  }
  
  /**
   * Helper method to clear caches for any objects used in the test
   */
  protected void clearCaches() {
    // Primary class LocusDetailProxy cache
    IDaoManager manager = DaoManagerFactory.getManager(getSubsystem());
    if (manager != null) {
      manager.clearCache(org.tair.db.locusdetail.LocusDetailProxy.class.getName());
    }

    // Clear nested object caches
    
    // Child LocusUpdateHistory cache
    IDaoManager LocusUpdateHistoryManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (LocusUpdateHistoryManager != null) {
      LocusUpdateHistoryManager.clearCache(org.tair.db.locusdetail.LocusUpdateHistory.class.getName());
    }
    
    // Child ModelFeature cache
    IDaoManager ModelFeatureManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (ModelFeatureManager != null) {
      ModelFeatureManager.clearCache(org.tair.db.locusdetail.ModelFeature.class.getName());
    }
    
    // Child LocusGeneModelCdnaAlias cache
    IDaoManager LocusGeneModelCdnaAliasManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (LocusGeneModelCdnaAliasManager != null) {
      LocusGeneModelCdnaAliasManager.clearCache(org.tair.db.locusdetail.LocusGeneModelCdnaAlias.class.getName());
    }
    
    // Child LocusGeneModelCdna cache
    IDaoManager LocusGeneModelCdnaManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (LocusGeneModelCdnaManager != null) {
      LocusGeneModelCdnaManager.clearCache(org.tair.db.locusdetail.LocusGeneModelCdna.class.getName());
    }
    
    // Child ProteinResourceLink cache
    IDaoManager ProteinResourceLinkManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (ProteinResourceLinkManager != null) {
      ProteinResourceLinkManager.clearCache(org.tair.db.locusdetail.ProteinResourceLink.class.getName());
    }
    
    // Child ProteinModelDomain cache
    IDaoManager ProteinModelDomainManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (ProteinModelDomainManager != null) {
      ProteinModelDomainManager.clearCache(org.tair.db.locusdetail.ProteinModelDomain.class.getName());
    }
    
    // Child ProteinModel Proxy cache
    IDaoManager ProteinModelManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (ProteinModelManager != null) {
      ProteinModelManager.clearCache(org.tair.db.locusdetail.ProteinModel.class.getName());
    }
    
    // Child LocusGeneModelAnnotation cache
    IDaoManager LocusGeneModelAnnotationManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (LocusGeneModelAnnotationManager != null) {
      LocusGeneModelAnnotationManager.clearCache(org.tair.db.locusdetail.LocusGeneModelAnnotation.class.getName());
    }
    
    // Child PolymorphismSite cache
    IDaoManager PolymorphismSiteManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (PolymorphismSiteManager != null) {
      PolymorphismSiteManager.clearCache(org.tair.db.locusdetail.PolymorphismSite.class.getName());
    }
    
    // Child LocusGeneModel Proxy cache
    IDaoManager LocusGeneModelManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (LocusGeneModelManager != null) {
      LocusGeneModelManager.clearCache(org.tair.db.locusdetail.LocusGeneModel.class.getName());
    }
    
    // Child LocusOtherName cache
    IDaoManager LocusOtherNameManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (LocusOtherNameManager != null) {
      LocusOtherNameManager.clearCache(org.tair.db.locusdetail.LocusOtherName.class.getName());
    }
    
    // Child LocusPhysicalMapCoordinates cache
    IDaoManager LocusPhysicalMapCoordinatesManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (LocusPhysicalMapCoordinatesManager != null) {
      LocusPhysicalMapCoordinatesManager.clearCache(org.tair.db.locusdetail.LocusPhysicalMapCoordinates.class.getName());
    }
    
    // Child LocusResourceLink cache
    IDaoManager LocusResourceLinkManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (LocusResourceLinkManager != null) {
      LocusResourceLinkManager.clearCache(org.tair.db.locusdetail.LocusResourceLink.class.getName());
    }
    
    // Child LocusComment cache
    IDaoManager LocusCommentManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (LocusCommentManager != null) {
      LocusCommentManager.clearCache(org.tair.db.locusdetail.LocusComment.class.getName());
    }
    
    // Child LocusAttribution cache
    IDaoManager LocusAttributionManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (LocusAttributionManager != null) {
      LocusAttributionManager.clearCache(org.tair.db.locusdetail.LocusAttribution.class.getName());
    }
    
    // Child LocusOtherSymbol cache
    IDaoManager LocusOtherSymbolManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (LocusOtherSymbolManager != null) {
      LocusOtherSymbolManager.clearCache(org.tair.db.locusdetail.LocusOtherSymbol.class.getName());
    }
    
    // Child LocusPolymorphism Proxy cache
    IDaoManager LocusPolymorphismManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (LocusPolymorphismManager != null) {
      LocusPolymorphismManager.clearCache(org.tair.db.locusdetail.LocusPolymorphism.class.getName());
    }
    
    // Child ReferencedLocus cache
    IDaoManager ReferencedLocusManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (ReferencedLocusManager != null) {
      ReferencedLocusManager.clearCache(org.tair.db.locusdetail.ReferencedLocus.class.getName());
    }
    
    // Child Reference Proxy cache
    IDaoManager ReferenceManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (ReferenceManager != null) {
      ReferenceManager.clearCache(org.tair.db.locusdetail.Reference.class.getName());
    }
    
    // Child LocusBac cache
    IDaoManager LocusBacManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (LocusBacManager != null) {
      LocusBacManager.clearCache(org.tair.db.locusdetail.LocusBac.class.getName());
    }
    
    // Child LocusEstAlias cache
    IDaoManager LocusEstAliasManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (LocusEstAliasManager != null) {
      LocusEstAliasManager.clearCache(org.tair.db.locusdetail.LocusEstAlias.class.getName());
    }
    
    // Child LocuslEst cache
    IDaoManager LocuslEstManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (LocuslEstManager != null) {
      LocuslEstManager.clearCache(org.tair.db.locusdetail.LocuslEst.class.getName());
    }
    
    // Child LocusCdnaAlias cache
    IDaoManager LocusCdnaAliasManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (LocusCdnaAliasManager != null) {
      LocusCdnaAliasManager.clearCache(org.tair.db.locusdetail.LocusCdnaAlias.class.getName());
    }
    
    // Child LocusCdna cache
    IDaoManager LocusCdnaManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (LocusCdnaManager != null) {
      LocusCdnaManager.clearCache(org.tair.db.locusdetail.LocusCdna.class.getName());
    }
    
    // Child LocusAnnotation cache
    IDaoManager LocusAnnotationManager = DaoManagerFactory.getManager("org.tair.db.locusdetail");
    if (LocusAnnotationManager != null) {
      LocusAnnotationManager.clearCache(org.tair.db.locusdetail.LocusAnnotation.class.getName());
    }
  }

  /**
   * Get a test key for the create method or primary key for a LocusDetail. 
   * This is abstract; the generated modifiable class must implement this method
   * for read-only classes.
   *
   * @param objectNumber the sequential counter that identifies the object to
   *                     return a key for in the implementation
   * @return ${property.typename} key value
   */
  abstract protected java.lang.Long getTestKeyLocusTairObjectId(int objectNumber);

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
      (com.poesys.db.pk.NaturalPrimaryKey)org.tair.db.locusdetail.LocusdetailFactory.getLocusDetailPrimaryKey(getTestKeyLocusTairObjectId(0));
    assertTrue("No key generated from concrete implementation", key != null);
    
    // Query the object.
    BsLocusDetail object = delegate.getObject(key);
    assertTrue("Couldn't get object", object != null);
    
    // Testing lazy loading of annotation Collection property
    java.util.Collection<org.tair.bs.locusdetail.BsAnnotation> annotation = 
      object.getAnnotation();
    assertTrue("annotation not lazily loaded", annotation != null);
    
    // Testing lazy loading of references Collection property
    java.util.Collection<org.tair.bs.locusdetail.BsReference> references = 
      object.getReferences();
    assertTrue("references not lazily loaded", references != null);
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
    List<BsLocusDetail> objects = delegate.getAllObjects(100);
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
  protected BsLocusDetail queryStoredObject(com.poesys.db.pk.NaturalPrimaryKey key)
      throws DelegateException {
    // Clear the caches, then query the saved object and test it.
    clearCaches();

    BsLocusDetail queriedObject = delegate.getObject(key);
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
