public class INFO {

    /*
    JDBC jest starym mechanizmem, nie bedzie uzywane w nowym kodzie.

    laczenie z zawnetrzna baza danych zachodzi poprzez zaimplementowanie 3 interfacow:
        Connection
        Statement
        ResultSet

    wszystkie implementuja AutoClosable

    stworzenie polaczenia wyglada w ponizszy sposob:
        <protokol>:<jaka_baza-danych>://<adress_url_bazy>/<nazwa_bazy>
        jbdc:postgresql://127.0.0.1:5432/zajavka


      JDBC - Java DataBase Conectivity
        jest to interfejs API pozwalający na ustanowienie połączenia do bazy danych z poziomu aplikacji napisanej w Javie.
        Biblioteki, których potrzebujemy, zawierają pakiety java.sql.*
        i są w taki sam sposób dostępny jak kolekcje w pakietach java.util

      w zależnosci od tego z jakiej bazy kozystamy (Postgre, Oracle itp...) musimy sciagnac dedykowany sterownik
      ktory zawiera w sobie implementacje tych interfacow i pozwala na polaczenie sie z baza
      dodajemy go poprzez ctrl+alt+S (opcje) w zakladce library


     Zapytania do bazy mozna robic poprzez metode statement.executeUpdate()
     executeUpdate() musi byc po za blokiem Try(), poniewaz zwraca inta, ktory nie implementuje autoClosable


     Druga mozliwosc to zapytania poprzez executeQuery, ktora implementuje Autoclosable()
     Możemy go zapisać wewnatrz Try() {
     Zapis jest trocho skomplikowany bo piszemy
     Try(ResultSet statement.executeQuery(query)) wewnatrz Try() w ktorym jest Conection i Statement



     ExecuteUpdate powinein byc uzywany do zaptan:
        - Insert
        - Update
        - Delete
        (zwraca ilosc zmodyfikowanych wierszy)

     ExecuteQuery powinein byc uzywany po to aby odczytac dane:
        - Select
        (zwraca jako wynik resultSet)

     Execute
        - zwraca boolin czy wynikiem zapytania jest ResultSet
        - mozemy nim sprawdzac czy zapytanie jest typu Select czy nie. Tylko dla Selecta zwraca true
        - lub czy samo zapytanie jest poprawne

    Aby wywalić rekord z tabel relatuwnych trzeba sprawdzic czy w tabelach zaleznych nie ma
    innych wpisow zwiazanych z tym rekordem. Inaczej wyskoczy blad. Trzeba takiegi rekord usunac wszedzie

SECURITY:
Tabele nalezy zabezpieczac przed skryprami i niechcianymi komendami.
Jeśli znamy nazwe tabeli i wpiszemy ponizszy kod do niezabezpieczonej tabeli to usunie wszystko:
    'whatever' or 1=1 or USER_NAME = 'whatever2';

2. Równie dobrze może to być próba logowania/rejestracji -
    w pole username wrzucimy " '; " i możemy pisać własne query np. drop table

Taki rodzaj ataku nazywa sie SQL Injection
aby uniknac takich zabiegow zamiast klasy Statement uzywamy PreparedStatement, ktora zabezpiecza nas przed takimi atakami
PreparedStatement jest bardziej wydajny i czytelniejszy w uzyciu


Parametry w resultSecie pozwalaja na odczytywanie lub odczytywanie i zapysywanie elementow jako obiekty Javowe
    Result set ma metode next, która sprawdza czy jeszcze jest cos do pobrania z odczytywanych danych.
    Pozniej w petli dodaje sie po kolei kazdy obiekt np do listy dopoki next nie zwroci false
    Nazwy kolumn musza byc zgodne z nazwami w kodzie. Zamiast tego mozna napisac inta z numerem kolumny liczac od 1

    Gdybysmy chcieli zapisywac dane z mazy jako osobne obiekty trzeba sprawdzic czy dana jest instanceof String lub Integer
    i jak bedziemy pewni jakiego typu to jest obiekt to go rzutujemy na ten typ:
            if (colu1 instanceof String) {
                String colu1Str = (String)colu1;

Pobierajac dane z bazy danych lepiej najpiero posortowaćte elementy na bazie a dopiero potem je wczytac
W odwrotnej kolejnosci bedzie to mniej wydajne

Mapowanie elementow baz danych do Javy jest złożone dlatego w praktyce sa uzywane biblioteki zewnetrzne
JPA i Hibernate

Aby wkladac elementy do bazy danych tak samo trzeba napisac metode, która przemapuje elementy z Javy
i wstawic je do zapytania INSERT


Podczas lapania wyjatkow SQLexception daje wiecej metod jak:
.getErrorCode()
.getSQLState()
Daje to mozliwosc zwracania kodow bledow baz danych
Jesli lapiemy Exception SQLException bedzie suppresed





     */

}
