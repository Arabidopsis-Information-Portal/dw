/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDbDto.vsl

package org.tair.db.genomicregion;


import com.poesys.db.pk.IPrimaryKey;

import com.poesys.db.dto.AbstractDto;
import com.poesys.db.dto.DtoStatusException;


/**
 * <p>
 * A data-access layer data-transfer object for the Polypeptide. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * SO_0000104: A sequence of amino acids linked by peptide bonds which may lack
 * appreciable tertiary structure and may not be liable to irreversible
 * denaturation. Synonym: protein.
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>CompositeKey</li>
 *     <li>Persistent</li>
 * </ul>
 * <p>
 * Class is read/write: true
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractPolypeptide extends AbstractDto implements IPolypeptide {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;
  // Setter strategy nested classes for single-object associations
  
  /**
   * Nested class that manages the transcript association data
   *
   * Source: AddToOneAssociationRequiredObjectProperties
   *
   * @author Poesys/DB Cartridge
   */
  private class QueryTranscriptSetter extends com.poesys.db.dto.AbstractObjectSetter<org.tair.db.genomicregion.ITranscript> {
    private static final long serialVersionUID = 1L;
    
    /**
     * Create a QueryTranscriptSetter object.
     */
    public QueryTranscriptSetter() {
      super("org.tair.db.genomicregion", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.genomicregion.Transcript.class.getName();
    }

    @Override
    protected IPrimaryKey getKey() {
      return transcriptKey;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.tair.db.genomicregion.ITranscript> getSql() {
      return new org.tair.db.genomicregion.sql.QueryTranscript();
    }

    @Override
    protected void set(org.tair.db.genomicregion.ITranscript dto) {
      // No status change, this is just filling in the object data.
      transcript = dto;
    }

    @Override
    public boolean isSet() {
      // Object is set if the associated transcript is not null
      return transcript != null;
    }
  }

  /**
   * Insert setter for inserting nested transcript.
   */
  private class InsertTranscriptSetter 
      extends com.poesys.db.dto.AbstractInsertSetter<org.tair.db.genomicregion.ITranscript> {
    // transcript source: AddToOneAssociationRequiredObjectProperties
    private static final long serialVersionUID = 1L;

    /**
     * Create an InsertTranscriptSetter object.
     */
    public InsertTranscriptSetter() {
      super("org.tair.db.genomicregion", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.genomicregion.Transcript.class.getName();
    }

    @Override
    protected org.tair.db.genomicregion.ITranscript getDto() {
      return transcript;
    }

    @Override
    protected com.poesys.db.dao.insert.IInsertSql<org.tair.db.genomicregion.ITranscript> getSql() {
      return new org.tair.db.genomicregion.sql.InsertTranscript();
    }
    
    @Override
    protected boolean createKey() {
      // Key type: None
      return true;
    }
  }

  /**
   * Setter for processing added transcript, updated transcript, and 
   * deleted transcript. 
   */
   
  private class UpdateTranscriptSetter 
      extends com.poesys.db.dto.AbstractProcessNestedObject<org.tair.db.genomicregion.ITranscript> {
    private static final long serialVersionUID = 1L;

    /**
     * Create an UpdateTranscriptSetter object.
     */
    public UpdateTranscriptSetter() {
      super("org.tair.db.genomicregion", 2147483647);
    }

    @Override
    protected void doChanged(java.sql.Connection connection, org.tair.db.genomicregion.ITranscript dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
        // transcript source: AddToOneAssociationRequiredObjectProperties
        // Immutable: false
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.genomicregion.ITranscript> factory = 
        manager.getFactory(org.tair.db.genomicregion.Transcript.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.update.IUpdate<org.tair.db.genomicregion.ITranscript> dao = 
        factory.getUpdate(new org.tair.db.genomicregion.sql.UpdateTranscript());
      dao.update(connection, dto);
    }
    
    @Override
    protected void doDeleted(java.sql.Connection connection, org.tair.db.genomicregion.ITranscript dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.genomicregion.ITranscript> factory = 
        manager.getFactory(org.tair.db.genomicregion.Transcript.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.delete.IDelete<org.tair.db.genomicregion.ITranscript> dao = 
        factory.getDelete(new org.tair.db.genomicregion.sql.DeleteTranscript());
      dao.delete(connection, dto);
    }

    @Override
    protected void doNew(java.sql.Connection connection, org.tair.db.genomicregion.ITranscript dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.tair.db.genomicregion.ITranscript> factory = 
        manager.getFactory(org.tair.db.genomicregion.Transcript.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.insert.IInsert<org.tair.db.genomicregion.ITranscript> dao =
        factory.getInsert(new org.tair.db.genomicregion.sql.InsertTranscript(), createKey());
      dao.insert(connection, dto);
    }

    @Override
    protected org.tair.db.genomicregion.ITranscript getDto() {
      return transcript;
    }
    
    @Override
    protected String getClassName() {
      return org.tair.db.genomicregion.Transcript.class.getName();
    }

    @Override
    protected boolean createKey() {
      // Key type: None
      return true;
    }
  }

  /**
   * Foreign key object used by QueryTranscriptSetter nested class to query object
   */
  private IPrimaryKey transcriptKey;
  
  /**
   * Set the foreign key transcriptKey. This has package access to enable
   * the subsystem factory getData method to call this method to set the key
   * by creating it from the queried result set.
   *
   * @param transcriptKey the foreign key
   */
  void setTranscriptKey(IPrimaryKey transcriptKey) {
    this.transcriptKey = transcriptKey;
  }


  /**
   * Create an empty Polypeptide for use in building a new object. The 
   * concrete subclass must call this constructor.
   */
  public AbstractPolypeptide() {
    // Setter arrays
    querySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    preSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    postSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();

    // Add the setters for the transcript property.
    querySetters.add(new QueryTranscriptSetter());
    preSetters.add(new InsertTranscriptSetter());
    postSetters.add(new UpdateTranscriptSetter());
  }

  /**
   * Create a Polypeptide. The concrete subclass must call this constructor.
   *
   * @param key the primary key of the Polypeptide
   * @param tairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param aaSequenceId the unique TAIR amino acid sequence identifier
   * @param genbankDefinition the protein definition from GenBank
   * @param experimental whether the protein sequence was experimentally determined in vivo
   * @param description text describing the protein
   * @param genbankGi the GenBank GI sequence number associated with the protein
   * @param PirAccession the unique identifier in Protein Information Resource (PIR)
   * @param pl the isoelectric point number for the protein
   * @param molecularWeight the molecular weight of the protein molecule
   * @param ecNumber the Enzyme Commission number for the protein
   * @param tremblId the identifier at TREMBL for the protein
   * @param swissProtId the identifier at SwissProt for the protein
   * @param uniProtId the UniProt identifier for the protein
   * @param dateEntered the date on which the protein record was created in the source database
   */
  public AbstractPolypeptide(IPrimaryKey key, java.lang.Long tairObjectId, java.lang.Long aaSequenceId, java.lang.String genbankDefinition, java.lang.Boolean experimental, java.lang.String description, java.lang.String genbankGi, java.lang.String PirAccession, java.lang.Double pl, java.lang.Double molecularWeight, java.lang.String ecNumber, java.lang.String tremblId, java.lang.String swissProtId, java.lang.String uniProtId, java.sql.Timestamp dateEntered) {
    this.key = key;

    this.tairObjectId = tairObjectId;

    if (tairObjectId == null) {
      throw new com.poesys.db.InvalidParametersException("tairObjectId is required for " + key.getValueList());
    }
    
    this.aaSequenceId = aaSequenceId;

    if (aaSequenceId == null) {
      throw new com.poesys.db.InvalidParametersException("aaSequenceId is required for " + key.getValueList());
    }
    
    this.genbankDefinition = genbankDefinition;

    this.experimental = experimental;

    this.description = description;

    this.genbankGi = genbankGi;

    this.PirAccession = PirAccession;

    this.pl = pl;

    this.molecularWeight = molecularWeight;

    this.ecNumber = ecNumber;

    this.tremblId = tremblId;

    this.swissProtId = swissProtId;

    this.uniProtId = uniProtId;

    this.dateEntered = dateEntered;

    // Setter arrays
    querySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertQuerySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    preSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    postSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    
    // Add the setters for the transcript property.
    querySetters.add(new QueryTranscriptSetter());
    insertSetters.add(new InsertTranscriptSetter());
    preSetters.add(new InsertTranscriptSetter());
    postSetters.add(new UpdateTranscriptSetter());
    
    // Set the internal key data member for the transcript object retrieval.
    transcriptKey = org.tair.db.genomicregion.GenomicregionFactory.getTranscriptPrimaryKey(tairObjectId/* Source: AddNaturalKeyProperties + AddInheritedKeyProperties + addAssociationForeignKeys: tairObjectId Key: true */);
    // Add a setter to instantiate the required transcript object before insert.
    insertQuerySetters.add(new QueryTranscriptSetter());
  }

  @Override
  public boolean equals(Object arg0) {
    AbstractPolypeptide other = (AbstractPolypeptide)arg0;
    return other.key.equals(key);
  }

  @Override
  public int hashCode() {
    return key.hashCode();
  }

  @Override
  public int compareTo(com.poesys.db.dto.IDbDto o) {
    AbstractPolypeptide other = (AbstractPolypeptide)o;
    // Sort on the key. Same semantics as equals and hashCode().
    return other.key.compareTo(key);
  }
  
  @Override
  public String getSubsystem() {
    return "org.tair.db.genomicregion";
  }

  @Override
  public void markChildrenDeleted() throws DtoStatusException {
  }

  @Override
  public IPrimaryKey getPrimaryKey() {
    return key;
  }
  
  @Override
  public java.sql.Connection getConnection() throws java.sql.SQLException {
    java.sql.Connection connection = null;
    
	/* 
	 * The resource bundle for the DTO's subsystem contains the suffix that
	 * distinguishes multiple versions of the subsystem in the database.properties
	 * file, such as "prod" or "test". Most database.properties files have only
	 * one implementation and use external facilities to switch between the
	 * databases (JNDI, for example, or producing different database.properties
	 * files in different setups). Use the subsystem resource bundle to get the
	 * suffix, then use the full subsystem name to get a connection factory for
	 * the DTO's subsystem, then use that factory to get a JDBC connection.
	 */
	java.util.ResourceBundle rb = 
	  java.util.ResourceBundle.getBundle("org.tair.db.genomicregion");
    String subsystem =
      "org.tair.db.genomicregion"
          + (rb.getString("suffix") == null
             || rb.getString("suffix").length() == 0 ? ""
              : "." + rb.getString("suffix"));
	  
	try {
	  connection = 
	    com.poesys.db.connection.ConnectionFactoryFactory.getInstance(subsystem).getConnection();
	} catch (com.poesys.db.InvalidParametersException e) {
	  throw new java.sql.SQLException(e.getMessage());
	} catch (java.io.IOException e) {
	  throw new java.sql.SQLException(e.getMessage());
	}
	
	return connection;
  }

  /**
   * Nested property tairObjectId
   *
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   *
   * Added by AddNaturalKeyProperties + AddInheritedKeyProperties + AddParentKeyAttributes
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.Long tairObjectId;
  

  public java.lang.Long getTairObjectId() {
    return tairObjectId;
  }

  /**
   * Clear the tairObjectId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearTairObjectId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property aaSequenceId
   *
   * <p>
   * the unique TAIR amino acid sequence identifier
   * </p>
   *
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.Long aaSequenceId;
  

  public java.lang.Long getAaSequenceId() {
    return aaSequenceId;
  }

  /**
   * Clear the aaSequenceId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearAaSequenceId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property genbankDefinition
   *
   * <p>
   * the protein definition from GenBank
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.String genbankDefinition;
  

  public java.lang.String getGenbankDefinition() {
    return genbankDefinition;
  }

  /**
   * Clear the genbankDefinition data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearGenbankDefinition() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the genbankDefinition.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the protein definition from GenBank
   * </p>
   *
   * @param genbankDefinition the value with which to set the property
   */
  public  void setGenbankDefinition(java.lang.String genbankDefinition) {
    this.genbankDefinition = genbankDefinition;
    setChanged();
  }

  /**
   * Nested property experimental
   *
   * <p>
   * whether the protein sequence was experimentally determined in vivo
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.Boolean experimental;
  

  public java.lang.Boolean getExperimental() {
    return experimental;
  }

  /**
   * Clear the experimental data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearExperimental() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the experimental.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * whether the protein sequence was experimentally determined in vivo
   * </p>
   *
   * @param experimental the value with which to set the property
   */
  public  void setExperimental(java.lang.Boolean experimental) {
    this.experimental = experimental;
    setChanged();
  }

  /**
   * Nested property description
   *
   * <p>
   * text describing the protein
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.String description;
  

  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Clear the description data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearDescription() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the description.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * text describing the protein
   * </p>
   *
   * @param description the value with which to set the property
   */
  public  void setDescription(java.lang.String description) {
    this.description = description;
    setChanged();
  }

  /**
   * Nested property genbankGi
   *
   * <p>
   * the GenBank GI sequence number associated with the protein
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.String genbankGi;
  

  public java.lang.String getGenbankGi() {
    return genbankGi;
  }

  /**
   * Clear the genbankGi data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearGenbankGi() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the genbankGi.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the GenBank GI sequence number associated with the protein
   * </p>
   *
   * @param genbankGi the value with which to set the property
   */
  public  void setGenbankGi(java.lang.String genbankGi) {
    this.genbankGi = genbankGi;
    setChanged();
  }

  /**
   * Nested property PirAccession
   *
   * <p>
   * the unique identifier in Protein Information Resource (PIR)
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.String PirAccession;
  

  public java.lang.String getPirAccession() {
    return PirAccession;
  }

  /**
   * Clear the PirAccession data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearPirAccession() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the PirAccession.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the unique identifier in Protein Information Resource (PIR)
   * </p>
   *
   * @param PirAccession the value with which to set the property
   */
  public  void setPirAccession(java.lang.String PirAccession) {
    this.PirAccession = PirAccession;
    setChanged();
  }

  /**
   * Nested property pl
   *
   * <p>
   * the isoelectric point number for the protein
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.Double pl;
  

  public java.lang.Double getPl() {
    return pl;
  }

  /**
   * Clear the pl data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearPl() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the pl.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the isoelectric point number for the protein
   * </p>
   *
   * @param pl the value with which to set the property
   */
  public  void setPl(java.lang.Double pl) {
    this.pl = pl;
    setChanged();
  }

  /**
   * Nested property molecularWeight
   *
   * <p>
   * the molecular weight of the protein molecule
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.Double molecularWeight;
  

  public java.lang.Double getMolecularWeight() {
    return molecularWeight;
  }

  /**
   * Clear the molecularWeight data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearMolecularWeight() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the molecularWeight.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the molecular weight of the protein molecule
   * </p>
   *
   * @param molecularWeight the value with which to set the property
   */
  public  void setMolecularWeight(java.lang.Double molecularWeight) {
    this.molecularWeight = molecularWeight;
    setChanged();
  }

  /**
   * Nested property ecNumber
   *
   * <p>
   * the Enzyme Commission number for the protein
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.String ecNumber;
  

  public java.lang.String getEcNumber() {
    return ecNumber;
  }

  /**
   * Clear the ecNumber data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearEcNumber() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the ecNumber.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the Enzyme Commission number for the protein
   * </p>
   *
   * @param ecNumber the value with which to set the property
   */
  public  void setEcNumber(java.lang.String ecNumber) {
    this.ecNumber = ecNumber;
    setChanged();
  }

  /**
   * Nested property tremblId
   *
   * <p>
   * the identifier at TREMBL for the protein
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.String tremblId;
  

  public java.lang.String getTremblId() {
    return tremblId;
  }

  /**
   * Clear the tremblId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearTremblId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the tremblId.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the identifier at TREMBL for the protein
   * </p>
   *
   * @param tremblId the value with which to set the property
   */
  public  void setTremblId(java.lang.String tremblId) {
    this.tremblId = tremblId;
    setChanged();
  }

  /**
   * Nested property swissProtId
   *
   * <p>
   * the identifier at SwissProt for the protein
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.String swissProtId;
  

  public java.lang.String getSwissProtId() {
    return swissProtId;
  }

  /**
   * Clear the swissProtId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearSwissProtId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the swissProtId.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the identifier at SwissProt for the protein
   * </p>
   *
   * @param swissProtId the value with which to set the property
   */
  public  void setSwissProtId(java.lang.String swissProtId) {
    this.swissProtId = swissProtId;
    setChanged();
  }

  /**
   * Nested property uniProtId
   *
   * <p>
   * the UniProt identifier for the protein
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.String uniProtId;
  

  public java.lang.String getUniProtId() {
    return uniProtId;
  }

  /**
   * Clear the uniProtId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearUniProtId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the uniProtId.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the UniProt identifier for the protein
   * </p>
   *
   * @param uniProtId the value with which to set the property
   */
  public  void setUniProtId(java.lang.String uniProtId) {
    this.uniProtId = uniProtId;
    setChanged();
  }

  /**
   * Nested property dateEntered
   *
   * <p>
   * the date on which the protein record was created in the source database
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.sql.Timestamp dateEntered;
  

  public java.sql.Timestamp getDateEntered() {
    return dateEntered;
  }

  /**
   * Clear the dateEntered data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearDateEntered() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the dateEntered.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the date on which the protein record was created in the source database
   * </p>
   *
   * @param dateEntered the value with which to set the property
   */
  public  void setDateEntered(java.sql.Timestamp dateEntered) {
    this.dateEntered = dateEntered;
    setChanged();
  }

  /**
   * Nested property transcript
   *
   * <p>
   * the transcript that codes for the protein
   * </p>
   *
   * Added by AddToOneAssociationRequiredObjectProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private org.tair.db.genomicregion.ITranscript transcript;
  

  public org.tair.db.genomicregion.ITranscript getTranscript() {
    return transcript;
  }

  /**
   * Clear the transcript data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearTranscript() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the transcript.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the transcript that codes for the protein
   * </p>
   *
   * @param transcript the value with which to set the property
   * @throws com.poesys.db.InvalidParametersException when the input transcript is null
   */
  public void setTranscript(org.tair.db.genomicregion.ITranscript transcript)
      throws com.poesys.db.InvalidParametersException {
    if (transcript == null) {
      throw new com.poesys.db.InvalidParametersException("transcript is required");
    }
    
    this.transcript = transcript;
    // Set the IPrimaryKey cache lookup key.
    this.transcriptKey = transcript.getPrimaryKey();
    setChanged();
  }

  @Override
  public void update(com.poesys.db.dto.ISubject subject,
                     com.poesys.db.dao.DataEvent event)
      throws com.poesys.db.dto.DtoStatusException {
  }
}