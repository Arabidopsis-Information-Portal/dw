/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractBsDto.vsl


package org.tair.bs.locusdetail;


import com.poesys.bs.delegate.DelegateException;
import com.poesys.bs.dto.IDto;
import com.poesys.db.dto.DtoStatusException;
import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.dto.AbstractDto;


import org.tair.db.locusdetail.ILocusGeneModelCdna;
import org.tair.db.locusdetail.LocusGeneModelCdnaProxy;
import org.tair.db.locusdetail.LocusGeneModelCdna;


/**
 * <p>
 * A business layer data-transfer object (DTO) for the LocusGeneModelCdna. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
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
public abstract class AbstractBsLocusGeneModelCdna 
    extends AbstractDto<org.tair.db.locusdetail.ILocusGeneModelCdna> {

  /**
   * A Collection builder helper class for building a business-layer Collection 
   * of BsLocusGeneModelCdnaAlias objects from a Collection aliases of data-access-layer 
   * org.tair.db.locusdetail.ILocusGeneModelCdnaAlias objects
   */
  private class BsAliasesCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.db.locusdetail.ILocusGeneModelCdnaAlias, org.tair.bs.locusdetail.BsLocusGeneModelCdnaAlias> {
    @Override
    public org.tair.bs.locusdetail.BsLocusGeneModelCdnaAlias get(org.tair.db.locusdetail.ILocusGeneModelCdnaAlias dto) {
      return new org.tair.bs.locusdetail.BsLocusGeneModelCdnaAlias(dto);
    }
  }

  /**
   * A Collection builder helper class for building a data-access-layer Collection 
   * of LocusGeneModelCdnaAlias objects from an input Collection aliases of 
   * business-layer BsLocusGeneModelCdnaAlias objects
   */
  private class AliasesCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.bs.locusdetail.BsLocusGeneModelCdnaAlias, org.tair.db.locusdetail.ILocusGeneModelCdnaAlias> {
    @Override
    public org.tair.db.locusdetail.ILocusGeneModelCdnaAlias get(org.tair.bs.locusdetail.BsLocusGeneModelCdnaAlias dto) {
      return dto.toDto();
    }
  }

  /**
   * Create a BsLocusGeneModelCdna object from a LocusGeneModelCdna object.
   * 
   * @param dto the data-access layer LocusGeneModelCdna DTO
   * @throws DelegateException when there is a problem creating the LocusGeneModelCdna
   */
  public AbstractBsLocusGeneModelCdna(ILocusGeneModelCdna dto) throws DelegateException {
    super(dto);
  }

  /**
   * Create a LocusGeneModelCdna from new data.
   *
   * @param key the primary key of the LocusGeneModelCdna
   * @param geneModelName composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param sequenceId the unique identifier for the cDNA
   * @param sequenceName the sequence name
   * @param icAccession the unique identifier at any of the major international genomics data centers
for the cDNA sequence
   * @param vectorType the kind of vector associated with the cDNA:
BAC
BiBAC
P1
TAC
YAC
cosmid
lambda
plasmid
unknown
   * @param fullLengthCds whether this cDNA is a "full-length" cDNA that contains the entire coding region
of the gene
   * @param length the length of the cDNA sequence, unit is bp (base pairs)
   * @param start the starting position on the chromosome in unit bp (base pairs)
   * @param end the ending position on the chromosome in unit bp (base pairs)
   */
  public AbstractBsLocusGeneModelCdna(IPrimaryKey key, java.lang.String geneModelName, java.lang.Long locusTairObjectId, java.lang.Long sequenceId, java.lang.String sequenceName, java.lang.String icAccession, java.lang.String vectorType, java.lang.Boolean fullLengthCds, java.lang.Long length, java.lang.Long start, java.lang.Long end) {
    super(new LocusGeneModelCdnaProxy(new LocusGeneModelCdna(key, geneModelName, locusTairObjectId, sequenceId, sequenceName, icAccession, vectorType, fullLengthCds, length, start, end)));
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object arg0) {
    // Unchecked cast here
    IDto<ILocusGeneModelCdna> other = (IDto<ILocusGeneModelCdna>)arg0;
    return dto.equals(other.toDto());
  }

  @Override
  public int hashCode() {
    return dto.hashCode();
  }

  public int compareTo(IDto<ILocusGeneModelCdna> o) {
    return dto.compareTo(o.toDto());
  }

  public void markChildrenDeleted() throws DtoStatusException {
    dto.markChildrenDeleted();
  }
  
  public IPrimaryKey getPrimaryKey() {
    return dto.getPrimaryKey();
  }

  // Data member properties

  /**
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddParentKeyAttributes as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocusGeneModelCdna</li>
   * </ul>
   * </p>
   * @return a java.lang.String geneModelName
   */
  public java.lang.String getGeneModelName() {
    return dto.getGeneModelName();
  }

  /**
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddParentKeyAttributes + AddParentKeyAttributes as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocusGeneModelCdna</li>
   * </ul>
   * </p>
   * @return a java.lang.Long locusTairObjectId
   */
  public java.lang.Long getLocusTairObjectId() {
    return dto.getLocusTairObjectId();
  }

  /**
   * <p>
   * the unique identifier for the cDNA
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocusGeneModelCdna</li>
   * </ul>
   * </p>
   * @return a java.lang.Long sequenceId
   */
  public java.lang.Long getSequenceId() {
    return dto.getSequenceId();
  }

  /**
   * <p>
   * the sequence name
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocusGeneModelCdna</li>
   * </ul>
   * </p>
   * @return a java.lang.String sequenceName
   */
  public java.lang.String getSequenceName() {
    return dto.getSequenceName();
  }

  /**
   * <p>
   * the unique identifier at any of the major international genomics data centers
   * for the cDNA sequence
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocusGeneModelCdna</li>
   * </ul>
   * </p>
   * @return a java.lang.String icAccession
   */
  public java.lang.String getIcAccession() {
    return dto.getIcAccession();
  }

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
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocusGeneModelCdna</li>
   * </ul>
   * </p>
   * @return a java.lang.String vectorType
   */
  public java.lang.String getVectorType() {
    return dto.getVectorType();
  }

  /**
   * <p>
   * whether this cDNA is a "full-length" cDNA that contains the entire coding region
   * of the gene
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocusGeneModelCdna</li>
   * </ul>
   * </p>
   * @return a java.lang.Boolean fullLengthCds
   */
  public java.lang.Boolean getFullLengthCds() {
    return dto.getFullLengthCds();
  }

  /**
   * <p>
   * the length of the cDNA sequence, unit is bp (base pairs)
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocusGeneModelCdna</li>
   * </ul>
   * </p>
   * @return a java.lang.Long length
   */
  public java.lang.Long getLength() {
    return dto.getLength();
  }

  /**
   * <p>
   * the starting position on the chromosome in unit bp (base pairs)
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocusGeneModelCdna</li>
   * </ul>
   * </p>
   * @return a java.lang.Long start
   */
  public java.lang.Long getStart() {
    return dto.getStart();
  }

  /**
   * <p>
   * the ending position on the chromosome in unit bp (base pairs)
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocusGeneModelCdna</li>
   * </ul>
   * </p>
   * @return a java.lang.Long end
   */
  public java.lang.Long getEnd() {
    return dto.getEnd();
  }

  /**
   * <p>
   * the gene model to which the cDNA belongs
   * </p>
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocusGeneModelCdna</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.locusdetail.BsLocusGeneModel geneModel
   */
  public org.tair.bs.locusdetail.BsLocusGeneModel getGeneModel() {
    // Return 4
    return new org.tair.bs.locusdetail.BsLocusGeneModel(dto.getGeneModel());
  }

  /**
   * <p>
   * the set of alternative names for the cDNA sequence
   * </p>
   * <p>
   * Added by AddToManyChildCollectionProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object LocusGeneModelCdna</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.locusdetail.BsLocusGeneModelCdnaAlias aliases
   */
  public java.util.Collection<org.tair.bs.locusdetail.BsLocusGeneModelCdnaAlias> getAliases() {
    BsAliasesCollectionBuilder builder = new BsAliasesCollectionBuilder();
    return builder.getCollection(dto.getAliases());
  }
}