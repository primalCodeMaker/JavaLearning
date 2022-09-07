package Final;

public class ParametrMetodyFinal {
    private String name;


        //final w parametrze konstruktora zabezpiecza aby nie przypisać nowych wartości dla tego parametru
    public ParametrMetodyFinal(final String name) {
        this.name = name;
         //name = name;      //tak sie nie da
    }



    public void setName(final String name) {
        this.name = name;
        // name = "Belzebub";   dzieki final w parametrze nie mozemy zmieniac wartosci dla argumentow w zakresie metody
    }


}
