package git;

public class GitTag {
    /*
    Sluzy do otagowania odpowiedniego commita
    Jeden commit moze miec kilka tagow
    Tag jest unikalny i nie mozemy zrobic dwoch identycznych tagow

LightWeight TAG:
    git tag <NAZWA> <ID commita>
        jesli nie podamy ID commita to zostanie dodany do najnowszego

    git tag -f <nazwa taga> <ID commita>
        jesli mamy juz taga np: v.1.1  i uzyjemy na nim tej komendy to zmienimy
        przypisany commit do tego TAGA. Tag nie zostanie zduplikowany bo nie mozna miec dwoch takich samych Tagow

Annotated TAG:
    git tag -a <nazwa taga> "Moja wiadomosc do taga"
        robi taga z adnotacja. Ale widac ja dopiero po wejsciu w szczegoly commita:
            git show <nazwa taga>


    git checkout <nazwa taga>
        zmienia HEAD na commit z tagiem ktory podamy
    git switch -
        powrot na walsciwy HEAD

wypychanie Taga na gitHuba:
    git push origin <nazwa taga>
Tag jest widoczny na gitHubie w projekcie w zakladce Tag
I w tym miejscu mozemy pobrac sobie projekt w postaci ZIPa w danej wersji do ktorej Tag sie odnosi
    mozna rowniez z tego miejsca przygotowac wydanie projektu

    git push --tags orogin
    wypycha wszystkie Tagi jakie mamy dodane do projektu

    git tag -d <nazwa taga>
    usowa taga z repo lokalnego

    git push --delete origin <nazwa taga>
    usowa taga z repo zdalnego



     */

}
