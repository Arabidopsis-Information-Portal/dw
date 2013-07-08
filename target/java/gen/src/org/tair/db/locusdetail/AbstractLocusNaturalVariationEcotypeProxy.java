/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDbDtoProxy.vsl

package org.tair.db.locusdetail;


import com.poesys.db.dto.AbstractLazyLoadingDtoProxy;


/**
 * <p>
 * A data-access layer data-transfer object (DTO) lazy-loading proxy for the 
 * LocusNaturalVariationEcotype. This class is an abstract class that contains AndroMDA 
 * generated code; change nothing in this class. Instead, override any methods 
 * in the concrete subclass generated in the same package. AndroMDA will 
 * overwrite this class each time you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * An ecotype that contains the natural variation polymorphism; this is in place of
 * a many-to-many link to SpeciesVariant, which extends beyond the subsystem
 * boundary and thus violates visibility rules
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractLocusNaturalVariationEcotypeProxy extends AbstractLazyLoadingDtoProxy implements ILocusNaturalVariationEcotype {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  // Lazy-loading query setter strategy nested classes for single-object associations
  
  /**
   * Create a LocusNaturalVariationEcotypeProxy. The concrete subclass must call this constructor.
   *
   * @param dto the DTO to proxy
   */
  public AbstractLocusNaturalVariationEcotypeProxy(LocusNaturalVariationEcotype dto) {
    super(dto);

    // Setter arrays
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
  }

  @Override
  public boolean equals(Object obj) {
    AbstractLocusNaturalVariationEcotypeProxy otherProxy = (AbstractLocusNaturalVariationEcotypeProxy)obj;
    return ((LocusNaturalVariationEcotype)dto).equals(otherProxy.dto);
  }

  @Override
  public int hashCode() {
    return ((LocusNaturalVariationEcotype)dto).hashCode();
  }

  // Local properties (attributes, associations, and association classes)

  // Source: AddNaturalKeyProperties + AddParentKeyAttributes + AddInheritedKeyProperties + AddParentKeyAttributes
  public java.lang.Long getLocusTairObjectId() {
    return ((LocusNaturalVariationEcotype)dto).getLocusTairObjectId();
  }

  // Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + AddInheritedKeyProperties + AddParentKeyAttributes
  public java.lang.String getPolymorphismName() {
    return ((LocusNaturalVariationEcotype)dto).getPolymorphismName();
  }

  // Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + addExplicitSubkeyOnAssociation
  public java.lang.String getAccession() {
    return ((LocusNaturalVariationEcotype)dto).getAccession();
  }

  // Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass + addExplicitSubkeyOnAssociation
  public java.lang.String getName() {
    return ((LocusNaturalVariationEcotype)dto).getName();
  }

  // Source: AddNaturalKeyProperties + AddParentKeyAttributes + addExplicitSubkeyOnAssociation
  public java.lang.Long getTaxonId() {
    return ((LocusNaturalVariationEcotype)dto).getTaxonId();
  }

  // Source: AddToOneAssociationRequiredObjectProperties
  public org.tair.db.locusdetail.ILocusNaturalVariation getPolymorphism() {
    return ((LocusNaturalVariationEcotype)dto).getPolymorphism();
  }

  public void setPolymorphism(org.tair.db.locusdetail.ILocusNaturalVariation polymorphism)
      throws com.poesys.db.InvalidParametersException {
    ((LocusNaturalVariationEcotype)dto).setPolymorphism(polymorphism);
  }

  // Source: AddToOneAssociationRequiredObjectProperties
  public org.tair.db.basic.ISpeciesVariant getEcotype() {
    return ((LocusNaturalVariationEcotype)dto).getEcotype();
  }

  public void markChildrenDeleted() throws com.poesys.db.dto.DtoStatusException {
  	((LocusNaturalVariationEcotype)dto).markChildrenDeleted();
  }
}