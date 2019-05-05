import java.lang.*;

public class Main {
  public static void main(String... args) {
    // System.out.println(args);
    printItems();
    //@ Task 2
    int resultNumAdd = 0;
    for(var i=0; i<args.length; i++) {
      int num = Integer.parseInt(args[i]);
      resultNumAdd = resultNumAdd + num;
    }
    System.out.println(resultNumAdd);

    //@ Task 2 / atlag
    double resultNumAvg = ((double)resultNumAdd / (double)args.length);
    System.out.println(resultNumAvg);

    //@ Task 3
    for(var i=1; i<args.length-1; i++) {
      int a = Integer.parseInt(args[i]);
      int aMinusOne = Integer.parseInt(args[i-1]);
      int aPlusOne = Integer.parseInt(args[i+1]);
      // System.out.println("WTF");
      if ((a - aMinusOne) + a == aPlusOne) {
        // befejezni otthon....
      }
    }
    // String[] foods = {"Pizza", "Gyros", "Hamburger", "Taco", "Hot-Dog"};

    // basicArrayParam(foods);
    // threeDotArrayParam(foods);
  }

  public static void basicArrayParam(String[] strings) {
    for(String string: strings) {
      System.out.println(string);
      System.out.println("slfgbaks");
    }
  }

  public static void threeDotArrayParam(String... strings) {
    for(String string: strings) {
      System.out.println(string);
    }
  }

  public static void printItems(String[] args) {
    int num1 = 312;
    float num2 = 15.6f;
    double num3 = 81.9;
    System.out.println(num1 + num2 + num3);
  }
}