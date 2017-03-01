CREATE USER IF NOT EXISTS ROOT SALT '0926f70fdef55da3' HASH '64e960e16b0449e5436aa470c70706347f0f68f2d3ad235007a58917c99aa3ef' ADMIN;
CREATE CACHED TABLE PUBLIC.WILAYAH( 
    KODE_WILAYAH VARCHAR(6) NOT NULL, 
    NAMA_WILAYAH VARCHAR(20), 
    LOKASI_WILAYAH VARCHAR(20), 
    PJ_WILAYAH VARCHAR(20), 
    FK_ID_LINGKUNGAN VARCHAR(6) 
);
ALTER TABLE PUBLIC.WILAYAH ADD CONSTRAINT PUBLIC.CONSTRAINT_7 PRIMARY KEY(KODE_WILAYAH);
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.WILAYAH;
CREATE CACHED TABLE PUBLIC.LINGKUNGAN( 
    ID_LINGKUNGAN VARCHAR(6) NOT NULL, 
    NAMA_LINGKUNGAN VARCHAR(20), 
    PJ_LINGKUNGAN VARCHAR(20), 
    NOTEL_PJ_LINGKUNGAN NUMERIC(15) 
);
ALTER TABLE PUBLIC.LINGKUNGAN ADD CONSTRAINT PUBLIC.CONSTRAINT_A PRIMARY KEY(ID_LINGKUNGAN);
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.LINGKUNGAN;
ALTER TABLE PUBLIC.WILAYAH ADD CONSTRAINT PUBLIC.FK_ID_LINGKUNGAN FOREIGN KEY(FK_ID_LINGKUNGAN) REFERENCES PUBLIC.LINGKUNGAN(ID_LINGKUNGAN) NOCHECK;