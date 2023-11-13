public class INFO_2_relacje {

    /*
    CREATE TABLE ADDRESSES (
        ID INT NOT NULL,
        STREET VARCHAR(32) NOT NULL,
        CITY VARCHAR(64) NOT NULL,
        PRIMARY KEY(ID)
    );

    CREATE TABLE EMPLOYEES(
        ID			        INT		        NOT NULL,
        NAME			    VARCHAR(20) 	NOT NULL,
        SURNAME			    VARCHAR(20) 	NOT NULL,
        AGR			        SMALLINT,
        SALARY			    NUMERIC(7,20)	NOT NULL,
        DATE_OF_EMPLOYMENT	DATE,
        ADDRESS_ID          INT             NOT NULL,       // okreslamy kolumne w tabelce dla ktorej robimy relacje
        PRIMARY KEY(ID),
        CONSTRAINT fk_address                               // okreslenie klucza obcego (powiazanie ze soba 2 tabel)
            FOREIGN KEY (ADDRESS_ID)
                REFERENCES ADDRESSES(ID)
    );

INSERT INTO ADDRESSED (ID, CITY, STREET) VALUES (1, 'Warszawa', 'Marszałkowska');
INSERT INTO ADDRESSED (ID, CITY, STREET) VALUES (2, 'Gdańsk', 'Oliwska');
INSERT INTO ADDRESSED (ID, CITY, STREET) VALUES (3, 'Szczecin', 'Biała');

SELECT * FROM ADDRESSES;

INSERT INTO EMPLOYEES (ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT, ADDRESS_ID)
      VALUES (8, 'Michal', 'Michal 8791.6449, '2018-03-12', 1);           // dodanie rekordu do pierwszej tablicy z relacją do drugiej


// jesli do ktoregos wpisu mamy odwolanie do innej tabelki, to nie mozna wyzucic takiego rekoru


    laczenie tabel:
SELECT EMP.ID, NAME, SURNAME, AGE, SALARY, DATE_OF_EMPLOYMENT, ADDRESS_ID, ADR.ID, SITY, STREET
FROM EMPLOYEES AS EMP
    INNER JOIN ADRESSES AS ADR ON EMP.ADRESS_ID = ADR.ID;

    lub INNER JOIN ADDRESSES ON EMPLOYEES.ADDRESS_ID = ADDRESSES.ID;




     */

}
