/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDelete.vsl

package org.tair.db.locusdetail.sql;



import com.poesys.db.dao.delete.AbstractDeleteSql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * SQL statement specification for deleting a LocusProteinModel
 * 
 * @author Robert J. Muller
 */
public class AbstractDeleteLocusProteinModel extends AbstractDeleteSql<org.tair.db.locusdetail.ILocusProteinModel> {
  private static final String SQL =
    "DELETE FROM LocusProteinModel WHERE ";

  public String getSql(IPrimaryKey key) {
    return super.getSql(key, SQL);
  }
}