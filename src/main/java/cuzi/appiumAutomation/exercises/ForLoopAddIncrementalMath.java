package cuzi.appiumAutomation.exercises;

import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

/***
 *Introduces variables to For-Loop
 * Expression is stored in variables
 */

@Log4j2
public class ForLoopAddIncrementalMath {

    @Test(priority = 1)
    public void storeAddTen() {
        for (int i = 1; i <= 5; i++) {
            int result = i + 10;
            log.info(result);
        }
    }

    @Test(priority = 2)
    public void storeAddFive() {
        for (int i = 1; i <= 5; i++) {
            int result = i + 5;
            log.info(result);
        }
    }

    @Test(priority = 3)
    public void storeAddOne() {
        for (int i = 0; i <= 4; i++) {
            int result = i + 1;
            log.info(result);
        }
    }

    @Test(priority = 4)
    public void storeAddTwo() {
        for (int i = 3; i <= 7; i++) {
            int result = i + 2;
            log.info(result);
        }
    }

    @Test(priority = 5)
    public void storeAddTenByTwo() {
        for (int i = 2; i <= 10; i += 2) {
            int result = i + 10;
            log.info(result);
        }
    }

    @Test(priority = 6)
    public void storeAddFiveBackwards() {
        for (int i = 10; i >= 6; i--) {
            int result = i + 5;
            log.info(result);
        }
    }

    @Test(priority = 7)
    public void storeAddThreeOdds() {
        for (int i = 1; i <= 9; i += 2) {
            int result = i + 3;
            log.info(result);
        }
    }

    @Test(priority = 8)
    public void storeAddZero() {
        for (int i = 1; i <= 5; i++) {
            int result = i + 0;
            log.info(result);
        }
    }

    @Test(priority = 9)
    public void storeMultiplyByTwo() {
        for (int i = 1; i <= 5; i++) {
            int result = i * 2;
            log.info(result);
        }
    }

    @Test(priority = 10)
    public void storeMultiplyByThree() {
        for (int i = 1; i <= 5; i++) {
            int result = i * 3;
            log.info(result);
        }
    }

    @Test(priority = 11)
    public void storeMultiplyByFive() {
        for (int i = 1; i <= 5; i++) {
            int result = i * 5;
            log.info(result);
        }
    }

    @Test(priority = 12)
    public void storeMultiplyZeroToFour() {
        for (int i = 0; i <= 4; i++) {
            int result = i * 2;
            log.info(result);
        }
    }

    @Test(priority = 13)
    public void storeMultiplyCountingByTwo() {
        for (int i = 2; i <= 10; i += 2) {
            int result = i * 2;
            log.info(result);
        }
    }

    @Test(priority = 14)
    public void storeMultiplyBackwards() {
        for (int i = 5; i >= 1; i--) {
            int result = i * 2;
            log.info(result);
        }
    }

    @Test(priority = 15)
    public void storeMultiplyByOne() {
        for (int i = 1; i <= 5; i++) {
            int result = i * 1;
            log.info(result);
        }
    }

}
