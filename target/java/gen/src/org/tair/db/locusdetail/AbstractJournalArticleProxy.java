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
 * JournalArticle. This class is an abstract class that contains AndroMDA 
 * generated code; change nothing in this class. Instead, override any methods 
 * in the concrete subclass generated in the same package. AndroMDA will 
 * overwrite this class each time you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * A journal article reference available in PubMed that refers to the locus
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractJournalArticleProxy extends AbstractLazyLoadingDtoProxy implements IJournalArticle {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;
  
  /**
   * Create a JournalArticleProxy. The concrete subclass must call this constructor.
   *
   * @param dto the DTO to proxy
   */
  public AbstractJournalArticleProxy(JournalArticle dto) {
    super(dto);

  }

  @Override
  public boolean equals(Object obj) {
    AbstractJournalArticleProxy otherProxy = (AbstractJournalArticleProxy)obj;
    return ((JournalArticle)dto).equals(otherProxy.dto);
  }

  @Override
  public int hashCode() {
    return ((JournalArticle)dto).hashCode();
  }
  // Inherited properties

  public java.lang.Long getLocusTairObjectId() {
    return ((IJournalArticle)dto).getLocusTairObjectId();
  }

  public java.lang.Long getReferenceTairObjectId() {
    return ((IJournalArticle)dto).getReferenceTairObjectId();
  }

  public org.tair.db.locusdetail.ILocusDetail getLocus() {
    return ((IJournalArticle)dto).getLocus();
  }

  /** Flag indicating whether the loci property has been loaded */
  boolean lociLoaded = false;

  /**
   * Query setter for lazily querying nested loci collection
   *
   * @see org.tair.db.locusdetail.sql.QueryLociByReference
   */
  private class QueryLociSetter 
      extends com.poesys.db.dto.AbstractLazyListSetter<org.tair.db.locusdetail.IReferencedLocus, org.tair.db.locusdetail.IReference, java.util.Collection<org.tair.db.locusdetail.IReferencedLocus>> {
    /** Serial version UID for Serializable object */
    private static final long serialVersionUID = 1L;
    private static final int FETCH_SIZE = 10;

    /**
     * Create a QueryLociSetter object.
     */
    public QueryLociSetter() {
      super("org.tair.db.locusdetail", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.locusdetail.ReferencedLocus.class.getName();
    }

    @Override
    protected int getFetchSize() {
      return FETCH_SIZE;
    }

    @Override
    protected IJournalArticle getParametersDto() {
      return AbstractJournalArticleProxy.this;
    }

    @Override
    protected com.poesys.db.dao.query.IParameterizedQuerySql<org.tair.db.locusdetail.IReferencedLocus, org.tair.db.locusdetail.IReference> getSql() {
      return new org.tair.db.locusdetail.sql.QueryLociByReference();
    }

    @Override
    protected void set(java.util.Collection<org.tair.db.locusdetail.IReferencedLocus> collection) {
      try {
        // Register the observer parent with the subject children.
        for (org.tair.db.locusdetail.IReferencedLocus child : collection) {
          child.attach(AbstractJournalArticleProxy.this.dto,
                              com.poesys.db.dao.DataEvent.MARKED_DELETED);
          child.attach(AbstractJournalArticleProxy.this.dto, 
                       com.poesys.db.dao.DataEvent.DELETE);
        }
        setLoci(collection);
      } catch (com.poesys.db.dto.DtoStatusException e) {
        // Just lazy loading here, not actually setting. Ignore this exception.        
      }
    }

    @Override
    public boolean isSet() {
      // Set if proxy has loaded loci
      return lociLoaded;
    }
  }

  public java.util.Collection<org.tair.db.locusdetail.IReferencedLocus> getLoci() throws java.sql.SQLException {
    // Lazy-load the inherited loci from the JournalArticle 
    // if not loaded and the inherited key is not null.
    if (!lociLoaded && ((IJournalArticle)dto).getLocusTairObjectId() != null && ((IJournalArticle)dto).getReferenceTairObjectId() != null) {
      try {
        com.poesys.db.dto.ISet setter = new QueryLociSetter();
        setter.set(dto.getConnection());
      } catch (com.poesys.db.InvalidParametersException e) {
        throw new java.sql.SQLException(e.getMessage());
      }
    }
    return ((IJournalArticle)dto).getLoci();
  }

  /**
   * Clear the lazily-loaded property loci.
   */
  public void clearLoci() {
    // Only clear if loaded already.
    if (lociLoaded) {
      try {
        // Call the local lazy property setter to clear the property.
        ((JournalArticle)dto).setLoci(null);
        ((JournalArticle)dto).undoStatus();
        lociLoaded = false;
      } catch (com.poesys.db.dto.DtoStatusException e) {
        // Couldn't set status to CHANGED, ignore because we don't want it set
      }
    }
  }

  /**
   * Set the lazily loaded property loci and mark it loaded.
   * 
   * @param loci the value for the lazily loaded property
   */
  public void setLoci(java.util.Collection<org.tair.db.locusdetail.IReferencedLocus> loci)
      {
    ((JournalArticle)dto).setLoci(loci);
    
    // Mark the property loaded and undo the status change if loading.
    if (!lociLoaded) {
      dto.undoStatus();
      lociLoaded = true;
    }
  }

  public java.lang.String getTitle() {
    return ((IJournalArticle)dto).getTitle();
  }

  public java.lang.String getAuthors() {
    return ((IJournalArticle)dto).getAuthors();
  }

  public java.lang.Integer getPublicationYear() {
    return ((IJournalArticle)dto).getPublicationYear();
  }

  public java.lang.Integer getLocusCount() {
    return ((IJournalArticle)dto).getLocusCount();
  }

  public java.lang.Boolean getAnnotated() {
    return ((IJournalArticle)dto).getAnnotated();
  }

  // Local properties (attributes, associations, and association classes)

  // Source: AddLocalAttributeProperties
  public java.lang.String getJournal() {
    return ((JournalArticle)dto).getJournal();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.String getPubmedId() {
    return ((JournalArticle)dto).getPubmedId();
  }

  public void markChildrenDeleted() throws com.poesys.db.dto.DtoStatusException {
  	((JournalArticle)dto).markChildrenDeleted();
  }
}