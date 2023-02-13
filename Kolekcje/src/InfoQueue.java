public class InfoQueue {
}

// Kolejki uzywa sie gdy elementy sa dodawane i odejmowane w odpowiedniej kolejnosci
// Jesli nie okresla sie inaczej to jest zgodnie z FiFo

// Kolejka priorytetowa stosuje komparator aby ustawic jej elementy w danej kolejnosci
// Priority Queue zgodnie z natural order sortuje elementy i układa podczas dodawania
// chyba ze zdefiniujemy Comparator i nakazemy wlasna kolejkosc

// kolejka ma spoecjalne metody, ktore umozliwiaja dodawanie elementow na poczatku kolejki


// Implementacja Queeue to ArrayDeck<>(), mozna tez za pomoca LinkedListy<>()
// Referencja LinkedListy lub Queue maja dodatkowo metody: add.first, add.last
// do wkladania elementu do kolejki uzywamy metody .offer()
// do zdejmowania elementow z kolejki uzywamy metody .poll()



// Inna implementacja kolejki to STOS, kora wykozystuje kolejnosc LI-FO (last in First out)
// Stos - implementacja kolejki na referencji Deque, ktora daje metode .push()  Referencja Queue daje mniej metod
    // metoda put wklada klejne elementy na poczatku kolejki i tez zdejmuje je jako pierwsze
// metody .peek() - odczytuja 1wszy element stacka
// metoda .push() wklada elementy do Stosu
// metoda .pop() wykonuje/sciaga 1wszy element ze stosu zgodnie z LiFo