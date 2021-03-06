/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQueryAssociatedLinks.vsl

package org.tair.db.locusdetail.sql;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.ConstraintViolationException;
import com.poesys.db.InvalidParametersException;
import com.poesys.db.dao.query.IParameterizedQuerySql;
import com.poesys.db.pk.IPrimaryKey;

import org.tair.db.locusdetail.LocusdetailFactory;


/**
 * <p>
 * A query Command pattern object that implements a SQL query of a collection of 
 * LocusAnnotation objects using the primary key of the associated
 * class Annotation. These objects are the linking objects from the SQL 
 * table LocusAnnotation rather than the objects associated through
 * the link (LocusDetail), which have a separate representation.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryLocusAnnotationByAnnotation 
    implements IParameterizedQuerySql<org.tair.db.locusdetail.ILocusAnnotation, org.tair.db.locusdetail.IAnnotation> {
  /** SQL query statement for LocusAnnotation */
  private static final String SQL =
    "SELECT category, evidenceCode, evidenceWith, keyword, locusTairObjectId, reference, relationshipType FROM LocusAnnotation WHERE category = ? AND evidenceCode = ? AND evidenceWith = ? AND keyword = ? AND reference = ? AND relationshipType = ?";

  public void bindParameters(PreparedStatement stmt, org.tair.db.locusdetail.IAnnotation parameters)
      throws SQLException {
    // Set the parameters starting with the first parameter.
    parameters.getPrimaryKey().setParams(stmt, 1);
  }

  public String getParameterValues(org.tair.db.locusdetail.IAnnotation parameters) {
    // Create the output string with the key parameters.
    return parameters.getPrimaryKey().getValueList();
  }

  public org.tair.db.locusdetail.ILocusAnnotation getData(ResultSet rs) throws SQLException,
      ConstraintViolationException {
    return LocusdetailFactory.getLocusAnnotationData(getPrimaryKey(rs), rs);
  }

  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return LocusdetailFactory.getLocusAnnotationPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}