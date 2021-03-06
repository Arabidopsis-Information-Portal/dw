/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractInsert.vsl

package org.tair.db.locusdetail.sql;



import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.poesys.db.dao.insert.IInsertSql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * SQL statement specification for inserting a LocusEstAlias
 * 
 * @author Robert J. Muller
 */
public class AbstractInsertLocusEstAlias implements IInsertSql<org.tair.db.locusdetail.ILocusEstAlias> {
  private static final String SQL =
    "INSERT INTO LocusEstAlias (alias, cloneEndTairObjectId, locusTairObjectId) VALUES (?,?,?)";

  public String getSql(IPrimaryKey key) {
    return SQL;
  }

  public void setParams(PreparedStatement stmt, int index, org.tair.db.locusdetail.ILocusEstAlias object)
      throws SQLException {
  }
}
