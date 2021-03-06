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
 * Affiliation. This SQL specification contains a SQL statement that queries
 * a single Affiliation object from the database using the primary key.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryAffiliation implements IKeyQuerySql<org.tair.db.community.IAffiliation> {
  /** SQL query statement for Affiliation */
  private static final String SQL =
    "SELECT organizationCommunityId, affiliateCommunityId, jobTitle, pi FROM Affiliation WHERE ";

  public org.tair.db.community.IAffiliation getData(IPrimaryKey key, ResultSet rs) throws SQLException {
    return org.tair.db.community.CommunityFactory.getAffiliationData(key, rs);
  }

  public String getSql(IPrimaryKey key) {
    return SQL + key.getSqlWhereExpression("");
  }
}