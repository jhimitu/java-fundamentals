package basiclibrary;

import java.util.List;
import java.util.*;

public class Tally {
    public static String maps(int[][] inputArr) {
        String result = "";
        HashSet<Integer> temperatures = new HashSet<Integer>();

        //store high temp
        int highTemp;
        int lowTemp;

        for (int[] arr : inputArr) {
            for (int i = 0; i < arr.length; i++) {
                temperatures.add(arr[i]);
            }
        }
        System.out.println(temperatures);

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

        result = "High: " + highTemp + "\n"
                + "Low: " + lowTemp;

        for (int i = lowTemp; i < highTemp; i++) {
            //if temperatures does not contain the temp at i
            //list as 'never seen'
        }

        System.out.println(highTemp);
        System.out.println(lowTemp);
        System.out.println(result);
        return result;
    }

    public static String tally(List<String> list) {
        String result = "";
        return result;
    }
}
