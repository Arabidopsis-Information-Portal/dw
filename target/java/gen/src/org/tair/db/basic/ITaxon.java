/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: IDbDto.vsl

package org.tair.db.basic;

import com.poesys.db.dto.IDbDto;

import com.poesys.db.dto.DtoStatusException;
import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer-object interface for the Taxon. 
 * The data-transfer-object class and proxy class implement this interface, as
 * does the business-layer data-transfer-object class.
 * </p>
 * <p>
 * The species identification for a set of loci
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>NaturalKey</li>
 *     <li>Persistent</li>
 * </ul>
 * <p>
 * Class is read/write: false
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public interface ITaxon extends IDbDto {

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
   * a unique identifier for the species taxon
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: taxonId
   * </p>
   * @return a java.lang.Long taxonId
   */
  public java.lang.Long getTaxonId();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the scientific genus name (collection of related species)
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: genus
   * </p>
   * @return a java.lang.String genus
   */
  public java.lang.String getGenus();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the scientific species name within the genus
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: species
   * </p>
   * @return a java.lang.String species
   */
  public java.lang.String getSpecies();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the common botanical or zoological name for the species
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: common
   * </p>
   * @return a java.lang.String common
   */
  public java.lang.String getCommon();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the set of genomic variant individuals that provide the genetic material for
   * sequencing a genome for a taxon
   * </p>
   * <p>
   * Added by AddToManyChildCollectionProperties
   * Owning DTO: SpeciesVariant
   * Owning package: org.tair.db.basic
   * Property prefix: variants
   * </p>
   * @return a java.util.Collection<org.tair.db.basic.ISpeciesVariant> variants
   */
  public java.util.Collection<org.tair.db.basic.ISpeciesVariant> getVariants();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false
}