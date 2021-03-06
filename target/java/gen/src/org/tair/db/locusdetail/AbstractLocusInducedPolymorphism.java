/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;

/**
 * <p>
 * A data-access layer data-transfer object for the LocusInducedPolymorphism. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * A lab-created, non-natural mutation; for example, T-DNA, transposon, and
 * chemically-generated polymorphisms are considered induced. Induced polymorphisms
 * are differences within a single ecotype, whereas natural variation polymorphisms
 * differ between ecotypes.
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>Persistent</li>
 * </ul>
 * <p>
 * Class is read/write: false
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractLocusInducedPolymorphism extends org.tair.db.locusdetail.LocusPolymorphism implements ILocusInducedPolymorphism {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;
  // Setter strategy nested classes for single-object associations
  
  /**
   * Nested class that manages the ecotype association data
   *
   * Source: AddToOneAssociationRequiredObjectProperties
   *
   * @author Poesys/DB Cartridge
   */
  private class QueryEcotypeSetter extends com.poesys.db.dto.AbstractObjectSetter<org.tair.db.basic.ISpeciesVariant> {
    private static final long serialVersionUID = 1L;
    
    /**
     * Create a QueryEcotypeSetter object.
     */
    public QueryEcotypeSetter() {
      super("org.tair.db.basic", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.basic.SpeciesVariant.class.getName();
    }

    @Override
    protected IPrimaryKey getKey() {
      return ecotypeKey;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.tair.db.basic.ISpeciesVariant> getSql() {
      return new org.tair.db.basic.sql.QuerySpeciesVariant();
    }

    @Override
    protected void set(org.tair.db.basic.ISpeciesVariant dto) {
      // No status change, this is just filling in the object data.
      ecotype = dto;
    }

    @Override
    public boolean isSet() {
      // Object is set if the associated ecotype is not null
      return ecotype != null;
    }
  }

  /**
   * Insert setter for inserting nested ecotype.
   */
  private class InsertEcotypeSetter 
      extends com.poesys.db.dto.AbstractInsertSetter<org.tair.db.basic.ISpeciesVariant> {
    // ecotype source: AddToOneAssociationRequiredObjectProperties
    private static final long serialVersionUID = 1L;

    /**
     * Create an InsertEcotypeSetter object.
     */
    public InsertEcotypeSetter() {
      super("org.tair.db.basic", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.basic.SpeciesVariant.class.getName();
    }

    @Override
    protected org.tair.db.basic.ISpeciesVariant getDto() {
      return ecotype;
    }

    @Override
    protected com.poesys.db.dao.insert.IInsertSql<org.tair.db.basic.ISpeciesVariant> getSql() {
      return new org.tair.db.basic.sql.InsertSpeciesVariant();
    }
    
    @Override
    protected boolean createKey() {
      // Key type: CompositeKey
      return true;
    }
  }

  /**
   * Setter for processing added ecotype, updated ecotype, and 
   * deleted ecotype. 
   */
   
  private class UpdateEcotypeSetter 
      extends com.poesys.db.dto.AbstractProcessNestedObject<org.tair.db.basic.ISpeciesVariant> {
    private static final long serialVersionUID = 1L;

    /**
     * Create an UpdateEcotypeSetter object.
     */
    public UpdateEcotypeSetter() {
      super("org.tair.db.basic", 2147483647);
    }

    @Override
    protected void doChanged(java.sql.Connection connection, org.tair.db.basic.ISpeciesVariant dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
        // ecotype source: AddToOneAssociationRequiredObjectProperties
        // Immutable: false
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.basic.ISpeciesVariant> factory = 
        manager.getFactory(org.tair.db.basic.SpeciesVariant.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.update.IUpdate<org.tair.db.basic.ISpeciesVariant> dao = 
        factory.getUpdate(new org.tair.db.basic.sql.UpdateSpeciesVariant());
      dao.update(connection, dto);
    }
    
    @Override
    protected void doDeleted(java.sql.Connection connection, org.tair.db.basic.ISpeciesVariant dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.basic.ISpeciesVariant> factory = 
        manager.getFactory(org.tair.db.basic.SpeciesVariant.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.delete.IDelete<org.tair.db.basic.ISpeciesVariant> dao = 
        factory.getDelete(new org.tair.db.basic.sql.DeleteSpeciesVariant());
      dao.delete(connection, dto);
    }

    @Override
    protected void doNew(java.sql.Connection connection, org.tair.db.basic.ISpeciesVariant dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.basic.ISpeciesVariant> factory = 
        manager.getFactory(org.tair.db.basic.SpeciesVariant.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.insert.IInsert<org.tair.db.basic.ISpeciesVariant> dao =
        factory.getInsert(new org.tair.db.basic.sql.InsertSpeciesVariant(), createKey());
      dao.insert(connection, dto);
    }

    @Override
    protected org.tair.db.basic.ISpeciesVariant getDto() {
      return ecotype;
    }
    
    @Override
    protected String getClassName() {
      return org.tair.db.basic.SpeciesVariant.class.getName();
    }

    @Override
    protected boolean createKey() {
      // Key type: CompositeKey
      return true;
    }
  }

  /**
   * Foreign key object used by QueryEcotypeSetter nested class to query object
   */
  private IPrimaryKey ecotypeKey;
  
  /**
   * Set the foreign key ecotypeKey. This has package access to enable
   * the subsystem factory getData method to call this method to set the key
   * by creating it from the queried result set.
   *
   * @param ecotypeKey the foreign key
   */
  void setEcotypeKey(IPrimaryKey ecotypeKey) {
    this.ecotypeKey = ecotypeKey;
  }

  // Setter strategy nested classes for multiple-object associations

  /**
   * Query setter for querying nested germplasms
   *
   * Source: AddToManyChildCollectionProperties
   *
   * @see org.tair.db.locusdetail.sql.QueryGermplasmsByLocusInducedPolymorphism
   */
  private class QueryGermplasmsSetter 
      extends com.poesys.db.dto.AbstractListSetter<org.tair.db.locusdetail.ILocusGermplasm, ILocusInducedPolymorphism, java.util.Collection<org.tair.db.locusdetail.ILocusGermplasm>> {
    private static final long serialVersionUID = 1L;
    private static final int FETCH_SIZE = 10;

    /**
     * Create a QueryGermplasmsSetter object.
     */
    public QueryGermplasmsSetter() {
      super("org.tair.db.locusdetail", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.locusdetail.LocusGermplasm.class.getName();
    }

    @Override
    protected int getFetchSize() {
      return FETCH_SIZE;
    }

    @Override
    protected ILocusInducedPolymorphism getParametersDto() {
      return AbstractLocusInducedPolymorphism.this;
    }

    @Override
    protected com.poesys.db.dao.query.IParameterizedQuerySql<org.tair.db.locusdetail.ILocusGermplasm, ILocusInducedPolymorphism> getSql() {
      return new org.tair.db.locusdetail.sql.QueryGermplasmsByLocusInducedPolymorphism();
    }

    @Override
    protected void set(java.util.Collection<org.tair.db.locusdetail.ILocusGermplasm> list) {
      // No status change; this is just filling in the object data.
      germplasms = list;
      // Add the primary keys to the serialized key list if there are any.
      if (germplasms != null) {
        for (com.poesys.db.dto.IDbDto object : germplasms) {
          germplasmsKeys.add(object.getPrimaryKey());
        }
      }
    }

    @Override
    public boolean isSet() {
      // Object is set if the associated germplasms list is not null
      return germplasms != null;
    }
  }

  /**
   * Insert setter for inserting nested germplasms.
   *
   * @see org.tair.db.locusdetail.sql.InsertLocusGermplasm
   */
  private class InsertGermplasmsSetter 
      extends com.poesys.db.dto.AbstractBatchInsertSetter<org.tair.db.locusdetail.ILocusGermplasm, java.util.Collection<org.tair.db.locusdetail.ILocusGermplasm>> {
    private static final long serialVersionUID = 1L;
    private static final int BATCH_SIZE = 100;
    
    // germplasms source: AddToManyChildCollectionProperties

    /**
     * Create an InsertGermplasmsSetter object.
     */
    public InsertGermplasmsSetter() {
      super("org.tair.db.locusdetail", 2147483647);
    }

    @Override
    protected int getBatchSize() {
      return BATCH_SIZE;
    }

    @Override
    protected String getClassName() {
      return org.tair.db.locusdetail.LocusGermplasm.class.getName();
    }

    @Override
    protected java.util.Collection<org.tair.db.locusdetail.ILocusGermplasm> getDtos() {
      return germplasms;
    }

    @Override
    protected com.poesys.db.dao.insert.IInsertSql<org.tair.db.locusdetail.ILocusGermplasm> getSql() {
      return new org.tair.db.locusdetail.sql.InsertLocusGermplasm();
    }
  }

  /**
   * Setter for processing added germplasms and updated germplasms.
   * Deleted germplasms are deleted in the database cascade delete.
   */
   
  private class UpdateGermplasmsSetter 
      extends com.poesys.db.dto.AbstractProcessNestedObjects<org.tair.db.locusdetail.ILocusGermplasm, java.util.Collection<org.tair.db.locusdetail.ILocusGermplasm>> {
    private static final long serialVersionUID = 1L;
    private static final int BATCH_SIZE = 100;

    /**
     * Create an UpdateGermplasmsSetter object.
     */
    public UpdateGermplasmsSetter() {
      super("org.tair.db.locusdetail", 2147483647);
    }

    @Override
    protected void doChanged(java.sql.Connection connection, java.util.Collection<org.tair.db.locusdetail.ILocusGermplasm> dtos)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
        // germplasms source: AddToManyChildCollectionProperties
        // Immutable: false
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.locusdetail.ILocusGermplasm> factory = 
        manager.getFactory(org.tair.db.locusdetail.LocusGermplasm.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.update.IUpdateBatch<org.tair.db.locusdetail.ILocusGermplasm> dao =
        factory.getUpdateBatch(new org.tair.db.locusdetail.sql.UpdateLocusGermplasm());
      dao.update(connection, dtos, BATCH_SIZE);
    }
    
    @Override
    protected void doDeleted(java.sql.Connection connection, java.util.Collection<org.tair.db.locusdetail.ILocusGermplasm> dtos)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.locusdetail.ILocusGermplasm> factory = 
        manager.getFactory(org.tair.db.locusdetail.LocusGermplasm.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.delete.IDeleteBatch<org.tair.db.locusdetail.ILocusGermplasm> dao = 
        factory.getDeleteBatch(new org.tair.db.locusdetail.sql.DeleteLocusGermplasm());
      dao.delete(connection, dtos, BATCH_SIZE);
    }

    @Override
    protected void doNew(java.sql.Connection connection, java.util.Collection<org.tair.db.locusdetail.ILocusGermplasm> dtos)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.locusdetail.ILocusGermplasm> factory = 
        manager.getFactory(org.tair.db.locusdetail.LocusGermplasm.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.insert.IInsertBatch<org.tair.db.locusdetail.ILocusGermplasm> dao =
        factory.getInsertBatch(new org.tair.db.locusdetail.sql.InsertLocusGermplasm());
      dao.insert(connection, dtos, BATCH_SIZE);
    }

    @Override
    protected java.util.Collection<org.tair.db.locusdetail.ILocusGermplasm> getDtos() {
      return germplasms;
    }
    
    @Override
    protected String getClassName() {
      return org.tair.db.locusdetail.LocusGermplasm.class.getName();
    }
  }

  /**
   * Create an empty LocusInducedPolymorphism for use in building a new object. The 
   * concrete subclass must call this constructor.
   */
  public AbstractLocusInducedPolymorphism() {
    super();
    // Setter arrays
    querySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    preSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    postSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();

    // Add the setters for the ecotype property.
    querySetters.add(new QueryEcotypeSetter());
    preSetters.add(new InsertEcotypeSetter());
    postSetters.add(new UpdateEcotypeSetter());
    
    // Add the many-to-many collection setters for the germplasms property.
    querySetters.add(new QueryGermplasmsSetter());
    insertSetters.add(new InsertGermplasmsSetter());
    postSetters.add(new UpdateGermplasmsSetter());
  }

  /**
   * Create a LocusInducedPolymorphism. The concrete subclass must call this constructor.
   *
   * @param key the primary key of the LocusInducedPolymorphism
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param polymorphismName the name of the polymorphism
   * @param polymorphismTairObjectId the TAIR object id for the polymorphism, used in URL links to the polymorphism
   * @param polymorphismType the kind of difference (insertion, substitution, deletion)
   * @param length the length of the polymorphic region in base pairs (bp)
   * @param start the starting position on the AGI map of the polymorphism
   * @param end the end position of the polymorphic region in the AGI map
   * @param inheritance how the inheritance of the polymorphism works (recessive, unknown, ???)
   * @param alleleType the kind of allele this polymorphism represents; null means the polymorphism is
not an allele
   * @param accession foreign key used by setter to query associated object
   * @param name foreign key used by setter to query associated object
   * @param taxonId foreign key used by setter to query associated object
   */
  public AbstractLocusInducedPolymorphism(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.String polymorphismName, java.lang.Long polymorphismTairObjectId, java.lang.String polymorphismType, java.lang.Long length, java.lang.Long start, java.lang.Long end, java.lang.String inheritance, java.lang.String alleleType, java.lang.String accession, java.lang.String name, java.lang.Long taxonId) {
    super(key, locusTairObjectId, polymorphismName, polymorphismTairObjectId, polymorphismType, length, start, end);

    this.inheritance = inheritance;

    if (inheritance == null) {
      throw new com.poesys.db.InvalidParametersException("inheritance is required for " + key.getValueList());
    }
    
    this.alleleType = alleleType;

    if (alleleType == null) {
      throw new com.poesys.db.InvalidParametersException("alleleType is required for " + key.getValueList());
    }
    
    this.accession = accession;

    if (accession == null) {
      throw new com.poesys.db.InvalidParametersException("accession is required for " + key.getValueList());
    }
    
    this.name = name;

    if (name == null) {
      throw new com.poesys.db.InvalidParametersException("name is required for " + key.getValueList());
    }
    
    this.taxonId = taxonId;

    if (taxonId == null) {
      throw new com.poesys.db.InvalidParametersException("taxonId is required for " + key.getValueList());
    }
    
    // Setter arrays
    querySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertQuerySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    preSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    postSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    
    // Add the setters for the ecotype property.
    querySetters.add(new QueryEcotypeSetter());
    insertSetters.add(new InsertEcotypeSetter());
    preSetters.add(new InsertEcotypeSetter());
    postSetters.add(new UpdateEcotypeSetter());
    
    // Set the internal key data member for the ecotype object retrieval.
    ecotypeKey = org.tair.db.basic.BasicFactory.getSpeciesVariantPrimaryKey(accession/* Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + addAssociationForeignKeys: accession Key: false */, name/* Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + addAssociationForeignKeys: name Key: false */, taxonId/* Source: AddNaturalKeyProperties + AddParentKeyAttributes + addAssociationForeignKeys: taxonId Key: false */);
    // Add a setter to instantiate the required ecotype object before insert.
    insertQuerySetters.add(new QueryEcotypeSetter());
    
    // Add the many-to-many collection setters for the germplasms property.
    querySetters.add(new QueryGermplasmsSetter());
    insertSetters.add(new InsertGermplasmsSetter());
    postSetters.add(new UpdateGermplasmsSetter());
  }


  /**
   * Nested property inheritance
   *
   * <p>
   * how the inheritance of the polymorphism works (recessive, unknown, ???)
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.String inheritance;
  

  public java.lang.String getInheritance() {
    return inheritance;
  }

  /**
   * Clear the inheritance data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearInheritance() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property alleleType
   *
   * <p>
   * the kind of allele this polymorphism represents; null means the polymorphism is
   * not an allele
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.String alleleType;
  

  public java.lang.String getAlleleType() {
    return alleleType;
  }

  /**
   * Clear the alleleType data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearAlleleType() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property ecotype
   *
   * 
   *
   * Added by AddToOneAssociationRequiredObjectProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private org.tair.db.basic.ISpeciesVariant ecotype;
  

  public org.tair.db.basic.ISpeciesVariant getEcotype() {
    return ecotype;
  }

  /**
   * Clear the ecotype data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearEcotype() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property accession
   *
   * <p>
   * Foreign key used by setter to query associated object
   * </p>
   *
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddToOneAssociationAttributeProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.String accession;
  

  public java.lang.String getAccession() {
    return accession;
  }

  /**
   * Clear the accession data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearAccession() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property name
   *
   * <p>
   * Foreign key used by setter to query associated object
   * </p>
   *
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddToOneAssociationAttributeProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.String name;
  

  public java.lang.String getName() {
    return name;
  }

  /**
   * Clear the name data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearName() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property taxonId
   *
   * <p>
   * Foreign key used by setter to query associated object
   * </p>
   *
   * Added by AddNaturalKeyProperties + AddParentKeyAttributes + AddToOneAssociationAttributeProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.Long taxonId;
  

  public java.lang.Long getTaxonId() {
    return taxonId;
  }

  /**
   * Clear the taxonId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearTaxonId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property germplasms
   *
   * 
   *
   * Added by AddToManyChildCollectionProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  // Doesn't serialize; package access allows proxy to set on readObject()
  transient java.util.Collection<org.tair.db.locusdetail.ILocusGermplasm> germplasms;
  // Ordered list of keys of the objects in the $property.uniquename list
  java.util.List<com.poesys.db.pk.IPrimaryKey> germplasmsKeys = 
    new java.util.ArrayList<com.poesys.db.pk.IPrimaryKey>();
  

  public java.util.Collection<org.tair.db.locusdetail.ILocusGermplasm> getGermplasms() {
    return germplasms;
  }

  /**
   * Clear the germplasms data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearGermplasms() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  @Override
  public void update(com.poesys.db.dto.ISubject subject,
                     com.poesys.db.dao.DataEvent event)
      throws com.poesys.db.dto.DtoStatusException {

    // Clean up germplasms.
    if (subject != null && subject instanceof org.tair.db.locusdetail.ILocusGermplasm && 
        event == com.poesys.db.dao.DataEvent.DELETE &&
        germplasms != null) {
      // Delete to-many germplasms child from collection
      germplasms.remove(subject);
      subject.detach(this, com.poesys.db.dao.DataEvent.MARKED_DELETED);
      subject.detach(this, com.poesys.db.dao.DataEvent.DELETE);
    }
  }
}