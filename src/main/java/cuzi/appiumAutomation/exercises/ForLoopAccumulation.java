package cuzi.appiumAutomation.exercises;

import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

/***
 * Accumulating a total in a For-Loop
 * Total is stored each time the loop iterates
 */

@Log4j2
public class ForLoopAccumulation {

    @Test(priority = 1)
    public void accumulateOneToFive() {
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            total = total + i;
            log.info(total);
        }
    }

    @Test(priority = 2)
    public void accumulateZeroToFOur() {
        int total = 0;
        for (int i = 0; i <= 4; i++) {
            total = total + i;
            log.info(total);
        }
    }

    @Test(priority = 3)
    public void accumulateTwoToSix() {
        int total = 0;
        for (int i = 2; i <= 6; i++) {
            total = total + i;
            log.info(total);
        }
    }

    @Test(priority = 4)
    public void accumulateCountingByTwo() {
        int total = 0;
        for (int i = 2; i <= 10; i += 2) {
            total = total + i;
            log.info(total);
        }
    }

    @Test(priority = 5)
    public void accumulateOddNumbers() {
        int total = 0;
        for (int i = 1; i <= 9; i += 2) {
            total = total + i;
            log.info(total);
        }
    }

    @Test(priority = 6)
    public void accumulateBackwardsFiveToOne() {
        int total = 0;
        for (int i = 5; i >= 1; i--) {
            total = total + i;
            log.info(total);
        }
    }

    @Test(priority = 7)
    public void accumulateThreeToSeven() {
        int total = 0;
        for (int i = 3; i <= 7; i++) {
            total = total + i;
            log.info(total);
        }
    }

    @Test(priority = 8)
    public void accumulateOneRepeated() {
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            total = total + 1;
            log.info(total);
        }
    }

    @Test(priority = 9)
    public void accumulateDoubleValues() {
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            total = total + (i * 2);
            log.info(total);
        }
    }

    @Test(priority = 10)
    public void accumulateTripleValues() {
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            total = total + (i * 3);
            log.info(total);
        }
    }

    @Test(priority = 11)
    public void accumulateByFive() {
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            total = total + (i * 5);
            log.info(total);
        }
    }

    @Test(priority = 12)
    public void accumulateEvenMultiples() {
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            total = total + (i * 4);
            log.info(total);
        }
    }

    @Test(priority = 13)
    public void accumulateBackwardsMultiplication() {
        int total = 0;
        for (int i = 5; i >= 1; i--) {
            total = total + (i * 2);
            log.info(total);
        }
    }

    @Test(priority = 14)
    public void accumulateZeroIncluded() {
        int total = 0;
        for (int i = 0; i <= 4; i++) {
            total = total + (i * 2);
            log.info(total);
        }
    }

    @Test(priority = 15)
    public void accumulateConstantValue() {
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            total = total + 3;
            log.info(total);
        }
    }

}
