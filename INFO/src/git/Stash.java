package git;

public class Stash {
    /*
    Git Stash
    odkłąda zmiany na pozniej jesli nie chcemy ich zakomitowac

    wszystkie zmiany, ktore "zeStashujemy" znikaja z kodu

    aby znalezc odlozone zmiany wpisujemy Git Stash List
    aby przywrocic zmiany do kodu wpisujemy Git Stash Upply. Jesli mamy kilka zmian odlozonych to po tej komendzie
        zostanie przywrocona pierwsza na stosie, ktora odlozylismy.
    Git Stash Upply stash@{0}  >>> przywraca zmiany po ID stasha

    Upply moze doprowadzac do konfliktow

    aby wycofac sie ze stasha trzeba zrobic Git reset --hard i cofnie nam zmiany do ostatniego commita

    po naprawieniu konfliktow nic sie samo nie merguje. Kod jest tratowany jak bysmy go dopiero napisali i musimy
    zrobic Git add. / commit / metge etc...

    jesli po komendzie Upply zrobimy Git Stash List to wszystkie odlozone zmiany jakie zrobilismy nadal widnieja na liscie

    aby dodac zmiany do kodu i jednoczesnie usunac je z listy Stash:
    Git Stash Pop           <<< to usunie pierwsza zmiane ktora wkladalismy jako odlozone
    Git Stash Pop stash@{2} <<< to usunie zmiane po ID ktora wybierzemy
        to moze powodowac konflikty

   lub jesli chcemy calkowicie usunac odlozone zmiany z listy i nie przywracac ich do kodu:
   Git Stash Drop
   Git Stash Drop stash@{2} lub Git Stash Drop "stash@{2}"

   IntelliJ w zakladce GIT (na dole po lewej) ma opcje Shelf. Jest to funkcjonalnosc podobna do stasha i odklada zmiany
   IntelliJ pozwala nam pozniej ogladac te odlozone zmiany z zakladki Shelf




     */

}
