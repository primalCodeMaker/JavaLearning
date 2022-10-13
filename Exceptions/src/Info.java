public class Info {
}

// wyjatki to bledy w programie, ktore mozemy sobie zakodowac
// w przeciwienstwie do bledow, na ktore nie mamy wplyu wyjatki moga zwracac okreslone przez nas wartosci
// bledy zabijaja program na stale

//      Wyjatki
// null pointer Exception  >>> null
//  "/ 0 exceprion" >>> dzielenie przez 0
// Index  out of bounds for length  >> dla tablic
//


// jesli zadeklarujemy ze metoda bedzie żucała jakims wyjatkiem, to musimy ten wyjatek obsluzyc inaczej bedzie blad
// albo tez wyniesc go wyżej i na dalszym etapie go obsłużyć

//możemy użyć RuntimeException i takie wyjątki nie muszą być obsługiwane przez Try {} Catch {} na poziomie kompilacji

// Analyze stack trace or Thread dump - opcja w intelliJ, ktora pozwala wkleic sobie i sprawdzic raport bledow

// mozna lapac kilka bledow w jednym sprawdzeniu jesli klasy Exceprions rozszerzaja sie wzajemnie
    // w takim wypadku trzeba zaczac pisac Catche od tego najwyzej w hierarhii (najbardziej szczegolowy)

// mozna zlapac 2 rozne bledy w 1 catchu za pomoca operatora "lub" |