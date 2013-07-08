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


import org.tair.db.locusdetail.IReference;
import org.tair.db.locusdetail.ReferenceProxy;
import org.tair.db.locusdetail.Reference;


/**
 * <p>
 * A business layer data-transfer object (DTO) for the Reference. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * A published reference that refers to this locus
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
public abstract class AbstractBsReference 
    extends AbstractDto<org.tair.db.locusdetail.IReference> {

  /**
   * A Collection builder helper class for building a business-layer Collection 
   * of BsReferencedLocus objects from a Collection loci of data-access-layer 
   * org.tair.db.locusdetail.IReferencedLocus objects
   */
  private class BsLociCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.db.locusdetail.IReferencedLocus, org.tair.bs.locusdetail.BsReferencedLocus> {
    @Override
    public org.tair.bs.locusdetail.BsReferencedLocus get(org.tair.db.locusdetail.IReferencedLocus dto) {
      return new org.tair.bs.locusdetail.BsReferencedLocus(dto);
    }
  }

  /**
   * A Collection builder helper class for building a data-access-layer Collection 
   * of ReferencedLocus objects from an input Collection loci of 
   * business-layer BsReferencedLocus objects
   */
  private class LociCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.tair.bs.locusdetail.BsReferencedLocus, org.tair.db.locusdetail.IReferencedLocus> {
    @Override
    public org.tair.db.locusdetail.IReferencedLocus get(org.tair.bs.locusdetail.BsReferencedLocus dto) {
      return dto.toDto();
    }
  }

  /**
   * Create a BsReference object from a Reference object.
   * 
   * @param dto the data-access layer Reference DTO
   * @throws DelegateException when there is a problem creating the Reference
   */
  public AbstractBsReference(IReference dto) throws DelegateException {
    super(dto);
  }

  /**
   * Create a Reference from new data.
   *
   * @param key the primary key of the Reference
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param referenceTairObjectId the unique TAIR object identifier for the reference; used to link to the
reference page
   * @param title title of the publication
   * @param authors a formatted list of authors (Smith J., Jones T., et al.)
   * @param publicationYear the year of publication
   * @param locusCount the number of loci other than the parent to which this reference refers
   * @param annotated has this article been curated, resulting in annotations to the locus?
   */
  public AbstractBsReference(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.Long referenceTairObjectId, java.lang.String title, java.lang.String authors, java.lang.Integer publicationYear, java.lang.Integer locusCount, java.lang.Boolean annotated) {
    super(new ReferenceProxy(new Reference(key, locusTairObjectId, referenceTairObjectId, title, authors, publicationYear, locusCount, annotated)));
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object arg0) {
    // Unchecked cast here
    IDto<IReference> other = (IDto<IReference>)arg0;
    return dto.equals(other.toDto());
  }

  @Override
  public int hashCode() {
    return dto.hashCode();
  }

  public int compareTo(IDto<IReference> o) {
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
   * Added by AddNaturalKeyProperties + AddParentKeyAttributes as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Reference</li>
   * </ul>
   * </p>
   * @return a java.lang.Long locusTairObjectId
   */
  public java.lang.Long getLocusTairObjectId() {
    return dto.getLocusTairObjectId();
  }

  /**
   * <p>
   * the unique TAIR object identifier for the reference; used to link to the
   * reference page
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Reference</li>
   * </ul>
   * </p>
   * @return a java.lang.Long referenceTairObjectId
   */
  public java.lang.Long getReferenceTairObjectId() {
    return dto.getReferenceTairObjectId();
  }

  /**
   * <p>
   * title of the publication
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Reference</li>
   * </ul>
   * </p>
   * @return a java.lang.String title
   */
  public java.lang.String getTitle() {
    return dto.getTitle();
  }

  /**
   * <p>
   * a formatted list of authors (Smith J., Jones T., et al.)
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Reference</li>
   * </ul>
   * </p>
   * @return a java.lang.String authors
   */
  public java.lang.String getAuthors() {
    return dto.getAuthors();
  }

  /**
   * <p>
   * the year of publication
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Reference</li>
   * </ul>
   * </p>
   * @return a java.lang.Integer publicationYear
   */
  public java.lang.Integer getPublicationYear() {
    return dto.getPublicationYear();
  }

  /**
   * <p>
   * the number of loci other than the parent to which this reference refers
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Reference</li>
   * </ul>
   * </p>
   * @return a java.lang.Integer locusCount
   */
  public java.lang.Integer getLocusCount() {
    return dto.getLocusCount();
  }

  /**
   * <p>
   * has this article been curated, resulting in annotations to the locus?
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Reference</li>
   * </ul>
   * </p>
   * @return a java.lang.Boolean annotated
   */
  public java.lang.Boolean getAnnotated() {
    return dto.getAnnotated();
  }

  /**
   * <p>
   * the locus to which the reference refers
   * </p>
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Reference</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.locusdetail.BsLocusDetail locus
   */
  public org.tair.bs.locusdetail.BsLocusDetail getLocus() {
    // Return 4
    return new org.tair.bs.locusdetail.BsLocusDetail(dto.getLocus());
  }

  /**
   * <p>
   * the set of loci to which the reference refers excluding the parent locus
   * </p>
   * <p>
   * Added by AddToManyChildCollectionProperties as data member
   * </p>
   * <p>
   * This property loads lazily on demand the first time you call this method,
   * not when you instantiate the BsReference object.
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Reference</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.locusdetail.BsReferencedLocus loci
   * @throws java.sql.SQLException when the method can't get a SQL connection to 
   *                               load the property lazily
   */
  public java.util.Collection<org.tair.bs.locusdetail.BsReferencedLocus> getLoci() throws java.sql.SQLException {
    BsLociCollectionBuilder builder = new BsLociCollectionBuilder();
    return builder.getCollection(dto.getLoci());
  }
}