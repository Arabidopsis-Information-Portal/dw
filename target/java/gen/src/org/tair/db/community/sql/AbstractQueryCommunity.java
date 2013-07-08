/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQuery.vsl

package org.tair.db.community.sql;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.dao.query.IKeyQuerySql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A query Command pattern object that implements a SQL key query for the 
 * Community. This SQL specification contains a SQL statement that queries
 * a single Community object from the database using the primary key.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryCommunity implements IKeyQuerySql<org.tair.db.community.ICommunity> {
  /** SQL query statement for Community */
  private static final String SQL =
    "SELECT Community.communityId, Community.communityType, Community.email, Community.memberStatus, Community.countryId, Person.countryId, Person.userName, Person.firstName, Person.middleName, Person.lastName, Person.suffix, Person.researchInterest, Organization.countryId, Organization.name, Organization.organizationType, Organization.description, Organization.commercial, CASE WHEN Person.communityId IS NOT NULL THEN 'Person' WHEN Organization.communityId IS NOT NULL THEN 'Organization' ELSE NULL END AS discriminant FROM Community LEFT OUTER JOIN Person Person ON Community.communityId = Person.communityId LEFT OUTER JOIN Organization Organization ON Community.communityId = Organization.communityId WHERE ";

  public org.tair.db.community.ICommunity getData(IPrimaryKey key, ResultSet rs) throws SQLException {
    // Community has concrete subclasses, so the query returns an object of the actual
    // type rather than just of type Community. It uses a discriminant expression
    // that the result set returns to figure out which class to instantiate.
    
    // Get the discriminant from the result set.
    String discriminant = rs.getString("discriminant");
    
    // Check whether the discriminant is null and throw exception.
    if (discriminant == null) {
      throw new com.poesys.bs.delegate.DelegateException("Missing subclass for queried object of superclass org.tair.db.community.Community");
    }
    
    org.tair.db.community.ICommunity data = null;
    // Check for Person, set return only if not already set
    if (discriminant.equals("Person") && data == null) {
      // Use the community factory to get the data.
      data = org.tair.db.community.CommunityFactory.getPersonData(key, rs);
    }
    // Check for Organization, set return only if not already set
    if (discriminant.equals("Organization") && data == null) {
      // Use the community factory to get the data.
      data = org.tair.db.community.CommunityFactory.getOrganizationData(key, rs);
    }
    return data;
  }

  public String getSql(IPrimaryKey key) {
    return SQL + key.getSqlWhereExpression("Community");
  }
}