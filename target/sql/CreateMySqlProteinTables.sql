--
-- Copyright 2012 Carnegie Institution for Science. All rights reserved.
--
-- Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
-- Template: SubsystemMySqlSchemaTables.vsl

-- SQL schema for protein subsystem

CREATE TABLE Protein (
  tairObjectId BIGINT NOT NULL,  
  name VARCHAR(50) NOT NULL,  
  sequence VARCHAR(200) NOT NULL,  
  genbankGi VARCHAR(20),  
  genPept VARCHAR(20),  
  molecularWeight NUMERIC,  
  isoelectricPoint NUMERIC,  
  length INT NOT NULL,  
  dateLastModified TIMESTAMP NOT NULL,  
  CONSTRAINT ProteinPK PRIMARY KEY (tairObjectId)
) ENGINE=InnoDB CHARSET=utf8;

CREATE TABLE ProteinTranscript (
  tairObjectId BIGINT NOT NULL,  
  geneTairObjectId BIGINT,  
  name VARCHAR(50),  
  CONSTRAINT ProteinTranscriptPK PRIMARY KEY (geneTairObjectId, tairObjectId)
) ENGINE=InnoDB CHARSET=utf8;

CREATE TABLE Domain (
  tairObjectId BIGINT NOT NULL,  
  domainTairObjectId BIGINT,  
  name VARCHAR(500),  
  database VARCHAR(20),  
  structuralClassType VARCHAR(50),  
  accession VARCHAR(50),  
  interproAccession VARCHAR(20) NOT NULL,  
  interpro VARCHAR(150) NOT NULL,  
  startPosition INT,  
  endPosition INT,  
  CONSTRAINT DomainPK PRIMARY KEY (domainTairObjectId, tairObjectId)
) ENGINE=InnoDB CHARSET=utf8;

CREATE TABLE ProteinResourceLink (
  tairObjectId BIGINT NOT NULL,  
  name VARCHAR(255) NOT NULL,  
  linkType VARCHAR(50),  
  icon VARCHAR(500),  
  locus ${col.sqlTypeMySql51} NOT NULL,  
  baseUrl VARCHAR(4000) NOT NULL,  
  urlVariable VARCHAR(1024),  
  explanation VARCHAR(100),  
  CONSTRAINT ProteinResourceLinkPK PRIMARY KEY (name, tairObjectId)
) ENGINE=InnoDB CHARSET=utf8;

