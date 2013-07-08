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
 * A data-access layer data-transfer-object interface for the CommunityAlias. 
 * The data-transfer-object class and proxy class implement this interface, as
 * does the business-layer data-transfer-object class.
 * </p>
 * 
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
public interface ICommunityAlias extends IDbDto {

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
   * an alternate name for the community member
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: alias
   * </p>
   * @return a java.lang.String alias
   */
  public java.lang.String getAlias();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the community member for which the alias is another name
   * </p>
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties
   * Owning DTO: Community
   * Owning package: org.tair.db.community
   * Property prefix: member
   * </p>
   * <p>
   * This property loads lazily on demand rather than when you first query the 
   * ICommunityAlias object.
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