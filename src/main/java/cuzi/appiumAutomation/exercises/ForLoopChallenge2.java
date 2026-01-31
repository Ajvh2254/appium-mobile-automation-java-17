package cuzi.appiumAutomation.exercises;

import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

@Log4j2
public class ForLoopChallenge2 {

    @Test(priority = 1)
    public void repeatHelloFiveTimes() {
        for (int i = 1; i <= 5; i++) {
            log.info("Hello");
        }
    }

    @Test(priority = 2)
    public void repeatJavaThreeTimes() {
        for (int i = 0; i <= 2; i++) {
            log.info("Java");
        }
    }

    @Test(priority = 3)
    public void repeatDoneSixTimes() {
        for (int i = 1; i < 7; i++) {
            log.info("Done");
        }
    }

    @Test(priority = 4)
    public void repeatLearningFourTimes() {
        for (int i = 4; i > 0; i--) {
            log.info("Learning");
        }
    }

    @Test(priority = 5)
    public void repeatTestNGTwoTimes() {
        for (int i = 2; i <= 4; i += 2) {
            log.info("TestNG");
        }
    }

    @Test(priority = 6)
    public void repeatStartFiveTimes() {
        for (int i = 15; i >= 1; i -= 3) {
            log.info("Start");
        }
    }

    @Test(priority = 7)
    public void repeatEndFourTimes() {
        for (int i = 16; i > 0; i -= 4) {
            log.info("End");
        }
    }

    @Test(priority = 8)
    public void repeatLoopFiveTimes() {
        for (int i = 2; i <= 10; i += 2) {
            log.info("Loop");
        }
    }

    @Test(priority = 9)
    public void repeatPracticeThreeTimes() {
        for (int i = 2; i >= 0; i--) {
            log.info("Practice");
        }
    }

    @Test(priority = 10)
    public void repeatFocusSixTimes() {
        for (int i = 6; i < 37; i += 6) {
            log.info("Focus");
        }
    }

    @Test(priority = 11)
    public void countOneToFive() {
        for (int i = 1; i < 6; i++) {
            log.info(i);
        }
    }

    @Test(priority = 12)
    public void countZeroToFour() {
        for (int i = 0; i <= 4; i++) {
            log.info(i);
        }
    }

    @Test(priority = 13)
    public void countThreeToSeven() {
        for (int i = 3; i < 8; i++) {
            log.info(i);
        }
    }

    @Test(priority = 14)
    public void countFiveToOne() {
        for (int i = 5; i > 0; i--) {
            log.info(i);
        }
    }

    @Test(priority = 15)
    public void countTenToZero() {
        for (int i = 10; i >= 0; i--) {
            log.info(i);
        }
    }

    @Test(priority = 16)
    public void countTwoToTenByTwo() {
        for (int i = 2; i < 11; i += 2) {
            log.info(i);
        }
    }

    @Test(priority = 17)
    public void countTenToTwoByTwo() {
        for (int i = 10; i > 1; i -= 2) {
            log.info(i);
        }
    }

    @Test(priority = 18)
    public void countFiveToTwentyByFive() {
        for (int i = 5; i <= 20; i += 5) {
            log.info(i);
        }
    }

    @Test(priority = 19)
    public void countTwentyToFiveByFive() {
        for (int i = 20; i > 4; i -= 5) {
            log.info(i);
        }
    }

    @Test(priority = 20)
    public void countOneToNineByTwo() {
        for (int i = 1; i <= 9; i += 2) {
            log.info(i);
        }
    }

}
