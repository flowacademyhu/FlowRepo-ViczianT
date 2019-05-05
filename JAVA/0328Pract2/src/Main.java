import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d = scn.nextInt();
        int e = scn.nextInt();

        HashSet<Integer> hash = new HashSet<Integer>();
        hash.add(a);
        hash.add(b);
        hash.add(c);
        hash.add(d);
        hash.add(e);


        System.out.println(hash.toString());
    }
}
