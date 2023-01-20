package generics;

public class INFO {
}

// Typy generyczne sluza do ustalania na jakich wartosciac moze pracowac instancja danej kalsy generycznej
// to znaczy ze podczas twozenia klasy ustalamy z gory typ generyczne, lub go nie ustalamy
    // ale musimy pozniej go wybrac podczas twozenia instancji klasy

// Typy Generyczne opisuje sie wielka litera np: T od "type, V od varialble itd
    // mozna wpisac sobie cokolwiek tak naprawde ale konwencja mowi o literkach

// typow generycznych dla klasy moze byc wiecej niz jeden.
    // Daje to pozniej mozliwosc do filtrowania lub wsadzania 2 roznych elementow do instancji klasy

// Java obsluguje to na takiej zasadzie, ze na poziomie kompilacji zmienai typ generyczny na Object i
    // castuje zgodnie z typem jaki wybralismy

// na typach generycznych mozna wymusic implemenmtowanie Interfejsów, natomiast robi sie to poprzez slowo kluczowe
    // extends jak w przypadku dziedziczenia

// typy generyczne obslugują dziedziczenie dla klas. Jesli SUV rozszerza CAR
    // to w typie generycznym CAR mozemy tez dodawac SUVy

