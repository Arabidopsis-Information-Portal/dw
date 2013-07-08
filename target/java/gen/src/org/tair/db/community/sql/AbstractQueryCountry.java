/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQuery.vsl

package org.tair.db.community.sql;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.dao.query.IKeyQuerySql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A query Command pattern object that implements a SQL key query for the 
 * Country. This SQL specification contains a SQL statement that queries
 * a single Country object from the database using the primary key.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryCountry implements IKeyQuerySql<org.tair.db.community.ICountry> {
  /** SQL query statement for Country */
  private static final String SQL =
    "SELECT countryId, name FROM Country WHERE ";

  public org.tair.db.community.ICountry getData(IPrimaryKey key, ResultSet rs) throws SQLException {
    return org.tair.db.community.CommunityFactory.getCountryData(key, rs);
  }

  public String getSql(IPrimaryKey key) {
    return SQL + key.getSqlWhereExpression("");
  }
}