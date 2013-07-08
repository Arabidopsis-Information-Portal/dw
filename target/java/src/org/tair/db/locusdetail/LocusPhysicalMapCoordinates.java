/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.tair.db.locusdetail;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the LocusPhysicalMapCoordinates. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * The map coordinates for the parent locus on a chromosome
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>CompositeKey</li>
 *     <li>Persistent</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class LocusPhysicalMapCoordinates extends AbstractLocusPhysicalMapCoordinates {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a LocusPhysicalMapCoordinates as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public LocusPhysicalMapCoordinates() {
    super(); 
  }

  /**
   * <p>
   * Create a LocusPhysicalMapCoordinates. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LocusPhysicalMapCoordinates
   * @param locusTairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param mapId the unique identifier for the map, also uniquely identifies the map coordinates
object within the parent TAIR object; used in the URL that displays the map
   * @param mapName the name of the map
   * @param mapType the kind of map: "nucleotide sequence" (nuc_sequence) and "annotation unit"
(assembly_unit)
   * @param chromosome the name of the map chromosome on which the locus appears
   * @param startPosition starting position on the map
   * @param endPosition ending position on the map
   * @param units the unit of length (bp, kb)
   * @param orientation the orientation of the locus on the map, reverse or forward; may be unknown
   */
  public LocusPhysicalMapCoordinates(IPrimaryKey key, java.lang.Long locusTairObjectId, java.lang.Long mapId, java.lang.String mapName, java.lang.String mapType, java.lang.String chromosome, java.lang.Double startPosition, java.lang.Double endPosition, java.lang.String units, java.lang.String orientation) {
    super(key, locusTairObjectId, mapId, mapName, mapType, chromosome, startPosition, endPosition, units, orientation); 
  }
}