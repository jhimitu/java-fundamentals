package basiclibrary;

import java.util.List;
import java.util.*;

public class Tally {
    public static String maps(int[][] inputArr) {
        String result;

        HashSet<Integer> temperatures = new HashSet<Integer>();

        //store high temp
        int highTemp;
        int lowTemp;

        for (int[] arr : inputArr) {
            for (int i = 0; i < arr.length; i++) {
                temperatures.add(arr[i]);
            }
        }

        //find the highest temperature
        Iterator highTemps = temperatures.iterator();
        highTemp = (int) highTemps.next();

        while (highTemps.hasNext()) {
            int current = (int) highTemps.next();

            if (current > highTemp) {
                highTemp = current;
            }
        }

        //find the lowest temperature
        Iterator lowTemps = temperatures.iterator();
        lowTemp = (int) lowTemps.next();

        while (lowTemps.hasNext()) {
            int current = (int) lowTemps.next();

            if (current < lowTemp) {
                lowTemp = current;
            }
        }

        //add high and low temps to string
        result = "High: " + highTemp + "\n"
                + "Low: " + lowTemp + "\n";

        //iterate through min to max temps, find never seen temps
        for (int i = lowTemp; i < highTemp + 1; i++) {
            if (!temperatures.contains(i)) {
                result += "Never saw temperature: " + i + "\n";
            }
        }

        //removes trailing newline
        String output = result.substring(0, result.lastIndexOf("\n"));

        return output;
    }

    public static String tally(List<String> list) {
        String result = "";
        return result;
    }
}
