package cuzi.appiumAutomation.exercises;

import java.util.Arrays;

public class ForLoopExercise {
    private static final int[] NUMS = {2, 5, 8, 3, 10};

    public static void main(String[] args) {
        System.out.println("Array: " + Arrays.toString(NUMS));

        // TODO: implement sumArray using a for loop
        int sum = sumArray(NUMS);
        System.out.println("Sum: " + sum);

        // TODO: implement countGreaterThan using a for loop
        int count = countGreaterThan(NUMS, 2);
        System.out.println("Count > 5: " + count);
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        // TODO: iterate with a for loop and accumulate into sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int countGreaterThan(int[] arr, int threshold) {
        int count = 0;
        // TODO: iterate with a for loop and increment count when element > threshold
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < threshold) {
                count++;
            }
        }
        return count;
    }

}
