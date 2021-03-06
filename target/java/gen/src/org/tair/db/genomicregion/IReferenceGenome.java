/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: IDbDto.vsl

package org.tair.db.genomicregion;

import com.poesys.db.dto.IDbDto;

import com.poesys.db.dto.DtoStatusException;
import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer-object interface for the ReferenceGenome. 
 * The data-transfer-object class and proxy class implement this interface, as
 * does the business-layer data-transfer-object class.
 * </p>
 * <p>
 * SO_0001505: A collection of sequences (often chromosomes) taken as the standard
 * for a given organism and genome assembly
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>NaturalKey</li>
 *     <li>Persistent</li>
 * </ul>
 * <p>
 * Class is read/write: true
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public interface IReferenceGenome extends IDbDto {

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
   * the unique name for the reference genome, such as AGI or LYRATA
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: genome
   * </p>
   * @return a java.lang.String genome
   */
  public java.lang.String getGenome();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the date on which the map was entered into the source database
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: dateEntered
   * </p>
   * @return a java.sql.Timestamp dateEntered
   */
  public java.sql.Timestamp getDateEntered();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the dateEntered.
   * </p>
   *
   * @param dateEntered the value to set into the dateEntered
   * @throws com.poesys.db.InvalidParametersException when the dateEntered 
   *       value is null
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setDateEntered(java.sql.Timestamp dateEntered) throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException;


  /**
   * <p>
   * the taxon or species of the genome
   * </p>
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties
   * Owning DTO: Taxon
   * Owning package: org.tair.db.basic
   * Property prefix: taxon
   * </p>
   * @return a org.tair.db.basic.ITaxon taxon
   */
  public org.tair.db.basic.ITaxon getTaxon();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the taxon.
   * </p>
   *
   * @param taxon the value to set into the taxon
   * @throws com.poesys.db.InvalidParametersException when the taxon 
   *       value is null
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setTaxon(org.tair.db.basic.ITaxon taxon) throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException;


  /**
   * <p>
   * the species variant that contributed the genetic material for the genome
   * sequence
   * </p>
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties
   * Owning DTO: SpeciesVariant
   * Owning package: org.tair.db.basic
   * Property prefix: referenceVariant
   * </p>
   * @return a org.tair.db.basic.ISpeciesVariant referenceVariant
   */
  public org.tair.db.basic.ISpeciesVariant getReferenceVariant();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the referenceVariant.
   * </p>
   *
   * @param referenceVariant the value to set into the referenceVariant
   * @throws com.poesys.db.InvalidParametersException when the referenceVariant 
   *       value is null
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setReferenceVariant(org.tair.db.basic.ISpeciesVariant referenceVariant) throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException;


  /**
   * <p>
   * Foreign key used by setter to query associated object
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddToOneAssociationAttributeProperties
   * Owning DTO: Taxon
   * Owning package: org.tair.db.basic
   * Property prefix: taxon
   * </p>
   * @return a java.lang.Long taxonTaxonId
   */
  public java.lang.Long getTaxonTaxonId();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * Foreign key used by setter to query associated object
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddToOneAssociationAttributeProperties
   * Owning DTO: SpeciesVariant
   * Owning package: org.tair.db.basic
   * Property prefix: referenceVariant
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
   * Foreign key used by setter to query associated object
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddToOneAssociationAttributeProperties
   * Owning DTO: SpeciesVariant
   * Owning package: org.tair.db.basic
   * Property prefix: referenceVariant
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
   * Foreign key used by setter to query associated object
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddParentKeyAttributes + AddToOneAssociationAttributeProperties
   * Owning DTO: SpeciesVariant
   * Owning package: org.tair.db.basic
   * Property prefix: referenceVariant
   * </p>
   * @return a java.lang.Long referenceVariantTaxonId
   */
  public java.lang.Long getReferenceVariantTaxonId();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * 
   * <p>
   * Added by TransformToProperty + AddToManyAssociationCollectionProperties
   * Owning DTO: Region
   * Owning package: org.tair.db.genomicregion
   * Property prefix: regions
   * </p>
   * @return a java.util.Collection<org.tair.db.genomicregion.IRegion> regions
   */
  public java.util.Collection<org.tair.db.genomicregion.IRegion> getRegions();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the regions.
   * </p>
   *
   * @param regions the value to set into the regions
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setRegions(java.util.Collection<org.tair.db.genomicregion.IRegion> regions) throws com.poesys.db.dto.DtoStatusException;


  /**
   * Add a Region object to the regions collection.
   *
   * @param object the object to add to the collection
   */
  public void addRegionsRegion(org.tair.db.genomicregion.IRegion object);
}