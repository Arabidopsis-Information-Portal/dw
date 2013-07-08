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
 * ProteinModel. This class is an abstract class that contains AndroMDA 
 * generated code; change nothing in this class. Instead, override any methods 
 * in the concrete subclass generated in the same package. AndroMDA will 
 * overwrite this class each time you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * a protein model for a parent protein-coding gene model
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractProteinModelProxy extends AbstractLazyLoadingDtoProxy implements IProteinModel {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  // Lazy-loading query setter strategy nested classes for single-object associations
  
    // Setter strategy nested classes for multiple-object associations

  /** Flag indicating whether the domain property has been loaded */
  boolean domainLoaded = false;

  /**
   * Query setter for lazily querying nested domain collection
   * Source: TransformToProperty + AddToManyAssociationCollectionProperties
   *
   * @see org.tair.db.locusdetail.sql.QueryDomainByProteinModel
   */
  private class QueryDomainSetter 
      extends com.poesys.db.dto.AbstractLazyListSetter<org.tair.db.locusdetail.IDomain, IProteinModel, java.util.List<org.tair.db.locusdetail.IDomain>> {
    /** Serial version UID for Serializable object */
    private static final long serialVersionUID = 1L;
    private static final int FETCH_SIZE = 10;

    /**
     * Create a QueryDomainSetter object.
     */
    public QueryDomainSetter() {
      super("org.tair.db.locusdetail", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.locusdetail.Domain.class.getName();
    }

    @Override
    protected int getFetchSize() {
      return FETCH_SIZE;
    }

    @Override
    protected IProteinModel getParametersDto() {
      return AbstractProteinModelProxy.this;
    }

    @Override
    protected com.poesys.db.dao.query.IParameterizedQuerySql<org.tair.db.locusdetail.IDomain, IProteinModel> getSql() {
      return new org.tair.db.locusdetail.sql.QueryDomainByProteinModel();
    }

    @Override
    protected void set(java.util.List<org.tair.db.locusdetail.IDomain> collection) {
      try {
        // Register the observer parent with the subject children.
        for (org.tair.db.locusdetail.IDomain child : collection) {
          child.attach(AbstractProteinModelProxy.this.dto,
                              com.poesys.db.dao.DataEvent.MARKED_DELETED);
          child.attach(AbstractProteinModelProxy.this.dto, com.poesys.db.dao.DataEvent.DELETE);
        }
        setDomain(collection);
      } catch (com.poesys.db.dto.DtoStatusException e) {
        // Just lazy loading here, not actually setting. Ignore this exception.        
      }
    }

    @Override
    public boolean isSet() {
      // Set if proxy has loaded domain
      return domainLoaded;
    }
  }


  /**
   * Read-Object setter for de-serializing nested domain list
   *
   * Source: TransformToProperty + AddToManyAssociationCollectionProperties
   *
   * @see org.tair.db.locusdetail.sql.QueryDomain
   */
  private class ReadDomainSetter 
      extends com.poesys.db.dto.AbstractListReadSetter<org.tair.db.locusdetail.IDomain> {
    private static final long serialVersionUID = 1L;

    /**
     * Create a ReadDomainSetter object to read the domain list.
     */
    public ReadDomainSetter() {
      super("org.tair.db.locusdetail", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.locusdetail.Domain.class.getName();
    }

    @Override
    protected java.util.List<org.tair.db.locusdetail.IDomain> getObjectList() {
      java.util.List<org.tair.db.locusdetail.IDomain> domain = null;
      try {
        domain = ((org.tair.db.locusdetail.ProteinModel)dto).getDomain();
      } catch (java.sql.SQLException e) {
        throw new RuntimeException("SQL Exception on list query: " + e.getMessage(), e);
      }
      return domain;
    }

    @Override
    protected java.util.List<com.poesys.db.pk.IPrimaryKey> getPrimaryKeys() {
      return ((org.tair.db.locusdetail.ProteinModel)dto).domainKeys;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.tair.db.locusdetail.IDomain> getSql() {
      return new org.tair.db.locusdetail.sql.QueryDomain();
    }

    @Override
    protected void set(java.util.List<org.tair.db.locusdetail.IDomain> list) {
      ((org.tair.db.locusdetail.ProteinModel)dto).domain = list;
    }
  }


  /**
   * Read-Object setter for de-serializing nested proteinModelDomain collection
   *
   * Source: AddAssociationClassCollectionProperties
   *
   * @see org.tair.db.locusdetail.sql.QueryProteinModelDomain
   */
  private class ReadProteinModelDomainSetter 
      extends com.poesys.db.dto.AbstractCollectionReadSetter<org.tair.db.locusdetail.IProteinModelDomain> {
    private static final long serialVersionUID = 1L;

    /**
     * Create a ReadProteinModelDomainSetter object to read the proteinModelDomain collection.
     */
    public ReadProteinModelDomainSetter() {
      super("org.tair.db.locusdetail", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.locusdetail.ProteinModelDomain.class.getName();
    }

    @Override
    protected java.util.Collection<org.tair.db.locusdetail.IProteinModelDomain> getObjectCollection() {
      java.util.Collection<org.tair.db.locusdetail.IProteinModelDomain> proteinModelDomain =  ((org.tair.db.locusdetail.ProteinModel)dto).getProteinModelDomain();
      return proteinModelDomain;
    }

    @Override
    protected java.util.List<com.poesys.db.pk.IPrimaryKey> getPrimaryKeys() {
      return ((org.tair.db.locusdetail.ProteinModel)dto).proteinModelDomainKeys;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.tair.db.locusdetail.IProteinModelDomain> getSql() {
      return new org.tair.db.locusdetail.sql.QueryProteinModelDomain();
    }

    @Override
    protected void set(java.util.Collection<org.tair.db.locusdetail.IProteinModelDomain> collection) {
      ((org.tair.db.locusdetail.ProteinModel)dto).proteinModelDomain = collection;
    }
  }



  /**
   * Read-Object setter for de-serializing nested resourceLinks collection
   *
   * Source: AddToManyChildCollectionProperties
   *
   * @see org.tair.db.locusdetail.sql.QueryProteinResourceLink
   */
  private class ReadResourceLinksSetter 
      extends com.poesys.db.dto.AbstractCollectionReadSetter<org.tair.db.locusdetail.IProteinResourceLink> {
    private static final long serialVersionUID = 1L;

    /**
     * Create a ReadResourceLinksSetter object to read the resourceLinks collection.
     */
    public ReadResourceLinksSetter() {
      super("org.tair.db.locusdetail", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.tair.db.locusdetail.ProteinResourceLink.class.getName();
    }

    @Override
    protected java.util.Collection<org.tair.db.locusdetail.IProteinResourceLink> getObjectCollection() {
      java.util.Collection<org.tair.db.locusdetail.IProteinResourceLink> resourceLinks =  ((org.tair.db.locusdetail.ProteinModel)dto).getResourceLinks();
      return resourceLinks;
    }

    @Override
    protected java.util.List<com.poesys.db.pk.IPrimaryKey> getPrimaryKeys() {
      return ((org.tair.db.locusdetail.ProteinModel)dto).resourceLinksKeys;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.tair.db.locusdetail.IProteinResourceLink> getSql() {
      return new org.tair.db.locusdetail.sql.QueryProteinResourceLink();
    }

    @Override
    protected void set(java.util.Collection<org.tair.db.locusdetail.IProteinResourceLink> collection) {
      ((org.tair.db.locusdetail.ProteinModel)dto).resourceLinks = collection;
    }
  }

  /**
   * Create a ProteinModelProxy. The concrete subclass must call this constructor.
   *
   * @param dto the DTO to proxy
   */
  public AbstractProteinModelProxy(ProteinModel dto) {
    super(dto);

    // Setter arrays
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    readObjectSetters.add(new ReadDomainSetter());
    readObjectSetters.add(new ReadProteinModelDomainSetter());
    readObjectSetters.add(new ReadResourceLinksSetter());
  }

  @Override
  public boolean equals(Object obj) {
    AbstractProteinModelProxy otherProxy = (AbstractProteinModelProxy)obj;
    return ((ProteinModel)dto).equals(otherProxy.dto);
  }

  @Override
  public int hashCode() {
    return ((ProteinModel)dto).hashCode();
  }

  // Local properties (attributes, associations, and association classes)

  // Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddParentKeyAttributes
  public java.lang.String getGeneModelName() {
    return ((ProteinModel)dto).getGeneModelName();
  }

  // Source: AddNaturalKeyProperties + AddParentKeyAttributes + AddParentKeyAttributes
  public java.lang.Long getLocusTairObjectId() {
    return ((ProteinModel)dto).getLocusTairObjectId();
  }

  // Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
  public java.lang.Long getSequenceTairObjectId() {
    return ((ProteinModel)dto).getSequenceTairObjectId();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.Integer getLength() {
    return ((ProteinModel)dto).getLength();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.Double getMolecularWeight() {
    return ((ProteinModel)dto).getMolecularWeight();
  }

  // Source: AddLocalAttributeProperties
  public java.lang.Double getIsoelectricPoint() {
    return ((ProteinModel)dto).getIsoelectricPoint();
  }

  // Source: AddToOneAssociationRequiredObjectProperties
  public org.tair.db.locusdetail.ILocusGeneModel getGeneModel() {
    return ((ProteinModel)dto).getGeneModel();
  }

  // Source: TransformToProperty + AddToManyAssociationCollectionProperties
  public java.util.List<org.tair.db.locusdetail.IDomain> getDomain() throws java.sql.SQLException {
    // Lazy-load the local property domain if not loaded.
    if (!domainLoaded) {
      try {
        com.poesys.db.dto.ISet setter = new QueryDomainSetter();
        setter.set(dto.getConnection());
      } catch (com.poesys.db.InvalidParametersException e) {
        throw new java.sql.SQLException(e.getMessage());
      }
    }
    return ((ProteinModel)dto).getDomain();
  }

  public void clearDomain() {
    // Only clear if loaded already.
    if (domainLoaded) {
      try {
        // Call the local lazy property setter to clear the property.
        ((ProteinModel)dto).setDomain(null);
        ((ProteinModel)dto).undoStatus();
        domainLoaded = false;
      } catch (com.poesys.db.dto.DtoStatusException e) {
        // Couldn't set status to CHANGED, ignore because we don't want it set
      }
    }
  }

  /**
   * Set the domain from a lazy-loading proxy. The IDbDto-
   * derived interface does not contain this method.
   *
   * @param domain the lazily loaded value to assign
   */
  void setDomain(java.util.List<org.tair.db.locusdetail.IDomain> domain)
      {
    ((ProteinModel)dto).setDomain(domain);
    // Mark the property loaded and undo the status change.
    dto.undoStatus();
    domainLoaded = true;
  }

  // Source: AddAssociationClassCollectionProperties
  public java.util.Collection<org.tair.db.locusdetail.IProteinModelDomain> getProteinModelDomain() {
    return ((ProteinModel)dto).getProteinModelDomain();
  }

  // Source: AddToManyChildCollectionProperties
  public java.util.Collection<org.tair.db.locusdetail.IProteinResourceLink> getResourceLinks() {
    return ((ProteinModel)dto).getResourceLinks();
  }

  public void markChildrenDeleted() throws com.poesys.db.dto.DtoStatusException {
  	((ProteinModel)dto).markChildrenDeleted();
  }
}