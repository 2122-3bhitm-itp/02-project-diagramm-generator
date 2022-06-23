CREATE TABLE Firma
(
    firmenNr bigint primary key,
    name     varchar(100)
);

CREATE TABLE Raum
(
    raumNr    bigint primary key,
    stockwerk varchar(3)

);

CREATE TABLE Kategorie
(
    kategorieNr   bigint primary key,
    kategorieName varchar(100)
);


Create TABLE Geraet
(
    geraetNr    bigint primary key,
    austauschbar boolean,
    kabellos    boolean,
    firmenNr    BIGINT,
    kategorieNr BIGINT,
    raumNr      BIGINT,
    partOf      BIGINT,


    FOREIGN KEY (kategorieNr) REFERENCES Kategorie (kategorieNr),
    FOREIGN KEY (firmenNr) REFERENCES Firma (firmenNr),
    FOREIGN KEY (partOf) REFERENCES Geraet (geraetNr),
    FOREIGN KEY (raumNr) REFERENCES Raum (raumNr)

);