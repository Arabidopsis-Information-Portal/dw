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
 * ModelFeature objects using the primary key of an associated 
 * LocusGeneModel object through the association Features. This
 * is a many-to-one association from ModelFeature to LocusGeneModel.
 * </p>
 * <p>
 * This SQL specification contains a SQL statement that queries a collection of
 * ModelFeature objects from the database using the foreign key type
 * LocusGeneModel.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryFeaturesByLocusGeneModel 
    implements IParameterizedQuerySql<org.tair.db.locusdetail.IModelFeature, org.tair.db.locusdetail.ILocusGeneModel> {
  /** SQL query statement for ModelFeature */
  private static final String SQL =
    "SELECT ModelFeature.geneModelName, ModelFeature.locusTairObjectId, ModelFeature.featureType, ModelFeature.featureNumber, ModelFeature.startPosition, ModelFeature.endPosition, ModelFeature.agiStart, ModelFeature.agiEnd FROM ModelFeature WHERE ModelFeature.geneModelName = ? AND ModelFeature.locusTairObjectId = ?";

  public void bindParameters(PreparedStatement stmt, org.tair.db.locusdetail.ILocusGeneModel parameters)
      throws SQLException {
    // Set the parameters starting with the first parameter.
    parameters.getPrimaryKey().setParams(stmt, 1);
  }

  public String getParameterValues(org.tair.db.locusdetail.ILocusGeneModel parameters) {
    // Create the output string with the key parameters.
    return parameters.getPrimaryKey().getValueList();
  }

  public org.tair.db.locusdetail.IModelFeature getData(ResultSet rs) throws SQLException,
      ConstraintViolationException {
    return org.tair.db.locusdetail.LocusdetailFactory.getModelFeatureData(getPrimaryKey(rs), rs);
  }

  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return org.tair.db.locusdetail.LocusdetailFactory.getModelFeaturePrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}