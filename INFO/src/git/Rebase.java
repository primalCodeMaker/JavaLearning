package git;

public class Rebase {
    /*
    Rebase uzywamy do przesowania brancha i jego commitow w inne miejsce na osi
    Uzywamy gdy chcemy zachowac czystosc w historri kodu

    Przykladowo praujemy na nowym branchu, i ktos dodał commity do maina
    jesli zrobimy merga maina do naszego brancha a potem scalimy calosc do maina to w historii commitow powstaje drzewo

    jesli chcemy zachowac ciaglosc maina bez dodatkowych galezi to uzywamy rebase aby "przeniesc" nowy branch
    w inne miejsce. Tak jakbysmy go rozpoczeli w innym miejscu w czasie.

    Pod spodem jest to tak robione, ze stare ID commitow zostaje usunieta, a GIT tworzy calkiem nowe commity
    z innym ID

   glowna komenda:
        git rebase main

    jesli mamy konflikty pojawi sie komunikat Merge conflict +nazwa klas gdzie wystepuja
    po zrobieniu porzadku w klasach z konfliktem wpisujemy komendy:
        git add +nazwa poprawionej klasy
            doda nam to zmiany do klasy ale tylko na galezi na ktorej pracujemy a nie na mainie
        git rebase --continue

    po tych zabiegach historia commitow jest jedno-liniowa ale nadal mamy 2 galezie. Aby wszystko polaczyc
    nalezy jeszcze bedac na galezi main zrobic: git merge inny_branch
    i nowy_branch zostanie wcielony do galezi glownej w mechanizmie Fast-Forward
                (w historii wersji nie zostawi nam drzewa tylko jest jedna linia)


    Uzywanie rebase zmienia ID commitow - czyli modyfikuje historie zmian wstecznie
    modyfikacja historii zmian wstecznie jest problematyczna jesli robimy ja na repo zdalnym
    rebase powinien byc DOBRZE zrobiony przez pushem inaczej beda problemy

    BARDZO WAZNE:
    aby pamietac ze rebasujemy moj_branch na main    a NIGDY main na feature
    doprowadzi to do bardzo dużych problemow na repo zdanym


    czym sie rozni Merge od Rebase:
        obie komendy sluza do scalania zmian, tylko robią to inaczej
        Rebase uzywamy w parze z mergem sam nie scala galezi, tylko scala zmiany i przesowa je w innym miejscu na osi

        Rebase pozwala na osiagniecie czystej historii, liniowej, bez drzewa
        Merge jesli zostaly ddane jakiekolwiek zmiany na mainie to stworzy drzewo.

        Merge kopiuje commity, zachowujach ich ID (zachowuje pelna historie zmian)
        Rebase przepisuje historie na nowo zmieniajac ID commitow

        Rebase moze dobrowadzić do dużych problemow na repo zdalnym, trzeba wiedziec jak go uzywac
        Uzywanie samego Mrga moze spowodowac ze historia zmian nie bedzie czytelna bo bedzie za duzo galezi
        Natomiast po Rebasie nie ma info w historii kiedy dokladnie merge wystapil i kiedy zostana dodala zmiana
            (nie ma drzewa)

     */
}
