/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.tair.bs.genomicregion;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the ReferenceGenome. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * SO_0001505: A collection of sequences (often chromosomes) taken as the standard
 * for a given organism and genome assembly
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>NaturalKey</li>
 *     <li>Persistent</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class BsReferenceGenome extends org.tair.bs.genomicregion.AbstractBsReferenceGenome {
  /**
   * Create a BsReferenceGenome object from a ReferenceGenome object.
   * 
   * @param dto the data-access layer ReferenceGenome DTO
   * @throws DelegateException when there is a problem creating the ReferenceGenome
   */
  public BsReferenceGenome(org.tair.db.genomicregion.IReferenceGenome dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsReferenceGenome. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the ReferenceGenome
   * @param genome the unique name for the reference genome, such as AGI or LYRATA
   * @param dateEntered the date on which the map was entered into the source database
   * @param taxonTaxonId foreign key used by setter to query associated object
   * @param accession foreign key used by setter to query associated object
   * @param name foreign key used by setter to query associated object
   * @param referenceVariantTaxonId foreign key used by setter to query associated object
   */
  public BsReferenceGenome(IPrimaryKey key, java.lang.String genome, java.sql.Timestamp dateEntered, java.lang.Long taxonTaxonId, java.lang.String accession, java.lang.String name, java.lang.Long referenceVariantTaxonId) {
    super(key, genome, dateEntered, taxonTaxonId, accession, name, referenceVariantTaxonId); 
  }
}