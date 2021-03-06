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
 * ProteinTranscript objects in the database; use with caution
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryAllProteinTranscript implements IQuerySql<org.tair.db.protein.IProteinTranscript> {
  /** SQL query statement for ProteinTranscript */
  private static final String SQL =
    "SELECT tairObjectId, geneTairObjectId, name FROM ProteinTranscript";

  public org.tair.db.protein.IProteinTranscript getData(ResultSet rs) throws SQLException {
    IPrimaryKey key = 
      ProteinFactory.getProteinTranscriptPrimaryKey(rs, "");
      
    return ProteinFactory.getProteinTranscriptData(key, rs);
  }
  
  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return ProteinFactory.getProteinTranscriptPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}