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
 * SQL statement specification for inserting a Variant
 * 
 * @author Robert J. Muller
 */
public class AbstractInsertVariant implements IInsertSql<org.tair.db.locusdetail.IVariant> {
  private static final String SQL =
    "INSERT INTO Variant (ecotype, locusTairObjectId, polymorphismName) VALUES (?,?,?)";

  public String getSql(IPrimaryKey key) {
    return SQL;
  }

  public void setParams(PreparedStatement stmt, int index, org.tair.db.locusdetail.IVariant object)
      throws SQLException {
  }
}