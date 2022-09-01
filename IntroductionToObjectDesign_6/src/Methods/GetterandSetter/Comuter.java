package Methods.GetterandSetter;

import java.util.Arrays;

public class Comuter {

    private String mainboard;
    private String procesor;
    private int SSDcapacity;
    private int[] RAMslot;

    public Comuter(String mainboard, String procesor, int SSDcapacity) {
        this.mainboard = mainboard;
        this.procesor = procesor;
        this.SSDcapacity = SSDcapacity;
        System.out.println("PC created, $ 56,000 is due, dude!");
        System.out.println();
    }

    public String getMainboard() {
        return this.mainboard;
    }

    public String getProcesor() {
        return this.procesor == null ? "add procesor" : this.procesor;
    }

    public int getSSDcapacity() {
        return this.SSDcapacity;
    }

    public int[] getRAMslot() {
        return this.RAMslot == null ? new int[5] : this.RAMslot;
    }


    public void setMainboard(String mainboard) {
        if ("empty".equals(mainboard)) {
            System.out.println("you will not install a new processor in the old motherboard !");
            return;
        }
        this.mainboard = mainboard;

    }
    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }
    public void setSSDcapacity(int SSDcapacity) {
        this.SSDcapacity = SSDcapacity;
    }
    public void setRAMslot (int[] RAMslot) {
        this.RAMslot = RAMslot;
    }


    @Override
    public String toString() {
        return "Comuter{" +
                "mainboard='" + mainboard + '\'' +
                ", procesor='" + procesor + '\'' +
                ", SSDcapacity=" + SSDcapacity +
                ", RAMslot=" + Arrays.toString(RAMslot) +
                '}';
    }
}
