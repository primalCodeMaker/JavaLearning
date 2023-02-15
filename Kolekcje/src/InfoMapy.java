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
// HashMapa nie zachowuje kolejnosci dodawania kluczy i elementow
// Jesli dodamy element o tym samym kluczu to zostanie on nadpisany
// do obslugi nulli jest metoda getOrDefauly(), w ktorej podaje sie wartosc jesli nie ma szukanego klucza
// Domyslnie Mapa hashuje elementy po kluczach a nie po wartosciach. Klucze musza byc unikalne
// HashMapa moze zawierac wartosci null i klucze null, z tym ze klucz moze byc tylko jeden

// Po doddaniu elementu do Mapy jako Wartosc, nie mozna go pozniej modyfikowac.
    // Raz dodany element do Mapy nie jest weryfikowany i moze dojsc do zrobienia duplikatu,
    // podczas zmiany jego stanu Seterem
    // Obiekty dodawane do Mapy powinny byc Immutable
// Jak zmienimy Seterem() klucz elementu w Mapie, to nie bedzie on potem znajgowany przez geter()

// Trzeba dobrze napisac metode hashCode(), bo inaczej bardzo zwiekszy sie czas operacji. Przyklady w secie

// LinkedHashMap zapewnia kolejnosc dodawania obiektow

// TreeMap - podobnie jak w przykladzie Setow taka implementacja od razu sortuje dodawane elementy
// Jesli klucze w TreeMapie sa dodawane jako obiekty to klasa na korej twozymy te instancje musi implementowac interface Comparable
// Inaczej poleci exceptoin bo Java nie wie jak porownywac takie obiekty
// Mozna tez w sygnaturze TreeSeta podac Comparator za pomoca Lambdy
// TreeMapa opiera sie na Comparable a nie na HashCode
// TreeMapa nie moze zawierac null dla kluczy, null dla wartosci jest ok