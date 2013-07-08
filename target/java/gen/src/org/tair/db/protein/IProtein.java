/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: IDbDto.vsl

package org.tair.db.protein;

import com.poesys.db.dto.IDbDto;

import com.poesys.db.dto.DtoStatusException;
import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer-object interface for the Protein. 
 * The data-transfer-object class and proxy class implement this interface, as
 * does the business-layer data-transfer-object class.
 * </p>
 * <p>
 * An amino acid possibly related to a transcript
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>NaturalKey</li>
 *     <li>Persistent</li>
 * </ul>
 * <p>
 * Class is read/write: true
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public interface IProtein extends IDbDto {

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
   * 
   * <p>
   * Added by AddNaturalKeyProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: tairObjectId
   * </p>
   * @return a java.lang.Long tairObjectId
   */
  public java.lang.Long getTairObjectId();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * 
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: name
   * </p>
   * @return a java.lang.String name
   */
  public java.lang.String getName();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the name.
   * </p>
   *
   * @param name the value to set into the name
   * @throws com.poesys.db.InvalidParametersException when the name 
   *       value is null
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setName(java.lang.String name) throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException;


  /**
   * 
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: sequence
   * </p>
   * @return a java.lang.String sequence
   */
  public java.lang.String getSequence();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the sequence.
   * </p>
   *
   * @param sequence the value to set into the sequence
   * @throws com.poesys.db.InvalidParametersException when the sequence 
   *       value is null
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setSequence(java.lang.String sequence) throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException;


  /**
   * 
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: genbankGi
   * </p>
   * @return a java.lang.String genbankGi
   */
  public java.lang.String getGenbankGi();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the genbankGi.
   * </p>
   *
   * @param genbankGi the value to set into the genbankGi
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setGenbankGi(java.lang.String genbankGi) throws com.poesys.db.dto.DtoStatusException;


  /**
   * 
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: genPept
   * </p>
   * @return a java.lang.String genPept
   */
  public java.lang.String getGenPept();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the genPept.
   * </p>
   *
   * @param genPept the value to set into the genPept
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setGenPept(java.lang.String genPept) throws com.poesys.db.dto.DtoStatusException;


  /**
   * 
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: molecularWeight
   * </p>
   * @return a java.lang.Double molecularWeight
   */
  public java.lang.Double getMolecularWeight();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the molecularWeight.
   * </p>
   *
   * @param molecularWeight the value to set into the molecularWeight
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setMolecularWeight(java.lang.Double molecularWeight) throws com.poesys.db.dto.DtoStatusException;


  /**
   * 
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: isoelectricPoint
   * </p>
   * @return a java.lang.Double isoelectricPoint
   */
  public java.lang.Double getIsoelectricPoint();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the isoelectricPoint.
   * </p>
   *
   * @param isoelectricPoint the value to set into the isoelectricPoint
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setIsoelectricPoint(java.lang.Double isoelectricPoint) throws com.poesys.db.dto.DtoStatusException;


  /**
   * 
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: length
   * </p>
   * @return a java.lang.Integer length
   */
  public java.lang.Integer getLength();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the length.
   * </p>
   *
   * @param length the value to set into the length
   * @throws com.poesys.db.InvalidParametersException when the length 
   *       value is null
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setLength(java.lang.Integer length) throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException;


  /**
   * 
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: dateLastModified
   * </p>
   * @return a java.sql.Timestamp dateLastModified
   */
  public java.sql.Timestamp getDateLastModified();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the dateLastModified.
   * </p>
   *
   * @param dateLastModified the value to set into the dateLastModified
   * @throws com.poesys.db.InvalidParametersException when the dateLastModified 
   *       value is null
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setDateLastModified(java.sql.Timestamp dateLastModified) throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException;


  /**
   * 
   * <p>
   * Added by AddToManyChildCollectionProperties
   * Owning DTO: ProteinTranscript
   * Owning package: org.tair.db.protein
   * Property prefix: transcript
   * </p>
   * @return a java.util.Collection<org.tair.db.protein.IProteinTranscript> transcript
   */
  public java.util.Collection<org.tair.db.protein.IProteinTranscript> getTranscript();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the transcript.
   * </p>
   *
   * @param transcript the value to set into the transcript
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setTranscript(java.util.Collection<org.tair.db.protein.IProteinTranscript> transcript) throws com.poesys.db.dto.DtoStatusException;


  /**
   * <p>
   * the set of domains in the protein
   * </p>
   * <p>
   * Added by AddToManyChildCollectionProperties
   * Owning DTO: Domain
   * Owning package: org.tair.db.protein
   * Property prefix: domains
   * </p>
   * @return a java.util.Collection<org.tair.db.protein.IDomain> domains
   */
  public java.util.Collection<org.tair.db.protein.IDomain> getDomains();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the domains.
   * </p>
   *
   * @param domains the value to set into the domains
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setDomains(java.util.Collection<org.tair.db.protein.IDomain> domains) throws com.poesys.db.dto.DtoStatusException;


  /**
   * <p>
   * the set of resource links that apply to the protein
   * </p>
   * <p>
   * Added by AddToManyChildCollectionProperties
   * Owning DTO: ProteinResourceLink
   * Owning package: org.tair.db.protein
   * Property prefix: links
   * </p>
   * @return a java.util.Collection<org.tair.db.protein.IProteinResourceLink> links
   */
  public java.util.Collection<org.tair.db.protein.IProteinResourceLink> getLinks();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the links.
   * </p>
   *
   * @param links the value to set into the links
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setLinks(java.util.Collection<org.tair.db.protein.IProteinResourceLink> links) throws com.poesys.db.dto.DtoStatusException;


  /**
   * Add a ProteinTranscript object to the transcript collection.
   *
   * @param object the object to add to the collection
   */
  public void addTranscriptProteinTranscript(org.tair.db.protein.IProteinTranscript object);

  /**
   * Add a Domain object to the domains collection.
   *
   * @param object the object to add to the collection
   */
  public void addDomainsDomain(org.tair.db.protein.IDomain object);

  /**
   * Add a ProteinResourceLink object to the links collection.
   *
   * @param object the object to add to the collection
   */
  public void addLinksProteinResourceLink(org.tair.db.protein.IProteinResourceLink object);
}