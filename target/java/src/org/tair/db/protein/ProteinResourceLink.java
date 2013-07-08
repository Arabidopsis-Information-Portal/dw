/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.protein;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the ProteinResourceLink. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
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
 * 
 * @author Poesys/DB Cartridge
 */
public class ProteinResourceLink extends AbstractProteinResourceLink {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a ProteinResourceLink as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public ProteinResourceLink() {
    super(); 
  }

  /**
   * <p>
   * Create a ProteinResourceLink. This constructor calls the abstract superclass 
   * constructor.
   * </p>
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
  public ProteinResourceLink(IPrimaryKey key, java.lang.Long tairObjectId, java.lang.String name, java.lang.String linkType, java.lang.String icon, org.tair.db.locusdetail.ILocusDetail locus, java.lang.String baseUrl, java.lang.String urlVariable, java.lang.String explanation) {
    super(key, tairObjectId, name, linkType, icon, locus, baseUrl, urlVariable, explanation); 
  }
}