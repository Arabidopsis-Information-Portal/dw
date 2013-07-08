/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDbDto.vsl

package org.tair.db.community;


import com.poesys.db.pk.IPrimaryKey;

import com.poesys.db.dto.AbstractDto;
import com.poesys.db.dto.DtoStatusException;


/**
 * <p>
 * A data-access layer data-transfer object for the CommunityAttribution. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * The attribution of an object in the database to a community member
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
public abstract class AbstractCommunityAttribution extends AbstractDto implements ICommunityAttribution {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;
  // Setter strategy nested classes for single-object associations
  


  /**
   * Create an empty CommunityAttribution for use in building a new object. The 
   * concrete subclass must call this constructor.
   */
  public AbstractCommunityAttribution() {
    // Setter arrays
    querySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    preSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    postSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();

    // Add the setters for the member property.
  }

  /**
   * Create a CommunityAttribution. The concrete subclass must call this constructor.
   *
   * @param key the primary key of the CommunityAttribution
   * @param communityId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param attributionType the nature of the attribution, such as "submitted_by" or "available_from"; first
part of the ordering part of the primary sub-key
   * @param name the name of the attributed object, such as the AGI number or the germplasm name;
if there is no name, this should contain some kind of descriptive text or
identifier that allows identification of the object;
second part of the ordering part of the primary sub-key
   * @param tairObjectId the unique TAIR identifier for the object being attributed to a community
member; used to link to the object page
   * @param attributionDate the date of the attribution
   * @param attributionComment an optional text comment on the attribution
   */
  public AbstractCommunityAttribution(IPrimaryKey key, java.math.BigInteger communityId, java.lang.String attributionType, java.lang.String name, java.lang.Long tairObjectId, java.sql.Timestamp attributionDate, java.lang.String attributionComment) {
    this.key = key;

    this.communityId = communityId;

    if (communityId == null) {
      throw new com.poesys.db.InvalidParametersException("communityId is required for " + key.getValueList());
    }
    
    this.attributionType = attributionType;

    if (attributionType == null) {
      throw new com.poesys.db.InvalidParametersException("attributionType is required for " + key.getValueList());
    }
    
    this.name = name;

    if (name == null) {
      throw new com.poesys.db.InvalidParametersException("name is required for " + key.getValueList());
    }
    
    this.tairObjectId = tairObjectId;

    if (tairObjectId == null) {
      throw new com.poesys.db.InvalidParametersException("tairObjectId is required for " + key.getValueList());
    }
    
    this.attributionDate = attributionDate;

    if (attributionDate == null) {
      throw new com.poesys.db.InvalidParametersException("attributionDate is required for " + key.getValueList());
    }
    
    this.attributionComment = attributionComment;

    // Setter arrays
    querySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertQuerySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    insertSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    preSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    postSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    
    // Add the setters for the member property.
  }

  @Override
  public boolean equals(Object arg0) {
    AbstractCommunityAttribution other = (AbstractCommunityAttribution)arg0;
    return other.key.equals(key);
  }

  @Override
  public int hashCode() {
    return key.hashCode();
  }

  @Override
  public int compareTo(com.poesys.db.dto.IDbDto o) {
    AbstractCommunityAttribution other = (AbstractCommunityAttribution)o;
    // Sort on the key. Same semantics as equals and hashCode().
    return other.key.compareTo(key);
  }
  
  @Override
  public String getSubsystem() {
    return "org.tair.db.community";
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
	  java.util.ResourceBundle.getBundle("org.tair.db.community");
    String subsystem =
      "org.tair.db.community"
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
   * Nested property communityId
   *
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   *
   * Added by AddGeneratedKeyProperties + AddParentKeyAttributes
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.math.BigInteger communityId;
  

  public java.math.BigInteger getCommunityId() {
    return communityId;
  }

  /**
   * Clear the communityId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearCommunityId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property attributionType
   *
   * <p>
   * the nature of the attribution, such as "submitted_by" or "available_from"; first
   * part of the ordering part of the primary sub-key
   * </p>
   *
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.String attributionType;
  

  public java.lang.String getAttributionType() {
    return attributionType;
  }

  /**
   * Clear the attributionType data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearAttributionType() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property name
   *
   * <p>
   * the name of the attributed object, such as the AGI number or the germplasm name;
   * if there is no name, this should contain some kind of descriptive text or
   * identifier that allows identification of the object;
   * </p>
   * <p>
   * second part of the ordering part of the primary sub-key
   * </p>
   *
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
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
   * Nested property tairObjectId
   *
   * <p>
   * the unique TAIR identifier for the object being attributed to a community
   * member; used to link to the object page
   * </p>
   *
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
   * Class is read/write: false
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
   * Nested property attributionDate
   *
   * <p>
   * the date of the attribution
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.sql.Timestamp attributionDate;
  

  public java.sql.Timestamp getAttributionDate() {
    return attributionDate;
  }

  /**
   * Clear the attributionDate data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearAttributionDate() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property attributionComment
   *
   * <p>
   * an optional text comment on the attribution
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.String attributionComment;
  

  public java.lang.String getAttributionComment() {
    return attributionComment;
  }

  /**
   * Clear the attributionComment data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearAttributionComment() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * Nested property member
   *
   * <p>
   * the community member to which the attribution is made
   * </p>
   *
   * Added by AddToOneAssociationRequiredObjectProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: true
   */
  private org.tair.db.community.ICommunity member;
  

  public org.tair.db.community.ICommunity getMember() throws java.sql.SQLException {
    return member;
  }

  /**
   * Clear the member data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearMember() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  void setMember(org.tair.db.community.ICommunity member)
      throws com.poesys.db.InvalidParametersException {
    if (member == null) {
      throw new com.poesys.db.InvalidParametersException("member is required");
    }
    
    this.member = member;
    setChanged();
  }

  @Override
  public void update(com.poesys.db.dto.ISubject subject,
                     com.poesys.db.dao.DataEvent event)
      throws com.poesys.db.dto.DtoStatusException {
  }
}