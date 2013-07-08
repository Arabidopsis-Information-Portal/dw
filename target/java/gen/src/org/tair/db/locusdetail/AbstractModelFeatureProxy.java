/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDbDtoProxy.vsl

package org.tair.db.locusdetail;


import com.poesys.db.dto.AbstractLazyLoadingDtoProxy;


/**
 * <p>
 * A data-access layer data-transfer object (DTO) lazy-loading proxy for the 
 * ModelFeature. This class is an abstract class that contains AndroMDA 
 * generated code; change nothing in this class. Instead, override any methods 
 * in the concrete subclass generated in the same package. AndroMDA will 
 * overwrite this class each time you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * A gene feature (orf, intron, exon, cdr, 5', 3') of a gene model of a locus,
 * including UTR and CDS information; each object is identified by the locus, the
 * gene model, the feature type (intron/exon), and the feature number (the order of
 * the feature within the region); the n features of each type are ordered by the
 * feature numbers from the 5' end (1) to the 3' end (n), starting with exon 1.
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractModelFeatureProxy extends AbstractLazyLoadingDtoProxy implements IModelFeature {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  // Lazy-loading query setter strategy nested classes for single-object associations
  
  /**
   * Create a ModelFeatureProxy. The concrete subclass must call this constructor.
   *
   * @param dto the DTO to proxy
   */
  public AbstractModelFeatureProxy(ModelFeature dto) {
    super(dto);

    // Setter arrays
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
  }

  @Override
  public boolean equals(Object obj) {
    AbstractModelFeatureProxy otherProxy = (AbstractModelFeatureProxy)obj;
    return ((ModelFeature)dto).equals(otherProxy.dto);
  }

  @Override
  public int hashCode() {
    return ((ModelFeature)dto).hashCode();
  }

  // Local properties (attributes, associations, and association classes)

  // Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddParentKeyAttributes
  public java.lang.String getGeneModelName() {
    return ((ModelFeature)dto).getGeneModelName();
  }

  // Source: AddNaturalKeyProperties + AddParentKeyAttributes + AddParentKeyAttributes
  public java.lang.Long getLocusTairObjectId() {
    return ((ModelFeature)dto).getLocusTairObjectId();
  }

  // Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
  public java.lang.String getFeatureType() {
    return ((ModelFeature)dto).getFeatureType();
  }

  // Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
  public java.lang.Integer getFeatureNumber() {
    return ((ModelFeature)dto).getFeatureNumber();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.Integer getStart() {
    return ((ModelFeature)dto).getStart();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.Integer getEnd() {
    return ((ModelFeature)dto).getEnd();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.Integer getAgiStart() {
    return ((ModelFeature)dto).getAgiStart();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.Integer getAgiEnd() {
    return ((ModelFeature)dto).getAgiEnd();
  }

  // Source: AddToOneAssociationRequiredObjectProperties
  public org.tair.db.locusdetail.ILocusGeneModel getGeneModel() {
    return ((ModelFeature)dto).getGeneModel();
  }

  public void markChildrenDeleted() throws com.poesys.db.dto.DtoStatusException {
  	((ModelFeature)dto).markChildrenDeleted();
  }
}