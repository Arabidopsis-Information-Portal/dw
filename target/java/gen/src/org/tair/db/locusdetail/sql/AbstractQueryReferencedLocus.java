/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQuery.vsl

package org.tair.db.locusdetail.sql;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.dao.query.IKeyQuerySql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A query Command pattern object that implements a SQL key query for the 
 * ReferencedLocus. This SQL specification contains a SQL statement that queries
 * a single ReferencedLocus object from the database using the primary key.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryReferencedLocus implements IKeyQuerySql<org.tair.db.locusdetail.IReferencedLocus> {
  /** SQL query statement for ReferencedLocus */
  private static final String SQL =
    "SELECT locusTairObjectId, referenceTairObjectId, refLocusame, refLocusTairObjectId, primarySymbol, primarySymbolFullName FROM ReferencedLocus WHERE ";

  public org.tair.db.locusdetail.IReferencedLocus getData(IPrimaryKey key, ResultSet rs) throws SQLException {
    return org.tair.db.locusdetail.LocusdetailFactory.getReferencedLocusData(key, rs);
  }

  public String getSql(IPrimaryKey key) {
    return SQL + key.getSqlWhereExpression("");
  }
}