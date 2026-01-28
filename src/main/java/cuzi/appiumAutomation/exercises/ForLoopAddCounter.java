package cuzi.appiumAutomation.exercises;

import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

@Log4j2
public class ForLoopAddCounter {

    @Test(priority = 1)
    public void addTenToOneToFive() {
        for (int i = 1; i <= 5; i++) {
            log.info(i + 10);
        }
    }

    @Test(priority = 2)
    public void addFiveToOneToFive() {
        for (int i = 1; i < 6; i++) {
            log.info(i + 5);
        }
    }

    @Test(priority = 3)
    public void addOneToZeroToFour() {
        for (int i = 0; i <= 4; i++) {
            log.info(i + 1);
        }
    }

    @Test(priority = 4)
    public void addTwoToThreeToSeven() {
        for (int i = 3; i < 8; i++) {
            log.info(i + 2);
        }
    }

    @Test(priority = 5)
    public void addTenCountingByTwoToTwoToTen() {
        for (int i = 2; i <= 10; i++) {
            log.info(i + 10);
        }
    }

    @Test(priority = 6)
    public void addFiveCountingBackwardsFromTenToSix() {
        for (int i = 10; i >= 6; i--) {
            log.info(i + 5);
        }
    }

    @Test(priority = 7)
    public void addThreeToOddNumbers() {
        for (int i = 1; i <= 9; i += 2) {
            log.info(i + 3);
        }
    }

    @Test(priority = 8)
    public void addZeroDoesNothing() {
        for (int i = 1; i <= 5; i++) {
            log.info(i + 0);
        }
    }

    @Test(priority = 9)
    public void multiplyByTwo() {
        for (int i = 1; i <= 5; i++) {
            log.info(i * 2);
        }
    }

    @Test(priority = 10)
    public void multiplyByThree() {
        for (int i = 1; i < 6; i++) {
            log.info(i * 3);
        }
    }

    @Test(priority = 11)
    public void multiplyByFive() {
        for (int i = 5; i >= 1; i--) {
            log.info(i * 5);
        }
    }

    @Test(priority = 12)
    public void multiplyZeroToFourByTwo() {
        for (int i = 0; i <= 4; i++) {
            log.info(i * 2);
        }
    }

    @Test(priority = 13)
    public void multiplyCountingByTwo() {
        for (int i = 2; i <= 10; i += 2) {
            log.info(i * 2);
        }
    }

    @Test(priority = 14)
    public void multiplyBackwardsByTwo() {
        for (int i = 5; i >= 1; i--) {
            log.info(i * 2);
        }
    }

    @Test(priority = 15)
    public void multiplyByOneShowsSameNumber() {
        for (int i = 1; i <= 5; i++) {
            log.info(i * 1);
        }
    }

}
