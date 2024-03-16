package git;

public class Merge {
    /*

    merge - komenda do scalania innej galezi do glownego brancha projektu

    podczas merga musimy byc na galezi, do ktorej chcemy wcielic zmiany, zazwyczaj galaz glowna
    branche musza byc zupdatowane w stosunku do swoich zdalnych odpowiednikow

    git merge inny_branch

    po zrobieniu merga dodaje sie automatycznie commit znawny merg commitem.

    Jesli po tym usuniemy branch to nadal bedzie on widoczny w historii wersji
    a jesli po tym usuniemy commit po przez git reset --soft~1
    to zmiany zostana cofniete do stage'a a branch zostanie usuniety z drzewa historii wersji i nie bedzie juz widoczny

    FAST-FORWARD - dobra praktyka
    jesli inny branch rozny od maina jest na bierzaco z commitami z galezi glownej projektu
    i nowe commity sa dodawane TYLKO do innego brancha, a main zostaje w niezmienionym stanie
    to po zrobieniu merga powstaje FAST-FORWARD
    czyli merge innej galezi do galezi glownej bez tworzenia w historii wersji tej galezi
    jednym slowem nie bedzie widac juz nigdzie tego brancha na ktorym pracowalismy. Zostaje on wcielony w maina
        gdyby zalezalo nam na zachowaniu historii branchy w projekcie to w takiej sytuacji
        musimy zrobic merga za pomoca komendy git merge --no-ff inny_branch
        po tym na grafie dodatkowa galaz zostanie dodana i bedzie widoczna











     */


}
