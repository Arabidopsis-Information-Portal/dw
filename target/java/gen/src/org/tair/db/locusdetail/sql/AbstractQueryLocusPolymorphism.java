/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQuery.vsl

package org.tair.db.locusdetail.sql;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.dao.query.IKeyQuerySql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A query Command pattern object that implements a SQL key query for the 
 * LocusPolymorphism. This SQL specification contains a SQL statement that queries
 * a single LocusPolymorphism object from the database using the primary key.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryLocusPolymorphism implements IKeyQuerySql<org.tair.db.locusdetail.ILocusPolymorphism> {
  /** SQL query statement for LocusPolymorphism */
  private static final String SQL =
    "SELECT LocusPolymorphism.locusTairObjectId, LocusPolymorphism.polymorphismName, LocusPolymorphism.polymorphismTairObjectId, LocusPolymorphism.polymorphismType, LocusPolymorphism.length, LocusPolymorphism.startPosition, LocusPolymorphism.endPosition, LocusInducedPolymorphism.inheritance, LocusInducedPolymorphism.alleleType, LocusInducedPolymorphism.accession, LocusInducedPolymorphism.name, LocusInducedPolymorphism.taxonId, LocusNaturalVariation.detail, LocusNaturalVariation.referenceAccession, LocusNaturalVariation.referenceEcotype, LocusNaturalVariation.referenceTaxonId, CASE WHEN LocusInducedPolymorphism.locusTairObjectId IS NOT NULL THEN 'LocusInducedPolymorphism' WHEN LocusInducedPolymorphism.polymorphismName IS NOT NULL THEN 'LocusInducedPolymorphism' WHEN LocusNaturalVariation.locusTairObjectId IS NOT NULL THEN 'LocusNaturalVariation' WHEN LocusNaturalVariation.polymorphismName IS NOT NULL THEN 'LocusNaturalVariation' ELSE NULL END AS discriminant FROM LocusPolymorphism LEFT OUTER JOIN LocusInducedPolymorphism LocusInducedPolymorphism ON LocusPolymorphism.locusTairObjectId = LocusInducedPolymorphism.locusTairObjectId AND LocusPolymorphism.polymorphismName = LocusInducedPolymorphism.polymorphismName LEFT OUTER JOIN LocusNaturalVariation LocusNaturalVariation ON LocusPolymorphism.locusTairObjectId = LocusNaturalVariation.locusTairObjectId AND LocusPolymorphism.polymorphismName = LocusNaturalVariation.polymorphismName WHERE ";

  public org.tair.db.locusdetail.ILocusPolymorphism getData(IPrimaryKey key, ResultSet rs) throws SQLException {
    // LocusPolymorphism has concrete subclasses, so the query returns an object of the actual
    // type rather than just of type LocusPolymorphism. It uses a discriminant expression
    // that the result set returns to figure out which class to instantiate.
    
    // Get the discriminant from the result set.
    String discriminant = rs.getString("discriminant");
    
    // Check whether the discriminant is null and throw exception.
    if (discriminant == null) {
      throw new com.poesys.bs.delegate.DelegateException("Missing subclass for queried object of superclass org.tair.db.locusdetail.LocusPolymorphism");
    }
    
    org.tair.db.locusdetail.ILocusPolymorphism data = null;
    // Check for LocusInducedPolymorphism, set return only if not already set
    if (discriminant.equals("LocusInducedPolymorphism") && data == null) {
      // Use the locusdetail factory to get the data.
      data = org.tair.db.locusdetail.LocusdetailFactory.getLocusInducedPolymorphismData(key, rs);
    }
    // Check for LocusNaturalVariation, set return only if not already set
    if (discriminant.equals("LocusNaturalVariation") && data == null) {
      // Use the locusdetail factory to get the data.
      data = org.tair.db.locusdetail.LocusdetailFactory.getLocusNaturalVariationData(key, rs);
    }
    return data;
  }

  public String getSql(IPrimaryKey key) {
    return SQL + key.getSqlWhereExpression("LocusPolymorphism");
  }
}