/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.locusdetail;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the ModelFeatures. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * The coordinates for gene features (exons and introns) of a gene model of a
 * locus, including UTR and CDS information; each coordinates object is identified
 * by the locus, the gene model, the feature type (intron/exon), and the feature
 * number (the order of the feature within the region); the n features of each type
 * are ordered by the feature numbers from the 5' end (1) to the 3' end (n),
 * starting with exon 1.
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
public class BsModelFeatures extends org.tair.bs.locusdetail.AbstractBsModelFeatures {
  /**
   * Create a BsModelFeatures object from a ModelFeatures object.
   * 
   * @param dto the data-access layer ModelFeatures DTO
   * @throws DelegateException when there is a problem creating the ModelFeatures
   */
  public BsModelFeatures(org.tair.db.locusdetail.IModelFeatures dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsModelFeatures. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the ModelFeatures
   * @param geneModelName composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param featureType the kind of feature: intron or exon
   * @param featureNumber an integer that uniquely identifies the feature within the locus, gene model,
and feature type; also orders the feature within the feature type
   * @param start the starting coordinate for the feature within the gene
   * @param end the ending coordinate for the feature within the gene
   * @param agiStart the starting coordinate for the feature on the chromosome
   * @param agiEnd the ending coordinate of the feature on the chromosome
   */
  public BsModelFeatures(IPrimaryKey key, java.lang.String geneModelName, java.lang.Long locusTairObjectId, java.lang.String featureType, java.lang.Integer featureNumber, java.lang.Integer start, java.lang.Integer end, java.lang.Integer agiStart, java.lang.Integer agiEnd) {
    super(key, geneModelName, locusTairObjectId, featureType, featureNumber, start, end, agiStart, agiEnd); 
  }
}