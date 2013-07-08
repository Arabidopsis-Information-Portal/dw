/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractInsert.vsl

package org.tair.db.genomicregion.sql;



import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.poesys.db.dao.insert.IInsertSql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * SQL statement specification for inserting a Est
 * 
 * @author Robert J. Muller
 */
public class AbstractInsertEst implements IInsertSql<org.tair.db.genomicregion.IEst> {
  private static final String SQL =
    "INSERT INTO Est (seqTairObjectId, tairObjectId, name, sequence, genbankAccession, length, startPosition, endPosition, cloneName, cloneId, dateEntered) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

  public String getSql(IPrimaryKey key) {
    return SQL;
  }

  public void setParams(PreparedStatement stmt, int index, org.tair.db.genomicregion.IEst object)
      throws SQLException {
    stmt.setString(index, object.getName());
    index++;
    stmt.setString(index, object.getSequence());
    index++;
    stmt.setString(index, object.getGenbankAccession());
    index++;
    stmt.setLong(index, object.getLength());
    index++;
    stmt.setLong(index, object.getStartPosition());
    index++;
    stmt.setLong(index, object.getEndPosition());
    index++;
    stmt.setString(index, object.getCloneName());
    index++;
    stmt.setLong(index, object.getCloneId());
    index++;
    stmt.setTimestamp(index, object.getDateEntered());
    index++;
  }
}