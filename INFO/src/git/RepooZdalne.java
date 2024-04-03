package git;

public class RepooZdalne {


    /*
    orogin - odnosi się do domyślnego zdalnego repozytorium, z którym lokalne repozytorium Git jest
             skonfigurowane do synchronizacji


    aby rozpoczac prace z repo zdalnym trzeba dodac
        uzytkownika do Gita lokalnie i jego email
        stwozyc token
        dodac go do "Menedżera Poswiadczen" w Windows w poswiadczeniach systemu Windows


    git remote -v
        sprawdza na jakie galezie mamy skonfigurowanego fetcha i pusha

    git remote show origin z repo zdalnego
        podaje wiecej danych


    git push --force
        uzywamy gdy chcemy zmodyfikwoac historje wersji w repo zdalnym
        np: w repo lokalny, robimy git reset --soft~2
        git push >> bez flagi --force nie przejdzie bo wplywa to bezposrednio na repo zdalne

        rebase wymaga push --force bo zmienia ID commita
        git amend wymaga push --force bo zmienia ID commita

     nie nalezy Force-Pushowac na publiczne branche zdalne bo zepsuje to historie wersji u innych uzytkownikow




     */
}

