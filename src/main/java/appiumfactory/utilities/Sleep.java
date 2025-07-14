package appiumfactory.utilities;

public class Sleep {

    public static void sleep(long milliseconds) {
        System.out.println("Waiting for " + milliseconds + " milliseconds");
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
