/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQueryAll.vsl

package org.tair.db.locusdetail.sql;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.InvalidParametersException;
import com.poesys.db.dao.query.IQuerySql;
import com.poesys.db.pk.IPrimaryKey;

import org.tair.db.locusdetail.LocusdetailFactory;


/**
 * <p>
 * A query Command pattern object that implements a SQL query for all the 
 * Annotation objects in the database; use with caution
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryAllAnnotation implements IQuerySql<org.tair.db.locusdetail.IAnnotation> {
  /** SQL query statement for Annotation */
  private static final String SQL =
    "SELECT category, relationshipType, keyword, evidenceCode, evidenceWith, reference, keywordId, ontologyId, evidenceDescription, evidenceId, referenceId, annotatedBy FROM Annotation";

  public org.tair.db.locusdetail.IAnnotation getData(ResultSet rs) throws SQLException {
    IPrimaryKey key = 
      LocusdetailFactory.getAnnotationPrimaryKey(rs, "");
      
    return LocusdetailFactory.getAnnotationData(key, rs);
  }
  
  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return LocusdetailFactory.getAnnotationPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}