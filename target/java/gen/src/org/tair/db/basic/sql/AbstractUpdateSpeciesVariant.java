/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractUpdate.vsl

package org.tair.db.basic.sql;


import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.poesys.db.dao.update.IUpdateSql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * SQL statement specification for updating a SpeciesVariant with read/write properties
 * 
 * @author Robert J. Muller
 */
public class AbstractUpdateSpeciesVariant implements IUpdateSql<org.tair.db.basic.ISpeciesVariant> {
  private static final String SQL =
    "UPDATE SpeciesVariant SET reference = ? WHERE ";

  public String getSql(IPrimaryKey key) {
    StringBuilder builder = new StringBuilder(SQL);
    builder.append(key.getSqlWhereExpression(""));
    return builder.toString();
  }

  public int setParams(PreparedStatement stmt, int index, org.tair.db.basic.ISpeciesVariant object)
      throws SQLException {
    stmt.setInt(index, object.getReference() ? 1 : 0);
    index++;
    // sets primary key in where clause
    index = object.getPrimaryKey().setParams(stmt, index);
    return index;
  }
}
