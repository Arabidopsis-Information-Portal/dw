/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractInsert.vsl

package org.tair.db.genomicregion.sql;



import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.poesys.db.dao.insert.IInsertSql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * SQL statement specification for inserting a ReferenceGenome
 * 
 * @author Robert J. Muller
 */
public class AbstractInsertReferenceGenome implements IInsertSql<org.tair.db.genomicregion.IReferenceGenome> {
  private static final String SQL =
    "INSERT INTO ReferenceGenome (genome, dateEntered, taxonTaxonId, accession, name, referenceVariantTaxonId) VALUES (?,?,?,?,?,?)";

  public String getSql(IPrimaryKey key) {
    return SQL;
  }

  public void setParams(PreparedStatement stmt, int index, org.tair.db.genomicregion.IReferenceGenome object)
      throws SQLException {
    stmt.setTimestamp(index, object.getDateEntered());
    index++;
    stmt.setLong(index, object.getTaxonTaxonId());
    index++;
    stmt.setString(index, object.getAccession());
    index++;
    stmt.setString(index, object.getName());
    index++;
    stmt.setLong(index, object.getReferenceVariantTaxonId());
    index++;
  }
}