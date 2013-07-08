/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: IDbDto.vsl

package org.tair.db.community;

import com.poesys.db.dto.IDbDto;

import org.tair.db.community.ICommunity;


/**
 * <p>
 * A data-access layer data-transfer-object interface for the Person. 
 * The data-transfer-object class and proxy class implement this interface, as
 * does the business-layer data-transfer-object class.
 * </p>
 * <p>
 * a person who is a member of the community
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
public interface IPerson extends IDbDto, ICommunity {
  

  /**
   * <p>
   * the person's login user name
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: userName
   * </p>
   * @return a java.lang.String userName
   */
  public java.lang.String getUserName();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the first name of the person
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: firstName
   * </p>
   * @return a java.lang.String firstName
   */
  public java.lang.String getFirstName();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the middle name of the person
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: middleName
   * </p>
   * @return a java.lang.String middleName
   */
  public java.lang.String getMiddleName();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the last name of the person
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: lastName
   * </p>
   * @return a java.lang.String lastName
   */
  public java.lang.String getLastName();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * an optional suffix for the person's name, such as Jr., III, and so on
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: suffix
   * </p>
   * @return a java.lang.String suffix
   */
  public java.lang.String getSuffix();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * a text description of the person's research interests
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: researchInterest
   * </p>
   * @return a java.lang.String researchInterest
   */
  public java.lang.String getResearchInterest();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the set of organizations to which a person belongs
   * </p>
   * <p>
   * Added by TransformToProperty + AddToManyAssociationCollectionProperties
   * Owning DTO: Organization
   * Owning package: org.tair.db.community
   * Property prefix: organizations
   * </p>
   * <p>
   * This property loads lazily on demand rather than when you first query the 
   * IPerson object.
   * </p>
   * @return a java.util.Collection<org.tair.db.community.IOrganization> organization
   * @throws java.sql.SQLException when the method can't get a SQL connection to 
   *                               load the property lazily
   */
  public java.util.Collection<org.tair.db.community.IOrganization> getOrganization() throws java.sql.SQLException;

  /**
   * Clear the organization so that it will lazily reload.
   */
  public void clearOrganization();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * Collection of association class objects (not the associated objects)
   * </p>
   * <p>
   * Added by AddAssociationClassCollectionProperties
   * Owning DTO: Affiliation
   * Owning package: org.tair.db.community
   * Property prefix: organizations
   * </p>
   * <p>
   * This property loads lazily on demand rather than when you first query the 
   * IPerson object.
   * </p>
   * @return a java.util.Collection<org.tair.db.community.IAffiliation> affiliation
   * @throws java.sql.SQLException when the method can't get a SQL connection to 
   *                               load the property lazily
   */
  public java.util.Collection<org.tair.db.community.IAffiliation> getAffiliation() throws java.sql.SQLException;

  /**
   * Clear the affiliation so that it will lazily reload.
   */
  public void clearAffiliation();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true
}