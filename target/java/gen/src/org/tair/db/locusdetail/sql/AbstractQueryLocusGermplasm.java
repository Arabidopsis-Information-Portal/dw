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
 * LocusGermplasm. This SQL specification contains a SQL statement that queries
 * a single LocusGermplasm object from the database using the primary key.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryLocusGermplasm implements IKeyQuerySql<org.tair.db.locusdetail.ILocusGermplasm> {
  /** SQL query statement for LocusGermplasm */
  private static final String SQL =
    "SELECT locusTairObjectId, polymorphismName, germplasmName, germplasmTairObjectId, phenotype FROM LocusGermplasm WHERE ";

  public org.tair.db.locusdetail.ILocusGermplasm getData(IPrimaryKey key, ResultSet rs) throws SQLException {
    return org.tair.db.locusdetail.LocusdetailFactory.getLocusGermplasmData(key, rs);
  }

  public String getSql(IPrimaryKey key) {
    return SQL + key.getSqlWhereExpression("");
  }
}