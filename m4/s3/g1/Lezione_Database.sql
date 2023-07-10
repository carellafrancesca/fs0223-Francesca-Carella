/* DDL - Data Definition Language */

--CREATE DATABASE dbtest; --Crea un database di nome dbtest
--DROP DATABASE dbtest; --Cancella un database di nome dbtest

CREATE TABLE utente (
	id SERIAL,
	nome VARCHAR NOT NULL DEFAULT '---',
	cognome VARCHAR NOT NULL DEFAULT '---',
	anni INTEGER NOT NULL,
	email VARCHAR NOT NULL UNIQUE,
	citta INTEGER NOT NULL,
	CONSTRAINT utente_pk PRIMARY KEY (id),
	CONSTRAINT utente_citta_FK FOREIGN KEY (citta) REFERENCES citta(id) 
	--creo un vincolo foreign key tra il campo citta della tabella utenti(la tabella in cui mi trovo) che si referenzia con la tabella citta sul campo univoco id
);

CREATE TABLE città (
	id SERIAL PRIMARY KEY, -- 1, 2, 3, 4...
	nome VARCHAR NOT NULL, --'Roma', 'Milano', 'Napoli', 'Torino'...
	provincia VARCHAR NOT NULL,
	regione VARCHAR NOT NULL
);

--DROP TABLE utente; --Per cancellare la tabella
--DROP TABLE citta; --Per cancellare la tabella

ALTER TABLE utente ADD cf VARCHAR NOT NULL UNIQUE; 
-- Modificare la struttura del database, aggiungendo una colonna
ALTER TABLE utente DROP cf;
--Modifico la struttura della tabella, andando a cancellare una proprietà esistente
ALTER TABLE utente RENAME COLUMN cf TO codice_fiscale;
--Modifico la struttura della tabella, andando a rinominare una proprietà esistente
ALTER TABLE utente DROP codice_fiscale;
ALTER TABLE UTENTE DROP CONSTRAINT utente_citta_fk;
--Modifico la struttura della tabella, andando a rimuovere un vincolo esistente
ALTER TABLE utente ADD CONSTRAINT utente_citta_FK FOREIGN KEY (citta) REFERENCES citta (id)
--Modifico la struttura della tabella, andando a aggiungere un vincolo esistente


/* DML - Data Manipulation Language */

INSERT INTO citta (nome, provincia, regione) VALUES ('Roma', 'Roma', 'Lazio');
INSERT INTO citta (nome, provincia, regione) VALUES ('Milano', 'Milano', 'Lombardia');
INSERT INTO citta (nome, provincia, regione) VALUES ('Rozzano', 'Milano', 'Lazio');
INSERT INTO citta (nome, provincia, regione) VALUES ('Roma', 'San Cesareo', 'Lazio');
INSERT INTO citta (nome, provincia, regione) VALUES ('Pompeii', 'Napoli', 'Campania');

INSERT INTO utente (nome, cognore, anni, email, citta) VALUES ('Mario', 'Rossi', 25, 'm.rossi@example.com', 2);
INSERT INTO utente (nome, cognore, anni, email, citta) VALUES ('Giuseppe', 'Verdi', 49, 'g.verdi@example.com', 3);
INSERT INTO utente (nome, cognore, anni, email, citta) VALUES ('Francesca', 'Neri', 37, 'f.neri@example.com', 5);
INSERT INTO utente (nome, cognore, anni, email, citta) VALUES ('Antonio', 'Bianchi', 19, 'a.bianchi@example.com', 1);

DELETE FROM utente WHERE id = 3; --Cancella l'utente con id 3
--DELETE FROM utente; --Cancella tutti gli utenti

UPDATE utente SET citta = 4 WHERE id = 9; --Modifico il valore citta solo per la riga 4 (?)
UPDATE utente SET citta = 4; --Modifico tutti i dati del campo citta nella tabella utente 

/* DQUl - Data Query Language */

SELECT * FROM utente; --Leggo tutti i dati presenti nella tabella utente
SELECT * FROM citta; -- * = tutti

SELECT nome, cognome FROM utente;

SELECT * FROM utente Where citta = 4;
SELECT * FROM citta WHERE provincia = 'Milano';
SELECT * FROM citta WHERE provincia = 'Milano' AND nome = 'Rozzano';

--% sta per qualunque cosa %mba = può iniziare in qualsiasi modo, ma l'importante è che contenta mba al suo interno
SELECT * FROM citta WHERE regione Like '%mba'; --Ricerca per una sottostringa, un dato parziale
SELECT * FROM citta WHERE regione Like 'L%'; --In questo caso deve cominciare per L e finire in qualsiasi modo
SELECT * FROM citta WHERE regione LIKE 'Lz%';
SELECT * FROM utente WHERE email LIKE '.%@%.com';
SELECT * FROM utente WHERE anni > 30;

/*I JOIN unisce due tabelle e prende i dati 
INNER JOIN - LEFT JOIN - RIGHT JOIN - FULL JOIN*/

/*Inner join prende dati che sono in relazione tra la tabella A e la tabella B*/
SELECT * FROM utente INNER JOIN citta ON utente.citta = citta.id;
SELECT * FROM utente LEFT JOIN citta ON utente.citta = citta.id;
SELECT * FROM utente RIGHT JOIN citta ON utente.citta = citta.id;
SELECT * FROM utente FULL JOIN citta ON utente.citta = citta.id;

SELECT * FROM utente ORDER BY anni ASC;
SELECT * FROM utente ORDER BY nome DESC;

/*Selezionare solo una volte le province*/
SELECT DISTINCT provincia FROM citta; 