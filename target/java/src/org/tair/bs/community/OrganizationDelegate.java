/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: Delegate.vsl

package org.tair.bs.community;


import com.poesys.db.connection.IConnectionFactory;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * Organization objects and their dependents. This class delegates to an abstract
 * class, AbstractOrganizationDelegate. You can modify this class to override
 * methods in that class or to add operations to the API.
 * </p>
 * <p>
 * An organization that is a member of the community
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class OrganizationDelegate extends AbstractOrganizationDelegate {
  /**
   * Create a OrganizationDelegate object with a supplied subsystem, using the
   * default database properties (usually for testing).
   * 
   * @param subsystem the subsystem to use
   */
  public OrganizationDelegate(String subsystem) {
    super(subsystem);
  }
  
  /**
   * Create a OrganizationDelegate object with a supplied subsystem and DBMS,
   * usually JNDI for production/test usage with an application server.
   * 
   * @param subsystem the subsystem to use
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public OrganizationDelegate(String subsystem, IConnectionFactory.DBMS dbms) {
    super(subsystem, dbms);
  }
  
}