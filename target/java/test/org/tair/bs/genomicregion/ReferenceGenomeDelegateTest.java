/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DelegateTest.vsl

package org.tair.bs.genomicregion;


/**
 * <p>
 * A test class for the ReferenceGenomeDelegate class. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class ReferenceGenomeDelegateTest extends org.tair.bs.genomicregion.AbstractReferenceGenomeDelegateTest {


  @Override
  protected java.util.List<org.tair.bs.basic.BsSpeciesVariant> createReferenceVariantBasicSpeciesVariant(int count)
      throws com.poesys.bs.delegate.DelegateException, 
             com.poesys.db.InvalidParametersException, 
             com.poesys.db.dto.DtoStatusException {
    java.util.List<org.tair.bs.basic.BsSpeciesVariant> objects = 
      new java.util.concurrent.CopyOnWriteArrayList<org.tair.bs.basic.BsSpeciesVariant>();
    @SuppressWarnings("unused")
    java.util.Random r = new java.util.Random();
    
    // TODO implement child creation (see javadoc for abstract parent)
    
    return objects;
  }


  @Override
  protected java.util.List<org.tair.bs.basic.BsTaxon> createTaxonBasicTaxon(int count)
      throws com.poesys.bs.delegate.DelegateException, 
             com.poesys.db.InvalidParametersException, 
             com.poesys.db.dto.DtoStatusException {
    java.util.List<org.tair.bs.basic.BsTaxon> objects = 
      new java.util.concurrent.CopyOnWriteArrayList<org.tair.bs.basic.BsTaxon>();
    @SuppressWarnings("unused")
    java.util.Random r = new java.util.Random();
    
    // TODO implement child creation (see javadoc for abstract parent)
    
    return objects;
  }

  @Override
  public void testTruncateTable() {
    // Truncate usually is hard; super.testTruncateTable() if desired
  }

  @Override
  public void testGetAllObjects() {
    // Too many objects to get, super.testGetAllObjects() if desired
  }
  
  @Override
  protected String getSubsystem() {
    // return explicit subsystem name
    return "org.tair.db.genomicregion";
    // use super.getSubsystem() to get default subsystem name if needed
  }
}