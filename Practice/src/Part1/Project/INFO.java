package Part1.Project;

public class INFO {

//    Napisz program, w którym zdefiniujesz klasę Osoba posiadającą pola name, surname oraz counter.
// Osoba może przyjść zrobić zakupy i zderzyć się z kolejką w sklepie.
// Taka osoba może się w kolejce ustawić i czekać.
// Jeżeli poczeka, to może przyjść jej kolej i może wejść do sklepu.
// Może też dojść do wniosku, że ma dość i sobie pójść.
// Pozwól użytkownikowi swojego programu na zabawę taką kolejką, dając możliwość wykonania operacji, które zostały wspomniane,
// czyli dodanie osoby do kolejki, kolejka przesuwa się do przodu, osoba odpuszcza i opuszcza kolejkę.

// Jeżeli do kolejki dodasz osobę o tym samym imieniu i nazwisku parę razy,
// to w każdej z nich ma się zwiększać counter, po to aby móc zdefiniować 2 osoby np. TOMASZ_ROMAŃSKI_1 oraz TOMASZ_ROMAŃSKI_2.

//    Potrzebne jest to do dalszej logiki w programie. Jeżeli TOMASZ_ROMAŃSKI_1 nie będzie już stał w kolejce,
//    i przyjdzie kolejny TOMASZ_ROMAŃSKI, to ma on otrzymać numer 3, a nie 1.

//    Wykorzystaj klasę Scanner od odczytu danych od użytkownika.
//    Dane takie będziemy wprowadzać w terminalu. Napisz też wariant z danymi zapisanymi na sztywno w liście.
//    Program będzie przyjmował od użytkownika komendy tekstowe, musimy więc ustalić na jakie
//    zachowania ma reagować. Zatem jeżeli wpiszesz:

//            • ADD PERSON(Tomasz_Romański) - taka osoba ustawi się w kolejce, podłogą oddzielamy imię i nazwisko.
//    Jeżeli zduplikujesz osobę, zostanie zwiększony counter.
//    Osoba może mieć tylko jedno imię i nazwisko.

//              • PROCESS - kolejka przesunie się o jedną osobę do przodu, czyli każda osoba czekająca w kolejce
//    przesunie się o jedno miejsce do przodu

//              • LEAVE PERSON(Tomasz_Romański_2) - osoba o takim imieniu i nazwisku (tutaj widzisz po co jest to pole
//  counter, żeby jednoznacznie identyfikować, o której osobie mówimy)
//  odpuszcza stanie w kolejce i sobie idzie. Pozostałe osoby wtedy przesuwają się w kolejce do przodu.

//    Jeżeli program nie rozpozna komendy, ma wypisać na ekranie: "O co Ci chodzi?".
//    Zapewnij, aby przy każdym kroku na ekranie drukowała się zawartość kolejki.

//    Nie zostaje narzucona obsługa przypadków skrajnych, czyli np, jak ma się zachować program jeżeli
//    powiemy, że kolejkę musi opuścić osoba, której na tej kolejce nie ma. Pozwalam Ci wymyślić
//    samodzielnie co zrobić w takich sytuacjach

}
