/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDelete.vsl

package org.tair.db.locusdetail.sql;



import com.poesys.db.dao.delete.AbstractDeleteSql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * SQL statement specification for deleting a LocusGeneModelEstAlias
 * 
 * @author Robert J. Muller
 */
public class AbstractDeleteLocusGeneModelEstAlias extends AbstractDeleteSql<org.tair.db.locusdetail.ILocusGeneModelEstAlias> {
  private static final String SQL =
    "DELETE FROM LocusGeneModelEstAlias WHERE ";

  public String getSql(IPrimaryKey key) {
    return super.getSql(key, SQL);
  }
}
