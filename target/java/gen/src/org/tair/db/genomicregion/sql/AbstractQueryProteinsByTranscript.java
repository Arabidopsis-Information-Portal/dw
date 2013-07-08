/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQueryAssociatedOneToManyObjects.vsl

package org.tair.db.genomicregion.sql;


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
 * Polypeptide objects using the primary key of an associated 
 * Transcript object through the association Proteins. This
 * is a many-to-one association from Polypeptide to Transcript.
 * </p>
 * <p>
 * This SQL specification contains a SQL statement that queries a collection of
 * Polypeptide objects from the database using the foreign key type
 * Transcript.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryProteinsByTranscript 
    implements IParameterizedQuerySql<org.tair.db.genomicregion.IPolypeptide, org.tair.db.genomicregion.ITranscript> {
  /** SQL query statement for Polypeptide */
  private static final String SQL =
    "SELECT Polypeptide.tairObjectId, Polypeptide.aaSequenceId, Polypeptide.genbankDefinition, Polypeptide.experimental, Polypeptide.description, Polypeptide.genbankGi, Polypeptide.PirAccession, Polypeptide.pl, Polypeptide.molecularWeight, Polypeptide.ecNumber, Polypeptide.tremblId, Polypeptide.swissProtId, Polypeptide.uniProtId, Polypeptide.dateEntered FROM Polypeptide WHERE Polypeptide.tairObjectId = ?";

  public void bindParameters(PreparedStatement stmt, org.tair.db.genomicregion.ITranscript parameters)
      throws SQLException {
    // Set the parameters starting with the first parameter.
    parameters.getPrimaryKey().setParams(stmt, 1);
  }

  public String getParameterValues(org.tair.db.genomicregion.ITranscript parameters) {
    // Create the output string with the key parameters.
    return parameters.getPrimaryKey().getValueList();
  }

  public org.tair.db.genomicregion.IPolypeptide getData(ResultSet rs) throws SQLException,
      ConstraintViolationException {
    return org.tair.db.genomicregion.GenomicregionFactory.getPolypeptideData(getPrimaryKey(rs), rs);
  }

  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return org.tair.db.genomicregion.GenomicregionFactory.getPolypeptidePrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}