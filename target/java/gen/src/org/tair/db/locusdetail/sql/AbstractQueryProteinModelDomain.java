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
 * ProteinModelDomain. This SQL specification contains a SQL statement that queries
 * a single ProteinModelDomain object from the database using the primary key.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryProteinModelDomain implements IKeyQuerySql<org.tair.db.locusdetail.IProteinModelDomain> {
  /** SQL query statement for ProteinModelDomain */
  private static final String SQL =
    "SELECT accession, geneModelName, locusTairObjectId, sequenceTairObjectId, startPosition, endPosition FROM ProteinModelDomain WHERE ";

  public org.tair.db.locusdetail.IProteinModelDomain getData(IPrimaryKey key, ResultSet rs) throws SQLException {
    return org.tair.db.locusdetail.LocusdetailFactory.getProteinModelDomainData(key, rs);
  }

  public String getSql(IPrimaryKey key) {
    return SQL + key.getSqlWhereExpression("");
  }
}