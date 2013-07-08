/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDtoProxy.vsl

package org.tair.db.community;


/**
 * <p>
 * A data-access layer proxy for the data-transfer object (DTO) for the 
 * Community. This class is the concrete subclass of the generated abstract 
 * class. Make any changes to proxy behavior by overriding methods here rather 
 * than changing the abstract superclass; AndroMDA will overwrite that class 
 * when you run it but will never overwrite this concrete subclass.
 * </p>
 * <p>
 * A member of the community
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class CommunityProxy extends AbstractCommunityProxy {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a CommunityProxy as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   * @param dto the DTO to proxy
   */
  public CommunityProxy(Community dto) {
    super(dto); 
  }
}