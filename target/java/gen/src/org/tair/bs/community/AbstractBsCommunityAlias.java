/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractBsDto.vsl


package org.tair.bs.community;


import com.poesys.bs.delegate.DelegateException;
import com.poesys.bs.dto.IDto;
import com.poesys.db.dto.DtoStatusException;
import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.dto.AbstractDto;


import org.tair.db.community.ICommunityAlias;
import org.tair.db.community.CommunityAliasProxy;
import org.tair.db.community.CommunityAlias;


/**
 * <p>
 * A business layer data-transfer object (DTO) for the CommunityAlias. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * 
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>CompositeKey</li>
 *     <li>Persistent</li>
 * </ul>
 * <p>
 * Class is read/write: false
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractBsCommunityAlias 
    extends AbstractDto<org.tair.db.community.ICommunityAlias> {

  /**
   * Create a BsCommunityAlias object from a CommunityAlias object.
   * 
   * @param dto the data-access layer CommunityAlias DTO
   * @throws DelegateException when there is a problem creating the CommunityAlias
   */
  public AbstractBsCommunityAlias(ICommunityAlias dto) throws DelegateException {
    super(dto);
  }

  /**
   * Create a CommunityAlias from new data.
   *
   * @param key the primary key of the CommunityAlias
   * @param communityId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param alias an alternate name for the community member
   */
  public AbstractBsCommunityAlias(IPrimaryKey key, java.math.BigInteger communityId, java.lang.String alias) {
    super(new CommunityAliasProxy(new CommunityAlias(key, communityId, alias)));
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object arg0) {
    // Unchecked cast here
    IDto<ICommunityAlias> other = (IDto<ICommunityAlias>)arg0;
    return dto.equals(other.toDto());
  }

  @Override
  public int hashCode() {
    return dto.hashCode();
  }

  public int compareTo(IDto<ICommunityAlias> o) {
    return dto.compareTo(o.toDto());
  }

  public void markChildrenDeleted() throws DtoStatusException {
    dto.markChildrenDeleted();
  }
  
  public IPrimaryKey getPrimaryKey() {
    return dto.getPrimaryKey();
  }

  // Data member properties

  /**
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   * <p>
   * Added by AddGeneratedKeyProperties + AddParentKeyAttributes as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object CommunityAlias</li>
   * </ul>
   * </p>
   * @return a java.math.BigInteger communityId
   */
  public java.math.BigInteger getCommunityId() {
    return dto.getCommunityId();
  }

  /**
   * <p>
   * an alternate name for the community member
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object CommunityAlias</li>
   * </ul>
   * </p>
   * @return a java.lang.String alias
   */
  public java.lang.String getAlias() {
    return dto.getAlias();
  }

  /**
   * <p>
   * the community member for which the alias is another name
   * </p>
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties as data member
   * </p>
   * <p>
   * This property loads lazily on demand the first time you call this method,
   * not when you instantiate the BsCommunityAlias object.
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object CommunityAlias</li>
   * </ul>
   * </p>
   * @return a org.tair.bs.community.BsCommunity member
   * @throws java.sql.SQLException when the method can't get a SQL connection to 
   *                               load the property lazily
   */
  public org.tair.bs.community.BsCommunity getMember() throws java.sql.SQLException {
    // Return 4
    return new org.tair.bs.community.BsCommunity(dto.getMember());
  }
}