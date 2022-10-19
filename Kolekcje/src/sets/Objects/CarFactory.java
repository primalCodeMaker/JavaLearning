package sets.Objects;

import java.util.Objects;

public class CarFactory {

    private String marka;
    private String model;
    private int prodYear;

    @Override
    public String toString() {
        return "CarFactory{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", prodYear=" + prodYear +
                '}';
    }

    public CarFactory(String marka, String model, int prodYear) {
        this.marka = marka;
        this.model = model;
        this.prodYear = prodYear;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarFactory that)) return false;
        return prodYear == that.prodYear && marka.equals(that.marka) && model.equals(that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, model, prodYear);
    }
}
