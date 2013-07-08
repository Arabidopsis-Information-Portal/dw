/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractBsDto.vsl


package org.tair.bs.protein;


import com.poesys.bs.delegate.DelegateException;
import com.poesys.bs.dto.IDto;
import com.poesys.db.dto.DtoStatusException;
import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.dto.AbstractDto;


import org.tair.db.protein.IProteinResourceLink;
import org.tair.db.protein.ProteinResourceLinkProxy;
import org.tair.db.protein.ProteinResourceLink;


/**
 * <p>
 * A business layer data-transfer object (DTO) for the ProteinResourceLink. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * a URL link to an external resource that contains some kind of information
 * related to the protein
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
public abstract class AbstractBsProteinResourceLink 
    extends AbstractDto<org.tair.db.protein.IProteinResourceLink> {

  /**
   * Create a BsProteinResourceLink object from a ProteinResourceLink object.
   * 
   * @param dto the data-access layer ProteinResourceLink DTO
   * @throws DelegateException when there is a problem creating the ProteinResourceLink
   */
  public AbstractBsProteinResourceLink(IProteinResourceLink dto) throws DelegateException {
    super(dto);
  }

  /**
   * Create a ProteinResourceLink from new data.
   *
   * @param key the primary key of the ProteinResourceLink
   * @param tairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param name the text name for the link, which usually includes the web site name and any
specific information in the context of the locus; the URL itself may be this
name if there is no other name
   * @param linkType the kind of link this is; used to place the link into a particular section of
the locus detail
   * @param icon an optional name for an icon to display for the link; icon gif must exist in
static images folder
   * @param locus the locus that owns the third-party resource link
   * @param baseUrl the base URL (http://... up to the ? arguments) for the external link
   * @param urlVariable the optional URL variable that identifies the locus to the target web site
   * @param explanation a short explanation (should fit on one line if possible) of the purpose of the
link
   */
  public AbstractBsProteinResourceLink(IPrimaryKey key, java.lang.Long tairObjectId, java.lang.String name, java.lang.String linkType, java.lang.String icon, org.tair.db.locusdetail.ILocusDetail locus, java.lang.String baseUrl, java.lang.String urlVariable, java.lang.String explanation) {
    super(new ProteinResourceLinkProxy(new ProteinResourceLink(key, tairObjectId, name, linkType, icon, locus, baseUrl, urlVariable, explanation)));
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object arg0) {
    // Unchecked cast here
    IDto<IProteinResourceLink> other = (IDto<IProteinResourceLink>)arg0;
    return dto.equals(other.toDto());
  }

  @Override
  public int hashCode() {
    return dto.hashCode();
  }

  public int compareTo(IDto<IProteinResourceLink> o) {
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
   * <li>Property is defined in the data-access object ProteinResourceLink</li>
   * </ul>
   * </p>
   * @return a java.lang.Long tairObjectId
   */
  public java.lang.Long getTairObjectId() {
    return dto.getTairObjectId();
  }

  /**
   * <p>
   * the text name for the link, which usually includes the web site name and any
   * specific information in the context of the locus; the URL itself may be this
   * name if there is no other name
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object ProteinResourceLink</li>
   * </ul>
   * </p>
   * @return a java.lang.String name
   */
  public java.lang.String getName() {
    return dto.getName();
  }

  /**
   * <p>
   * the kind of link this is; used to place the link into a particular section of
   * the locus detail
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object ProteinResourceLink</li>
   * </ul>
   * </p>
   * @return a java.lang.String linkType
   */
  public java.lang.String getLinkType() {
    return dto.getLinkType();
  }

  /**
   * <p>
   * an optional name for an icon to display for the link; icon gif must exist in
   * static images folder
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object ProteinResourceLink</li>
   * </ul>
   * </p>
   * @return a java.lang.String icon
   */
  public java.lang.String getIcon() {
    return dto.getIcon();
  }

  /**
   * <p>
   * the locus that owns the third-party resource link
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object ProteinResourceLink</li>
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
   * the base URL (http://... up to the ? arguments) for the external link
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object ProteinResourceLink</li>
   * </ul>
   * </p>
   * @return a java.lang.String baseUrl
   */
  public java.lang.String getBaseUrl() {
    return dto.getBaseUrl();
  }

  /**
   * <p>
   * the optional URL variable that identifies the locus to the target web site
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object ProteinResourceLink</li>
   * </ul>
   * </p>
   * @return a java.lang.String urlVariable
   */
  public java.lang.String getUrlVariable() {
    return dto.getUrlVariable();
  }

  /**
   * <p>
   * a short explanation (should fit on one line if possible) of the purpose of the
   * link
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object ProteinResourceLink</li>
   * </ul>
   * </p>
   * @return a java.lang.String explanation
   */
  public java.lang.String getExplanation() {
    return dto.getExplanation();
  }

  /**
   * <p>
   * the protein to which the resource link applies
   * </p>
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object ProteinResourceLink</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.protein.BsProtein protein
   */
  public org.tair.bs.protein.BsProtein getProtein() {
    // Return 4
    return new org.tair.bs.protein.BsProtein(dto.getProtein());
  }
}