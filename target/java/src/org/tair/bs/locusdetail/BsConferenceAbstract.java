/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the ConferenceAbstract. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * An abstract reference from a conference proceedings that refers to the locus
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>Persistent</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class BsConferenceAbstract extends org.tair.bs.locusdetail.AbstractBsConferenceAbstract {
  /**
   * Create a BsConferenceAbstract object from a ConferenceAbstract object.
   * 
   * @param dto the data-access layer ConferenceAbstract DTO
   * @throws DelegateException when there is a problem creating the ConferenceAbstract
   */
  public BsConferenceAbstract(org.tair.db.locusdetail.IConferenceAbstract dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsConferenceAbstract. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the ConferenceAbstract
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param referenceTairObjectId the unique TAIR object identifier for the reference; used to link to the
reference page
   * @param title title of the publication
   * @param authors a formatted list of authors (Smith J., Jones T., et al.)
   * @param publicationYear the year of publication
   * @param locusCount the number of loci other than the parent to which this reference refers
   * @param annotated has this article been curated, resulting in annotations to the locus?
   * @param conference the conference (ICAR, PAG, and so on)
   */
  public BsConferenceAbstract(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.Long referenceTairObjectId, java.lang.String title, java.lang.String authors, java.lang.Integer publicationYear, java.lang.Integer locusCount, java.lang.Boolean annotated, java.lang.String conference) {
    super(key, locusTairObjectId, referenceTairObjectId, title, authors, publicationYear, locusCount, annotated, conference); 
  }
}