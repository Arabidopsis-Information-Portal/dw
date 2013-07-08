/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQueryAssociatedManyToManyObjects.vsl


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
 * ProteinModel objects using the primary key of an associated 
 * Domain object through the association Model using the 
 * association class ProteinModelDomain. This association is a many-to-many 
 * association from ProteinModel to Domain.
 * </p>
 * <p>
 * This SQL specification contains a SQL statement that queries a collection of
 * ProteinModel objects from the database table ProteinModel by
 * joining to the database table ProteinModelDomain and using the 
 * primary key from Domain to query the collection.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryModelByDomain 
    implements IParameterizedQuerySql<org.tair.db.locusdetail.IProteinModel, org.tair.db.locusdetail.IDomain> {
  /** SQL query statement for ProteinModel */
  private static final String SQL =
    "SELECT a.geneModelName, a.locusTairObjectId, a.sequenceTairObjectId, a.length, a.molecularWeight, a.isoelectricPoint FROM ProteinModel a JOIN ProteinModelDomain b ON a.geneModelName = b.geneModelName AND a.locusTairObjectId = b.locusTairObjectId AND a.sequenceTairObjectId = b.sequenceTairObjectId WHERE b.accession = ?";

  public void bindParameters(PreparedStatement stmt, org.tair.db.locusdetail.IDomain parameters)
      throws SQLException {
    // Set the parameters starting with the first parameter.
    parameters.getPrimaryKey().setParams(stmt, 1);
  }

  public String getParameterValues(org.tair.db.locusdetail.IDomain parameters) {
    // Create the output string with the key parameters.
    return parameters.getPrimaryKey().getValueList();
  }

  public org.tair.db.locusdetail.IProteinModel getData(ResultSet rs) 
      throws SQLException, ConstraintViolationException {
    IPrimaryKey key = 
      org.tair.db.locusdetail.LocusdetailFactory.getProteinModelPrimaryKey(rs, "");
    return org.tair.db.locusdetail.LocusdetailFactory.getProteinModelData(key, rs);
  }

  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return org.tair.db.locusdetail.LocusdetailFactory.getProteinModelPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}