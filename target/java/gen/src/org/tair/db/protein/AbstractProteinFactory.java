/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractSubsystemFactory.vsl

package org.tair.db.protein;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.InvalidParametersException;
import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A separate, shareable set of factory methods for all the protein
 * classes, including JDBC data-setting, parameter-setting, and
 * primary-key-generation methods. This class is abstract and has a single
 * concrete subclass, ProteinFactory, that you can modify to override
 * the default behavior in the abstract class or implement an as-yet 
 * unimplemented method.
 * </p>
 * 
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractProteinFactory {
  /**
   * Retrieve the Protein data from the result set's current row and create
   * a Protein object.
   * 
   * @param key the primary key for the Protein
   * @param rs the query result set
   * @return a Protein instance based on the result set data
   * @throws SQLException when there is a problem getting data from the results
   * @throws InvalidParametersException when a required value is null
   */
  public static IProtein getProteinData(IPrimaryKey key, ResultSet rs)
      throws SQLException, InvalidParametersException {
    // Constructor argument tairObjectId gets the JDBC value with a function call.
    java.lang.Long tairObjectIdValue = rs.getLong("tairObjectId");
    // Constructor argument name gets the JDBC value with a function call.
    java.lang.String nameValue = rs.getString("name");
    // Constructor argument sequence gets the JDBC value with a function call.
    java.lang.String sequenceValue = rs.getString("sequence");
    // Constructor argument genbankGi gets the JDBC value with a function call.
    java.lang.String genbankGiValue = rs.getString("genbankGi");
    // Constructor argument genPept gets the JDBC value with a function call.
    java.lang.String genPeptValue = rs.getString("genPept");
    // Constructor argument molecularWeight gets the JDBC value with a function call.
    java.lang.Double molecularWeightValue = rs.getDouble("molecularWeight");
    if (rs.wasNull()) {
      molecularWeightValue = null;
    };
    // Constructor argument isoelectricPoint gets the JDBC value with a function call.
    java.lang.Double isoelectricPointValue = rs.getDouble("isoelectricPoint");
    if (rs.wasNull()) {
      isoelectricPointValue = null;
    };
    // Constructor argument length gets the JDBC value with a function call.
    java.lang.Integer lengthValue = rs.getInt("length");
    // Constructor argument dateLastModified gets the JDBC value with a function call.
    java.sql.Timestamp dateLastModifiedValue = rs.getTimestamp("dateLastModified");
    // Protein has no lazily loaded members, so there is no need for Proxy.
    IProtein newObject = 
      new Protein(key, tairObjectIdValue, nameValue, sequenceValue, genbankGiValue, genPeptValue, molecularWeightValue, isoelectricPointValue, lengthValue, dateLastModifiedValue);
    return newObject;
  }
  
  /**
   * <p>
   * Get a primary key for a Protein based on a result set that must contain
   * the Protein primary key columns. The method creates a primary key of
   * a type specified by the primary key stereotype on the persistent class.
   * </p>
   * <p>
   * Stereotypes:
   * </p>
   * <ul>
   *     <li>NaturalKey</li>
   *     <li>Persistent</li>
   * </ul>
   * 
   * @param rs a JDBC result set with primary key columns
   * @param prefix an optional prefix string for derived column names in 
   *               associations
   * @return a Protein NaturalKey primary key
   * @throws SQLException when there is a problem getting data from the result
   *             set
   * @throws InvalidParametersException when there is a problem creating a key
   */
  public static IPrimaryKey getProteinPrimaryKey(ResultSet rs, String prefix)
      throws SQLException, InvalidParametersException {
    IPrimaryKey key = null;
    if (prefix == null) {
      prefix = "";
    }
    java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
    java.lang.Long tairObjectIdValue = rs.getLong("tairObjectId");

    list.add(new com.poesys.db.col.LongColumnValue(prefix + "tairObjectId", tairObjectIdValue));
    key = com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.tair.db.protein.Protein");
    return key;
  }

  /**
   * <p>
   * Get a primary key for a Protein based on input key attributes. 
   * The method creates a primary key of a type specified by the primary key 
   * stereotype on the persistent class.
   * </p>
   * <p>
   * Stereotypes:
   * </p>
   * <ul>
   *     <li>NaturalKey</li>
   *     <li>Persistent</li>
   * </ul>
   * 
   * @param tairObjectId 
   * @return a Protein NaturalKey primary key
   * @throws InvalidParametersException when there is a problem creating a key
   */
  public static IPrimaryKey getProteinPrimaryKey(java.lang.Long tairObjectId)
      throws InvalidParametersException {
    IPrimaryKey key = null;
    // Track generated inputs for nullity.
    boolean noNulls = true;
    java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
    if (tairObjectId != null && noNulls) {
      list.add(new com.poesys.db.col.LongColumnValue("tairObjectId", tairObjectId));
    } else {
      noNulls = false;
    }
    if (noNulls) {
      key = com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.tair.db.protein.Protein");
    }
    return key;
  }

  /**
   * Retrieve the ProteinTranscript data from the result set's current row and create
   * a ProteinTranscript object.
   * 
   * @param key the primary key for the Protein
   * @param rs the query result set
   * @return a ProteinTranscript instance based on the result set data
   * @throws SQLException when there is a problem getting data from the results
   * @throws InvalidParametersException when a required value is null
   */
  public static IProteinTranscript getProteinTranscriptData(IPrimaryKey key, ResultSet rs)
      throws SQLException, InvalidParametersException {
    // Constructor argument tairObjectId gets the JDBC value with a function call.
    java.lang.Long tairObjectIdValue = rs.getLong("tairObjectId");
    // Constructor argument geneTairObjectId gets the JDBC value with a function call.
    java.lang.Long geneTairObjectIdValue = rs.getLong("geneTairObjectId");
    if (rs.wasNull()) {
      geneTairObjectIdValue = null;
    };
    // Constructor argument name gets the JDBC value with a function call.
    java.lang.String nameValue = rs.getString("name");
    // ProteinTranscript has no lazily loaded members, so there is no need for Proxy.
    IProteinTranscript newObject = 
      new ProteinTranscript(key, tairObjectIdValue, geneTairObjectIdValue, nameValue);
    return newObject;
  }
  
  /**
   * <p>
   * Get a primary key for a ProteinTranscript based on a result set that must contain
   * the ProteinTranscript primary key columns. The method creates a primary key of
   * a type specified by the primary key stereotype on the persistent class.
   * </p>
   * <p>
   * Stereotypes:
   * </p>
   * <ul>
   *     <li>CompositeKey</li>
   *     <li>Persistent</li>
   * </ul>
   * 
   * @param rs a JDBC result set with primary key columns
   * @param prefix an optional prefix string for derived column names in 
   *               associations
   * @return a ProteinTranscript CompositeKey primary key
   * @throws SQLException when there is a problem getting data from the result
   *             set
   * @throws InvalidParametersException when there is a problem creating a key
   */
  public static IPrimaryKey getProteinTranscriptPrimaryKey(ResultSet rs, String prefix)
      throws SQLException, InvalidParametersException {
    IPrimaryKey key = null;
    if (prefix == null) {
      prefix = "";
    }
    IPrimaryKey parentKey = getProteinPrimaryKey(rs, "");
    java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
    java.lang.Long geneTairObjectIdValue = rs.getLong("geneTairObjectId");
    if (rs.wasNull()) {
      geneTairObjectIdValue = null;
    }
    list.add(new com.poesys.db.col.LongColumnValue(prefix + "geneTairObjectId", geneTairObjectIdValue));
	IPrimaryKey subKey = com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.tair.db.protein.ProteinTranscript");
    key = com.poesys.db.pk.PrimaryKeyFactory.createCompositeKey(parentKey, subKey, "org.tair.db.protein.ProteinTranscript");
    return key;
  }

  /**
   * <p>
   * Get a primary key for a ProteinTranscript based on input key attributes. 
   * The method creates a primary key of a type specified by the primary key 
   * stereotype on the persistent class.
   * </p>
   * <p>
   * Stereotypes:
   * </p>
   * <ul>
   *     <li>CompositeKey</li>
   *     <li>Persistent</li>
   * </ul>
   * 
   * @param geneTairObjectId the unique identifier in TAIR for the transcript
   * @param tairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @return a ProteinTranscript CompositeKey primary key
   * @throws InvalidParametersException when there is a problem creating a key
   */
  public static IPrimaryKey getProteinTranscriptPrimaryKey(java.lang.Long geneTairObjectId, java.lang.Long tairObjectId)
      throws InvalidParametersException {
    IPrimaryKey key = null;
    IPrimaryKey parentKey = getProteinPrimaryKey(tairObjectId);

    // Check the parent key; if it is null, the return key should be null.
    if (parentKey != null) {
      java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
      list.add(new com.poesys.db.col.LongColumnValue("geneTairObjectId", geneTairObjectId));
	  IPrimaryKey subKey = com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.tair.db.protein.ProteinTranscript");
      key = com.poesys.db.pk.PrimaryKeyFactory.createCompositeKey(parentKey, subKey, "org.tair.db.protein.ProteinTranscript");
    }
    return key;
  }

  /**
   * Retrieve the Domain data from the result set's current row and create
   * a Domain object.
   * 
   * @param key the primary key for the Protein
   * @param rs the query result set
   * @return a Domain instance based on the result set data
   * @throws SQLException when there is a problem getting data from the results
   * @throws InvalidParametersException when a required value is null
   */
  public static IDomain getDomainData(IPrimaryKey key, ResultSet rs)
      throws SQLException, InvalidParametersException {
    // Constructor argument tairObjectId gets the JDBC value with a function call.
    java.lang.Long tairObjectIdValue = rs.getLong("tairObjectId");
    // Constructor argument domainTairObjectId gets the JDBC value with a function call.
    java.lang.Long domainTairObjectIdValue = rs.getLong("domainTairObjectId");
    if (rs.wasNull()) {
      domainTairObjectIdValue = null;
    };
    // Constructor argument name gets the JDBC value with a function call.
    java.lang.String nameValue = rs.getString("name");
    // Constructor argument database gets the JDBC value with a function call.
    java.lang.String databaseValue = rs.getString("database");
    // Constructor argument structuralClassType gets the JDBC value with a function call.
    java.lang.String structuralClassTypeValue = rs.getString("structuralClassType");
    // Constructor argument accession gets the JDBC value with a function call.
    java.lang.String accessionValue = rs.getString("accession");
    // Constructor argument interproAccession gets the JDBC value with a function call.
    java.lang.String interproAccessionValue = rs.getString("interproAccession");
    // Constructor argument interpro gets the JDBC value with a function call.
    java.lang.String interproValue = rs.getString("interpro");
    // Constructor argument startPosition gets the JDBC value with a function call.
    java.lang.Integer startPositionValue = rs.getInt("startPosition");
    if (rs.wasNull()) {
      startPositionValue = null;
    };
    // Constructor argument endPosition gets the JDBC value with a function call.
    java.lang.Integer endPositionValue = rs.getInt("endPosition");
    if (rs.wasNull()) {
      endPositionValue = null;
    };
    // Domain has no lazily loaded members, so there is no need for Proxy.
    IDomain newObject = 
      new Domain(key, tairObjectIdValue, domainTairObjectIdValue, nameValue, databaseValue, structuralClassTypeValue, accessionValue, interproAccessionValue, interproValue, startPositionValue, endPositionValue);
    return newObject;
  }
  
  /**
   * <p>
   * Get a primary key for a Domain based on a result set that must contain
   * the Domain primary key columns. The method creates a primary key of
   * a type specified by the primary key stereotype on the persistent class.
   * </p>
   * <p>
   * Stereotypes:
   * </p>
   * <ul>
   *     <li>CompositeKey</li>
   *     <li>Persistent</li>
   * </ul>
   * 
   * @param rs a JDBC result set with primary key columns
   * @param prefix an optional prefix string for derived column names in 
   *               associations
   * @return a Domain CompositeKey primary key
   * @throws SQLException when there is a problem getting data from the result
   *             set
   * @throws InvalidParametersException when there is a problem creating a key
   */
  public static IPrimaryKey getDomainPrimaryKey(ResultSet rs, String prefix)
      throws SQLException, InvalidParametersException {
    IPrimaryKey key = null;
    if (prefix == null) {
      prefix = "";
    }
    IPrimaryKey parentKey = getProteinPrimaryKey(rs, "");
    java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
    java.lang.Long domainTairObjectIdValue = rs.getLong("domainTairObjectId");
    if (rs.wasNull()) {
      domainTairObjectIdValue = null;
    }
    list.add(new com.poesys.db.col.LongColumnValue(prefix + "domainTairObjectId", domainTairObjectIdValue));
	IPrimaryKey subKey = com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.tair.db.protein.Domain");
    key = com.poesys.db.pk.PrimaryKeyFactory.createCompositeKey(parentKey, subKey, "org.tair.db.protein.Domain");
    return key;
  }

  /**
   * <p>
   * Get a primary key for a Domain based on input key attributes. 
   * The method creates a primary key of a type specified by the primary key 
   * stereotype on the persistent class.
   * </p>
   * <p>
   * Stereotypes:
   * </p>
   * <ul>
   *     <li>CompositeKey</li>
   *     <li>Persistent</li>
   * </ul>
   * 
   * @param domainTairObjectId the unique identifier in TAIR for the protein domain
   * @param tairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @return a Domain CompositeKey primary key
   * @throws InvalidParametersException when there is a problem creating a key
   */
  public static IPrimaryKey getDomainPrimaryKey(java.lang.Long domainTairObjectId, java.lang.Long tairObjectId)
      throws InvalidParametersException {
    IPrimaryKey key = null;
    IPrimaryKey parentKey = getProteinPrimaryKey(tairObjectId);

    // Check the parent key; if it is null, the return key should be null.
    if (parentKey != null) {
      java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
      list.add(new com.poesys.db.col.LongColumnValue("domainTairObjectId", domainTairObjectId));
	  IPrimaryKey subKey = com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.tair.db.protein.Domain");
      key = com.poesys.db.pk.PrimaryKeyFactory.createCompositeKey(parentKey, subKey, "org.tair.db.protein.Domain");
    }
    return key;
  }

  /**
   * Retrieve the ProteinResourceLink data from the result set's current row and create
   * a ProteinResourceLink object.
   * 
   * @param key the primary key for the Protein
   * @param rs the query result set
   * @return a ProteinResourceLink instance based on the result set data
   * @throws SQLException when there is a problem getting data from the results
   * @throws InvalidParametersException when a required value is null
   */
  public static IProteinResourceLink getProteinResourceLinkData(IPrimaryKey key, ResultSet rs)
      throws SQLException, InvalidParametersException {
    // Constructor argument tairObjectId gets the JDBC value with a function call.
    java.lang.Long tairObjectIdValue = rs.getLong("tairObjectId");
    // Constructor argument name gets the JDBC value with a function call.
    java.lang.String nameValue = rs.getString("name");
    // Constructor argument linkType gets the JDBC value with a function call.
    java.lang.String linkTypeValue = rs.getString("linkType");
    // Constructor argument icon gets the JDBC value with a function call.
    java.lang.String iconValue = rs.getString("icon");
    org.tair.db.locusdetail.ILocusDetail locusValue = null;
    // Constructor argument baseUrl gets the JDBC value with a function call.
    java.lang.String baseUrlValue = rs.getString("baseUrl");
    // Constructor argument urlVariable gets the JDBC value with a function call.
    java.lang.String urlVariableValue = rs.getString("urlVariable");
    // Constructor argument explanation gets the JDBC value with a function call.
    java.lang.String explanationValue = rs.getString("explanation");
    // ProteinResourceLink has no lazily loaded members, so there is no need for Proxy.
    IProteinResourceLink newObject = 
      new ProteinResourceLink(key, tairObjectIdValue, nameValue, linkTypeValue, iconValue, locusValue, baseUrlValue, urlVariableValue, explanationValue);
    return newObject;
  }
  
  /**
   * <p>
   * Get a primary key for a ProteinResourceLink based on a result set that must contain
   * the ProteinResourceLink primary key columns. The method creates a primary key of
   * a type specified by the primary key stereotype on the persistent class.
   * </p>
   * <p>
   * Stereotypes:
   * </p>
   * <ul>
   *     <li>CompositeKey</li>
   *     <li>Persistent</li>
   * </ul>
   * 
   * @param rs a JDBC result set with primary key columns
   * @param prefix an optional prefix string for derived column names in 
   *               associations
   * @return a ProteinResourceLink CompositeKey primary key
   * @throws SQLException when there is a problem getting data from the result
   *             set
   * @throws InvalidParametersException when there is a problem creating a key
   */
  public static IPrimaryKey getProteinResourceLinkPrimaryKey(ResultSet rs, String prefix)
      throws SQLException, InvalidParametersException {
    IPrimaryKey key = null;
    if (prefix == null) {
      prefix = "";
    }
    IPrimaryKey parentKey = getProteinPrimaryKey(rs, "");
    java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
    java.lang.String nameValue = rs.getString("name");
    list.add(new com.poesys.db.col.StringColumnValue(prefix + "name", nameValue));
	IPrimaryKey subKey = com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.tair.db.protein.ProteinResourceLink");
    key = com.poesys.db.pk.PrimaryKeyFactory.createCompositeKey(parentKey, subKey, "org.tair.db.protein.ProteinResourceLink");
    return key;
  }

  /**
   * <p>
   * Get a primary key for a ProteinResourceLink based on input key attributes. 
   * The method creates a primary key of a type specified by the primary key 
   * stereotype on the persistent class.
   * </p>
   * <p>
   * Stereotypes:
   * </p>
   * <ul>
   *     <li>CompositeKey</li>
   *     <li>Persistent</li>
   * </ul>
   * 
   * @param name the text name for the link, which usually includes the web site name and any
specific information in the context of the locus; the URL itself may be this
name if there is no other name
   * @param tairObjectId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @return a ProteinResourceLink CompositeKey primary key
   * @throws InvalidParametersException when there is a problem creating a key
   */
  public static IPrimaryKey getProteinResourceLinkPrimaryKey(java.lang.String name, java.lang.Long tairObjectId)
      throws InvalidParametersException {
    IPrimaryKey key = null;
    IPrimaryKey parentKey = getProteinPrimaryKey(tairObjectId);

    // Check the parent key; if it is null, the return key should be null.
    if (parentKey != null) {
      java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
      list.add(new com.poesys.db.col.StringColumnValue("name", name));
	  IPrimaryKey subKey = com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.tair.db.protein.ProteinResourceLink");
      key = com.poesys.db.pk.PrimaryKeyFactory.createCompositeKey(parentKey, subKey, "org.tair.db.protein.ProteinResourceLink");
    }
    return key;
  }

}