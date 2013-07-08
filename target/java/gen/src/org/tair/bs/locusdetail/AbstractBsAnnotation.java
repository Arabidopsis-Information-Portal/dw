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


import org.tair.db.locusdetail.IAnnotation;
import org.tair.db.locusdetail.AnnotationProxy;
import org.tair.db.locusdetail.Annotation;


/**
 * <p>
 * A business layer data-transfer object (DTO) for the Annotation. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * A unique combination of category, relationship type, keyword, evidence code,
 * evidence description, evidence-with, and reference that constitutes a functional
 * annotation of a genomic object such as a locus or gene model
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
public abstract class AbstractBsAnnotation 
    extends AbstractDto<org.tair.db.locusdetail.IAnnotation> {

  /**
   * A Collection builder helper class for building a business-layer Collection 
   * of BsLocusGeneModel objects from a Collection model of data-access-layer 
   * org.tair.db.locusdetail.ILocusGeneModel objects
   */
  private class BsModelCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.db.locusdetail.ILocusGeneModel, org.tair.bs.locusdetail.BsLocusGeneModel> {
    @Override
    public org.tair.bs.locusdetail.BsLocusGeneModel get(org.tair.db.locusdetail.ILocusGeneModel dto) {
      return new org.tair.bs.locusdetail.BsLocusGeneModel(dto);
    }
  }

  /**
   * A Collection builder helper class for building a data-access-layer Collection 
   * of LocusGeneModel objects from an input Collection model of 
   * business-layer BsLocusGeneModel objects
   */
  private class ModelCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.bs.locusdetail.BsLocusGeneModel, org.tair.db.locusdetail.ILocusGeneModel> {
    @Override
    public org.tair.db.locusdetail.ILocusGeneModel get(org.tair.bs.locusdetail.BsLocusGeneModel dto) {
      return dto.toDto();
    }
  }

  /**
   * A Collection builder helper class for building a business-layer Collection 
   * of BsLocusDetail objects from a Collection locus of data-access-layer 
   * org.tair.db.locusdetail.ILocusDetail objects
   */
  private class BsLocusCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.db.locusdetail.ILocusDetail, org.tair.bs.locusdetail.BsLocusDetail> {
    @Override
    public org.tair.bs.locusdetail.BsLocusDetail get(org.tair.db.locusdetail.ILocusDetail dto) {
      return new org.tair.bs.locusdetail.BsLocusDetail(dto);
    }
  }

  /**
   * A Collection builder helper class for building a data-access-layer Collection 
   * of LocusDetail objects from an input Collection locus of 
   * business-layer BsLocusDetail objects
   */
  private class LocusCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.bs.locusdetail.BsLocusDetail, org.tair.db.locusdetail.ILocusDetail> {
    @Override
    public org.tair.db.locusdetail.ILocusDetail get(org.tair.bs.locusdetail.BsLocusDetail dto) {
      return dto.toDto();
    }
  }

  /**
   * A Collection builder helper class for building a business-layer Collection 
   * of BsLocusGeneModelAnnotation objects from a Collection locusGeneModelAnnotation of data-access-layer 
   * org.tair.db.locusdetail.ILocusGeneModelAnnotation objects
   */
  private class BsLocusGeneModelAnnotationCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.db.locusdetail.ILocusGeneModelAnnotation, org.tair.bs.locusdetail.BsLocusGeneModelAnnotation> {
    @Override
    public org.tair.bs.locusdetail.BsLocusGeneModelAnnotation get(org.tair.db.locusdetail.ILocusGeneModelAnnotation dto) {
      return new org.tair.bs.locusdetail.BsLocusGeneModelAnnotation(dto);
    }
  }

  /**
   * A Collection builder helper class for building a data-access-layer Collection 
   * of LocusGeneModelAnnotation objects from an input Collection locusGeneModelAnnotation of 
   * business-layer BsLocusGeneModelAnnotation objects
   */
  private class LocusGeneModelAnnotationCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.bs.locusdetail.BsLocusGeneModelAnnotation, org.tair.db.locusdetail.ILocusGeneModelAnnotation> {
    @Override
    public org.tair.db.locusdetail.ILocusGeneModelAnnotation get(org.tair.bs.locusdetail.BsLocusGeneModelAnnotation dto) {
      return dto.toDto();
    }
  }

  /**
   * A Collection builder helper class for building a business-layer Collection 
   * of BsLocusAnnotation objects from a Collection locusAnnotation of data-access-layer 
   * org.tair.db.locusdetail.ILocusAnnotation objects
   */
  private class BsLocusAnnotationCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.db.locusdetail.ILocusAnnotation, org.tair.bs.locusdetail.BsLocusAnnotation> {
    @Override
    public org.tair.bs.locusdetail.BsLocusAnnotation get(org.tair.db.locusdetail.ILocusAnnotation dto) {
      return new org.tair.bs.locusdetail.BsLocusAnnotation(dto);
    }
  }

  /**
   * A Collection builder helper class for building a data-access-layer Collection 
   * of LocusAnnotation objects from an input Collection locusAnnotation of 
   * business-layer BsLocusAnnotation objects
   */
  private class LocusAnnotationCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.bs.locusdetail.BsLocusAnnotation, org.tair.db.locusdetail.ILocusAnnotation> {
    @Override
    public org.tair.db.locusdetail.ILocusAnnotation get(org.tair.bs.locusdetail.BsLocusAnnotation dto) {
      return dto.toDto();
    }
  }

  /**
   * Create a BsAnnotation object from a Annotation object.
   * 
   * @param dto the data-access layer Annotation DTO
   * @throws DelegateException when there is a problem creating the Annotation
   */
  public AbstractBsAnnotation(IAnnotation dto) throws DelegateException {
    super(dto);
  }

  /**
   * Create a Annotation from new data.
   *
   * @param key the primary key of the Annotation
   * @param category The kind of keyword (GO Biological Process, GO Cellular Component, GO Molecular
Function, Interaction, Expression, Growth and Developmental Stages, Plant
Structure)
   * @param relationshipType The kind of relationship between a locus and a keyword (such as involved in,
located in, functions in, has, not expressed during, or expressed in)
   * @param keyword the keyword associated with the locus (such as nucleus, glucose mediated
signaling pathway, or dry seed stage)
   * @param evidenceCode the standard three-letter code that indicates the kind of evidence association
with the annotation, such as IEA (inferred from electronic annotation) or IDA
(inferred from direct assay).
   * @param evidenceWith information associated with the evidence, such as an affected protein or gene
   * @param reference the reference (publication, communication, etc.) from which the annotation
comes; this is a textual version of the reference used for display
   * @param keywordId the unique identifier for the keyword; used in the URL that links to the keyword
   * @param ontologyId the unique identifier from the ontology for the keyword, such as GO:123456
   * @param evidenceDescription a textual description of the specific evidentiary technique used to provide
evidence for the annotation to the object
   * @param evidenceId unique identifier for the evidence code/description combination ("evidence");
used in the URL that displays the full page for the evidence
   * @param referenceId the unique reference identifier; used in a URL to link to the reference
information
   * @param annotatedBy the community member responsible for the annotation
   */
  public AbstractBsAnnotation(IPrimaryKey key, java.lang.String category, java.lang.String relationshipType, java.lang.String keyword, java.lang.String evidenceCode, java.lang.String evidenceWith, java.lang.String reference, java.lang.Long keywordId, java.lang.String ontologyId, java.lang.String evidenceDescription, java.lang.Long evidenceId, java.lang.Long referenceId, java.lang.String annotatedBy) {
    super(new AnnotationProxy(new Annotation(key, category, relationshipType, keyword, evidenceCode, evidenceWith, reference, keywordId, ontologyId, evidenceDescription, evidenceId, referenceId, annotatedBy)));
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object arg0) {
    // Unchecked cast here
    IDto<IAnnotation> other = (IDto<IAnnotation>)arg0;
    return dto.equals(other.toDto());
  }

  @Override
  public int hashCode() {
    return dto.hashCode();
  }

  public int compareTo(IDto<IAnnotation> o) {
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
   * The kind of keyword (GO Biological Process, GO Cellular Component, GO Molecular
   * Function, Interaction, Expression, Growth and Developmental Stages, Plant
   * Structure)
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Annotation</li>
   * </ul>
   * </p>
   * @return a java.lang.String category
   */
  public java.lang.String getCategory() {
    return dto.getCategory();
  }

  /**
   * <p>
   * The kind of relationship between a locus and a keyword (such as involved in,
   * located in, functions in, has, not expressed during, or expressed in)
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Annotation</li>
   * </ul>
   * </p>
   * @return a java.lang.String relationshipType
   */
  public java.lang.String getRelationshipType() {
    return dto.getRelationshipType();
  }

  /**
   * <p>
   * the keyword associated with the locus (such as nucleus, glucose mediated
   * signaling pathway, or dry seed stage)
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Annotation</li>
   * </ul>
   * </p>
   * @return a java.lang.String keyword
   */
  public java.lang.String getKeyword() {
    return dto.getKeyword();
  }

  /**
   * <p>
   * the standard three-letter code that indicates the kind of evidence association
   * with the annotation, such as IEA (inferred from electronic annotation) or IDA
   * (inferred from direct assay).
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Annotation</li>
   * </ul>
   * </p>
   * @return a java.lang.String evidenceCode
   */
  public java.lang.String getEvidenceCode() {
    return dto.getEvidenceCode();
  }

  /**
   * <p>
   * information associated with the evidence, such as an affected protein or gene
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Annotation</li>
   * </ul>
   * </p>
   * @return a java.lang.String evidenceWith
   */
  public java.lang.String getEvidenceWith() {
    return dto.getEvidenceWith();
  }

  /**
   * <p>
   * the reference (publication, communication, etc.) from which the annotation
   * comes; this is a textual version of the reference used for display
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Annotation</li>
   * </ul>
   * </p>
   * @return a java.lang.String reference
   */
  public java.lang.String getReference() {
    return dto.getReference();
  }

  /**
   * <p>
   * the unique identifier for the keyword; used in the URL that links to the keyword
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Annotation</li>
   * </ul>
   * </p>
   * @return a java.lang.Long keywordId
   */
  public java.lang.Long getKeywordId() {
    return dto.getKeywordId();
  }

  /**
   * <p>
   * the unique identifier from the ontology for the keyword, such as GO:123456
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Annotation</li>
   * </ul>
   * </p>
   * @return a java.lang.String ontologyId
   */
  public java.lang.String getOntologyId() {
    return dto.getOntologyId();
  }

  /**
   * <p>
   * a textual description of the specific evidentiary technique used to provide
   * evidence for the annotation to the object
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Annotation</li>
   * </ul>
   * </p>
   * @return a java.lang.String evidenceDescription
   */
  public java.lang.String getEvidenceDescription() {
    return dto.getEvidenceDescription();
  }

  /**
   * <p>
   * unique identifier for the evidence code/description combination ("evidence");
   * used in the URL that displays the full page for the evidence
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Annotation</li>
   * </ul>
   * </p>
   * @return a java.lang.Long evidenceId
   */
  public java.lang.Long getEvidenceId() {
    return dto.getEvidenceId();
  }

  /**
   * <p>
   * the unique reference identifier; used in a URL to link to the reference
   * information
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Annotation</li>
   * </ul>
   * </p>
   * @return a java.lang.Long referenceId
   */
  public java.lang.Long getReferenceId() {
    return dto.getReferenceId();
  }

  /**
   * <p>
   * the community member responsible for the annotation
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Annotation</li>
   * </ul>
   * </p>
   * @return a java.lang.String annotatedBy
   */
  public java.lang.String getAnnotatedBy() {
    return dto.getAnnotatedBy();
  }

  /**
   * <p>
   * the set of annotated gene models for the annotation
   * </p>
   * <p>
   * Added by TransformToProperty + AddToManyAssociationCollectionProperties as data member
   * </p>
   * <p>
   * This property loads lazily on demand the first time you call this method,
   * not when you instantiate the BsAnnotation object.
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Annotation</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.locusdetail.BsLocusGeneModel model
   * @throws java.sql.SQLException when the method can't get a SQL connection to 
   *                               load the property lazily
   */
  public java.util.Collection<org.tair.bs.locusdetail.BsLocusGeneModel> getModel() throws java.sql.SQLException {
    BsModelCollectionBuilder builder = new BsModelCollectionBuilder();
    return builder.getCollection(dto.getModel());
  }

  /**
   * <p>
   * the set of loci associated with the annotation
   * </p>
   * <p>
   * Added by TransformToProperty + AddToManyAssociationCollectionProperties as data member
   * </p>
   * <p>
   * This property loads lazily on demand the first time you call this method,
   * not when you instantiate the BsAnnotation object.
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Annotation</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.locusdetail.BsLocusDetail locus
   * @throws java.sql.SQLException when the method can't get a SQL connection to 
   *                               load the property lazily
   */
  public java.util.Collection<org.tair.bs.locusdetail.BsLocusDetail> getLocus() throws java.sql.SQLException {
    BsLocusCollectionBuilder builder = new BsLocusCollectionBuilder();
    return builder.getCollection(dto.getLocus());
  }

  /**
   * <p>
   * Collection of association class objects (not the associated objects)
   * </p>
   * <p>
   * Added by AddAssociationClassCollectionProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Annotation</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.locusdetail.BsLocusGeneModelAnnotation locusGeneModelAnnotation
   */
  public java.util.Collection<org.tair.bs.locusdetail.BsLocusGeneModelAnnotation> getLocusGeneModelAnnotation() {
    BsLocusGeneModelAnnotationCollectionBuilder builder = new BsLocusGeneModelAnnotationCollectionBuilder();
    return builder.getCollection(dto.getLocusGeneModelAnnotation());
  }

  /**
   * <p>
   * Collection of association class objects (not the associated objects)
   * </p>
   * <p>
   * Added by AddAssociationClassCollectionProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Annotation</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.locusdetail.BsLocusAnnotation locusAnnotation
   */
  public java.util.Collection<org.tair.bs.locusdetail.BsLocusAnnotation> getLocusAnnotation() {
    BsLocusAnnotationCollectionBuilder builder = new BsLocusAnnotationCollectionBuilder();
    return builder.getCollection(dto.getLocusAnnotation());
  }
}