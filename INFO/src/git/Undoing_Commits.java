package git;

public class Undoing_Commits {
    /*

    HEAD - wskazuje na jakim branchu i commicie jestesmy w naszym projekcie
           docelowo jest ustawiony na najnowszym stanie projektu,
           ale mozemy go przestawic na inny punkt w czasie

    git add . - dodaje wszyste zmodyfikowane pliki do stage'a przed commitem
    git restore --staged <nazwa pliku> - usowa dany plik ze stage'a

    Cofanie commitow:
        1. Revert - bezpieczne cofanie zmian
            Dodaje w drzewie historii wersji dodatkowego commita kompensujacego, ktorego wybralismy z przeszlosci,
            i robi dokladna jego kopie jako ostatni stan projektu.
            Wszystkie poprzednie zmiany są zachowane i mozna do nich wrocic
            (Jesli jakieś zmiany zostaly wyslane do zdalnego repo to nie powinnismy modyfikowac historii commitow)

            uzywamy poprzez wpisanie komendy:
            git revert <ID commita do ktorego chcemy przywrocic wersje projektu>
            przed zrobieniem reverta wszystkie zmiany w stagu musza byc wczesniej zacommitowane

            jesli wystapi konflikt mozna zrobic git revert --abort
            aby zrezygnowac z reverta ktory probowalismy robic

        2. git reset - nie dodaje nowych wpisow w historii, ale pozwala zmotyfikować wpisy wstecz.
           Generuje problemy jesli chcemy tego uzyc na zmianach wyslanych do zdalnego repo
           stosujemy z flagami:
            --soft
            --mixed (domyslny jesli nie podamy flagi)
            --hard

               --soft:
                    Wycofuje commity, wraca zmiany ze stanu commited do stanu staged.
                    Nie modyfikuje stanu plikow, tylko wplywa na historie commitow.
                    Uzywamy jesli chcemy np: scalic kilka commitow w 1
                    przy stosowaniu tej komendy musimy podac commit, ktory zostanie ustaniony jako nowy HEAD
                    Commity, ktore byly dalej w historii od naszego nowego wybranego HEADA zostaja usuniete.
                        a wszystkie nowe pliki i modyfikacje dodane do STAGE'a
               UZYCIE:
               git reset --soft <ID commita ktory ma byc nowym HEADEM w projekcie>
               git reset --soft HEAD^   lub   git reset --soft "HEAD^"  - cofa 1 ostatni commit
               git reset --soft HEAD~3 - wycofuje tyle commitow ile podamy za tylda

               --mixed (domyslny jesli nie podamy flagi):
                    dziala podobnie jak soft, natomiast po usunieciu commita zmiany nie sa dodane do STAGE'a

               --hard
                    git reset --hard HEAD^
                    Pozbywamy sie commita wraz ze zmianami, ktore zostaly w nim wprowadzone
                    jednym slowem nie zachowuje zmian jak w poprzednich wariantach
                    tylko usowa wszystko permamentnie az do nowego HEAD'a ktorego sobie ustalimy
                    po tej komendzie nie ciezko przywrocic zmian, ktore usunelismy i nie mamy pewnosci ze to sie uda
                        robimy to komenda git reflog

     */

}
