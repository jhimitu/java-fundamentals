import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    //pluralize method call
    // System.out.println(pluralize("dog", 2));
    //flipNHeads method call
    // flipNHeads(2);
    //clock method call
    clock();
  }

  public static String pluralize(String word, int num) {
    if (num == 0 || num > 1) {
      return word + "s";
    } 
    return word;
  }

  public static void flipNHeads(int n) {
    int flips = 0;
    int heads = 0;
    String lastFlip = "";
    
    while (heads < n) {
      double randomNum = Math.random();
      if (randomNum > .5) {
        // System.out.println("heads");
        lastFlip = "heads";
        if (lastFlip == "heads") {
          heads++;
        }
      } else if (randomNum < .5) {
        // System.out.println("tails");
        lastFlip = "tails";
      }
      flips++;
    }
    
    if(heads == n) {
      // System.out.println("It took " + flips + " flips to flip " + n + " heads in a row.");
    }
  }

  public static void clock() {
    LocalDateTime current = LocalDateTime.now().withNano(0);
    
    System.out.println(DateTimeFormatter.ISO_LOCAL_TIME.format(current));
  }
}