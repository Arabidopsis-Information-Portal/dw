--
-- Copyright 2012 Carnegie Institution for Science. All rights reserved.
--
-- Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
-- Template: SubsystemOracleSchemaTables.vsl

-- Oracle SQL schema for protein subsystem

CREATE TABLE Protein (
  tairObjectId NUMBER(18) NOT NULL,  
  name VARCHAR2(50) NOT NULL,  
  sequence VARCHAR2(200) NOT NULL,  
  genbankGi VARCHAR2(20),  
  genPept VARCHAR2(20),  
  molecularWeight BINARY_DOUBLE,  
  isoelectricPoint BINARY_DOUBLE,  
  length NUMBER(12) NOT NULL,  
  dateLastModified TIMESTAMP WITH TIME ZONE NOT NULL,  
  CONSTRAINT ProteinPK PRIMARY KEY (tairObjectId)
);

CREATE TABLE ProteinTranscript (
  tairObjectId NUMBER(18) NOT NULL,  
  geneTairObjectId NUMBER(18),  
  name VARCHAR2(50),  
  CONSTRAINT ProteinTranscriptPK PRIMARY KEY (geneTairObjectId, tairObjectId)
);

CREATE TABLE Domain (
  tairObjectId NUMBER(18) NOT NULL,  
  domainTairObjectId NUMBER(18),  
  name VARCHAR2(500),  
  database VARCHAR2(20),  
  structuralClassType VARCHAR2(50),  
  accession VARCHAR2(50),  
  interproAccession VARCHAR2(20) NOT NULL,  
  interpro VARCHAR2(150) NOT NULL,  
  startPosition NUMBER(12),  
  endPosition NUMBER(12),  
  CONSTRAINT DomainPK PRIMARY KEY (domainTairObjectId, tairObjectId)
);

CREATE TABLE ProteinResourceLink (
  tairObjectId NUMBER(18) NOT NULL,  
  name VARCHAR2(255) NOT NULL,  
  linkType VARCHAR2(50),  
  icon VARCHAR2(500),  
  locus ${col.sqlTypeOracle11g} NOT NULL,  
  baseUrl VARCHAR2(4000) NOT NULL,  
  urlVariable VARCHAR2(1024),  
  explanation VARCHAR2(100),  
  CONSTRAINT ProteinResourceLinkPK PRIMARY KEY (name, tairObjectId)
);
