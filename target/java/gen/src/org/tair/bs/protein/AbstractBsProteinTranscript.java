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


import org.tair.db.protein.IProteinTranscript;
import org.tair.db.protein.ProteinTranscriptProxy;
import org.tair.db.protein.ProteinTranscript;


/**
 * <p>
 * A business layer data-transfer object (DTO) for the ProteinTranscript. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * 
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>CompositeKey</li>
 *     <li>Persistent</li>
 * </ul>
 * <p>
 * Class is read/write: true
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractBsProteinTranscript 
    extends AbstractDto<org.tair.db.protein.IProteinTranscript> {

  /**
   * Create a BsProteinTranscript object from a ProteinTranscript object.
   * 
   * @param dto the data-access layer ProteinTranscript DTO
   * @throws DelegateException when there is a problem creating the ProteinTranscript
   */
  public AbstractBsProteinTranscript(IProteinTranscript dto) throws DelegateException {
    super(dto);
  }

  /**
   * Create a ProteinTranscript from new data.
   *
   * @param key the primary key of the ProteinTranscript
   * @param tairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param geneTairObjectId the unique identifier in TAIR for the transcript
   * @param name 
   */
  public AbstractBsProteinTranscript(IPrimaryKey key, java.lang.Long tairObjectId, java.lang.Long geneTairObjectId, java.lang.String name) {
    super(new ProteinTranscriptProxy(new ProteinTranscript(key, tairObjectId, geneTairObjectId, name)));
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object arg0) {
    // Unchecked cast here
    IDto<IProteinTranscript> other = (IDto<IProteinTranscript>)arg0;
    return dto.equals(other.toDto());
  }

  @Override
  public int hashCode() {
    return dto.hashCode();
  }

  public int compareTo(IDto<IProteinTranscript> o) {
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
   * <li>Property is defined in the data-access object ProteinTranscript</li>
   * </ul>
   * </p>
   * @return a java.lang.Long tairObjectId
   */
  public java.lang.Long getTairObjectId() {
    return dto.getTairObjectId();
  }

  /**
   * <p>
   * the unique identifier in TAIR for the transcript
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object ProteinTranscript</li>
   * </ul>
   * </p>
   * @return a java.lang.Long geneTairObjectId
   */
  public java.lang.Long getGeneTairObjectId() {
    return dto.getGeneTairObjectId();
  }

  /**
   * 
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object ProteinTranscript</li>
   * </ul>
   * </p>
   * @return a java.lang.String name
   */
  public java.lang.String getName() {
    return dto.getName();
  }

  /**
   * <p>
   * Set the name.
   * </p>
   * 
   * <p>
   * Added by AddLocalAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object ProteinTranscript</li>
   * </ul>
   * </p>
   * @param name the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   */
  public void setName(java.lang.String name) 
      throws com.poesys.db.dto.DtoStatusException {
    dto.setName(name);
  }

  /**
   * 
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object ProteinTranscript</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.protein.BsProtein protein
   */
  public org.tair.bs.protein.BsProtein getProtein() {
    // Return 4
    return new org.tair.bs.protein.BsProtein(dto.getProtein());
  }

  /**
   * <p>
   * Set the protein.
   * </p>
   * 
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object ProteinTranscript</li>
   * </ul>
   * </p>
   * @param protein the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter protein is null
   */
  public void setProtein(org.tair.bs.protein.BsProtein protein) 
      throws com.poesys.db.dto.DtoStatusException , com.poesys.db.InvalidParametersException {
    dto.setProtein(protein.toDto());
  }
}