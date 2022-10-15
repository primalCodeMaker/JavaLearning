package second;

public class Info {
}

// Stwórz metodę, która przyjmuje wiek na wejściu.
// Napisz walidację, która sprawdza czy podany wiek jest większy niż 21, jeżeli nie jest, wyrzuć wyjątek checked.
// Następnie stwórz kolejną metodę np. wrapper(),
// która w bloku try-catch złapie ten wyjątek i zredeklaruje go jako runtime.
// Wywołaj metodę wrapper(). Zwróć uwagę, że jeżeli wrapowanie w RuntimeException zamieniono by na
// wrapowanie w Exception, to ten nowy wyjątek należałoby albo obsłużyć (try-catch),
// albo zadeklarować, że metoda wrapper go wyrzuci.