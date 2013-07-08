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
 * LocusGeneModelAnnotation. This class is an abstract class that contains AndroMDA 
 * generated code; change nothing in this class. Instead, override any methods 
 * in the concrete subclass generated in the same package. AndroMDA will 
 * overwrite this class each time you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * The link between a gene model of a locus and an annotation; one annotation may
 * annotate several gene models, and one gene model may have several annotations.
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractLocusGeneModelAnnotationProxy extends AbstractLazyLoadingDtoProxy implements ILocusGeneModelAnnotation {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  // Lazy-loading query setter strategy nested classes for single-object associations
  
  /**
   * Create a LocusGeneModelAnnotationProxy. The concrete subclass must call this constructor.
   *
   * @param dto the DTO to proxy
   */
  public AbstractLocusGeneModelAnnotationProxy(LocusGeneModelAnnotation dto) {
    super(dto);

    // Setter arrays
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
  }

  @Override
  public boolean equals(Object obj) {
    AbstractLocusGeneModelAnnotationProxy otherProxy = (AbstractLocusGeneModelAnnotationProxy)obj;
    return ((LocusGeneModelAnnotation)dto).equals(otherProxy.dto);
  }

  @Override
  public int hashCode() {
    return ((LocusGeneModelAnnotation)dto).hashCode();
  }

  // Local properties (attributes, associations, and association classes)

  // Source: AddAssociationKeyObjectProperties
  public org.tair.db.locusdetail.IAnnotation getAnnotation() {
    return ((LocusGeneModelAnnotation)dto).getAnnotation();
  }

  // Source: AddAssociationKeyObjectProperties
  public org.tair.db.locusdetail.ILocusGeneModel getModel() {
    return ((LocusGeneModelAnnotation)dto).getModel();
  }

  // Source: AddNaturalKeyProperties + AddAssociationKeyAttributeProperties
  public java.lang.String getCategory() {
    return ((LocusGeneModelAnnotation)dto).getCategory();
  }

  // Source: AddNaturalKeyProperties + AddAssociationKeyAttributeProperties
  public java.lang.String getEvidenceCode() {
    return ((LocusGeneModelAnnotation)dto).getEvidenceCode();
  }

  // Source: AddNaturalKeyProperties + AddAssociationKeyAttributeProperties
  public java.lang.String getEvidenceWith() {
    return ((LocusGeneModelAnnotation)dto).getEvidenceWith();
  }

  // Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddAssociationKeyAttributeProperties
  public java.lang.String getGeneModelName() {
    return ((LocusGeneModelAnnotation)dto).getGeneModelName();
  }

  // Source: AddNaturalKeyProperties + AddAssociationKeyAttributeProperties
  public java.lang.String getKeyword() {
    return ((LocusGeneModelAnnotation)dto).getKeyword();
  }

  // Source: AddNaturalKeyProperties + AddParentKeyAttributes + AddAssociationKeyAttributeProperties
  public java.lang.Long getLocusTairObjectId() {
    return ((LocusGeneModelAnnotation)dto).getLocusTairObjectId();
  }

  // Source: AddNaturalKeyProperties + AddAssociationKeyAttributeProperties
  public java.lang.String getReference() {
    return ((LocusGeneModelAnnotation)dto).getReference();
  }

  // Source: AddNaturalKeyProperties + AddAssociationKeyAttributeProperties
  public java.lang.String getRelationshipType() {
    return ((LocusGeneModelAnnotation)dto).getRelationshipType();
  }

  public void markChildrenDeleted() throws com.poesys.db.dto.DtoStatusException {
  	((LocusGeneModelAnnotation)dto).markChildrenDeleted();
  }
}