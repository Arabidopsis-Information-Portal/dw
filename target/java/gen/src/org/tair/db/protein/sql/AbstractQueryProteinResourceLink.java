/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQuery.vsl

package org.tair.db.protein.sql;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.dao.query.IKeyQuerySql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A query Command pattern object that implements a SQL key query for the 
 * ProteinResourceLink. This SQL specification contains a SQL statement that queries
 * a single ProteinResourceLink object from the database using the primary key.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryProteinResourceLink implements IKeyQuerySql<org.tair.db.protein.IProteinResourceLink> {
  /** SQL query statement for ProteinResourceLink */
  private static final String SQL =
    "SELECT tairObjectId, name, linkType, icon, baseUrl, urlVariable, explanation FROM ProteinResourceLink WHERE ";

  public org.tair.db.protein.IProteinResourceLink getData(IPrimaryKey key, ResultSet rs) throws SQLException {
    return org.tair.db.protein.ProteinFactory.getProteinResourceLinkData(key, rs);
  }

  public String getSql(IPrimaryKey key) {
    return SQL + key.getSqlWhereExpression("");
  }
}