import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arguments = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            arguments.add(Integer.parseInt(args[i]));
        }
        System.out.println(arguments);

        first(arguments);
        contains(arguments, 12);
        evensToDelete(arguments);
        // userInput();
        contains2(arguments, userInput());


    }

    public static void first(ArrayList input) {
        String result = "";
        for (int i = 0; i < input.size(); i++) {
            result = "kabbefaszom";
        }
        System.out.println("Szépen: " + result);
    }


    public static boolean contains(ArrayList<Integer> input, int toFind) {
        if (input.contains(toFind)) {
            System.out.println("Benne van e'");
            return true;
        }
        System.out.println("Nincseeee");
        return false;
    }

    public static void evensToDelete(ArrayList<Integer> input) {
        for (int i = input.size() - 1; i >= 0; i--) {
            if (input.get(i) % 2 == 0) {
                input.remove(i);
            }
        }
        System.out.println(input);


    }
     public static ArrayList<Integer> userInput() {

         ArrayList<Integer> arr = new ArrayList<>();
         Scanner scn = new Scanner(System.in);
         int a = scn.nextInt();
         arr.add(a);
         int b = scn.nextInt();
         arr.add(b);
         int c = scn.nextInt();
         arr.add(c);

         System.out.println(arr);
         return arr;

    }

    public static void contains2(ArrayList<Integer> arguments, ArrayList<Integer> arr) {
        if (arguments.containsAll(arr)) {
            System.out.println("Fuck YEAH");
        } else {
            System.out.println("Nope...");
        }
    }

}
