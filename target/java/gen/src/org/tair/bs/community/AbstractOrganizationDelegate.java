/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDelegate.vsl

package org.tair.bs.community;


import com.poesys.bs.delegate.AbstractReadOnlyDataDelegate;
import com.poesys.bs.delegate.DelegateException;
import com.poesys.db.connection.IConnectionFactory.DBMS;
import com.poesys.db.dao.query.IKeyQuerySql;
import com.poesys.db.dao.query.IQuerySql;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * Organization objects and their dependents. You should not modify this class;
 * instead, override or add methods in the class OrganizationDelegate, which
 * specializes this class.
 * </p>
 * <p>
 * An organization that is a member of the community
 * </p>
 * @see OrganizationDelegate
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractOrganizationDelegate
    extends AbstractReadOnlyDataDelegate<BsOrganization, org.tair.db.community.IOrganization, com.poesys.db.pk.SequencePrimaryKey> {
  /**
   * Create an AbstractOrganizationDelegate object by supplying the database
   * subsystem in the database.properties file.
   * 
   * @param subsystem the database subsystem to use in database.properties
   */
  public AbstractOrganizationDelegate(String subsystem) {
    super(subsystem, 2147483647);
  }

  /**
   * Create an AbstractOrganizationDelegate object by supplying the database
   * subsystem in the database.properties file and a specific DBMS, usually
   * IConnectionFactory.DBMS.JNDI.
   * 
   * @param subsystem the database subsystem to use in database.properties
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public AbstractOrganizationDelegate(String subsystem, DBMS dbms) {
    super(subsystem, dbms, 2147483647);
  }

  @Override
  protected String getClassName() {
    return org.tair.db.community.Organization.class.getName();
  }

  @Override
  protected IKeyQuerySql<org.tair.db.community.IOrganization> getQueryByKeySql() {
    return new org.tair.db.community.sql.QueryOrganization();
  }

  @Override
  protected IQuerySql<org.tair.db.community.IOrganization> getQueryListSql() {
    // Query-All method not required
    return new org.tair.db.community.sql.QueryAllOrganization();
  }

  @Override
  protected org.tair.bs.community.BsOrganization wrapData(org.tair.db.community.IOrganization dto) {
    return new org.tair.bs.community.BsOrganization(dto);
  }

  /**
   * <p>
   * Create a new Organization with data fields.
   * </p>
   * <p>
   * The Organization class has no key of its own but inherits from a superclass
   * that has a SequenceKey. When you create an instance of this
   * class, the delegate creates a key of that type in the superclass.
   * </p>
   * 
   * @param communityId primary key attribute
   * @param communityType the kind of community member this is: person or organization
   * @param email the email address of the community member
   * @param memberStatus the current status of the community member: new, active, inactive.
A new member is one who has registered but not been activated.
An active member has been activated.
An inactive member has been inactivated.
   * @param countryId foreign key used by setter to query associated object
   * @param name the name of the organization
   * @param organizationType the kind of organization:
lab
institute
organization
project
university
other
high_school
education_outreach_program
foundation
company
facility
stock_center
center
community_college
collaboration
middle_school
committee
unknown
database
4_year_college
   * @param description a text describing the organization
   * @param commercial whether this is a commercial organization
   * @return the new Organization object
   * @throws DelegateException when there is a problem generating the key or
   *             creating the object
   */
  public org.tair.bs.community.BsOrganization createOrganization(java.math.BigInteger communityId, java.lang.String communityType, java.lang.String email, java.lang.String memberStatus, java.math.BigInteger countryId, java.lang.String name, java.lang.String organizationType, java.lang.String description, java.lang.Boolean commercial)
      throws DelegateException {
      com.poesys.db.pk.SequencePrimaryKey key = null;

    // Generate a new Organization id if the input key is null.
    if (communityId == null) {
      java.sql.Connection connection = null;
      try {
        connection = getConnection();
        if (connection == null) {
          throw new DelegateException("Could not get database connection to generate sequence");
        }
        
        if (dbms.equals(DBMS.MYSQL)) {
          key =
            com.poesys.db.pk.PrimaryKeyFactory.createMySqlSequenceKey(connection,
                                                                      "CommunitySeq",
                                                                      "communityId",
                                                                      "org.tair.db.community.Organization");
        } else {
          // Create key with sequence CommunitySeq
          key =
            com.poesys.db.pk.PrimaryKeyFactory.createOracleSequenceKey(connection,
                                                                       "CommunitySeq",
                                                                       "communityId",
                                                                       "org.tair.db.community.Organization");
        }
        // Get the sequence number for use as an attribute value.
        communityId = key.getValue();
      } catch (com.poesys.db.InvalidParametersException e) {
        Object[] args = e.getParameters().toArray();
        String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
        throw new DelegateException(message, e);
      } catch (com.poesys.db.NoPrimaryKeyException e) {
        Object[] args = e.getParameters().toArray();
        String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
        throw new DelegateException(message, e);
      } catch (java.sql.SQLException e) {
        throw new DelegateException(e.getMessage(), e);
      } finally {
        // Done with this connection, close it and return it to the pool.
        if (connection != null) {
          try {
            connection.close();
          } catch (java.sql.SQLException e) {
            throw new DelegateException(e.getMessage(), e);
          }
        }
      }
    } else {
      key = com.poesys.db.pk.PrimaryKeyFactory.createSequenceKey("communityId", communityId, "org.tair.db.community.Organization");
    }

    // Create a data-access DTO proxy (supports lazy loading).
    org.tair.db.community.IOrganization dto =
      new org.tair.db.community.OrganizationProxy(new org.tair.db.community.Organization(key, communityId, communityType, email, memberStatus, countryId, name, organizationType, description, commercial));

    // Create the business DTO.
    return new org.tair.bs.community.BsOrganization(dto);
  }

  /**
   * Create a new Affiliation association class child of Organization with 
   * an association key. This class links the input objects.
   * 
   * @param affiliatesObject associated Person object (part of the key)
   * @param organizationsObject associated Organization object (part of the key)
   * @param organizationsCommunityId Attribute that is part of the association key
   * @param affiliatesCommunityId Attribute that is part of the association key
   * @param jobTitle the person's job title within this organization, if any
   * @param pi whether the person acts in the role of a principal investigator for the
organization
   * @return a new Affiliation business layer DTO
   * @throws DelegateException when a parameter causes a problem
   */
  public org.tair.bs.community.BsAffiliation createAffiliation(org.tair.bs.community.BsPerson affiliatesObject, org.tair.bs.community.BsOrganization organizationsObject, java.math.BigInteger organizationsCommunityId, java.math.BigInteger affiliatesCommunityId, java.lang.String jobTitle, java.lang.Boolean pi) throws DelegateException {
    // Create the key.
    com.poesys.db.pk.AssociationPrimaryKey key = null;
    try {
      java.util.ArrayList<com.poesys.db.pk.IPrimaryKey> list =
        new java.util.ArrayList<com.poesys.db.pk.IPrimaryKey>();
      list.add(affiliatesObject.getPrimaryKey());
      list.add(organizationsObject.getPrimaryKey());
      key = 
        com.poesys.db.pk.PrimaryKeyFactory.createAssociationKey(list, "org.tair.db.community.Affiliation");
    } catch (com.poesys.db.InvalidParametersException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.DuplicateKeyNameException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    }

    // Create an association-key child data-access Affiliation DTO for direct access, no proxy required.
    org.tair.db.community.IAffiliation dto =
      new org.tair.db.community.Affiliation(key, affiliatesObject.toDto(), organizationsObject.toDto(), organizationsCommunityId, affiliatesCommunityId, jobTitle, pi);

    // Create the business DTO.
    return new org.tair.bs.community.BsAffiliation(dto);
  }
}
