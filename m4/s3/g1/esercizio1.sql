CREATE TABLE IF NOT EXISTS clienti (
	numero_cliente SERIAL PRIMARY KEY,
	nome VARCHAR NOT NULL,
	cognome VARCHAR NOT NULL,
	data_nascita DATE NOT NULL,
	regione_residenza VARCHAR NOT NULL
);

INSERT INTO clienti (nome, cognome, data_nascita, regione_residenza) 
		VALUES ('Mario', 'Rossi', '1/8/1982', 'Milano'); 
				('Giuseppe', 'Verdi', '15/10/1985', 'Roma');
				('Francesca', 'Neri', '25/04/1991', 'Napoli');
				('Mattia', 'Bianchi', '24/4/1982', 'Lombardia');


CREATE TABLE IF NOT EXISTS fornitori (
	numero_fornitore SERIAL PRIMARY KEY,
	denominazione VARCHAR NOT NULL,
	regioneResidenza VARCHAR NOT NULL
);

INSERT INTO fornitori (denominazione, regioneResidenza) 
		VALUES ('Epicode', 'Lombardia');
				('Zalando', 'Lazio');
				('Amazon', 'Lazio');
				('ASOS', 'Piemonte');

CREATE TABLE IF NOT EXISTS fatture (
	numero_fattura SERIAL PRIMARY KEY,
	tipologia VARCHAR NOT NULL,
	importo DECIMAL NOT NULL,
	iva VARCHAR NOT NULL DEFAULT '20%',
	id_cliente INTEGER NOT NULL,
	data_fattura DATE NOT NULL,
	numero_fornitore INTEGER NOT NULL,
	CONSTRAINT fatture_clienti_fk FOREIGN KEY (id_cliente) REFERENCES clienti (numero_cliente),
	CONSTRAINT fatture_fornitori_fk FOREIGN KEY (numero_fornitore) REFERENCES fornitori (numero_fornitore)
);

INSERT INTO fatture(tipologia, importo, iva, id_cliente, data_fattura, numero_fornitore) 
		VALUES 	('A', '145.12', '10%', 2, '2/2/2022', 1),
				('B', '533.99', '20%', 1, '29/4/2022', 2),
				('A', '145.12', '20%', 3, '12/1/2023', 1),
				('A', '188.00', '15%', 2, '2/2/2023', 1);

CREATE TABLE IF NOT EXISTS prodotti (
	id_prodotto SERIAL PRIMARY KEY,
	descrizione VARCHAR NOT NULL,
	inProduzione BOOLEAN NOT NULL DEFAULT 'false',
	inCommercio BOOLEAN NOT NULL DEFAULT 'false',
	dataAttivazione DATE NOT NULL,
	dataDisattivazione DATE 
);

INSERT INTO prodotti (descrizione, inProduzione, inCommercio,  dataAttivazione, dataDisattivazione)
		VALUES 	('Prodotto x', true, false, '29/4/2017', '29/4/2023'),
				('Prodotto z', true, true, '15/9/2016', '15/9/2024'),
				('Prodotto q', false, false, '12/12/2017', '12/9/2022'),
				('Prodotto p', false, true, '12/12/2017', '12/9/2022');

DROP TABLE clienti;
DROP TABLE fatture;
DROP TABLE prodotti;
DROP TABLE fornitori;

--ESERCIZIO 1
SELECT nome, cognome FROM clienti WHERE EXTRACT(YEAR FROM data_nascita) = 1982;

--ESERCIZIO 2
SELECT COUNT(*) AS numero_fatture FROM fatture WHERE iva = '20%';

--ESERCIZIO 3
SELECT 
	EXTRACT(YEAR FROM data_fattura) AS anno, 
	COUNT(*) AS numero_fatture,
	SUM(importo) AS somma_importi
FROM fatture 
GROUP BY EXTRACT(YEAR FROM data_fattura);

--ESERCIZIO 4
SELECT * FROM prodotti 
	WHERE EXTRACT(YEAR FROM dataAttivazione) = 2017 
			AND (inProduzione = true OR inCommercio = true);

--ESERCIZIO 5
SELECT EXTRACT(YEAR FROM data_fattura) AS anno, COUNT(*) AS numero_fatture 
	FROM fatture 
	WHERE iva = '20%' 
	GROUP BY EXTRACT(YEAR FROM data_fattura); 

--ESERCIZIO 6
SELECT 
	EXTRACT(YEAR FROM data_fattura) AS anno,
	COUNT(*) AS numero_fatture 
FROM fatture
WHERE tipologia = 'A'
GROUP BY EXTRACT(YEAR FROM data_fattura) 
HAVING COUNT(*) > 1; -- seleziona solo gli anni in cui sono presenti più di una fattura.

--ESERCIZIO 7
SELECT numero_fattura, importo, iva, data_fattura, denominazione  
FROM fatture INNER JOIN fornitori ON fatture.numero_fornitore = fornitori.numero_fornitore;
--serve a richiamare gli elementi di fatture con l'aggiunta del nome del fornitore

--ESERCIZIO 8
SELECT clienti.regione_residenza, SUM(fatture.importo) AS importo_fatture
FROM fatture INNER JOIN clienti ON fatture.id_cliente = clienti.numero_cliente
GROUP BY clienti.regione_residenza;
--Estrarre il totale degli importi delle fatture divisi per residenza dei clienti

--ESERCIZIO 9
/*SELECT COUNT(*) AS numero_clienti 
	FROM clienti INNER JOIN fatture 
	ON fatture.id_cliente = clienti.numero_cliente
	WHERE EXTRACT(YEAR FROM data_nascita) = 1980 AND fatture.importo > 50;
--Estrarre il numero dei clienti nati nel 1980 che hanno almeno una fattura superiore a 50 euro	*/
	
--ESERCIZIO 10
SELECT CONCAT(nome, '-', cognome) FROM clienti WHERE regione_residenza = 'Lombardia';
-- Estrarre una colonna di nome “Denominazione” contenente il nome, seguito da un carattere “-“, seguito dal cognome, per i soli clienti residenti nella regione Lombardia
