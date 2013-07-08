/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQueryAll.vsl

package org.tair.db.locusdetail.sql;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.InvalidParametersException;
import com.poesys.db.dao.query.IQuerySql;
import com.poesys.db.pk.IPrimaryKey;

import org.tair.db.locusdetail.LocusdetailFactory;


/**
 * <p>
 * A query Command pattern object that implements a SQL query for all the 
 * LocuslEst objects in the database; use with caution
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryAllLocuslEst implements IQuerySql<org.tair.db.locusdetail.ILocuslEst> {
  /** SQL query statement for LocuslEst */
  private static final String SQL =
    "SELECT locusTairObjectId, cloneEndTairObjectId, estName, icAccession, length, startPosition, endPosition, cloneName, cloneTairObjectId FROM LocuslEst";

  public org.tair.db.locusdetail.ILocuslEst getData(ResultSet rs) throws SQLException {
    IPrimaryKey key = 
      LocusdetailFactory.getLocuslEstPrimaryKey(rs, "");
      
    return LocusdetailFactory.getLocuslEstData(key, rs);
  }
  
  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return LocusdetailFactory.getLocuslEstPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}