/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractBsDto.vsl


package org.tair.bs.locusdetail;


import com.poesys.bs.delegate.DelegateException;
import com.poesys.bs.dto.IDto;
import com.poesys.db.dto.DtoStatusException;
import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.dto.AbstractDto;


import org.tair.db.locusdetail.IModelFeatures;
import org.tair.db.locusdetail.ModelFeaturesProxy;
import org.tair.db.locusdetail.ModelFeatures;


/**
 * <p>
 * A business layer data-transfer object (DTO) for the ModelFeatures. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * The coordinates for gene features (exons and introns) of a gene model of a
 * locus, including UTR and CDS information; each coordinates object is identified
 * by the locus, the gene model, the feature type (intron/exon), and the feature
 * number (the order of the feature within the region); the n features of each type
 * are ordered by the feature numbers from the 5' end (1) to the 3' end (n),
 * starting with exon 1.
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
public abstract class AbstractBsModelFeatures 
    extends AbstractDto<org.tair.db.locusdetail.IModelFeatures> {

  /**
   * Create a BsModelFeatures object from a ModelFeatures object.
   * 
   * @param dto the data-access layer ModelFeatures DTO
   * @throws DelegateException when there is a problem creating the ModelFeatures
   */
  public AbstractBsModelFeatures(IModelFeatures dto) throws DelegateException {
    super(dto);
  }

  /**
   * Create a ModelFeatures from new data.
   *
   * @param key the primary key of the ModelFeatures
   * @param geneModelName composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param featureType the kind of feature: intron or exon
   * @param featureNumber an integer that uniquely identifies the feature within the locus, gene model,
and feature type; also orders the feature within the feature type
   * @param start the starting coordinate for the feature within the gene
   * @param end the ending coordinate for the feature within the gene
   * @param agiStart the starting coordinate for the feature on the chromosome
   * @param agiEnd the ending coordinate of the feature on the chromosome
   */
  public AbstractBsModelFeatures(IPrimaryKey key, java.lang.String geneModelName, java.lang.Long locusTairObjectId, java.lang.String featureType, java.lang.Integer featureNumber, java.lang.Integer start, java.lang.Integer end, java.lang.Integer agiStart, java.lang.Integer agiEnd) {
    super(new ModelFeaturesProxy(new ModelFeatures(key, geneModelName, locusTairObjectId, featureType, featureNumber, start, end, agiStart, agiEnd)));
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object arg0) {
    // Unchecked cast here
    IDto<IModelFeatures> other = (IDto<IModelFeatures>)arg0;
    return dto.equals(other.toDto());
  }

  @Override
  public int hashCode() {
    return dto.hashCode();
  }

  public int compareTo(IDto<IModelFeatures> o) {
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
   * <li>Property is defined in the data-access object ModelFeatures</li>
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
   * <li>Property is defined in the data-access object ModelFeatures</li>
   * </ul>
   * </p>
   * @return a java.lang.Long locusTairObjectId
   */
  public java.lang.Long getLocusTairObjectId() {
    return dto.getLocusTairObjectId();
  }

  /**
   * <p>
   * the kind of feature: intron or exon
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object ModelFeatures</li>
   * </ul>
   * </p>
   * @return a java.lang.String featureType
   */
  public java.lang.String getFeatureType() {
    return dto.getFeatureType();
  }

  /**
   * <p>
   * an integer that uniquely identifies the feature within the locus, gene model,
   * and feature type; also orders the feature within the feature type
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object ModelFeatures</li>
   * </ul>
   * </p>
   * @return a java.lang.Integer featureNumber
   */
  public java.lang.Integer getFeatureNumber() {
    return dto.getFeatureNumber();
  }

  /**
   * <p>
   * the starting coordinate for the feature within the gene
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object ModelFeatures</li>
   * </ul>
   * </p>
   * @return a java.lang.Integer start
   */
  public java.lang.Integer getStart() {
    return dto.getStart();
  }

  /**
   * <p>
   * the ending coordinate for the feature within the gene
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object ModelFeatures</li>
   * </ul>
   * </p>
   * @return a java.lang.Integer end
   */
  public java.lang.Integer getEnd() {
    return dto.getEnd();
  }

  /**
   * <p>
   * the starting coordinate for the feature on the chromosome
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object ModelFeatures</li>
   * </ul>
   * </p>
   * @return a java.lang.Integer agiStart
   */
  public java.lang.Integer getAgiStart() {
    return dto.getAgiStart();
  }

  /**
   * <p>
   * the ending coordinate of the feature on the chromosome
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object ModelFeatures</li>
   * </ul>
   * </p>
   * @return a java.lang.Integer agiEnd
   */
  public java.lang.Integer getAgiEnd() {
    return dto.getAgiEnd();
  }

  /**
   * <p>
   * the gene model to which the feature belongs
   * </p>
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object ModelFeatures</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.locusdetail.BsLocusGeneModel geneModel
   */
  public org.tair.bs.locusdetail.BsLocusGeneModel getGeneModel() {
    // Return 4
    return new org.tair.bs.locusdetail.BsLocusGeneModel(dto.getGeneModel());
  }
}