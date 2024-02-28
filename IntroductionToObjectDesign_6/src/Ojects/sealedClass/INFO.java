package Ojects.sealedClass;
public class INFO {
}

/*
UPDATE JAVA 17!

sealed class - sluzy do ustawienia na sztywno ktore kalsy MUSZA dziedziczyc z tej klasy
    ustawia sie poprzez slowko kluczowe permits
    klasa musi miec w definicji sealed class

klasy, ktore dziedzicza po sealed classach:
   - musza byc oznaczone jako final - czyli nic wiecej nie moze z niej dziedziczyc
   - lub non-sealed - to nam nie daje zadnych ograniczen
   - lub sealed, ale w takim przypadku tez musi uzywac slowa kluczowego permits,
        i okreslac klasy, ktore beda ja rozszerzac

Przyklad uzycia:
np: przy pisaniu biblioteki chcemy miec klase, z ktorej beda dziedziczyly tylko klasy robocze
    i zeby urzytkownicy nie mieli do nich dostepu



 */