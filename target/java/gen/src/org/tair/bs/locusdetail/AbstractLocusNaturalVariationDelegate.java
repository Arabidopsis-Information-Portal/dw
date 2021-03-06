/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDelegate.vsl

package org.tair.bs.locusdetail;


import com.poesys.bs.delegate.AbstractReadOnlyDataDelegate;
import com.poesys.bs.delegate.DelegateException;
import com.poesys.db.connection.IConnectionFactory.DBMS;
import com.poesys.db.dao.query.IKeyQuerySql;
import com.poesys.db.dao.query.IQuerySql;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * LocusNaturalVariation objects and their dependents. You should not modify this class;
 * instead, override or add methods in the class LocusNaturalVariationDelegate, which
 * specializes this class.
 * </p>
 * <p>
 * a naturally-occurring polymorphism between two ecotypes; induced polymorphisms
 * are differences within a single ecotype, whereas natural variation polymorphisms
 * differ between ecotypes
 * </p>
 * @see LocusNaturalVariationDelegate
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractLocusNaturalVariationDelegate
    extends AbstractReadOnlyDataDelegate<BsLocusNaturalVariation, org.tair.db.locusdetail.ILocusNaturalVariation, com.poesys.db.pk.CompositePrimaryKey> {
  /**
   * Create an AbstractLocusNaturalVariationDelegate object by supplying the database
   * subsystem in the database.properties file.
   * 
   * @param subsystem the database subsystem to use in database.properties
   */
  public AbstractLocusNaturalVariationDelegate(String subsystem) {
    super(subsystem, 2147483647);
  }

  /**
   * Create an AbstractLocusNaturalVariationDelegate object by supplying the database
   * subsystem in the database.properties file and a specific DBMS, usually
   * IConnectionFactory.DBMS.JNDI.
   * 
   * @param subsystem the database subsystem to use in database.properties
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public AbstractLocusNaturalVariationDelegate(String subsystem, DBMS dbms) {
    super(subsystem, dbms, 2147483647);
  }

  @Override
  protected String getClassName() {
    return org.tair.db.locusdetail.LocusNaturalVariation.class.getName();
  }

  @Override
  protected IKeyQuerySql<org.tair.db.locusdetail.ILocusNaturalVariation> getQueryByKeySql() {
    return new org.tair.db.locusdetail.sql.QueryLocusNaturalVariation();
  }

  @Override
  protected IQuerySql<org.tair.db.locusdetail.ILocusNaturalVariation> getQueryListSql() {
    // Query-All method not required
    return new org.tair.db.locusdetail.sql.QueryAllLocusNaturalVariation();
  }

  @Override
  protected org.tair.bs.locusdetail.BsLocusNaturalVariation wrapData(org.tair.db.locusdetail.ILocusNaturalVariation dto) {
    return new org.tair.bs.locusdetail.BsLocusNaturalVariation(dto);
  }

  /**
   * <p>
   * Create a new LocusNaturalVariation with data fields.
   * </p>
   * <p>
   * The LocusNaturalVariation class has no key of its own but inherits from a superclass
   * that has a CompositeKey. When you create an instance of this
   * class, the delegate creates a key of that type in the superclass.
   * </p>
   * 
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param polymorphismName the name of the polymorphism
   * @param polymorphismTairObjectId the TAIR object id for the polymorphism, used in URL links to the polymorphism
   * @param polymorphismType the kind of difference (insertion, substitution, deletion)
   * @param length the length of the polymorphic region in base pairs (bp)
   * @param start the starting position on the AGI map of the polymorphism
   * @param end the end position of the polymorphic region in the AGI map
   * @param detail a text representation of the structural details of the polymorphic difference
between the ecotypes (for example, a SNP with G->A)
   * @param accession foreign key used by setter to query associated object
   * @param name foreign key used by setter to query associated object
   * @param taxonId foreign key used by setter to query associated object
   * @return the new LocusNaturalVariation object
   * @throws DelegateException when there is a problem generating the key or
   *             creating the object
   */
  public org.tair.bs.locusdetail.BsLocusNaturalVariation createLocusNaturalVariation(java.lang.Long locusTairObjectId, java.lang.String polymorphismName, java.lang.Long polymorphismTairObjectId, java.lang.String polymorphismType, java.lang.Long length, java.lang.Long start, java.lang.Long end, java.lang.String detail, java.lang.String accession, java.lang.String name, java.lang.Long taxonId)
      throws DelegateException {
    // Create the composite key.
    com.poesys.db.pk.IPrimaryKey key = 
      org.tair.db.locusdetail.LocusdetailFactory.getLocusNaturalVariationPrimaryKey(locusTairObjectId, polymorphismName);
      
    // Create a data-access DTO proxy (supports lazy loading).
    org.tair.db.locusdetail.ILocusNaturalVariation dto =
      new org.tair.db.locusdetail.LocusNaturalVariationProxy(new org.tair.db.locusdetail.LocusNaturalVariation(key, locusTairObjectId, polymorphismName, polymorphismTairObjectId, polymorphismType, length, start, end, detail, accession, name, taxonId));

    // Create the business DTO.
    return new org.tair.bs.locusdetail.BsLocusNaturalVariation(dto);
  }

  /**
   * Create a new LocusNaturalVariationEcotype child of LocusNaturalVariation with a composite key.
   * 
   * @param parent the parent of the child object to create
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param polymorphismName composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param accession the accession identifier for this particular variant (second part of the primary
key); nulls in the original database translate into zero.
   * @param name the name of the variant ecotype or species variant; first part of the primary
key
   * @param taxonId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @return a new LocusNaturalVariationEcotype business layer DTO
   * @throws DelegateException when a parameter causes a problem
   */
  public org.tair.bs.locusdetail.BsLocusNaturalVariationEcotype createLocusNaturalVariationEcotype(org.tair.bs.locusdetail.BsLocusNaturalVariation parent, java.lang.Long locusTairObjectId, java.lang.String polymorphismName, java.lang.String accession, java.lang.String name, java.lang.Long taxonId) throws DelegateException {
    // Create the key.
    com.poesys.db.pk.CompositePrimaryKey key = null;
    try {
      java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
      list.add(new com.poesys.db.col.StringColumnValue("accession", accession));
      list.add(new com.poesys.db.col.StringColumnValue("name", name));
      list.add(new com.poesys.db.col.LongColumnValue("taxonId", taxonId));
	  com.poesys.db.pk.IPrimaryKey subKey = 
	    com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.tair.db.locusdetail.LocusNaturalVariationEcotype");
      key = 
        com.poesys.db.pk.PrimaryKeyFactory.createCompositeKey(parent.getPrimaryKey(), 
                                                              subKey,
                                                              "org.tair.db.locusdetail.LocusNaturalVariationEcotype");
    } catch (com.poesys.db.InvalidParametersException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.DuplicateKeyNameException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    }

    // Create a composite-key child data-access LocusNaturalVariationEcotype DTO for direct access, no proxy required.
    org.tair.db.locusdetail.ILocusNaturalVariationEcotype dto =
      new org.tair.db.locusdetail.LocusNaturalVariationEcotype(key, locusTairObjectId, polymorphismName, accession, name, taxonId);

    // Create the business DTO.
    return new org.tair.bs.locusdetail.BsLocusNaturalVariationEcotype(dto);
  }
}
