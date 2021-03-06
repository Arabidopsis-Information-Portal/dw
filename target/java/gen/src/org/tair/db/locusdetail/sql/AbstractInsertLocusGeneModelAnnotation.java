/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractInsert.vsl

package org.tair.db.locusdetail.sql;



import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.poesys.db.dao.insert.IInsertSql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * SQL statement specification for inserting a LocusGeneModelAnnotation
 * 
 * @author Robert J. Muller
 */
public class AbstractInsertLocusGeneModelAnnotation implements IInsertSql<org.tair.db.locusdetail.ILocusGeneModelAnnotation> {
  private static final String SQL =
    "INSERT INTO LocusGeneModelAnnotation (category, evidenceCode, evidenceWith, geneModelName, keyword, locusTairObjectId, reference, relationshipType) VALUES (?,?,?,?,?,?,?,?)";

  public String getSql(IPrimaryKey key) {
    return SQL;
  }

  public void setParams(PreparedStatement stmt, int index, org.tair.db.locusdetail.ILocusGeneModelAnnotation object)
      throws SQLException {
  }
}
