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
 * SQL statement specification for inserting a LocuslEst
 * 
 * @author Robert J. Muller
 */
public class AbstractInsertLocuslEst implements IInsertSql<org.tair.db.locusdetail.ILocuslEst> {
  private static final String SQL =
    "INSERT INTO LocuslEst (cloneEndTairObjectId, locusTairObjectId, estName, icAccession, length, startPosition, endPosition, cloneName, cloneTairObjectId) VALUES (?,?,?,?,?,?,?,?,?)";

  public String getSql(IPrimaryKey key) {
    return SQL;
  }

  public void setParams(PreparedStatement stmt, int index, org.tair.db.locusdetail.ILocuslEst object)
      throws SQLException {
    stmt.setString(index, object.getEstName());
    index++;
    stmt.setString(index, object.getIcAccession());
    index++;
    stmt.setLong(index, object.getLength());
    index++;
    stmt.setLong(index, object.getStart());
    index++;
    stmt.setLong(index, object.getEnd());
    index++;
    stmt.setString(index, object.getCloneName());
    index++;
    stmt.setLong(index, object.getCloneTairObjectId());
    index++;
  }
}
