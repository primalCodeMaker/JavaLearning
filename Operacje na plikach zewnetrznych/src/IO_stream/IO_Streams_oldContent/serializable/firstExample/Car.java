package IO_stream.IO_Streams_oldContent.serializable.firstExample;

import java.io.Serializable;
import java.util.List;

public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String name;

    private final Long year;

    private final transient List<Door> dors; // jesli drzwi beda tansient to po zapisaniu obiektu Car jako obiekt javy
                                             // i ponownym go wczytaniu, zamiast drzwi zroci nulla

    private String someNull;

    public Car(String name, Long year, List<Door> dors) {
        this.name = name;
        this.year = year;
        this.dors = dors;
    }


    public String getName() {
        return name;
    }

    public Long getYear() {
        return year;
    }

    public List<Door> getDors() {
        return dors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", dors=" + dors +
                ", someNull='" + someNull + '\'' +
                '}';
    }
}
