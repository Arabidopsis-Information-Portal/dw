/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQueryAll.vsl

package org.tair.db.protein.sql;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.InvalidParametersException;
import com.poesys.db.dao.query.IQuerySql;
import com.poesys.db.pk.IPrimaryKey;

import org.tair.db.protein.ProteinFactory;


/**
 * <p>
 * A query Command pattern object that implements a SQL query for all the 
 * Domain objects in the database; use with caution
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryAllDomain implements IQuerySql<org.tair.db.protein.IDomain> {
  /** SQL query statement for Domain */
  private static final String SQL =
    "SELECT tairObjectId, domainTairObjectId, name, database, structuralClassType, accession, interproAccession, interpro, startPosition, endPosition FROM Domain";

  public org.tair.db.protein.IDomain getData(ResultSet rs) throws SQLException {
    IPrimaryKey key = 
      ProteinFactory.getDomainPrimaryKey(rs, "");
      
    return ProteinFactory.getDomainData(key, rs);
  }
  
  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return ProteinFactory.getDomainPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}