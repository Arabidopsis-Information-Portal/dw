/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQueryAll.vsl

package org.tair.db.community.sql;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.InvalidParametersException;
import com.poesys.db.dao.query.IQuerySql;
import com.poesys.db.pk.IPrimaryKey;

import org.tair.db.community.CommunityFactory;


/**
 * <p>
 * A query Command pattern object that implements a SQL query for all the 
 * Community objects in the database; use with caution
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryAllCommunity implements IQuerySql<org.tair.db.community.ICommunity> {
  /** SQL query statement for Community */
  private static final String SQL =
    "SELECT Community.communityId, Community.communityType, Community.email, Community.memberStatus, Community.countryId, Person.countryId, Person.userName, Person.firstName, Person.middleName, Person.lastName, Person.suffix, Person.researchInterest, Organization.countryId, Organization.name, Organization.organizationType, Organization.description, Organization.commercial, CASE WHEN Person.communityId IS NOT NULL THEN 'Person' WHEN Organization.communityId IS NOT NULL THEN 'Organization' ELSE NULL END AS discriminant FROM Community LEFT OUTER JOIN Person Person ON Community.communityId = Person.communityId LEFT OUTER JOIN Organization Organization ON Community.communityId = Organization.communityId";

  public org.tair.db.community.ICommunity getData(ResultSet rs) throws SQLException {
    IPrimaryKey key = 
      CommunityFactory.getCommunityPrimaryKey(rs, "");
      
    // Community has subclasses, so the query returns an object of the actual
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
      data = 
        (org.tair.db.community.ICommunity)org.tair.db.community.CommunityFactory.getPersonData(key, rs);
    }
    // Check for Organization, set return only if not already set
    if (discriminant.equals("Organization") && data == null) {
      // Use the community factory to get the data.
      data = 
        (org.tair.db.community.ICommunity)org.tair.db.community.CommunityFactory.getOrganizationData(key, rs);
    }
    return data;
  }
  
  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return CommunityFactory.getCommunityPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}