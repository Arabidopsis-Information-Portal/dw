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
 * ProteinResourceLink objects in the database; use with caution
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryAllProteinResourceLink implements IQuerySql<org.tair.db.locusdetail.IProteinResourceLink> {
  /** SQL query statement for ProteinResourceLink */
  private static final String SQL =
    "SELECT geneModelName, locusTairObjectId, sequenceTairObjectId, name, icon, baseUrl, urlVariable, explanation FROM ProteinResourceLink";

  public org.tair.db.locusdetail.IProteinResourceLink getData(ResultSet rs) throws SQLException {
    IPrimaryKey key = 
      LocusdetailFactory.getProteinResourceLinkPrimaryKey(rs, "");
      
    return LocusdetailFactory.getProteinResourceLinkData(key, rs);
  }
  
  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return LocusdetailFactory.getProteinResourceLinkPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}