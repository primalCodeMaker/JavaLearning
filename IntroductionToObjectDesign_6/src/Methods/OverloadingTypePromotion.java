package Methods;
// promocja typow dziala rowniez w metodach o tej samej nazwie

public class OverloadingTypePromotion {

    public static void main(String[] args) {

        OverloadingTypePromotion testing = new OverloadingTypePromotion();

        byte newByte = 122;
        short newShort = 5565;
        int newInt = 5156146;
        long newLong = 456644444;

        testing.promotion(newByte);
        testing.promotion(newInt);
        testing.promotion(newShort);
        testing.promotion(newLong);


    }
//
//    public void promotion (byte newByte) {
//        System.out.println("byte = " + newByte);
//    }

//    public void promotion (short newShort) {
//        System.out.println("short = " + newShort);
//    }
    public void promotion (int newInt) {
        System.out.println("int = " + newInt);
    }
    public void promotion (long newLong) {
        System.out.println("long = " + newLong);
    }
}

