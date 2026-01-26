package cuzi.appiumAutomation.exercises;

import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

@Log4j2
public class ForLoopChallenge {

    @Test(priority = 1)
    public void print1FiveTimes() {
        for (int i = 1; i <= 5; i++) {
            log.info(1);
        }
    }

    @Test(priority = 2)
    public void printHelloFiveTimes() {
        for (int i =1; i <= 5; i++) {
            log.info("Hello");
        }
    }

    @Test(priority = 3)
    public void printLearningJava3Times() {
        for (int i = 1; i <= 3; i++) {
            log.info("I am learning java");
        }
    }

    @Test(priority = 4)
    public void printOneToFive() {
        for (int i = 1; i <= 5; i++) {
            log.info(i);
        }
    }

    @Test(priority = 5)
    public void printZeroToFour() {
        for (int i = 0; i <= 4; i++) {
            log.info(i);
        }
    }

    @Test(priority = 6)
    public void printOneToTen() {
        for (int i = 1; i <= 10; i++) {
            log.info(i);
        }
    }

    @Test(priority = 7)
    public void printThreeToSeven() {
        for (int i = 3; i <= 7; i++) {
            log.info(i);
        }
    }

    @Test(priority = 8)
    public void printFiveToNine() {
        for (int i = 5; i <= 9; i++) {
            log.info(i);
        }
    }

    @Test(priority = 9)
    public void printTenToFifteen() {
        for (int i = 10; i < 16; i++) {
            log.info(i);
        }
    }

    @Test(priority = 10)
    public void printFiveToOne() {
        for (int i = 5; i >= 1; i--) {
            log.info(i);
        }
    }

    @Test(priority = 11)
    public void printTenToZero() {
        for (int i = 10; i >= 0; i--) {
            log.info(i);
        }
    }

    @Test(priority = 12)
    public void printEightToThree() {
        for (int i = 8; i > 2; i--) {
            log.info(i);
        }
    }

    @Test(priority = 13)
    public void printJavaFiveTimes() {
        for (int i = 1; i <= 5; i++) {
            log.info("Java");
        }
    }

    @Test(priority = 14)
    public void printLoopsAreFunFourTimes() {
        for (int i = 7; i > 3; i--) {
            log.info("Loops are fun");
        }
    }

    @Test(priority = 15)
    public void printDoneSixTimes() {
        for (int i = 6; i >= 1; i--) {
            log.info("Done");
        }
    }

}
