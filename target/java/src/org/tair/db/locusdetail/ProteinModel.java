/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the ProteinModel. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * a protein model for a parent protein-coding gene model
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
public class ProteinModel extends AbstractProteinModel {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a ProteinModel as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public ProteinModel() {
    super(); 
  }

  /**
   * <p>
   * Create a ProteinModel. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the ProteinModel
   * @param geneModelName composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param sequenceTairObjectId the TAIR object id for the sequence; used in links
   * @param length the amino-acid (aa) length of the protein sequence
   * @param molecularWeight the computed molecular weight of the sequence (Da)
   * @param isoelectricPoint the calculated isoelectric point (Pi) of the protein sequence
   */
  public ProteinModel(IPrimaryKey key, java.lang.String geneModelName, java.lang.Long locusTairObjectId, java.lang.Long sequenceTairObjectId, java.lang.Integer length, java.lang.Double molecularWeight, java.lang.Double isoelectricPoint) {
    super(key, geneModelName, locusTairObjectId, sequenceTairObjectId, length, molecularWeight, isoelectricPoint); 
  }
}