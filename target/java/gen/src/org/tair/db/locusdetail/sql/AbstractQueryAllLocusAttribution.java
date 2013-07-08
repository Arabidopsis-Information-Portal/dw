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
 * LocusAttribution objects in the database; use with caution
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryAllLocusAttribution implements IQuerySql<org.tair.db.locusdetail.ILocusAttribution> {
  /** SQL query statement for LocusAttribution */
  private static final String SQL =
    "SELECT locusTairObjectId, locusAttributionNo, attributionType, linkType, communityId, name, attributionDate FROM LocusAttribution";

  public org.tair.db.locusdetail.ILocusAttribution getData(ResultSet rs) throws SQLException {
    IPrimaryKey key = 
      LocusdetailFactory.getLocusAttributionPrimaryKey(rs, "");
      
    return LocusdetailFactory.getLocusAttributionData(key, rs);
  }
  
  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return LocusdetailFactory.getLocusAttributionPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}