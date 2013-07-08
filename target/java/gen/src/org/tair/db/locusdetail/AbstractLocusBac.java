/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;

import com.poesys.db.dto.AbstractDto;
import com.poesys.db.dto.DtoStatusException;


/**
 * <p>
 * A data-access layer data-transfer object for the LocusBac. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * A bacterially activated chromosome on which a locus appears; an artificially
 * created chromosome in which biologists clone medium-sized segments of foreign
 * DNA into bacteria, enabling amplification or the making of many copies of the
 * DNA. Note that if the length or start or end is null (not available), this might
 * not be the correct BAC for the gene model.
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>CompositeKey</li>
 *     <li>Persistent</li>
 * </ul>
 * <p>
 * Class is read/write: false
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractLocusBac extends AbstractDto implements ILocusBac {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;
  // Setter strategy nested classes for single-object associations
  
  /**
   * Nested class that manages the locus association data
   *
   * Source: AddToOneAssociationRequiredObjectProperties
   *
   * @author Poesys/DB Cartridge
   */
  private class QueryLocusSetter extends com.poesys.db.dto.AbstractObjectSetter<org.tair.db.locusdetail.ILocusDetail> {
    private static final long serialVersionUID = 1L;
    
    /**
     * Create a QueryLocusSetter object.
     */
    public QueryLocusSetter() {
      super("org.tair.db.locusdetail", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.locusdetail.LocusDetail.class.getName();
    }

    @Override
    protected IPrimaryKey getKey() {
      return locusKey;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.tair.db.locusdetail.ILocusDetail> getSql() {
      return new org.tair.db.locusdetail.sql.QueryLocusDetail();
    }

    @Override
    protected void set(org.tair.db.locusdetail.ILocusDetail dto) {
      // No status change, this is just filling in the object data.
      locus = dto;
    }

    @Override
    public boolean isSet() {
      // Object is set if the associated locus is not null
      return locus != null;
    }
  }


  /**
   * Foreign key object used by QueryLocusSetter nested class to query object
   */
  private IPrimaryKey locusKey;
  
  /**
   * Set the foreign key locusKey. This has package access to enable
   * the subsystem factory getData method to call this method to set the key
   * by creating it from the queried result set.
   *
   * @param locusKey the foreign key
   */
  void setLocusKey(IPrimaryKey locusKey) {
    this.locusKey = locusKey;
  }


  /**
   * Create an empty LocusBac for use in building a new object. The 
   * concrete subclass must call this constructor.
   */
  public AbstractLocusBac() {
    // Setter arrays
    querySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    preSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    postSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();

    // Add the setters for the locus property.
    querySetters.add(new QueryLocusSetter());
  }

  /**
   * Create a LocusBac. The concrete subclass must call this constructor.
   *
   * @param key the primary key of the LocusBac
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param bacTairObjectId the unique TAIR object identifier for the BAC (assembly unit)
   * @param name the BAC name; usually the same as the clone name
   * @param icAccession the unique identifier at any of the major international genomics data centers
for the BAC sequence
   * @param length the length of the BAC sequence, unit is bp (base pairs)
   * @param start the starting position on the chromosome in unit bp (base pairs)
   * @param end the ending position on the chromosome in unit bp (base pairs)
   * @param cloneTairObjectId the TAIR object identifier for the clone of the BAC; used to connect to the TAIR
clone
   */
  public AbstractLocusBac(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.Long bacTairObjectId, java.lang.String name, java.lang.String icAccession, java.lang.Long length, java.lang.Long start, java.lang.Long end, java.lang.Long cloneTairObjectId) {
    this.key = key;

    this.locusTairObjectId = locusTairObjectId;

    if (locusTairObjectId == null) {
      throw new com.poesys.db.InvalidParametersException("locusTairObjectId is required for " + key.getValueList());
    }
    
    this.bacTairObjectId = bacTairObjectId;

    if (bacTairObjectId == null) {
      throw new com.poesys.db.InvalidParametersException("bacTairObjectId is required for " + key.getValueList());
    }
    
    this.name = name;

    if (name == null) {
      throw new com.poesys.db.InvalidParametersException("name is required for " + key.getValueList());
    }
    
    this.icAccession = icAccession;

    if (icAccession == null) {
      throw new com.poesys.db.InvalidParametersException("icAccession is required for " + key.getValueList());
    }
    
    this.length = length;

    if (length == null) {
      throw new com.poesys.db.InvalidParametersException("length is required for " + key.getValueList());
    }
    
    this.start = start;

    if (start == null) {
      throw new com.poesys.db.InvalidParametersException("start is required for " + key.getValueList());
    }
    
    this.end = end;

    if (end == null) {
      throw new com.poesys.db.InvalidParametersException("end is required for " + key.getValueList());
    }
    
    this.cloneTairObjectId = cloneTairObjectId;

    if (cloneTairObjectId == null) {
      throw new com.poesys.db.InvalidParametersException("cloneTairObjectId is required for " + key.getValueList());
    }
    
    // Setter arrays
    querySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertQuerySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    preSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    postSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    
    // Add the setters for the locus property.
    querySetters.add(new QueryLocusSetter());
    
    // Set the internal key data member for the locus object retrieval.
    locusKey = org.tair.db.locusdetail.LocusdetailFactory.getLocusDetailPrimaryKey(locusTairObjectId/* Source: AddNaturalKeyProperties + addAssociationForeignKeys: locusTairObjectId Key: true */);
    // Add a setter to instantiate the required locus object before insert.
    insertQuerySetters.add(new QueryLocusSetter());
  }

  @Override
  public boolean equals(Object arg0) {
    AbstractLocusBac other = (AbstractLocusBac)arg0;
    return other.key.equals(key);
  }

  @Override
  public int hashCode() {
    return key.hashCode();
  }

  @Override
  public int compareTo(com.poesys.db.dto.IDbDto o) {
    AbstractLocusBac other = (AbstractLocusBac)o;
    // Sort on the key. Same semantics as equals and hashCode().
    return other.key.compareTo(key);
  }
  
  @Override
  public String getSubsystem() {
    return "org.tair.db.locusdetail";
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
	  java.util.ResourceBundle.getBundle("org.tair.db.locusdetail");
    String subsystem =
      "org.tair.db.locusdetail"
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
   * Nested property locusTairObjectId
   *
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   *
   * Added by AddNaturalKeyProperties + AddParentKeyAttributes
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.Long locusTairObjectId;
  

  public java.lang.Long getLocusTairObjectId() {
    return locusTairObjectId;
  }

  /**
   * Clear the locusTairObjectId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearLocusTairObjectId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property bacTairObjectId
   *
   * <p>
   * the unique TAIR object identifier for the BAC (assembly unit)
   * </p>
   *
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.Long bacTairObjectId;
  

  public java.lang.Long getBacTairObjectId() {
    return bacTairObjectId;
  }

  /**
   * Clear the bacTairObjectId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearBacTairObjectId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property name
   *
   * <p>
   * the BAC name; usually the same as the clone name
   * </p>
   *
   * Added by AddLocalAttributeProperties
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
   * Nested property icAccession
   *
   * <p>
   * the unique identifier at any of the major international genomics data centers
   * for the BAC sequence
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.String icAccession;
  

  public java.lang.String getIcAccession() {
    return icAccession;
  }

  /**
   * Clear the icAccession data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearIcAccession() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property length
   *
   * <p>
   * the length of the BAC sequence, unit is bp (base pairs)
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.Long length;
  

  public java.lang.Long getLength() {
    return length;
  }

  /**
   * Clear the length data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearLength() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property start
   *
   * <p>
   * the starting position on the chromosome in unit bp (base pairs)
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.Long start;
  

  public java.lang.Long getStart() {
    return start;
  }

  /**
   * Clear the start data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearStart() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property end
   *
   * <p>
   * the ending position on the chromosome in unit bp (base pairs)
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.Long end;
  

  public java.lang.Long getEnd() {
    return end;
  }

  /**
   * Clear the end data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearEnd() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property cloneTairObjectId
   *
   * <p>
   * the TAIR object identifier for the clone of the BAC; used to connect to the TAIR
   * clone
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.Long cloneTairObjectId;
  

  public java.lang.Long getCloneTairObjectId() {
    return cloneTairObjectId;
  }

  /**
   * Clear the cloneTairObjectId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearCloneTairObjectId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property locus
   *
   * 
   *
   * Added by AddToOneAssociationRequiredObjectProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private org.tair.db.locusdetail.ILocusDetail locus;
  

  public org.tair.db.locusdetail.ILocusDetail getLocus() {
    return locus;
  }

  /**
   * Clear the locus data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearLocus() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  @Override
  public void update(com.poesys.db.dto.ISubject subject,
                     com.poesys.db.dao.DataEvent event)
      throws com.poesys.db.dto.DtoStatusException {
  }
}