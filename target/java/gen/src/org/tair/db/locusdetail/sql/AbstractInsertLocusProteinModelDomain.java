/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractInsert.vsl

package org.tair.db.locusdetail.sql;



import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.poesys.db.dao.insert.IInsertSql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * SQL statement specification for inserting a LocusProteinModelDomain
 * 
 * @author Robert J. Muller
 */
public class AbstractInsertLocusProteinModelDomain implements IInsertSql<org.tair.db.locusdetail.ILocusProteinModelDomain> {
  private static final String SQL =
    "INSERT INTO LocusProteinModelDomain (id, locusTairObjectId, positionNumber, start, end) VALUES (?,?,?,?,?)";

  public String getSql(IPrimaryKey key) {
    return SQL;
  }

  public void setParams(PreparedStatement stmt, int index, org.tair.db.locusdetail.ILocusProteinModelDomain object)
      throws SQLException {
    stmt.setInt(index, object.getStart());
    index++;
    stmt.setInt(index, object.getEnd());
    index++;
  }
}
