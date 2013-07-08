/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractInsert.vsl

package org.tair.db.community.sql;



import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.poesys.db.dao.insert.IInsertSql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * SQL statement specification for inserting a CommunityKeyword
 * 
 * @author Robert J. Muller
 */
public class AbstractInsertCommunityKeyword implements IInsertSql<org.tair.db.community.ICommunityKeyword> {
  private static final String SQL =
    "INSERT INTO CommunityKeyword (communityId, keyword, keywordType) VALUES (?,?,?)";

  public String getSql(IPrimaryKey key) {
    return SQL;
  }

  public void setParams(PreparedStatement stmt, int index, org.tair.db.community.ICommunityKeyword object)
      throws SQLException {
    stmt.setString(index, object.getKeywordType());
    index++;
  }
}
