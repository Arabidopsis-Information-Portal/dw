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
 * CommunityReference. This SQL specification contains a SQL statement that queries
 * a single CommunityReference object from the database using the primary key.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryCommunityReference implements IKeyQuerySql<org.tair.db.community.ICommunityReference> {
  /** SQL query statement for CommunityReference */
  private static final String SQL =
    "SELECT communityId, tairObjectId, title, source, publicationYear FROM CommunityReference WHERE ";

  public org.tair.db.community.ICommunityReference getData(IPrimaryKey key, ResultSet rs) throws SQLException {
    return org.tair.db.community.CommunityFactory.getCommunityReferenceData(key, rs);
  }

  public String getSql(IPrimaryKey key) {
    return SQL + key.getSqlWhereExpression("");
  }
}