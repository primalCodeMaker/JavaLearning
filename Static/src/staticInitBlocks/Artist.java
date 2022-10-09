package staticInitBlocks;

public class Artist implements Doable {

    static {
        System.out.println("Atrist static block");
    }

    {
        System.out.println("Artist non static block ");
    }

    public Artist() {
        System.out.println("Artist constructor here rerere");
    }
}
