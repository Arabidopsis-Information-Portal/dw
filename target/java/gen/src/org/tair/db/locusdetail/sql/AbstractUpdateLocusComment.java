/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractUpdate.vsl

package org.tair.db.locusdetail.sql;


import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.poesys.db.dao.update.IUpdateSql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * SQL statement specification for updating a LocusComment with read/write properties
 * 
 * @author Robert J. Muller
 */
public class AbstractUpdateLocusComment implements IUpdateSql<org.tair.db.locusdetail.ILocusComment> {
  private static final String SQL =
    "UPDATE LocusComment SET locusCommentNo = ? WHERE ";

  public String getSql(IPrimaryKey key) {
    StringBuilder builder = new StringBuilder(SQL);
    builder.append(key.getSqlWhereExpression(""));
    return builder.toString();
  }

  public int setParams(PreparedStatement stmt, int index, org.tair.db.locusdetail.ILocusComment object)
      throws SQLException {
    stmt.setBigDecimal(index, object.getLocusCommentNo() == null ? null : new java.math.BigDecimal(object.getLocusCommentNo()));
    index++;
    // sets primary key in where clause
    index = object.getPrimaryKey().setParams(stmt, index);
    return index;
  }
}
