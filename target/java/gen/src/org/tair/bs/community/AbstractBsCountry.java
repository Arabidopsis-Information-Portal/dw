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


import org.tair.db.community.ICountry;
import org.tair.db.community.CountryProxy;
import org.tair.db.community.Country;


/**
 * <p>
 * A business layer data-transfer object (DTO) for the Country. This class
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
 *     <li>Persistent</li>
 *     <li>SequenceKey</li>
 * </ul>
 * <p>
 * Class is read/write: false
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractBsCountry 
    extends AbstractDto<org.tair.db.community.ICountry> {

  /**
   * Create a BsCountry object from a Country object.
   * 
   * @param dto the data-access layer Country DTO
   * @throws DelegateException when there is a problem creating the Country
   */
  public AbstractBsCountry(ICountry dto) throws DelegateException {
    super(dto);
  }

  /**
   * Create a Country from new data.
   *
   * @param key the primary key of the Country
   * @param countryId primary key attribute
   * @param name the formal name of the country
   */
  public AbstractBsCountry(IPrimaryKey key, java.math.BigInteger countryId, java.lang.String name) {
    super(new CountryProxy(new Country(key, countryId, name)));
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object arg0) {
    // Unchecked cast here
    IDto<ICountry> other = (IDto<ICountry>)arg0;
    return dto.equals(other.toDto());
  }

  @Override
  public int hashCode() {
    return dto.hashCode();
  }

  public int compareTo(IDto<ICountry> o) {
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
   * Primary key attribute
   * </p>
   * <p>
   * Added by AddGeneratedKeyProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Country</li>
   * </ul>
   * </p>
   * @return a java.math.BigInteger countryId
   */
  public java.math.BigInteger getCountryId() {
    return dto.getCountryId();
  }

  /**
   * <p>
   * the formal name of the country
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object Country</li>
   * </ul>
   * </p>
   * @return a java.lang.String name
   */
  public java.lang.String getName() {
    return dto.getName();
  }
}