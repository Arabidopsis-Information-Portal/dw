/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDelete.vsl

package org.tair.db.locusdetail.sql;



import com.poesys.db.dao.delete.AbstractDeleteSql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * SQL statement specification for deleting a LocusGeneModelBac
 * 
 * @author Robert J. Muller
 */
public class AbstractDeleteLocusGeneModelBac extends AbstractDeleteSql<org.tair.db.locusdetail.ILocusGeneModelBac> {
  private static final String SQL =
    "DELETE FROM LocusGeneModelBac WHERE ";

  public String getSql(IPrimaryKey key) {
    return super.getSql(key, SQL);
  }
}
