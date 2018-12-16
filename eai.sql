-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Erstellungszeit: 16. Dez 2018 um 22:15
-- Server-Version: 10.1.16-MariaDB
-- PHP-Version: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `eai`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `account`
--

CREATE TABLE `account` (
  `idAccount` int(11) NOT NULL,
  `Datum` date NOT NULL,
  `Acc_Name` varchar(45) NOT NULL,
  `Treuepunkte` int(11) DEFAULT NULL,
  `Kunde_idKunde` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `bestellteprodukte`
--

CREATE TABLE `bestellteprodukte` (
  `Produkt Menge` varchar(45) NOT NULL,
  `Kosten` int(11) NOT NULL,
  `idBestellteprodukte` int(11) NOT NULL,
  `Rechnungsobjekte_idRechnungsobjekte` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `bestellung`
--

CREATE TABLE `bestellung` (
  `idBestellung` int(11) NOT NULL,
  `Datum` datetime NOT NULL,
  `Menge` int(11) NOT NULL,
  `Kunde_idKunde` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `bestellungen`
--

CREATE TABLE `bestellungen` (
  `idbestellungen` int(11) NOT NULL,
  `Titel` varchar(45) NOT NULL,
  `Erste` varchar(45) NOT NULL,
  `Mittlere` varchar(45) NOT NULL,
  `Letzte` varchar(45) NOT NULL,
  `Bestelldatum` varchar(45) NOT NULL,
  `Gelifert` varchar(45) NOT NULL,
  `produkte_idprodukte` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `details`
--

CREATE TABLE `details` (
  `iddetails` int(11) NOT NULL,
  `produktid` varchar(45) NOT NULL,
  `Menge` varchar(45) NOT NULL,
  `Stueckpreis` varchar(45) NOT NULL,
  `Preis` varchar(45) NOT NULL,
  `versand_idversand` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `kunde`
--

CREATE TABLE `kunde` (
  `idKunde` int(11) NOT NULL,
  `Vorname` varchar(45) NOT NULL,
  `Nachname` varchar(45) NOT NULL,
  `Geschlecht` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `TEL` int(11) NOT NULL,
  `Adresse` varchar(45) NOT NULL,
  `Kreditkarte` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `kunde`
--

INSERT INTO `kunde` (`idKunde`, `Vorname`, `Nachname`, `Geschlecht`, `Email`, `TEL`, `Adresse`, `Kreditkarte`) VALUES
(101001, 'Hans', 'Meyer', 'Herr', 'test@gmail.com', 775556677, 'Musterweg 12', '55226655442211772');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `produkte`
--

CREATE TABLE `produkte` (
  `idprodukte` int(11) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Bestellnummer` varchar(45) NOT NULL,
  `Marke` varchar(45) NOT NULL,
  `Startmenge` varchar(45) NOT NULL,
  `Erhaltenemenge` varchar(45) NOT NULL,
  `Versendetendmenge` varchar(45) NOT NULL,
  `Versandbereitemenge` varchar(45) NOT NULL,
  `Minimalmenge` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `rechnungen`
--

CREATE TABLE `rechnungen` (
  `idRechnungen` int(11) NOT NULL,
  `Datum` int(11) NOT NULL,
  `Betrag` int(11) NOT NULL,
  `Bestellungen_idBestellungen` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `rechnungsobjekte`
--

CREATE TABLE `rechnungsobjekte` (
  `idRechnungsobjekte` int(11) NOT NULL,
  `Menge` varchar(45) NOT NULL,
  `Rechnungsobjektecol` varchar(45) NOT NULL,
  `Stueckpreis` int(11) NOT NULL,
  `Spezielle Kosten` int(11) NOT NULL,
  `Steuertaxe` int(11) NOT NULL,
  `Total Kosten` int(11) NOT NULL,
  `Rechnungen_idRechnungen` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `supplier`
--

CREATE TABLE `supplier` (
  `idsupplier` int(11) NOT NULL,
  `Name` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `supplier_has_produkte`
--

CREATE TABLE `supplier_has_produkte` (
  `supplier_idsupplier` int(11) NOT NULL,
  `produkte_idprodukte` int(11) NOT NULL,
  `ideinkauf` int(11) NOT NULL,
  `Erhaltenemenge` varchar(45) NOT NULL,
  `Kaufdatum` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `typ`
--

CREATE TABLE `typ` (
  `idtyp` int(11) NOT NULL,
  `name` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `versand`
--

CREATE TABLE `versand` (
  `idversand` int(11) NOT NULL,
  `client_id` varchar(45) NOT NULL,
  `timestamp` varchar(45) NOT NULL,
  `Lieferadresse` varchar(45) NOT NULL,
  `preis` varchar(45) NOT NULL,
  `Zahlungsadresse` varchar(45) NOT NULL,
  `Versandkosten` varchar(45) NOT NULL,
  `Rabatt` varchar(45) NOT NULL,
  `Endpreis` varchar(45) NOT NULL,
  `typ_idtyp` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`idAccount`),
  ADD KEY `fk_Account_Kunde_idx` (`Kunde_idKunde`);

--
-- Indizes für die Tabelle `bestellteprodukte`
--
ALTER TABLE `bestellteprodukte`
  ADD PRIMARY KEY (`idBestellteprodukte`),
  ADD KEY `fk_Bestellteprodukte_Rechnungsobjekte1_idx` (`Rechnungsobjekte_idRechnungsobjekte`);

--
-- Indizes für die Tabelle `bestellung`
--
ALTER TABLE `bestellung`
  ADD PRIMARY KEY (`idBestellung`),
  ADD KEY `fk_Bestellung_Kunde1_idx` (`Kunde_idKunde`);

--
-- Indizes für die Tabelle `bestellungen`
--
ALTER TABLE `bestellungen`
  ADD PRIMARY KEY (`idbestellungen`),
  ADD KEY `fk_bestellungen_produkte1_idx` (`produkte_idprodukte`);

--
-- Indizes für die Tabelle `details`
--
ALTER TABLE `details`
  ADD PRIMARY KEY (`iddetails`),
  ADD KEY `fk_details_versand1_idx` (`versand_idversand`);

--
-- Indizes für die Tabelle `kunde`
--
ALTER TABLE `kunde`
  ADD PRIMARY KEY (`idKunde`);

--
-- Indizes für die Tabelle `produkte`
--
ALTER TABLE `produkte`
  ADD PRIMARY KEY (`idprodukte`);

--
-- Indizes für die Tabelle `rechnungen`
--
ALTER TABLE `rechnungen`
  ADD PRIMARY KEY (`idRechnungen`);

--
-- Indizes für die Tabelle `rechnungsobjekte`
--
ALTER TABLE `rechnungsobjekte`
  ADD PRIMARY KEY (`idRechnungsobjekte`),
  ADD KEY `fk_Rechnungsobjekte_Rechnungen1_idx` (`Rechnungen_idRechnungen`);

--
-- Indizes für die Tabelle `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`idsupplier`);

--
-- Indizes für die Tabelle `supplier_has_produkte`
--
ALTER TABLE `supplier_has_produkte`
  ADD PRIMARY KEY (`supplier_idsupplier`,`produkte_idprodukte`,`ideinkauf`),
  ADD KEY `fk_supplier_has_produkte_produkte1_idx` (`produkte_idprodukte`),
  ADD KEY `fk_supplier_has_produkte_supplier_idx` (`supplier_idsupplier`);

--
-- Indizes für die Tabelle `typ`
--
ALTER TABLE `typ`
  ADD PRIMARY KEY (`idtyp`);

--
-- Indizes für die Tabelle `versand`
--
ALTER TABLE `versand`
  ADD PRIMARY KEY (`idversand`),
  ADD KEY `fk_versand_typ1_idx` (`typ_idtyp`);

--
-- Constraints der exportierten Tabellen
--

--
-- Constraints der Tabelle `account`
--
ALTER TABLE `account`
  ADD CONSTRAINT `fk_Account_Kunde` FOREIGN KEY (`Kunde_idKunde`) REFERENCES `mydb`.`kunde` (`idKunde`);

--
-- Constraints der Tabelle `bestellteprodukte`
--
ALTER TABLE `bestellteprodukte`
  ADD CONSTRAINT `fk_Bestellteprodukte_Rechnungsobjekte1` FOREIGN KEY (`Rechnungsobjekte_idRechnungsobjekte`) REFERENCES `payment_db`.`rechnungsobjekte` (`idRechnungsobjekte`);

--
-- Constraints der Tabelle `bestellung`
--
ALTER TABLE `bestellung`
  ADD CONSTRAINT `fk_Bestellung_Kunde1` FOREIGN KEY (`Kunde_idKunde`) REFERENCES `mydb`.`kunde` (`idKunde`);

--
-- Constraints der Tabelle `bestellungen`
--
ALTER TABLE `bestellungen`
  ADD CONSTRAINT `fk_bestellungen_produkte1` FOREIGN KEY (`produkte_idprodukte`) REFERENCES `inventory_db`.`produkte` (`idprodukte`);

--
-- Constraints der Tabelle `details`
--
ALTER TABLE `details`
  ADD CONSTRAINT `fk_details_versand1` FOREIGN KEY (`versand_idversand`) REFERENCES `shipping_db`.`versand` (`idversand`);

--
-- Constraints der Tabelle `rechnungsobjekte`
--
ALTER TABLE `rechnungsobjekte`
  ADD CONSTRAINT `fk_Rechnungsobjekte_Rechnungen1` FOREIGN KEY (`Rechnungen_idRechnungen`) REFERENCES `payment_db`.`rechnungen` (`idRechnungen`);

--
-- Constraints der Tabelle `supplier_has_produkte`
--
ALTER TABLE `supplier_has_produkte`
  ADD CONSTRAINT `fk_supplier_has_produkte_produkte1` FOREIGN KEY (`produkte_idprodukte`) REFERENCES `inventory_db`.`produkte` (`idprodukte`),
  ADD CONSTRAINT `fk_supplier_has_produkte_supplier` FOREIGN KEY (`supplier_idsupplier`) REFERENCES `inventory_db`.`supplier` (`idsupplier`);

--
-- Constraints der Tabelle `versand`
--
ALTER TABLE `versand`
  ADD CONSTRAINT `fk_versand_typ1` FOREIGN KEY (`typ_idtyp`) REFERENCES `shipping_db`.`typ` (`idtyp`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
