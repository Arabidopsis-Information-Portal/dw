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
 * SQL statement specification for updating a JournalArticle with read/write properties
 * 
 * @author Robert J. Muller
 */
public class AbstractUpdateJournalArticle implements IUpdateSql<org.tair.db.locusdetail.IJournalArticle> {
  private static final String SQL =
    "UPDATE JournalArticle SET  WHERE ";

  public String getSql(IPrimaryKey key) {
    StringBuilder builder = new StringBuilder(SQL);
    builder.append(key.getSqlWhereExpression(""));
    return builder.toString();
  }

  public int setParams(PreparedStatement stmt, int index, org.tair.db.locusdetail.IJournalArticle object)
      throws SQLException {
    // sets primary key in where clause
    index = object.getPrimaryKey().setParams(stmt, index);
    return index;
  }
}
