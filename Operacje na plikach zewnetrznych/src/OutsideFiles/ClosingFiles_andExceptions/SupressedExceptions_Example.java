package OutsideFiles.ClosingFiles_andExceptions;

public class SupressedExceptions_Example {

    public static void main(String[] args) {

        try (Door door = new Door()) {
            throw new RuntimeException("other runtimeException during try");
        } catch (Exception e) {
            System.out.println(e.getMessage());                                        // taki zapis wywali nam nadpisany blad w tr)
            for (Throwable throwable : e.getSuppressed()) {       // taki zapis pozwoli nam zobaczyc blad z metody close()
                System.out.println("Suppressed: " + throwable.getMessage());
            }
        } finally {
            System.out.println("callin' finally");
        }
    }


    static class Door implements AutoCloseable {

        public Door() {
            System.out.println("new door created");
        }

        @Override
        public void close() throws Exception {
            System.out.println("door closing");
            throw new Exception("exception from close() method");

        }
    }
}
