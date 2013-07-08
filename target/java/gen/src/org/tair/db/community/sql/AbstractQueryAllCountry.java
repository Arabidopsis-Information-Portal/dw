/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQueryAll.vsl

package org.tair.db.community.sql;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.InvalidParametersException;
import com.poesys.db.dao.query.IQuerySql;
import com.poesys.db.pk.IPrimaryKey;

import org.tair.db.community.CommunityFactory;


/**
 * <p>
 * A query Command pattern object that implements a SQL query for all the 
 * Country objects in the database; use with caution
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryAllCountry implements IQuerySql<org.tair.db.community.ICountry> {
  /** SQL query statement for Country */
  private static final String SQL =
    "SELECT countryId, name FROM Country";

  public org.tair.db.community.ICountry getData(ResultSet rs) throws SQLException {
    IPrimaryKey key = 
      CommunityFactory.getCountryPrimaryKey(rs, "");
      
    return CommunityFactory.getCountryData(key, rs);
  }
  
  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return CommunityFactory.getCountryPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}