package interfaces.SecondExample;

public interface BreweryConcern {

   // abstract public void bottle();

  abstract public void metodaNadpisanaDopierowKlasie();

    public default void asdasd() {
        System.out.println("adasd"); //metody defaultowej nie trzeba nadpisywać
    }

   public default String bottles(){
       return "choice the colour of bottle"; }



}
