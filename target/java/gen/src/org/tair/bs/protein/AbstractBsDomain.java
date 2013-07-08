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


import org.tair.db.protein.IDomain;
import org.tair.db.protein.DomainProxy;
import org.tair.db.protein.Domain;


/**
 * <p>
 * A business layer data-transfer object (DTO) for the Domain. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * a conserved part of a given protein sequence and structure that can evolve,
 * function, and exist independently of the rest of the protein chain
 * </p>
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
public abstract class AbstractBsDomain 
    extends AbstractDto<org.tair.db.protein.IDomain> {

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
   * @param tairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param domainTairObjectId the unique identifier in TAIR for the protein domain
   * @param name the domain name in the originating database
   * @param database the database that contains the domain:
prosite
prints
pir
tigrfam
prodom
hamap
gene3d
smart
panther
pfam
superfam
   * @param structuralClassType One of several structural classes of protein:
All alpha proteins
All beta proteins
Alpha and beta proteins (a/b)
Alpha and beta proteins (a+b)
Multi-domain proteins (alpha and beta)
Membrane and cell surface proteins and peptides
Small proteins
Coiled coil proteins
   * @param accession the identifier in the originating database
   * @param interproAccession the Interpro accession identifier (IPRnnnnn)
   * @param interpro the Interpro domain name in full
   * @param startPosition the starting position of the domain in the amino acid sequence
   * @param endPosition the ending position of the domain in the amino acid sequence
   */
  public AbstractBsDomain(IPrimaryKey key, java.lang.Long tairObjectId, java.lang.Long domainTairObjectId, java.lang.String name, java.lang.String database, java.lang.String structuralClassType, java.lang.String accession, java.lang.String interproAccession, java.lang.String interpro, java.lang.Integer startPosition, java.lang.Integer endPosition) {
    super(new DomainProxy(new Domain(key, tairObjectId, domainTairObjectId, name, database, structuralClassType, accession, interproAccession, interpro, startPosition, endPosition)));
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
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddParentKeyAttributes as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @return a java.lang.Long tairObjectId
   */
  public java.lang.Long getTairObjectId() {
    return dto.getTairObjectId();
  }

  /**
   * <p>
   * the unique identifier in TAIR for the protein domain
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @return a java.lang.Long domainTairObjectId
   */
  public java.lang.Long getDomainTairObjectId() {
    return dto.getDomainTairObjectId();
  }

  /**
   * <p>
   * the domain name in the originating database
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Domain</li>
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
   * <p>
   * the domain name in the originating database
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Domain</li>
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
   * <p>
   * the database that contains the domain:
   * </p>
   * <p>
   * prosite
   * </p>
   * <p>
   * prints
   * </p>
   * <p>
   * pir
   * </p>
   * <p>
   * tigrfam
   * </p>
   * <p>
   * prodom
   * </p>
   * <p>
   * hamap
   * </p>
   * <p>
   * gene3d
   * </p>
   * <p>
   * smart
   * </p>
   * <p>
   * panther
   * </p>
   * <p>
   * pfam
   * </p>
   * <p>
   * superfam
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
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
   * Set the database.
   * </p>
   * <p>
   * the database that contains the domain:
   * </p>
   * <p>
   * prosite
   * </p>
   * <p>
   * prints
   * </p>
   * <p>
   * pir
   * </p>
   * <p>
   * tigrfam
   * </p>
   * <p>
   * prodom
   * </p>
   * <p>
   * hamap
   * </p>
   * <p>
   * gene3d
   * </p>
   * <p>
   * smart
   * </p>
   * <p>
   * panther
   * </p>
   * <p>
   * pfam
   * </p>
   * <p>
   * superfam
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @param database the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   */
  public void setDatabase(java.lang.String database) 
      throws com.poesys.db.dto.DtoStatusException {
    dto.setDatabase(database);
  }

  /**
   * <p>
   * One of several structural classes of protein:
   * </p>
   * <p>
   * All alpha proteins
   * </p>
   * <p>
   * All beta proteins
   * </p>
   * <p>
   * Alpha and beta proteins (a/b)
   * </p>
   * <p>
   * Alpha and beta proteins (a+b)
   * </p>
   * <p>
   * Multi-domain proteins (alpha and beta)
   * </p>
   * <p>
   * Membrane and cell surface proteins and peptides
   * </p>
   * <p>
   * Small proteins
   * </p>
   * <p>
   * Coiled coil proteins
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
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
   * Set the structuralClassType.
   * </p>
   * <p>
   * One of several structural classes of protein:
   * </p>
   * <p>
   * All alpha proteins
   * </p>
   * <p>
   * All beta proteins
   * </p>
   * <p>
   * Alpha and beta proteins (a/b)
   * </p>
   * <p>
   * Alpha and beta proteins (a+b)
   * </p>
   * <p>
   * Multi-domain proteins (alpha and beta)
   * </p>
   * <p>
   * Membrane and cell surface proteins and peptides
   * </p>
   * <p>
   * Small proteins
   * </p>
   * <p>
   * Coiled coil proteins
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @param structuralClassType the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   */
  public void setStructuralClassType(java.lang.String structuralClassType) 
      throws com.poesys.db.dto.DtoStatusException {
    dto.setStructuralClassType(structuralClassType);
  }

  /**
   * <p>
   * the identifier in the originating database
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
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
   * Set the accession.
   * </p>
   * <p>
   * the identifier in the originating database
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @param accession the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   */
  public void setAccession(java.lang.String accession) 
      throws com.poesys.db.dto.DtoStatusException {
    dto.setAccession(accession);
  }

  /**
   * <p>
   * the Interpro accession identifier (IPRnnnnn)
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @return a java.lang.String interproAccession
   */
  public java.lang.String getInterproAccession() {
    return dto.getInterproAccession();
  }

  /**
   * <p>
   * Set the interproAccession.
   * </p>
   * <p>
   * the Interpro accession identifier (IPRnnnnn)
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @param interproAccession the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter interproAccession is null
   */
  public void setInterproAccession(java.lang.String interproAccession) 
      throws com.poesys.db.dto.DtoStatusException , com.poesys.db.InvalidParametersException {
    dto.setInterproAccession(interproAccession);
  }

  /**
   * <p>
   * the Interpro domain name in full
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @return a java.lang.String interpro
   */
  public java.lang.String getInterpro() {
    return dto.getInterpro();
  }

  /**
   * <p>
   * Set the interpro.
   * </p>
   * <p>
   * the Interpro domain name in full
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @param interpro the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter interpro is null
   */
  public void setInterpro(java.lang.String interpro) 
      throws com.poesys.db.dto.DtoStatusException , com.poesys.db.InvalidParametersException {
    dto.setInterpro(interpro);
  }

  /**
   * <p>
   * the starting position of the domain in the amino acid sequence
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @return a java.lang.Integer startPosition
   */
  public java.lang.Integer getStartPosition() {
    return dto.getStartPosition();
  }

  /**
   * <p>
   * Set the startPosition.
   * </p>
   * <p>
   * the starting position of the domain in the amino acid sequence
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @param startPosition the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   */
  public void setStartPosition(java.lang.Integer startPosition) 
      throws com.poesys.db.dto.DtoStatusException {
    dto.setStartPosition(startPosition);
  }

  /**
   * <p>
   * the ending position of the domain in the amino acid sequence
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @return a java.lang.Integer endPosition
   */
  public java.lang.Integer getEndPosition() {
    return dto.getEndPosition();
  }

  /**
   * <p>
   * Set the endPosition.
   * </p>
   * <p>
   * the ending position of the domain in the amino acid sequence
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Domain</li>
   * </ul>
   * </p>
   * @param endPosition the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   */
  public void setEndPosition(java.lang.Integer endPosition) 
      throws com.poesys.db.dto.DtoStatusException {
    dto.setEndPosition(endPosition);
  }

  /**
   * 
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object Domain</li>
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
   * <li>Property is defined in the data-access object Domain</li>
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