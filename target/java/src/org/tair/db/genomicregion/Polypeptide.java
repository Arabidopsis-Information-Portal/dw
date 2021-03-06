/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.genomicregion;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the Polypeptide. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * SO_0000104: A sequence of amino acids linked by peptide bonds which may lack
 * appreciable tertiary structure and may not be liable to irreversible
 * denaturation. Synonym: protein.
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
public class Polypeptide extends AbstractPolypeptide {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a Polypeptide as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public Polypeptide() {
    super(); 
  }

  /**
   * <p>
   * Create a Polypeptide. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Polypeptide
   * @param tairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param aaSequenceId the unique TAIR amino acid sequence identifier
   * @param genbankDefinition the protein definition from GenBank
   * @param experimental whether the protein sequence was experimentally determined in vivo
   * @param description text describing the protein
   * @param genbankGi the GenBank GI sequence number associated with the protein
   * @param PirAccession the unique identifier in Protein Information Resource (PIR)
   * @param pl the isoelectric point number for the protein
   * @param molecularWeight the molecular weight of the protein molecule
   * @param ecNumber the Enzyme Commission number for the protein
   * @param tremblId the identifier at TREMBL for the protein
   * @param swissProtId the identifier at SwissProt for the protein
   * @param uniProtId the UniProt identifier for the protein
   * @param dateEntered the date on which the protein record was created in the source database
   */
  public Polypeptide(IPrimaryKey key, java.lang.Long tairObjectId, java.lang.Long aaSequenceId, java.lang.String genbankDefinition, java.lang.Boolean experimental, java.lang.String description, java.lang.String genbankGi, java.lang.String PirAccession, java.lang.Double pl, java.lang.Double molecularWeight, java.lang.String ecNumber, java.lang.String tremblId, java.lang.String swissProtId, java.lang.String uniProtId, java.sql.Timestamp dateEntered) {
    super(key, tairObjectId, aaSequenceId, genbankDefinition, experimental, description, genbankGi, PirAccession, pl, molecularWeight, ecNumber, tremblId, swissProtId, uniProtId, dateEntered); 
  }
}