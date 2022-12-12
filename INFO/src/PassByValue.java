public class PassByValue {
}

// JAVA JEST PASS BY VALUE:
//pass by reference - Jeśli mamy obiekt cat na referencji Cat i w metodzie zrobimy nowy obiekt dla tej referencji:
//	cat = new Cat(), to nasza referencja zmieni swoj obiekt i bedzie wskazywac na nowy obiekt utworzony
//	w metodzie.
//Tak samo jesli dla prymitywow dzialając na nazwie zmiennej zmienimy wartość w metodzie i przpiszemy do tej zmiennej to powinno zmienć wartość
//
//pas by value - w metodzie tworzy sie nowa referencja, ktora wskazuje na ten sam obiekt.
//	Aby na stale zmieniać stan obiektu trzeba w tym wypadku pracować na polach obiektu poprzez .this
//	Inaczej zmiany beda tylko widoczne w scoupie metody