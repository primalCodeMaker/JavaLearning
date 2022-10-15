package first;

public class WrogNumberException extends Exception{


    public WrogNumberException(String message) {
        super(message);
    }

    public void error() throws WrogNumberException {
        System.out.println("calling \"WrongNumberException DUDE!\" ");
        throw new WrogNumberException("Wrong Number DUDE!");
    }

}
