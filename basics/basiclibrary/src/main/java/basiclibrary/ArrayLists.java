package basiclibrary;
import java.lang.Math;

public class ArrayLists {
    public static int[] roll(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int max = 6;
            int min = 1;
            int range = max - min + 1;
            int dieRoll = (int) (Math.random() * range) + min;
            result[i] = dieRoll;
        }
        return result;
    }

    public static boolean containsDuplicates(int[] inputArr) {
        int current = inputArr[0];

        for (int i = 1; i < inputArr.length; i++) {
            if (inputArr[i] == current) {
                return true;
            } else {
                current = inputArr[i];
            }
        }
        return false;
    }

    public static int calculateAverage(int[] inputArr) {
        int average = 0;
        int sum = 0;

        for (int i = 0; i < inputArr.length; i++) {
            sum += inputArr[i];
        }

        average = sum / inputArr.length;
        return average;
    }

    public static int[] arrOfArrAverage(int[][] inputArr) {
        int[] result = inputArr[0];
        int lowestAvg = calculateAverage(inputArr[0]);

        for (int i = 0; i < inputArr.length; i++) {
            int arrAvg = calculateAverage(inputArr[i]);
            if (arrAvg < lowestAvg) {
                lowestAvg = arrAvg;
                result = inputArr[i];
            }
        }
        return result;
    }
}