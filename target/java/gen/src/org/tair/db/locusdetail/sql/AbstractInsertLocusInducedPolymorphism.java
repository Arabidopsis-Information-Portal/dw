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
 * SQL statement specification for inserting a LocusInducedPolymorphism
 * 
 * @author Robert J. Muller
 */
public class AbstractInsertLocusInducedPolymorphism implements IInsertSql<org.tair.db.locusdetail.ILocusInducedPolymorphism> {
  private static final String SQL =
    "INSERT INTO LocusInducedPolymorphism (locusTairObjectId, polymorphismName, inheritance, alleleType, accession, name, taxonId) VALUES (?,?,?,?,?,?,?)";

  public String getSql(IPrimaryKey key) {
    return SQL;
  }

  public void setParams(PreparedStatement stmt, int index, org.tair.db.locusdetail.ILocusInducedPolymorphism object)
      throws SQLException {
    stmt.setString(index, object.getInheritance());
    index++;
    stmt.setString(index, object.getAlleleType());
    index++;
    stmt.setString(index, object.getAccession());
    index++;
    stmt.setString(index, object.getName());
    index++;
    stmt.setLong(index, object.getTaxonId());
    index++;
  }
}
