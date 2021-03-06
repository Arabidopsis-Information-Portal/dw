/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;

/**
 * <p>
 * A data-access layer data-transfer object for the ConferenceAbstract. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
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
 * <p>
 * Class is read/write: false
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractConferenceAbstract extends org.tair.db.locusdetail.Reference implements IConferenceAbstract {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;
  

  /**
   * Create an empty ConferenceAbstract for use in building a new object. The 
   * concrete subclass must call this constructor.
   */
  public AbstractConferenceAbstract() {
    super();
  }

  /**
   * Create a ConferenceAbstract. The concrete subclass must call this constructor.
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
  public AbstractConferenceAbstract(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.Long referenceTairObjectId, java.lang.String title, java.lang.String authors, java.lang.Integer publicationYear, java.lang.Integer locusCount, java.lang.Boolean annotated, java.lang.String conference) {
    super(key, locusTairObjectId, referenceTairObjectId, title, authors, publicationYear, locusCount, annotated);

    this.conference = conference;

    if (conference == null) {
      throw new com.poesys.db.InvalidParametersException("conference is required for " + key.getValueList());
    }
    
  }


  /**
   * Nested property conference
   *
   * <p>
   * the conference (ICAR, PAG, and so on)
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: false
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.String conference;
  

  public java.lang.String getConference() {
    return conference;
  }

  /**
   * Clear the conference data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearConference() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  @Override
  public void update(com.poesys.db.dto.ISubject subject,
                     com.poesys.db.dao.DataEvent event)
      throws com.poesys.db.dto.DtoStatusException {
  }
}