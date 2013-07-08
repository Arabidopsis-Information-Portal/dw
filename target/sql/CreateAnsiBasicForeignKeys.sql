--
-- Copyright 2012 Carnegie Institution for Science. All rights reserved.
--
-- Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
-- Template: SubsystemAnsiSchemaForeignKeys.vsl

-- Create all the foreign keys for the Basic schema

-- Foreign keys for SpeciesVariant

ALTER TABLE SpeciesVariant ADD CONSTRAINT taxon FOREIGN KEY (taxonId) REFERENCES Taxon(taxonId) ON DELETE CASCADE;

