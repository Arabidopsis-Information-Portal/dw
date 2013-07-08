/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: IDbDto.vsl

package org.tair.db.locusdetail;

import com.poesys.db.dto.IDbDto;

import com.poesys.db.dto.DtoStatusException;
import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer-object interface for the LocusProteinResourceLink. 
 * The data-transfer-object class and proxy class implement this interface, as
 * does the business-layer data-transfer-object class.
 * </p>
 * <p>
 * a URL link to a third-party resource that contains some kind of information
 * related to the locus protein model
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
public interface ILocusProteinResourceLink extends IDbDto {

  boolean equals(Object arg0);

  int hashCode();

  /**
   * <p>
   * Mark any children of this DTO as deleted.
   * </p>
   *
   * @throws DtoStatusException when the child cannot be set to DELETED status
   */
  void markChildrenDeleted() throws DtoStatusException;

  IPrimaryKey getPrimaryKey();
  

  /**
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddParentKeyAttributes + AddParentKeyAttributes
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: locusTairObjectId
   * </p>
   * @return a java.lang.Long locusTairObjectId
   */
  public java.lang.Long getLocusTairObjectId();

  /**
   * <p>
   * the text name for the link, which usually includes the web site name and any
   * specific information in the context of the locus; the URL itself may be this
   * name if there is no other name
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: name
   * </p>
   * @return a java.lang.String name
   */
  public java.lang.String getName();

  /**
   * <p>
   * an optional name for an icon to display for the link; icon gif must exist in
   * static images folder
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: icon
   * </p>
   * @return a java.lang.String icon
   */
  public java.lang.String getIcon();

  /**
   * <p>
   * the base URL (http://... up to the ? arguments) for the external link
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: baseUrl
   * </p>
   * @return a java.lang.String baseUrl
   */
  public java.lang.String getBaseUrl();

  /**
   * <p>
   * the optional URL variable that identifies the locus to the target web site
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: urlVariable
   * </p>
   * @return a java.lang.String urlVariable
   */
  public java.lang.String getUrlVariable();

  /**
   * <p>
   * a short explanation (should fit on one line if possible) of the purpose of the
   * link
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: explanation
   * </p>
   * @return a java.lang.String explanation
   */
  public java.lang.String getExplanation();

  /**
   * <p>
   * the locus protein model to which the resource link refers
   * </p>
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties
   * Owning DTO: LocusProteinModel
   * Owning package: org.tair.db.locusdetail
   * Property prefix: model
   * </p>
   * @return a org.tair.db.locusdetail.ILocusProteinModel model
   */
  public org.tair.db.locusdetail.ILocusProteinModel getModel();
}