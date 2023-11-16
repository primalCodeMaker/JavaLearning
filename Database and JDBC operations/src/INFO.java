public class INFO {

    /*
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

     Druga mozliwosc to zapytania poprzez executeQuery, ktora implementuje Autoclosable()
     Możemy go zapisać wewnatrz Try() {
     Zapis jest trocho skomplikowany bo piszemy
     Try(ResultSet statement.executeQuery(query)) wewnatrz Try() w ktorym jest Conection i Statement





     */

}
