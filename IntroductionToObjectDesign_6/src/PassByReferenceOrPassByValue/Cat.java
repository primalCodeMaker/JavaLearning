package PassByReferenceOrPassByValue;

public class Cat {
    public String name;

    public Cat (String name){
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
