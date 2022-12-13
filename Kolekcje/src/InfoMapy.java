public class InfoMapy {
}

// Mapa i hashmapa - tablica asocjacyjna (skojarzeniowa)
// Mapa - zawsze mamy jakis klucz i jakas wartość

// podczas tworzenia jakiejs pozycji w mapie na podstawie klucz + wartosc Java kozysta z mechanizmu Enytry
    // w ktorym tworzy sobie obiekt i te obiekty sa przechowywane w Mapie

    //HashMap
// W mapie mamy dostępne metody put() i get(). Gdy wywołujemy metodę put(), musimy podać klucz i wartość.
// Mapa wywołuje metodę hashcode() na obiekcie klucza, a następnie używa własnej funkcji hashującej,
    // by określić, w którym bucket (kubełku) zostanie umieszczona wartość reprezentowana przez Map.Entry.
// Co ważne, w Map.Entry mapa przechowuje zarówno klucz jak i wartość.
// Elementy HashMapy sa przechowywane w bucketach w postaci Likedlisty