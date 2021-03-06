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
 * A data-access layer data-transfer-object interface for the LocusGeneModelCdna. 
 * The data-transfer-object class and proxy class implement this interface, as
 * does the business-layer data-transfer-object class.
 * </p>
 * <p>
 * A complementary DNA (cDNA) sequence associated with the locus gene model. cDNA
 * is single-stranded DNA made in the laboratory from a messenger RNA template.
 * Biologists use this form of DNA as a probe in the structural mapping of a
 * chromosome.
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
public interface ILocusGeneModelCdna extends IDbDto {

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
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddParentKeyAttributes
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: geneModelName
   * </p>
   * @return a java.lang.String geneModelName
   */
  public java.lang.String getGeneModelName();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddParentKeyAttributes + AddParentKeyAttributes
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: locusTairObjectId
   * </p>
   * @return a java.lang.Long locusTairObjectId
   */
  public java.lang.Long getLocusTairObjectId();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the unique identifier for the cDNA
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: sequenceId
   * </p>
   * @return a java.lang.Long sequenceId
   */
  public java.lang.Long getSequenceId();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the sequence name
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: sequenceName
   * </p>
   * @return a java.lang.String sequenceName
   */
  public java.lang.String getSequenceName();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the unique identifier at any of the major international genomics data centers
   * for the cDNA sequence
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: icAccession
   * </p>
   * @return a java.lang.String icAccession
   */
  public java.lang.String getIcAccession();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the kind of vector associated with the cDNA:
   * </p>
   * <p>
   * BAC
   * </p>
   * <p>
   * BiBAC
   * </p>
   * <p>
   * P1
   * </p>
   * <p>
   * TAC
   * </p>
   * <p>
   * YAC
   * </p>
   * <p>
   * cosmid
   * </p>
   * <p>
   * lambda
   * </p>
   * <p>
   * plasmid
   * </p>
   * <p>
   * unknown
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: vectorType
   * </p>
   * @return a java.lang.String vectorType
   */
  public java.lang.String getVectorType();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * whether this cDNA is a "full-length" cDNA that contains the entire coding region
   * of the gene
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: fullLengthCds
   * </p>
   * @return a java.lang.Boolean fullLengthCds
   */
  public java.lang.Boolean getFullLengthCds();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the length of the cDNA sequence, unit is bp (base pairs)
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: length
   * </p>
   * @return a java.lang.Long length
   */
  public java.lang.Long getLength();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the starting position on the chromosome in unit bp (base pairs)
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: start
   * </p>
   * @return a java.lang.Long start
   */
  public java.lang.Long getStart();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the ending position on the chromosome in unit bp (base pairs)
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: end
   * </p>
   * @return a java.lang.Long end
   */
  public java.lang.Long getEnd();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the gene model to which the cDNA belongs
   * </p>
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties
   * Owning DTO: LocusGeneModel
   * Owning package: org.tair.db.locusdetail
   * Property prefix: geneModel
   * </p>
   * @return a org.tair.db.locusdetail.ILocusGeneModel geneModel
   */
  public org.tair.db.locusdetail.ILocusGeneModel getGeneModel();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the set of alternative names for the cDNA sequence
   * </p>
   * <p>
   * Added by AddToManyChildCollectionProperties
   * Owning DTO: LocusGeneModelCdnaAlias
   * Owning package: org.tair.db.locusdetail
   * Property prefix: aliases
   * </p>
   * @return a java.util.Collection<org.tair.db.locusdetail.ILocusGeneModelCdnaAlias> aliases
   */
  public java.util.Collection<org.tair.db.locusdetail.ILocusGeneModelCdnaAlias> getAliases();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: false
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false
}