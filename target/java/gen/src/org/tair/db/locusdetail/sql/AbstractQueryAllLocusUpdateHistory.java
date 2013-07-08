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
 * LocusUpdateHistory objects in the database; use with caution
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryAllLocusUpdateHistory implements IQuerySql<org.tair.db.locusdetail.ILocusUpdateHistory> {
  /** SQL query statement for LocusUpdateHistory */
  private static final String SQL =
    "SELECT locusTairObjectId, updateType, updateDate, affectedTairObjectId, affectedTairObjectType, affectedTairObjectName FROM LocusUpdateHistory";

  public org.tair.db.locusdetail.ILocusUpdateHistory getData(ResultSet rs) throws SQLException {
    IPrimaryKey key = 
      LocusdetailFactory.getLocusUpdateHistoryPrimaryKey(rs, "");
      
    return LocusdetailFactory.getLocusUpdateHistoryData(key, rs);
  }
  
  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return LocusdetailFactory.getLocusUpdateHistoryPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}