/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: IDbDto.vsl

package org.tair.db.community;

import com.poesys.db.dto.IDbDto;

import com.poesys.db.dto.DtoStatusException;
import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer-object interface for the CommunityAttribution. 
 * The data-transfer-object class and proxy class implement this interface, as
 * does the business-layer data-transfer-object class.
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
public interface ICommunityAttribution extends IDbDto {

  boolean equals(Object arg0);

  int hashCode();

  /**
   * <p>
   * Mark any children of this DTO as deleted.
   * </p>
   *
   * @throws DtoStatusException when the child cannot be set to DELETED status
   */
  void markChildrenDeleted() throws DtoStatusException;

  IPrimaryKey getPrimaryKey();
  

  /**
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   * <p>
   * Added by AddGeneratedKeyProperties + AddParentKeyAttributes
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: ${property.prefix}
   * </p>
   * @return a java.math.BigInteger communityId
   */
  public java.math.BigInteger getCommunityId();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not true
// Read/Write property: false

  /**
   * <p>
   * the nature of the attribution, such as "submitted_by" or "available_from"; first
   * part of the ordering part of the primary sub-key
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: attributionType
   * </p>
   * @return a java.lang.String attributionType
   */
  public java.lang.String getAttributionType();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the name of the attributed object, such as the AGI number or the germplasm name;
   * if there is no name, this should contain some kind of descriptive text or
   * identifier that allows identification of the object;
   * </p>
   * <p>
   * second part of the ordering part of the primary sub-key
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: name
   * </p>
   * @return a java.lang.String name
   */
  public java.lang.String getName();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the unique TAIR identifier for the object being attributed to a community
   * member; used to link to the object page
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: tairObjectId
   * </p>
   * @return a java.lang.Long tairObjectId
   */
  public java.lang.Long getTairObjectId();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the date of the attribution
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: attributionDate
   * </p>
   * @return a java.sql.Timestamp attributionDate
   */
  public java.sql.Timestamp getAttributionDate();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * an optional text comment on the attribution
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: attributionComment
   * </p>
   * @return a java.lang.String attributionComment
   */
  public java.lang.String getAttributionComment();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the community member to which the attribution is made
   * </p>
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties
   * Owning DTO: Community
   * Owning package: org.tair.db.community
   * Property prefix: member
   * </p>
   * <p>
   * This property loads lazily on demand rather than when you first query the 
   * ICommunityAttribution object.
   * </p>
   * @return a org.tair.db.community.ICommunity member
   * @throws java.sql.SQLException when the method can't get a SQL connection to 
   *                               load the property lazily
   */
  public org.tair.db.community.ICommunity getMember() throws java.sql.SQLException;

  /**
   * Clear the member so that it will lazily reload.
   */
  public void clearMember();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false
}