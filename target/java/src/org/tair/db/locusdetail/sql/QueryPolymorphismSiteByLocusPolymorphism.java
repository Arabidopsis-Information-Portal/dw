/**
 * Copyright 2012 Carnegie Institution for Science. All rights reserved.
 */
// Template: QueryAssociatedLinks.vsl

package org.tair.db.locusdetail.sql;


/**
 * <p>
 * A query Command pattern object that implements a SQL query of a collection of 
 * PolymorphismSite objects using the primary key of the associated
 * class LocusPolymorphism. These objects are the linking objects rather than
 * the objects associated through the link, which have a separate representation.
 * </p>
 * <p>
 * Make any changes to query behavior by overriding methods here rather than 
 * changing the abstract superclass; AndroMDA will overwrite that class when you
 * run it but will never overwrite this concrete subclass.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class QueryPolymorphismSiteByLocusPolymorphism extends AbstractQueryPolymorphismSiteByLocusPolymorphism {

}