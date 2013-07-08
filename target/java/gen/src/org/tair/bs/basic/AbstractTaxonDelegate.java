/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDelegate.vsl

package org.tair.bs.basic;


import com.poesys.bs.delegate.AbstractReadOnlyDataDelegate;
import com.poesys.bs.delegate.DelegateException;
import com.poesys.db.connection.IConnectionFactory.DBMS;
import com.poesys.db.dao.query.IKeyQuerySql;
import com.poesys.db.dao.query.IQuerySql;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * Taxon objects and their dependents. You should not modify this class;
 * instead, override or add methods in the class TaxonDelegate, which
 * specializes this class.
 * </p>
 * <p>
 * The species identification for a set of loci
 * </p>
 * @see TaxonDelegate
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractTaxonDelegate
    extends AbstractReadOnlyDataDelegate<BsTaxon, org.tair.db.basic.ITaxon, com.poesys.db.pk.NaturalPrimaryKey> {
  /**
   * Create an AbstractTaxonDelegate object by supplying the database
   * subsystem in the database.properties file.
   * 
   * @param subsystem the database subsystem to use in database.properties
   */
  public AbstractTaxonDelegate(String subsystem) {
    super(subsystem, 2147483647);
  }

  /**
   * Create an AbstractTaxonDelegate object by supplying the database
   * subsystem in the database.properties file and a specific DBMS, usually
   * IConnectionFactory.DBMS.JNDI.
   * 
   * @param subsystem the database subsystem to use in database.properties
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public AbstractTaxonDelegate(String subsystem, DBMS dbms) {
    super(subsystem, dbms, 2147483647);
  }

  @Override
  protected String getClassName() {
    return org.tair.db.basic.Taxon.class.getName();
  }

  @Override
  protected IKeyQuerySql<org.tair.db.basic.ITaxon> getQueryByKeySql() {
    return new org.tair.db.basic.sql.QueryTaxon();
  }

  @Override
  protected IQuerySql<org.tair.db.basic.ITaxon> getQueryListSql() {
    // Query-All method not required
    return new org.tair.db.basic.sql.QueryAllTaxon();
  }

  @Override
  protected org.tair.bs.basic.BsTaxon wrapData(org.tair.db.basic.ITaxon dto) {
    return new org.tair.bs.basic.BsTaxon(dto);
  }

  /**
   * <p>
   * Create a new Taxon with data fields.
   * </p>
   * <p>
   * The Taxon class has a natural key; this method creates the primary
   * key from the appropriate input properties.
   * </p>
   * 
   * @param taxonId a unique identifier for the species taxon
   * @param genus the scientific genus name (collection of related species)
   * @param species the scientific species name within the genus
   * @param common the common botanical or zoological name for the species
   * @return the new Taxon object
   * @throws DelegateException when there is a problem generating the key or
   *             creating the object
   */
  public org.tair.bs.basic.BsTaxon createTaxon(java.lang.Long taxonId, java.lang.String genus, java.lang.String species, java.lang.String common)
      throws DelegateException {
    com.poesys.db.pk.NaturalPrimaryKey key = null;
    try {
      java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
      list.add(new com.poesys.db.col.LongColumnValue("taxonId", taxonId));
      key = 
        com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.tair.db.basic.Taxon");
    } catch (com.poesys.db.InvalidParametersException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.DuplicateKeyNameException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    }

    // Create a data-access DTO for direct access, no proxy required.
    org.tair.db.basic.ITaxon dto =
      new org.tair.db.basic.Taxon(key, taxonId, genus, species, common);

    // Create the business DTO.
    return new org.tair.bs.basic.BsTaxon(dto);
  }

  /**
   * Create a new SpeciesVariant child of Taxon with a composite key.
   * 
   * @param parent the parent of the child object to create
   * @param taxonId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param name the name of the variant ecotype or species variant; first part of the primary
key
   * @param accession the accession identifier for this particular variant (second part of the primary
key); nulls in the original database translate into zero.
   * @param reference whether this is the reference species variant/ecotype for the taxon
   * @return a new SpeciesVariant business layer DTO
   * @throws DelegateException when a parameter causes a problem
   */
  public org.tair.bs.basic.BsSpeciesVariant createSpeciesVariant(org.tair.bs.basic.BsTaxon parent, java.lang.Long taxonId, java.lang.String name, java.lang.String accession, java.lang.Boolean reference) throws DelegateException {
    // Create the key.
    com.poesys.db.pk.CompositePrimaryKey key = null;
    try {
      java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
      list.add(new com.poesys.db.col.StringColumnValue("name", name));
      list.add(new com.poesys.db.col.StringColumnValue("accession", accession));
	  com.poesys.db.pk.IPrimaryKey subKey = 
	    com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.tair.db.basic.SpeciesVariant");
      key = 
        com.poesys.db.pk.PrimaryKeyFactory.createCompositeKey(parent.getPrimaryKey(), 
                                                              subKey,
                                                              "org.tair.db.basic.SpeciesVariant");
    } catch (com.poesys.db.InvalidParametersException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.DuplicateKeyNameException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    }

    // Create a composite-key child data-access SpeciesVariant DTO for direct access, no proxy required.
    org.tair.db.basic.ISpeciesVariant dto =
      new org.tair.db.basic.SpeciesVariant(key, taxonId, name, accession, reference);

    // Create the business DTO.
    return new org.tair.bs.basic.BsSpeciesVariant(dto);
  }
}
