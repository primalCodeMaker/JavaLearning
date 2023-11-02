package IO_stream.copy_pasteValues.serializable.firstExample;

import java.io.Serializable;

public class Door implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String which;

    public Door(String which) {
        this.which = which;
    }

    public String getWhich() {
        return which;
    }

    @Override
    public String toString() {
        return "Door{" +
                "which='" + which + '\'' +
                '}';
    }
}
