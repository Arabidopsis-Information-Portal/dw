/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQueryAssociatedOneToManyObjects.vsl

package org.tair.db.locusdetail.sql;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.ConstraintViolationException;
import com.poesys.db.InvalidParametersException;
import com.poesys.db.dao.query.IParameterizedQuerySql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A query Command pattern object that implements a SQL query of a collection of 
 * LocusCdnaAlias objects using the primary key of an associated 
 * LocusCdna object through the association Aliases. This
 * is a many-to-one association from LocusCdnaAlias to LocusCdna.
 * </p>
 * <p>
 * This SQL specification contains a SQL statement that queries a collection of
 * LocusCdnaAlias objects from the database using the foreign key type
 * LocusCdna.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryAliasesByLocusCdna 
    implements IParameterizedQuerySql<org.tair.db.locusdetail.ILocusCdnaAlias, org.tair.db.locusdetail.ILocusCdna> {
  /** SQL query statement for LocusCdnaAlias */
  private static final String SQL =
    "SELECT LocusCdnaAlias.cloneTairObjectId, LocusCdnaAlias.locusTairObjectId, LocusCdnaAlias.alias FROM LocusCdnaAlias WHERE LocusCdnaAlias.cloneTairObjectId = ? AND LocusCdnaAlias.locusTairObjectId = ?";

  public void bindParameters(PreparedStatement stmt, org.tair.db.locusdetail.ILocusCdna parameters)
      throws SQLException {
    // Set the parameters starting with the first parameter.
    parameters.getPrimaryKey().setParams(stmt, 1);
  }

  public String getParameterValues(org.tair.db.locusdetail.ILocusCdna parameters) {
    // Create the output string with the key parameters.
    return parameters.getPrimaryKey().getValueList();
  }

  public org.tair.db.locusdetail.ILocusCdnaAlias getData(ResultSet rs) throws SQLException,
      ConstraintViolationException {
    return org.tair.db.locusdetail.LocusdetailFactory.getLocusCdnaAliasData(getPrimaryKey(rs), rs);
  }

  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return org.tair.db.locusdetail.LocusdetailFactory.getLocusCdnaAliasPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}