package basiclibrary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
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
        String winner = "";
        int highestTally = 0;

        HashMap<String, Integer> voteTallies = new HashMap<>();
        ListIterator<String> iterator = list.listIterator();
        System.out.println(list);

        while (iterator.hasNext()) {
            String currentVote = iterator.next();

            voteTallies.putIfAbsent(currentVote, 1);

            if (voteTallies.containsKey(currentVote)) {
                int currentTally = voteTallies.get(currentVote);
                voteTallies.replace(currentVote, currentTally, currentTally + 1);
            }
        }

        for (Map.Entry<String, Integer> voteTally : voteTallies.entrySet()) {
            if (voteTally.getValue() > highestTally) {
                highestTally = voteTally.getValue();
                winner = voteTally.getKey();
            }
        }

        return winner;
    }
    public static void linter(Path path) {

        BufferedReader reader = new BufferedReader(new FileReader(file));
        while (reader.readLine() != null) {

        }
        System.out.println(path);

    }
}
