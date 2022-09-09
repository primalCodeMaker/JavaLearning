package Final.immutableClass;

// klasa musi być final, aby nie mozna było nadpisać jej metod ani po niej dziedziczyć
public final class Cat {

    // pola robimy final aby nie można go było ich nadpisać po nadaniu wartośći np: w konstruktorze
    private final String name;
    private final String owner;

    // konstruktor nie moze byc final, tutaj sobie zrobilem default
    Cat (String name, String owner){
        this.name = name;
        this.owner = owner;

    }


    public Cat newOwner(String name, String owner) {
        return new Cat(this.name, owner);
    }

    public Cat newName (String name, String owner) {
        return new Cat(name, this.owner);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("name='").append(name).append('\'');
        sb.append(", owner='").append(owner).append('\'');
        sb.append('}');
        return sb.toString();
    }


}





