package git;

public class PobieranieDanych {
    /*

    Aby pobrac zmiany z repo zdalengo musimy wykoanc  kroki:
        1. sprawdzic czy sa jakies zmaiany do pobrania
        2. zmergowac zmiany z repo zdalnego do lokalnego

    Git Fetch
    Git Fetch Origin
    Git Fetch Origin <nazwa_brancha>

    Fetch - sprawdza czy sa jakies zmiany w repozytorum zdalnym i pokazuje je nam na drzewie w zakladce
            Git Log. Natomiast nie pobiera tych zmian. Informuja nas tylko, ze nasze repo lokalne nie jest aktualne
            w stosunku do zdalnego ale nie pobiera zmian.

            Po wykonaniu Fetcha i git Log, wydzimy tylko dostepne commity, ktore mamy w repo zdalnym

   Git Log Origin main - pozwala na podejrzenie commitow w repo zdalnym ale nie wprowadza zadnych zmian

   Git merge origin main - pobiera zmiany z repo zdalnego

   Git pull - laczy ze soba 2 kroki Git Fetch oraz Git pull i pobiera od razu zmiany
   nie powinno sie wykonywac pulla bezposrednio na galezi main bez wczesniejszego ogarniecia Fetcha / Rebase i Merge
        moze to doprowadzic do drzewa w historii wersji repo zdalnego

   Istnieje komenda laczaca pull i rebase jednoczesnie. Jesli  uzyjemy tej komendy
   to przesunie nam to nasze commity lokalne za pobrane commity z repo zdalnego. Historia zmian pozostanie liniowa

        git pull --rebase


w pluginach w MarketPlace jest dostepny GitToolBox ktory automatycznie potrafi miedzy innymi
co jakis czas automatycznie fetchowac zmiany z repo zdalnym





     */

}
