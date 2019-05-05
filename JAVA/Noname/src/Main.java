import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i > j) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        int num = (int)(Math.random() * 10 + 1);
        for (int k = 0; k <= num; k++) {
            for (int l = 0; l <= num; l++) {
                if (k == l) {
                    System.out.print(k);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }


        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> task1 = new ArrayList<>();
        while (scn.hasNextInt()) {
            task1.add(scn.nextInt());
        }
        if (task1.size() < 2) {
            System.out.println("Kicsiiiii!");
        }
        int min = task1.get(0);
        for (int i : task1) {
            min = min < i ? min : i;
        }
        System.out.println("Minimum value: " + min);

        int max = task1.get(0);
        for (int i : task1) {
            max = max > i ? max : i;
        }
        System.out.println("Maximum value: " + max);

        //Task 3
        int sum = 0;
        for (int z = 0; z < task1.size(); z++) {
            sum += task1.get(z);
        }
        System.out.println("Sum of list: " + sum);


        System.out.println(task1);

        scn.close();

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        isTriangle(4, 5, 1);

    }


    public static void isTriangle(int a, int b, int c) {
        int[] input = new int[3];
        if (input.length < 3) {
            System.out.println("Kicsiiii");
        }

        if (a + b < c || a + c < b || a + b < c) {
            System.out.println("Terület: ");
        } else {
            System.out.println(("Nem háromszög!"));
        }

    }

}


