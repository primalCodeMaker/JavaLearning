package Final;

// interface nie moze byc final, poniewaz jest po to aby go implementować
public interface InterfaceFinal {

// metody w interfejsie nie moga byc final zarowno niezainicjalizowane jak i defaultowe

    //final String somethink();

     default String somethink2() {
        return "I am blue da ba dee, da ba daa...";
    }

}
