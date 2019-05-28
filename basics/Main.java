import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {

    System.out.println(pluralize("dog", 2));
    flipNHeads(2);
    clock();
  }

  //PLURALIZE
  public static String pluralize(String word, int num) {
    if (num == 0 || num > 1) {
      return word + "s";
    } 
    return word;
  }

  //FLIPS
  public static void flipNHeads(int n) {
    int flips = 0;
    int heads = 0;
    String lastFlip = "";
    
    while (heads < n) {
      double randomNum = Math.random();
      if (randomNum > .5) {
        System.out.println("heads");
        lastFlip = "heads";
        if (lastFlip == "heads") {
          heads++;
        }
      } else if (randomNum < .5) {
        System.out.println("tails");
        lastFlip = "tails";
      }
      flips++;
    }
    
    if(heads == n) {
      System.out.println("It took " + flips + " flips to flip " + n + " heads in a row.");
    }
  }

  //CLOCK
  public static void clock() {
    LocalDateTime past = LocalDateTime.now().withNano(0);
    int pastSeconds = past.getSecond();
    LocalDateTime current = LocalDateTime.now().withNano(0);
    int currentSeconds = current.getSecond();
    
    do {
      if (currentSeconds - pastSeconds == 1) {
        System.out.println(DateTimeFormatter.ISO_LOCAL_TIME.format(current));
      } 
      pastSeconds = currentSeconds;
      current = LocalDateTime.now();
      currentSeconds = current.getSecond();
    } while (true);
  }
}

