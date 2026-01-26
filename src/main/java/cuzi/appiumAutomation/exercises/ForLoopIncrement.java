package cuzi.appiumAutomation.exercises;

import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

@Log4j2
public class ForLoopIncrement {

    @Test(priority = 16)
    public void printOddNumbersOneToNine() {
        for (int i = 1; i <= 9; i += 2) {
            log.info(i);
        }
    }

    @Test(priority = 17)
    public void printEvenNumbersZeroToEight() {
        for (int i = 0; i <= 8; i += 2) {
            log.info(i);
        }
    }

    @Test(priority = 18)
    public void printEvenNumbersTwoToTen() {
        for (int i = 2; i <= 10; i += 2) {
            log.info(i);
        }
    }

    @Test(priority = 19)
    public void printDownBy2TenToTwo() {
        for (int i = 10; i >= 2; i -= 2) {
            log.info(i);
        }
    }

    @Test(priority = 20)
    public void printAddBy5FiveToTwentyFive() {
        for (int i = 5; i <= 25; i += 5) {
            log.info(i);
        }
    }

    @Test(priority = 21)
    public void printSubtractBy5TwentyFiveToFive() {
        for (int i = 25; i >= 5; i -= 5) {
            log.info(i);
        }
    }

    @Test(priority = 22)
    public void printAddBy3ZeroToTwelve() {
        for (int i = 0; i <= 12; i += 3) {
            log.info(i);
        }
    }

    @Test(priority = 23)
    public void printAddBy3OneToThirteen() {
        for (int i = 1; i <= 13; i += 3) {
            log.info(i);
        }
    }

    @Test(priority = 24)
    public void printAddBy4FourToTwenty() {
        for (int i = 4; i <= 20; i += 4) {
            log.info(i);
        }
    }

    @Test(priority = 25)
    public void printDownBy4TwentyToFour() {
        for (int i = 20; i >= 4; i -= 4) {
            log.info(i);
        }
    }

    @Test(priority = 26)
    public void printAddBy10TenToFifty() {
        for (int i = 10; i <= 50; i += 10) {
            log.info(i);
        }
    }

    @Test(priority = 27)
    public void printDownBy10FiftyToTen() {
        for (int i = 50; i >= 10; i -= 10) {
            log.info(i);
        }
    }

    @Test(priority = 28)
    public void printAddBy2OneToEleven() {
        for (int i = 1; i <= 11; i += 2) {
            log.info(i);
        }
    }

    @Test(priority = 29)
    public void printAddBy7SevenToThirtyFive() {
        for (int i = 7; i <= 35; i += 7) {
            log.info(i);
        }
    }

    @Test(priority = 30)
    public void printDownBy3FifteenToZero() {
        for (int i = 15; i >= 0; i -= 3) {
            log.info(i);
        }
    }

}
