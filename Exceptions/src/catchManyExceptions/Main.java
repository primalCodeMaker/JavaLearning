package catchManyExceptions;

public class Main {
    public static void main(String[] args){


    Driver driver1 = new Driver(13);
    Driver driver2 = new Driver(20);
    Driver driver3 = new Driver(20);

    drive(driver1, 36);
    drive(driver2, 13);
    drive(driver3, 200);
}


        public static void drive(Driver driver, int age){
            try {
                driver.setAge(age);
//                driver.setAge(19);
//                driver.setAge(200); // ten nie jest obsluzony. Program sie stopuje przy zlapanym pierwszym wyjatku

            } catch (SecondException | NullPointerException se) {
                System.out.println(se.getMessage());
            } catch (DrivingException de) {
                System.out.println(de.getMessage());
            } catch (Exception exe) {
                System.out.println(" exception possible here");
            }

        }
    }


