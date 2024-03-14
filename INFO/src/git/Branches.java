package git;

public class Branches {

    /*

    git branch          >> sprawdza na jakim branchu jestesmy
    git branch -l "m*"  >> znajduje branche ktore zaczynaja sie od "m"

    git branch nazwa_nowego_brancha  >> tworzy nowego brancha ale nie ustawia go jako galaz robocza
        nowa galaz jest dokladna kopia stanu jaki znajdowal sie na galezi main w momencie tworzenia go
        nowy branch nie ma dostepu do nowych zmian na galezi main dopoki nie zrobimy merga
        sledzone zmiany musza zostac zakomitowane zanim GIT pozwoli nam zalozyc nowego brancha

    git branch najnowszy_branch jakis_branch_ktory_byl >> tworzy najnowszy branch w projekcie
        na podstawie jakiegos_brancha_ktory_byl wczesniej

    git branch nazwa_brancha_naPodstawie_commita fjgh4h52...  >> twozy branch na podstawie commita ktory wybierzemy

    git checkout nazwa_nowego_brancha >> zmienia galaz na ktorej chcemy pracowac
        commity dodaja sie na branchu na ktorym aktualnie jestesmy

    git checkout -b nazwa_kolejnego_brancha_na_ktory_od_razu_sie_przelaczamy
        tworzy brancha, i przelecza nas od razu na niego w projekcie

    git switch >> nowa komenda dodana aby byla bardziej zrozumiala niz git checkout
        robi to samo - przelacza miedzy branchami

    git switch -c new_branch >> zaklada nowego brancha i przelacza na niego

    git detached HEAD - przelacza sie na konkretny commit w projekcie
        np: gdy chcemy zdebugowac projekt w stanie w przeszlosci

    git branch -m nazwa-brancha_1 nazwa-brancha_1111  >> parametr -m oznacza modify
        w tym przypadku zmienia nazwe brancha. Jesli nie podamy nazwy brancha ktory chcemy zmodyfikwoac
        to automatycznie zmieni nazwe brancha na ktorym bylismy

    git branch -d nazwa_galezi   >> usowa brancha
        nie mozna usunac brancha, na ktorym sie znajdujemy

    git branch -D nazwa_galezi >> parametr duze D oznacza --delete --force
        uzywamy gdy chcemy usunac brancha, na ktorym sa jakies commity rozne od maina i nie zostaly wcielone


     */

}
