/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: IDbDto.vsl

package org.tair.db.locusdetail;

import com.poesys.db.dto.IDbDto;

import com.poesys.db.dto.DtoStatusException;
import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer-object interface for the LocusNaturalVariationEcotype. 
 * The data-transfer-object class and proxy class implement this interface, as
 * does the business-layer data-transfer-object class.
 * </p>
 * <p>
 * An ecotype that contains the natural variation polymorphism; this is in place of
 * a many-to-many link to SpeciesVariant, which extends beyond the subsystem
 * boundary and thus violates visibility rules
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
public interface ILocusNaturalVariationEcotype extends IDbDto {

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
   * Added by AddNaturalKeyProperties + AddParentKeyAttributes + AddInheritedKeyProperties + AddParentKeyAttributes
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: locusTairObjectId
   * </p>
   * @return a java.lang.Long locusTairObjectId
   */
  public java.lang.Long getLocusTairObjectId();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddInheritedKeyProperties + AddParentKeyAttributes
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: polymorphismName
   * </p>
   * @return a java.lang.String polymorphismName
   */
  public java.lang.String getPolymorphismName();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * Foreign key used as primary sub-key in composite
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + addExplicitSubkeyOnAssociation
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: accession
   * </p>
   * @return a java.lang.String accession
   */
  public java.lang.String getAccession();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * Foreign key used as primary sub-key in composite
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + addExplicitSubkeyOnAssociation
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: name
   * </p>
   * @return a java.lang.String name
   */
  public java.lang.String getName();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * Foreign key used as primary sub-key in composite
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddParentKeyAttributes + addExplicitSubkeyOnAssociation
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: taxonId
   * </p>
   * @return a java.lang.Long taxonId
   */
  public java.lang.Long getTaxonId();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * 
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties
   * Owning DTO: LocusNaturalVariation
   * Owning package: org.tair.db.locusdetail
   * Property prefix: polymorphism
   * </p>
   * @return a org.tair.db.locusdetail.ILocusNaturalVariation polymorphism
   */
  public org.tair.db.locusdetail.ILocusNaturalVariation getPolymorphism();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the polymorphism.
   * </p>
   *
   * @param polymorphism the value to set into the polymorphism
   * @throws com.poesys.db.InvalidParametersException when the polymorphism 
   *       value is null
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setPolymorphism(org.tair.db.locusdetail.ILocusNaturalVariation polymorphism) throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException;


  /**
   * <p>
   * the species variant that serves as the ecotype in the natural variation
   * polymorphism
   * </p>
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties
   * Owning DTO: SpeciesVariant
   * Owning package: org.tair.db.basic
   * Property prefix: ecotype
   * </p>
   * @return a org.tair.db.basic.ISpeciesVariant ecotype
   */
  public org.tair.db.basic.ISpeciesVariant getEcotype();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false
}