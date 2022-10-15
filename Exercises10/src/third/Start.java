package third;

import first.WrogNumberException;

public class Start {

    public static void main(String[] args) throws RuntimeException {

        try {
            new Start().fakeExceptionThrowing();

        }catch (SecondExceprion se){
            System.out.println("second exception catched");
            try {
                throw new SecondExceprion("second exception throwed in catched second exception");
            } catch (SecondExceprion e) {
                System.out.println("second second exception catched");
                System.out.println(e.getStackTrace());
            }

        }catch (WrogNumberException eW){
            System.out.println("WrogNumberException catched");


        } catch (RuntimeException w) {
            System.out.println("runtime catched");

        } catch (Exception e) {
            System.out.println("Exception catched");
            throw new RuntimeException();
        }

    }

    public void fakeExceptionThrowing() throws Exception {
        System.out.println("fake exception method here");
        throw new WrogNumberException("exception added to method");
    }
}
