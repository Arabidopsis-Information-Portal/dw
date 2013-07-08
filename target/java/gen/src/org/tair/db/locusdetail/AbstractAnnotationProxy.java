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
 * Annotation. This class is an abstract class that contains AndroMDA 
 * generated code; change nothing in this class. Instead, override any methods 
 * in the concrete subclass generated in the same package. AndroMDA will 
 * overwrite this class each time you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * A unique combination of category, relationship type, keyword, evidence code,
 * evidence description, evidence-with, and reference that constitutes a functional
 * annotation of a genomic object such as a locus or gene model
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractAnnotationProxy extends AbstractLazyLoadingDtoProxy implements IAnnotation {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;
  
    // Setter strategy nested classes for multiple-object associations

  /** Flag indicating whether the model property has been loaded */
  boolean modelLoaded = false;

  /**
   * Query setter for lazily querying nested model collection
   * Source: TransformToProperty + AddToManyAssociationCollectionProperties
   *
   * @see org.tair.db.locusdetail.sql.QueryModelByAnnotation
   */
  private class QueryModelSetter 
      extends com.poesys.db.dto.AbstractLazyListSetter<org.tair.db.locusdetail.ILocusGeneModel, IAnnotation, java.util.Collection<org.tair.db.locusdetail.ILocusGeneModel>> {
    /** Serial version UID for Serializable object */
    private static final long serialVersionUID = 1L;
    private static final int FETCH_SIZE = 10;

    /**
     * Create a QueryModelSetter object.
     */
    public QueryModelSetter() {
      super("org.tair.db.locusdetail", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.locusdetail.LocusGeneModel.class.getName();
    }

    @Override
    protected int getFetchSize() {
      return FETCH_SIZE;
    }

    @Override
    protected IAnnotation getParametersDto() {
      return AbstractAnnotationProxy.this;
    }

    @Override
    protected com.poesys.db.dao.query.IParameterizedQuerySql<org.tair.db.locusdetail.ILocusGeneModel, IAnnotation> getSql() {
      return new org.tair.db.locusdetail.sql.QueryModelByAnnotation();
    }

    @Override
    protected void set(java.util.Collection<org.tair.db.locusdetail.ILocusGeneModel> collection) {
      try {
        // Register the observer parent with the subject children.
        for (org.tair.db.locusdetail.ILocusGeneModel child : collection) {
          child.attach(AbstractAnnotationProxy.this.dto,
                              com.poesys.db.dao.DataEvent.MARKED_DELETED);
          child.attach(AbstractAnnotationProxy.this.dto, com.poesys.db.dao.DataEvent.DELETE);
        }
        setModel(collection);
      } catch (com.poesys.db.dto.DtoStatusException e) {
        // Just lazy loading here, not actually setting. Ignore this exception.        
      }
    }

    @Override
    public boolean isSet() {
      // Set if proxy has loaded model
      return modelLoaded;
    }
  }


  /**
   * Read-Object setter for de-serializing nested model collection
   *
   * Source: TransformToProperty + AddToManyAssociationCollectionProperties
   *
   * @see org.tair.db.locusdetail.sql.QueryLocusGeneModel
   */
  private class ReadModelSetter 
      extends com.poesys.db.dto.AbstractCollectionReadSetter<org.tair.db.locusdetail.ILocusGeneModel> {
    private static final long serialVersionUID = 1L;

    /**
     * Create a ReadModelSetter object to read the model collection.
     */
    public ReadModelSetter() {
      super("org.tair.db.locusdetail", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.locusdetail.LocusGeneModel.class.getName();
    }

    @Override
    protected java.util.Collection<org.tair.db.locusdetail.ILocusGeneModel> getObjectCollection() {
      java.util.Collection<org.tair.db.locusdetail.ILocusGeneModel> model = null;
      try {
        model = ((org.tair.db.locusdetail.Annotation)dto).getModel();
      } catch (java.sql.SQLException e) {
        throw new RuntimeException("SQL Exception on collection query: " + e.getMessage(), e);
      }
      return model;
    }

    @Override
    protected java.util.List<com.poesys.db.pk.IPrimaryKey> getPrimaryKeys() {
      return ((org.tair.db.locusdetail.Annotation)dto).modelKeys;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.tair.db.locusdetail.ILocusGeneModel> getSql() {
      return new org.tair.db.locusdetail.sql.QueryLocusGeneModel();
    }

    @Override
    protected void set(java.util.Collection<org.tair.db.locusdetail.ILocusGeneModel> collection) {
      ((org.tair.db.locusdetail.Annotation)dto).model = collection;
    }
  }

  

  /** Flag indicating whether the locus property has been loaded */
  boolean locusLoaded = false;

  /**
   * Query setter for lazily querying nested locus collection
   * Source: TransformToProperty + AddToManyAssociationCollectionProperties
   *
   * @see org.tair.db.locusdetail.sql.QueryLocusByAnnotation
   */
  private class QueryLocusSetter 
      extends com.poesys.db.dto.AbstractLazyListSetter<org.tair.db.locusdetail.ILocusDetail, IAnnotation, java.util.Collection<org.tair.db.locusdetail.ILocusDetail>> {
    /** Serial version UID for Serializable object */
    private static final long serialVersionUID = 1L;
    private static final int FETCH_SIZE = 10;

    /**
     * Create a QueryLocusSetter object.
     */
    public QueryLocusSetter() {
      super("org.tair.db.locusdetail", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.locusdetail.LocusDetail.class.getName();
    }

    @Override
    protected int getFetchSize() {
      return FETCH_SIZE;
    }

    @Override
    protected IAnnotation getParametersDto() {
      return AbstractAnnotationProxy.this;
    }

    @Override
    protected com.poesys.db.dao.query.IParameterizedQuerySql<org.tair.db.locusdetail.ILocusDetail, IAnnotation> getSql() {
      return new org.tair.db.locusdetail.sql.QueryLocusByAnnotation();
    }

    @Override
    protected void set(java.util.Collection<org.tair.db.locusdetail.ILocusDetail> collection) {
      try {
        // Register the observer parent with the subject children.
        for (org.tair.db.locusdetail.ILocusDetail child : collection) {
          child.attach(AbstractAnnotationProxy.this.dto,
                              com.poesys.db.dao.DataEvent.MARKED_DELETED);
          child.attach(AbstractAnnotationProxy.this.dto, com.poesys.db.dao.DataEvent.DELETE);
        }
        setLocus(collection);
      } catch (com.poesys.db.dto.DtoStatusException e) {
        // Just lazy loading here, not actually setting. Ignore this exception.        
      }
    }

    @Override
    public boolean isSet() {
      // Set if proxy has loaded locus
      return locusLoaded;
    }
  }


  /**
   * Read-Object setter for de-serializing nested locus collection
   *
   * Source: TransformToProperty + AddToManyAssociationCollectionProperties
   *
   * @see org.tair.db.locusdetail.sql.QueryLocusDetail
   */
  private class ReadLocusSetter 
      extends com.poesys.db.dto.AbstractCollectionReadSetter<org.tair.db.locusdetail.ILocusDetail> {
    private static final long serialVersionUID = 1L;

    /**
     * Create a ReadLocusSetter object to read the locus collection.
     */
    public ReadLocusSetter() {
      super("org.tair.db.locusdetail", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.locusdetail.LocusDetail.class.getName();
    }

    @Override
    protected java.util.Collection<org.tair.db.locusdetail.ILocusDetail> getObjectCollection() {
      java.util.Collection<org.tair.db.locusdetail.ILocusDetail> locus = null;
      try {
        locus = ((org.tair.db.locusdetail.Annotation)dto).getLocus();
      } catch (java.sql.SQLException e) {
        throw new RuntimeException("SQL Exception on collection query: " + e.getMessage(), e);
      }
      return locus;
    }

    @Override
    protected java.util.List<com.poesys.db.pk.IPrimaryKey> getPrimaryKeys() {
      return ((org.tair.db.locusdetail.Annotation)dto).locusKeys;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.tair.db.locusdetail.ILocusDetail> getSql() {
      return new org.tair.db.locusdetail.sql.QueryLocusDetail();
    }

    @Override
    protected void set(java.util.Collection<org.tair.db.locusdetail.ILocusDetail> collection) {
      ((org.tair.db.locusdetail.Annotation)dto).locus = collection;
    }
  }



  /**
   * Read-Object setter for de-serializing nested locusGeneModelAnnotation collection
   *
   * Source: AddAssociationClassCollectionProperties
   *
   * @see org.tair.db.locusdetail.sql.QueryLocusGeneModelAnnotation
   */
  private class ReadLocusGeneModelAnnotationSetter 
      extends com.poesys.db.dto.AbstractCollectionReadSetter<org.tair.db.locusdetail.ILocusGeneModelAnnotation> {
    private static final long serialVersionUID = 1L;

    /**
     * Create a ReadLocusGeneModelAnnotationSetter object to read the locusGeneModelAnnotation collection.
     */
    public ReadLocusGeneModelAnnotationSetter() {
      super("org.tair.db.locusdetail", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.locusdetail.LocusGeneModelAnnotation.class.getName();
    }

    @Override
    protected java.util.Collection<org.tair.db.locusdetail.ILocusGeneModelAnnotation> getObjectCollection() {
      java.util.Collection<org.tair.db.locusdetail.ILocusGeneModelAnnotation> locusGeneModelAnnotation =  ((org.tair.db.locusdetail.Annotation)dto).getLocusGeneModelAnnotation();
      return locusGeneModelAnnotation;
    }

    @Override
    protected java.util.List<com.poesys.db.pk.IPrimaryKey> getPrimaryKeys() {
      return ((org.tair.db.locusdetail.Annotation)dto).locusGeneModelAnnotationKeys;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.tair.db.locusdetail.ILocusGeneModelAnnotation> getSql() {
      return new org.tair.db.locusdetail.sql.QueryLocusGeneModelAnnotation();
    }

    @Override
    protected void set(java.util.Collection<org.tair.db.locusdetail.ILocusGeneModelAnnotation> collection) {
      ((org.tair.db.locusdetail.Annotation)dto).locusGeneModelAnnotation = collection;
    }
  }



  /**
   * Read-Object setter for de-serializing nested locusAnnotation collection
   *
   * Source: AddAssociationClassCollectionProperties
   *
   * @see org.tair.db.locusdetail.sql.QueryLocusAnnotation
   */
  private class ReadLocusAnnotationSetter 
      extends com.poesys.db.dto.AbstractCollectionReadSetter<org.tair.db.locusdetail.ILocusAnnotation> {
    private static final long serialVersionUID = 1L;

    /**
     * Create a ReadLocusAnnotationSetter object to read the locusAnnotation collection.
     */
    public ReadLocusAnnotationSetter() {
      super("org.tair.db.locusdetail", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.locusdetail.LocusAnnotation.class.getName();
    }

    @Override
    protected java.util.Collection<org.tair.db.locusdetail.ILocusAnnotation> getObjectCollection() {
      java.util.Collection<org.tair.db.locusdetail.ILocusAnnotation> locusAnnotation =  ((org.tair.db.locusdetail.Annotation)dto).getLocusAnnotation();
      return locusAnnotation;
    }

    @Override
    protected java.util.List<com.poesys.db.pk.IPrimaryKey> getPrimaryKeys() {
      return ((org.tair.db.locusdetail.Annotation)dto).locusAnnotationKeys;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.tair.db.locusdetail.ILocusAnnotation> getSql() {
      return new org.tair.db.locusdetail.sql.QueryLocusAnnotation();
    }

    @Override
    protected void set(java.util.Collection<org.tair.db.locusdetail.ILocusAnnotation> collection) {
      ((org.tair.db.locusdetail.Annotation)dto).locusAnnotation = collection;
    }
  }

  /**
   * Create a AnnotationProxy. The concrete subclass must call this constructor.
   *
   * @param dto the DTO to proxy
   */
  public AbstractAnnotationProxy(Annotation dto) {
    super(dto);

    // Setter arrays
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    readObjectSetters.add(new ReadModelSetter());
    readObjectSetters.add(new ReadLocusSetter());
    readObjectSetters.add(new ReadLocusGeneModelAnnotationSetter());
    readObjectSetters.add(new ReadLocusAnnotationSetter());
  }

  @Override
  public boolean equals(Object obj) {
    AbstractAnnotationProxy otherProxy = (AbstractAnnotationProxy)obj;
    return ((Annotation)dto).equals(otherProxy.dto);
  }

  @Override
  public int hashCode() {
    return ((Annotation)dto).hashCode();
  }

  // Local properties (attributes, associations, and association classes)

  // Source: AddNaturalKeyProperties
  public java.lang.String getCategory() {
    return ((Annotation)dto).getCategory();
  }

  // Source: AddNaturalKeyProperties
  public java.lang.String getRelationshipType() {
    return ((Annotation)dto).getRelationshipType();
  }

  // Source: AddNaturalKeyProperties
  public java.lang.String getKeyword() {
    return ((Annotation)dto).getKeyword();
  }

  // Source: AddNaturalKeyProperties
  public java.lang.String getEvidenceCode() {
    return ((Annotation)dto).getEvidenceCode();
  }

  // Source: AddNaturalKeyProperties
  public java.lang.String getEvidenceWith() {
    return ((Annotation)dto).getEvidenceWith();
  }

  // Source: AddNaturalKeyProperties
  public java.lang.String getReference() {
    return ((Annotation)dto).getReference();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.Long getKeywordId() {
    return ((Annotation)dto).getKeywordId();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.String getOntologyId() {
    return ((Annotation)dto).getOntologyId();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.String getEvidenceDescription() {
    return ((Annotation)dto).getEvidenceDescription();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.Long getEvidenceId() {
    return ((Annotation)dto).getEvidenceId();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.Long getReferenceId() {
    return ((Annotation)dto).getReferenceId();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.String getAnnotatedBy() {
    return ((Annotation)dto).getAnnotatedBy();
  }

  // Source: TransformToProperty + AddToManyAssociationCollectionProperties
  public java.util.Collection<org.tair.db.locusdetail.ILocusGeneModel> getModel() throws java.sql.SQLException {
    // Lazy-load the local property model if not loaded.
    if (!modelLoaded) {
      try {
        com.poesys.db.dto.ISet setter = new QueryModelSetter();
        setter.set(dto.getConnection());
      } catch (com.poesys.db.InvalidParametersException e) {
        throw new java.sql.SQLException(e.getMessage());
      }
    }
    return ((Annotation)dto).getModel();
  }

  public void clearModel() {
    // Only clear if loaded already.
    if (modelLoaded) {
      try {
        // Call the local lazy property setter to clear the property.
        ((Annotation)dto).setModel(null);
        ((Annotation)dto).undoStatus();
        modelLoaded = false;
      } catch (com.poesys.db.dto.DtoStatusException e) {
        // Couldn't set status to CHANGED, ignore because we don't want it set
      }
    }
  }

  /**
   * Set the model from a lazy-loading proxy. The IDbDto-
   * derived interface does not contain this method.
   *
   * @param model the lazily loaded value to assign
   */
  void setModel(java.util.Collection<org.tair.db.locusdetail.ILocusGeneModel> model)
      {
    ((Annotation)dto).setModel(model);
    // Mark the property loaded and undo the status change.
    dto.undoStatus();
    modelLoaded = true;
  }

  // Source: TransformToProperty + AddToManyAssociationCollectionProperties
  public java.util.Collection<org.tair.db.locusdetail.ILocusDetail> getLocus() throws java.sql.SQLException {
    // Lazy-load the local property locus if not loaded.
    if (!locusLoaded) {
      try {
        com.poesys.db.dto.ISet setter = new QueryLocusSetter();
        setter.set(dto.getConnection());
      } catch (com.poesys.db.InvalidParametersException e) {
        throw new java.sql.SQLException(e.getMessage());
      }
    }
    return ((Annotation)dto).getLocus();
  }

  public void clearLocus() {
    // Only clear if loaded already.
    if (locusLoaded) {
      try {
        // Call the local lazy property setter to clear the property.
        ((Annotation)dto).setLocus(null);
        ((Annotation)dto).undoStatus();
        locusLoaded = false;
      } catch (com.poesys.db.dto.DtoStatusException e) {
        // Couldn't set status to CHANGED, ignore because we don't want it set
      }
    }
  }

  /**
   * Set the locus from a lazy-loading proxy. The IDbDto-
   * derived interface does not contain this method.
   *
   * @param locus the lazily loaded value to assign
   */
  void setLocus(java.util.Collection<org.tair.db.locusdetail.ILocusDetail> locus)
      {
    ((Annotation)dto).setLocus(locus);
    // Mark the property loaded and undo the status change.
    dto.undoStatus();
    locusLoaded = true;
  }

  // Source: AddAssociationClassCollectionProperties
  public java.util.Collection<org.tair.db.locusdetail.ILocusGeneModelAnnotation> getLocusGeneModelAnnotation() {
    return ((Annotation)dto).getLocusGeneModelAnnotation();
  }

  // Source: AddAssociationClassCollectionProperties
  public java.util.Collection<org.tair.db.locusdetail.ILocusAnnotation> getLocusAnnotation() {
    return ((Annotation)dto).getLocusAnnotation();
  }

  public void markChildrenDeleted() throws com.poesys.db.dto.DtoStatusException {
  	((Annotation)dto).markChildrenDeleted();
  }
}