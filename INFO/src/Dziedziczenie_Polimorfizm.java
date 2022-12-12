public class Dziedziczenie_Polimorfizm {
}
// Dziedziczenie:
//- mechanizm ktory przekazuje metody i pola z Superklasy do klasy rozszerzającej
//- jesli mamy Car i Volkswagen i Car ma metode otworzSzyby()
//	to na referencji typu Car mozemy uzyc otworzSzyby() dla obiektu Volkswagen
//- jesli metoda otworzSzyby() bedzie tylko w klasie Volkswagen, a obiekt Volkswagen utworzymu na
//	referenci tupu Car to ta metoda nie bedzie juz dostepna
//- Prosty przyklad z klasa Object
//	mozemy zrobić kady obiekt na referencji typu objekt ale ten objekt nie bedzie mial dostepu do 		zadnej z naszych metod

//Pilomorfizm:
//- mechanizm, w ktorym @Overridujemy metody SuperKlasy, i nadajemy jej nowe wartosci w klasie rozszerzającej
//	i nawet jesli zrobimy Objekt Volkswagen na referencji typu Car, to implementacja metody
//	otworzSzyby() bedzie pobrana z klasy na ktorej utworzyliśmy obiekt a nie z Superklasy.

//	(ta SuperKlasa też musi mieć zdefinowana taką metode inaczej bedzie Error kompilacji.
//	np: rbimy Volkswagen na referenci typu Object, wiec nie mamy dostepu do metody otworzSzyby()
//	wiec polimorfizm nie moze dzialac jesli nie ma tych metod zdefoniowanych w Superklasie)

//- Jesli chcemy miec dostęp do metod SubKlasy, ktore nie sa zdefiniowane w Superklasie,
//na ktorej mamy referencje naszego obiektu to trzebe użyć mechanizmu RZUTOWANIA w którym:
//Robimy nową reteferencje: Volksvagen vw = (Volkswagen) car;
//i mamy 2 referencje do tego samego obiektu i mozemy teraz pracować na nowej "vw" zamiast na "car"


//Dwa style/metody do modelowania świata:
//Is A >> przyklad dziedziczenia. Volkswagen i Seta są samochodem. Po drodze dziedziczysz pola i metody.
//Has A >> kompozycja. Samochód ma kierownice, silnik, koła... chodzi o reużywanie kodu.
//
//	Nie zrobie silnika, ktory rozszerza samochod
//	Zrobie zamochod, ktory ma silnik