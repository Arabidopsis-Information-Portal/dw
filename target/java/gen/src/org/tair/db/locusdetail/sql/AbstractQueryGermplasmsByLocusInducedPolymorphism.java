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
 * LocusGermplasm objects using the primary key of an associated 
 * LocusInducedPolymorphism object through the association Germplasms. This
 * is a many-to-one association from LocusGermplasm to LocusInducedPolymorphism.
 * </p>
 * <p>
 * This SQL specification contains a SQL statement that queries a collection of
 * LocusGermplasm objects from the database using the foreign key type
 * LocusInducedPolymorphism.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryGermplasmsByLocusInducedPolymorphism 
    implements IParameterizedQuerySql<org.tair.db.locusdetail.ILocusGermplasm, org.tair.db.locusdetail.ILocusInducedPolymorphism> {
  /** SQL query statement for LocusGermplasm */
  private static final String SQL =
    "SELECT LocusGermplasm.locusTairObjectId, LocusGermplasm.polymorphismName, LocusGermplasm.germplasmName, LocusGermplasm.germplasmTairObjectId, LocusGermplasm.phenotype FROM LocusGermplasm WHERE LocusGermplasm.locusTairObjectId = ? AND LocusGermplasm.polymorphismName = ?";

  public void bindParameters(PreparedStatement stmt, org.tair.db.locusdetail.ILocusInducedPolymorphism parameters)
      throws SQLException {
    // Set the parameters starting with the first parameter.
    parameters.getPrimaryKey().setParams(stmt, 1);
  }

  public String getParameterValues(org.tair.db.locusdetail.ILocusInducedPolymorphism parameters) {
    // Create the output string with the key parameters.
    return parameters.getPrimaryKey().getValueList();
  }

  public org.tair.db.locusdetail.ILocusGermplasm getData(ResultSet rs) throws SQLException,
      ConstraintViolationException {
    return org.tair.db.locusdetail.LocusdetailFactory.getLocusGermplasmData(getPrimaryKey(rs), rs);
  }

  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return org.tair.db.locusdetail.LocusdetailFactory.getLocusGermplasmPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}