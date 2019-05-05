public class Main {

    public static void main(String[] args) {

        // int a = Integer.parseInt(args[0]);
        // int b = Integer.parseInt(args[1]);
        // int c = Integer.parseInt(args[2]);
        // isTriangle(a, b, c);

        int n = (int) Integer.parseInt("12");

        task16(n);


    }
    public static void isTriangle(int a, int b, int c) {
        int[] input = new int[3];
        if (input.length < 3) {
            System.out.println("Kicsiiii");
        }

        if (a + b >= c && a + c >= b && a + b >= c) {
            System.out.println("Terület: ");
        } else {
            System.out.println(("Nem háromszög!"));
        }

    }
    public static void task16(int n) {
        n = Integer.parseInt("12");
        int[] diceThrows = new int[n];
        for (int i = 0; i < n; i++) {
            diceThrows[i] =  (int)(Math.random() * 6) + 1;
        }
        System.out.println(diceThrows);
    }

}
