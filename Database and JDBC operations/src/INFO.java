public class INFO {

     /*
     	Robienie tabeli:
CREATE TABLE EMPLOYEES(
ID			INT		NOT NULL,
NAME			VARCHAR(20)	NOT NULL,
SURNAME			VARCHAR(20)	NOT NULL,
AGR			SMALLINT,
SALARY			NUMERIC(7,20)	NOT NULL,
DATE_OF_EMPLOYMENT	DATE,
PRIMARY KEY(ID)			// wartosc ktora definije unikalny rekord
);


	Dodawanie wartości do tabeli
--  INSERT INTO EMPLOYEES (ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT)
--       VALUES (8, 'Michal', 'Michal 8791.6449, '2018-03-12');

--  INSERT INTO EMPLOYEES (ID, NAME, SURNAME, SALARY)
--       VALUES (8, 'Michal', 'Michalski', 891.6449);



	Wybór tabeli:
SELECT * FROM EMPLOYEES;

SELECT ID, NAME, SURNAME FROM EMPLOYEES;

SELECT * FROM information.schema.columns	// zwraca ustawienia dla kolumn
WHERE table_name = 'employees';

SELECT *
FROM EMPLOYEES
WHERE name = 'Roman' AND AGE = 52;
WHERE name = 'Roman' OR name = 'Anna';

SELECT *
FROM EMPLOYEES
WHERE AGE IS NULL;

SELECT *
FROM EMPLOYEES
WHERE AGE NOT IN (33,38);  // zwraca wszystko procz 33 i 38

SELECT *
FROM EMPLOYEES
WHERE NAME LIKE '%Ro%';   // % oznacza ze przed lub po moze byc jakas inna warosc



	zwracanie kolumn z innymi nazwami (alias)
SELECT ID AS XXX FROM EMPLOYEES;

SELECT
	ID AS PKET,
	NAME AS my_name,
FROM EMPLOYEES;	 		// dziala na czas jednego zapytania



	drop table:
DROP TABLE EMPLOYEES;       // usowa cala tabele

	Usówanie rekordow:
DELETE FROM EMPLOYEES WHERE ID > 7

DELETE FROM EMPLOYEES   // usunie wszystkie dane z tabeli


	zmiana ustawien kolumn:
ALTER TABLE EMPLOYEES
ALTER COLUMN SURNAME DROP NOT NULL;	// pozwala na wkladanie nulli
ALTER COLUMN SURNAME DROP NOT NULL;	// nie pozwala na wkladanie nulli



	operatory logiczne:

	modulo:
SELECT
	NAME,
	AGE,
	AGE % 10 AS AGE_MODULO
FROM EMPLOYEES;

	rozne od:
SELECT *
FROM EMPLOYEES;
WHERE NAME != 'Roman';
WHERE NAME <> 'Roman';	// ten sam zapis


	wieksze mniejsze:
SELECT *
FROM EMPLOYEES
WHERE age > 30;
WHERE salary < 7000;


	operator in (lub):
SELECT *
FROM EMPLOYEES
WHERE name IN (	'Roman', 'Anna', 'Tomasz');


	between (pomiedzy):
SELECT *
FROM EMPLOYEES
WHERE age BETWEEN 20 AND 40;
WHERE age >= 20 and age <= 38;  // ten sam zapis



    sortowanie:
SELECT *
FROM EMPLOYEES
WHERE AGE IS NOT NULL
ORDER BY AGE ASC;    // ASC / DESC   rosnaco, malejaco

ORDER BY NAME DESC, SURNAME ASC;

Przy sortowaniu warto dodać gdzie pojawiają sie wartości NULL:
Przy sortowaniu rosnącym NULLe są domyślnie na końcu, przy sortowaniu malejącym NULLe są domyślnie na początku.
Można tym sterować poleceniem NULLS FIRST / NULLS LAST. Na przykład ... ORDER BY AGE DESC NULLS LAST



    limit - ogranicza ilosc wierszy
SELECT *
FROM EMPLOYEES
ORDER BY NAME DESC
LIMIT 2;


    distinct - unikalne wartosci bez duplikatow
SELECT DISTINCT NAME
FROM EMPLOYEES
ORDER BY NAME DESC;


    funkcje agregujące (grupowanie elementow):
        count - zliczanie elementow w tablicy

SELECT NAME, COUNT(*)              // mozna wedlug roznych column grupowac COUNT(ID)
FROM EMPLOYEES
GROUP BY NAME;


SELECT *            // taki zapis gubi ile jest Romanow w tabeli. Zwraca tylko raz unikalny rekord i nie mowi ile jest Romanow
FROM EMPLOYEES
GROUP BY NAME;

        sum - sumowanie elementow tabeli
SELECT NAME, SUM(AGE)              // zsumuje wiek wszystki imion jakie wystepuja w tabeli
FROM EMPLOYEES                     // dla kilku Romanow zsumuje ich wiek i zwroci
GROUP BY NAME;


SELECT NAME, COUNT(ID), SUM(SALARY)              // polaczenie count i sum, zworic ile jest Romanow i sume ich wyplat
FROM EMPLOYEES
GROUP BY NAME;

    inne funkcje agregujace:
AVG - average, srednia z wszystkich szukanych rekordow
MAX - najwiueksza wartosc dla szukanych rekordow
MIN - wartosc minimalna dla rekordow




    zliczanie elementow
SELECT COUNT(*)     // wszystkie rekordy
FROM EMPLOYEES;

SELECT COUNT(NAME)     // wszystkie imiona
FROM EMPLOYEES;

SELECT COUNT(DISTINCT NAME)     // unikalne imiona
FROM EMPLOYEES;


    zmiany w rekordach:
UPDATE EMPLOYEES
SET SALARY = 10000
WHERE NAME = 'Anna';     // wszystkie Anny zarabiaja 10000


UPDATE EMPLOYEES
SET SURNAME = 'Zajavkowy', AGE = 30
WHERE NAME = 'Roman';           // wszystkie romany maja na nazwisko Zajavkowy i maja po 30 lat


      */


}