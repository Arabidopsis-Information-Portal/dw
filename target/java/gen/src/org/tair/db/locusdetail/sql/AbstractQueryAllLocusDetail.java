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
 * LocusDetail objects in the database; use with caution
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryAllLocusDetail implements IQuerySql<org.tair.db.locusdetail.ILocusDetail> {
  /** SQL query statement for LocusDetail */
  private static final String SQL =
    "SELECT locusTairObjectId, locusName, primarySymbol, primarySymbolFullName, chromosome, spanStartPosition, spanEndPosition, curatedSummary, geneModelCount, polymorphismCount, articleCount, abstractCount, geneFamilyName, geneFamilyTairObjectId, taxonId FROM LocusDetail";

  public org.tair.db.locusdetail.ILocusDetail getData(ResultSet rs) throws SQLException {
    IPrimaryKey key = 
      LocusdetailFactory.getLocusDetailPrimaryKey(rs, "");
      
    return LocusdetailFactory.getLocusDetailData(key, rs);
  }
  
  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return LocusdetailFactory.getLocusDetailPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}