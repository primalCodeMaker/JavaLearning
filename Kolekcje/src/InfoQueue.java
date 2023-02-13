public class InfoQueue {
}

// Kolejki uzywa sie gdy elementy sa dodawane i odejmowane w odpowiedniej kolejnosci
// Jesli nie okresla sie inaczej to jes FI-FO

// Kolejka priorytetowa stosuje komparator aby ustawic jej elementy w danej kolejnosci

// kolejka ma spoecjalne metody, ktore umozliwiaja dodawanie elementow na poczatku kolejki

// Inna implementacja kolejki to STOS, kora wykozystuje kolejnosc LI-FO (last in First out)

// Implementacja Queeue to ArrayDeck<>(), mozna tez za pomoca LinkedListy<>()
    // Referencja Linked Listy lub Queue maja dodatkowo metody: add.first, add.last


// Stos - implementacja kolejki na referencji Deque, ktora daje metode .push()
    // metoda put wklada klejne elementy na poczatku kolejki i tez zdejmuje je jako pierwsze
// metody .peek() - odczytuja 1wszy element stacka
// metoda .pop() wykonuje/sciaga 1wszy element ze stosu zgodnie z LiFo