public class INFO {

/*

Maven i Gradle - narzedzia do budowania projektow
Stosuje zasade konwencja ponad konfiguracja - chodzi o standaryzacje struktury folderow i plikow w projekcie

aby ustawic konfiguracje w glownym folderze projekty umieszczamy nowy plik: pom.xml
oraz katalog .mvn w ktrym umiescimy plik jvm.config
w ktorym byly by zawarte ustawienia z ktorych bedzie kozystal Maven np: ile maven moze zuzyc pamieci podczas Buildu

Struktura katalogow:
src
    > main
        > java          (nasz katalog roboczy)
        > resources     (pliki ktore sa odpowiedzialne za konfiguracje aplikacji)
    > test
        > java          (kod odpowiedzialny za testy w naszym projekcie)
        > resources     (pliki ktore sa odpowiedzialne za konfiguracje aplikacji)

Jak zaczniemy budować dodatkowo pojawi sie pomaranczowy katalog: target w glownym katalogu projektu
w ktorym beda umieszczane wyprodukowane przez mavena rezultaty
    mozna je czyscic komendą mvn -clean

maven jest domyslnie dodany do inteliJa
jesli chcemy kzystac z niego z poziomu terminala trzeba go sciagnac i folder bin dodac do patha

 */

}
