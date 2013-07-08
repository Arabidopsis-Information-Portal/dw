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


import org.tair.db.locusdetail.IDomain;
import org.tair.db.locusdetail.DomainProxy;
import org.tair.db.locusdetail.Domain;


/**
 * <p>
 * A business layer data-transfer object (DTO) for the Domain. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * A named protein domain
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
public abstract class AbstractBsDomain 
    extends AbstractDto<org.tair.db.locusdetail.IDomain> {

  /**
   * A Collection builder helper class for building a business-layer Collection 
   * of BsProteinModel objects from a Collection model of data-access-layer 
   * org.tair.db.locusdetail.IProteinModel objects
   */
  private class BsModelCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.db.locusdetail.IProteinModel, org.tair.bs.locusdetail.BsProteinModel> {
    @Override
    public org.tair.bs.locusdetail.BsProteinModel get(org.tair.db.locusdetail.IProteinModel dto) {
      return new org.tair.bs.locusdetail.BsProteinModel(dto);
    }
  }

  /**
   * A Collection builder helper class for building a data-access-layer Collection 
   * of ProteinModel objects from an input Collection model of 
   * business-layer BsProteinModel objects
   */
  private class ModelCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.bs.locusdetail.BsProteinModel, org.tair.db.locusdetail.IProteinModel> {
    @Override
    public org.tair.db.locusdetail.IProteinModel get(org.tair.bs.locusdetail.BsProteinModel dto) {
      return dto.toDto();
    }
  }

  /**
   * A Collection builder helper class for building a business-layer Collection 
   * of BsProteinModelDomain objects from a Collection proteinModelDomain of data-access-layer 
   * org.tair.db.locusdetail.IProteinModelDomain objects
   */
  private class BsProteinModelDomainCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.db.locusdetail.IProteinModelDomain, org.tair.bs.locusdetail.BsProteinModelDomain> {
    @Override
    public org.tair.bs.locusdetail.BsProteinModelDomain get(org.tair.db.locusdetail.IProteinModelDomain dto) {
      return new org.tair.bs.locusdetail.BsProteinModelDomain(dto);
    }
  }

  /**
   * A Collection builder helper class for building a data-access-layer Collection 
   * of ProteinModelDomain objects from an input Collection proteinModelDomain of 
   * business-layer BsProteinModelDomain objects
   */
  private class ProteinModelDomainCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.bs.locusdetail.BsProteinModelDomain, org.tair.db.locusdetail.IProteinModelDomain> {
    @Override
    public org.tair.db.locusdetail.IProteinModelDomain get(org.tair.bs.locusdetail.BsProteinModelDomain dto) {
      return dto.toDto();
    }
  }

  /**
   * Create a BsDomain object from a Domain object.
   * 
   * @param dto the data-access layer Domain DTO
   * @throws DelegateException when there is a problem creating the Domain
   */
  public AbstractBsDomain(IDomain dto) throws DelegateException {
    super(dto);
  }

  /**
   * Create a Domain from new data.
   *
   * @param key the primary key of the Domain
   * @param accession a unique identifier for the protein domain, usually InterPro
   * @param accessionUrl a URL that links to a site containing information about the id
   * @param domain the name of the protein domain
   * @param domainUrl a URL that links to a page displaying information about the named domain
   * @param database the database that contains the domain
   * @param databaseUrl the URL that links to the external database that contains the domain
   * @param structuralClassType the structural class of the domain
   * @param classUrl a URL link to a page displaying information about the structural class type of
the protein domain
   */
  public AbstractBsDomain(IPrimaryKey key, java.lang.String accession, java.lang.String accessionUrl, java.lang.String domain, java.lang.String domainUrl, java.lang.String database, java.lang.String databaseUrl, java.lang.String structuralClassType, java.lang.String classUrl) {
    super(new DomainProxy(new Domain(key, accession, accessionUrl, domain, domainUrl, database, databaseUrl, structuralClassType, classUrl)));
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object arg0) {
    // Unchecked cast here
    IDto<IDomain> other = (IDto<IDomain>)arg0;
    return dto.equals(other.toDto());
  }

  @Override
  public int hashCode() {
    return dto.hashCode();
  }

  public int compareTo(IDto<IDomain> o) {
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
   * a unique identifier for the protein domain, usually InterPro
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @return a java.lang.String accession
   */
  public java.lang.String getAccession() {
    return dto.getAccession();
  }

  /**
   * <p>
   * a URL that links to a site containing information about the id
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @return a java.lang.String accessionUrl
   */
  public java.lang.String getAccessionUrl() {
    return dto.getAccessionUrl();
  }

  /**
   * <p>
   * the name of the protein domain
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @return a java.lang.String domain
   */
  public java.lang.String getDomain() {
    return dto.getDomain();
  }

  /**
   * <p>
   * a URL that links to a page displaying information about the named domain
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @return a java.lang.String domainUrl
   */
  public java.lang.String getDomainUrl() {
    return dto.getDomainUrl();
  }

  /**
   * <p>
   * the database that contains the domain
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @return a java.lang.String database
   */
  public java.lang.String getDatabase() {
    return dto.getDatabase();
  }

  /**
   * <p>
   * the URL that links to the external database that contains the domain
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @return a java.lang.String databaseUrl
   */
  public java.lang.String getDatabaseUrl() {
    return dto.getDatabaseUrl();
  }

  /**
   * <p>
   * the structural class of the domain
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @return a java.lang.String structuralClassType
   */
  public java.lang.String getStructuralClassType() {
    return dto.getStructuralClassType();
  }

  /**
   * <p>
   * a URL link to a page displaying information about the structural class type of
   * the protein domain
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @return a java.lang.String classUrl
   */
  public java.lang.String getClassUrl() {
    return dto.getClassUrl();
  }

  /**
   * <p>
   * the locus protein models on which a protein domain appears
   * </p>
   * <p>
   * Added by TransformToProperty + AddToManyAssociationCollectionProperties as data member
   * </p>
   * <p>
   * This property loads lazily on demand the first time you call this method,
   * not when you instantiate the BsDomain object.
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.locusdetail.BsProteinModel model
   * @throws java.sql.SQLException when the method can't get a SQL connection to 
   *                               load the property lazily
   */
  public java.util.Collection<org.tair.bs.locusdetail.BsProteinModel> getModel() throws java.sql.SQLException {
    BsModelCollectionBuilder builder = new BsModelCollectionBuilder();
    return builder.getCollection(dto.getModel());
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
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.locusdetail.BsProteinModelDomain proteinModelDomain
   */
  public java.util.Collection<org.tair.bs.locusdetail.BsProteinModelDomain> getProteinModelDomain() {
    BsProteinModelDomainCollectionBuilder builder = new BsProteinModelDomainCollectionBuilder();
    return builder.getCollection(dto.getProteinModelDomain());
  }
}