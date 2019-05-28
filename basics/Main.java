public class Main {
  public static void main(String[] args) {
    System.out.println("java working");
    System.out.println(pluralize("dog", 2));
  }

  public static String pluralize(String word, int num) {
    if (num == 0 || num > 1) {
      return word + "s";
    } 
    return word;
  }
}