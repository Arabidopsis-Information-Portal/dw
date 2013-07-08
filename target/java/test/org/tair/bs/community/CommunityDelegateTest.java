/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DelegateTest.vsl

package org.tair.bs.community;


/**
 * <p>
 * A test class for the CommunityDelegate class. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class CommunityDelegateTest extends org.tair.bs.community.AbstractCommunityDelegateTest {


  @Override
  protected java.util.List<org.tair.bs.community.BsCountry> createCountryCommunityCountry(int count)
      throws com.poesys.bs.delegate.DelegateException, 
             com.poesys.db.InvalidParametersException, 
             com.poesys.db.dto.DtoStatusException {
    java.util.List<org.tair.bs.community.BsCountry> objects = 
      new java.util.concurrent.CopyOnWriteArrayList<org.tair.bs.community.BsCountry>();
    @SuppressWarnings("unused")
    java.util.Random r = new java.util.Random();
    
    // TODO implement child creation (see javadoc for abstract parent)
    
    return objects;
  }

  @Override
  protected java.math.BigInteger getTestKeyCommunityId(int objectNumber) {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public void testGetAllObjects() {
    // Too many objects to get, super.testGetAllObjects() if desired
  }
  
  @Override
  protected String getSubsystem() {
    // return explicit subsystem name
    return "org.tair.db.community";
    // use super.getSubsystem() to get default subsystem name if needed
  }
}