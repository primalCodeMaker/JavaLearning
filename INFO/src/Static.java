public class Static {
}


// w metodach statycznych NIE MOZNA sie odnosic do metod, pol instancyjnych ani do obiektow
    // static jest generowany na poziomie tworzenia klasy i nie widzi obiektow
    // .this i .super tez nie zadziala do metod i pol instancyjnych

// w metodach instancyjnych i obiektach MOZNA sie odnosic do pol i metod statycznych

// pola i metody statyczne sa przynalezne dla kasy

// wszystkie obiekty danej klasy maja ta sama wartosc dla pol statycznych.
    //  jesli za pomoca zmiennej z jakiego obiektu zredefiniujemy pole statyczne,
    //  to ta wartosc pola statycznego zmieni swoja wartosc dla wszystkich instancji tej klasy

// Metody statycne mozna wywolywac bezinstancyjnie wpisujac po prostu nazwe tej metody w mainie
    // jakasTamMetodaStatyczma()  >> i to wystarczy aby taka metoda zostala wywolana


// static sluzy do definiowania stalych w klasie:
    // np: public static final string

// Static w przypadku dziedziczenia nie obsluguje mechanizmu polimorfizmu
    // Ma w zamian mechanizm przykrywania. W tym wypadku bedzie drukwoalo metode z klasy
    // dla ktorej jest zrobiona instancja obiektu.
    // Nawet jak bedzie to obiekt Subclasy, a referencja superklasy, to metoda statyczna wydrukuje sie dla referencji
    // w polimorfizmie bylo by na odwrot

//  nie mozna zrobic 2och statycznych importow z taka sama nazwa pola, jesli klasy sie nie rozszerzaja




