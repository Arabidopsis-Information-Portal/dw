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
 * SQL statement specification for inserting a LocusDetail
 * 
 * @author Robert J. Muller
 */
public class AbstractInsertLocusDetail implements IInsertSql<org.tair.db.locusdetail.ILocusDetail> {
  private static final String SQL =
    "INSERT INTO LocusDetail (locusTairObjectId, locusName, primarySymbol, primarySymbolFullName, chromosome, spanStartPosition, spanEndPosition, curatedSummary, geneModelCount, polymorphismCount, articleCount, abstractCount, geneFamilyName, geneFamilyTairObjectId, taxonId) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

  public String getSql(IPrimaryKey key) {
    return SQL;
  }

  public void setParams(PreparedStatement stmt, int index, org.tair.db.locusdetail.ILocusDetail object)
      throws SQLException {
    stmt.setString(index, object.getLocusName());
    index++;
    stmt.setString(index, object.getPrimarySymbol());
    index++;
    stmt.setString(index, object.getPrimarySymbolFullName());
    index++;
    stmt.setString(index, object.getChromosome());
    index++;
    stmt.setLong(index, object.getSpanStartPosition());
    index++;
    stmt.setLong(index, object.getSpanEndPosition());
    index++;
    stmt.setString(index, object.getCuratedSummary());
    index++;
    stmt.setLong(index, object.getGeneModelCount());
    index++;
    stmt.setLong(index, object.getPolymorphismCount());
    index++;
    stmt.setLong(index, object.getArticleCount());
    index++;
    stmt.setLong(index, object.getAbstractCount());
    index++;
    stmt.setString(index, object.getGeneFamilyName());
    index++;
    stmt.setLong(index, object.getGeneFamilyTairObjectId());
    index++;
    stmt.setLong(index, object.getTaxonId());
    index++;
  }
}