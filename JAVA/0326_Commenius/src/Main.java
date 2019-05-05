import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Map map = new Map(10, 10);
        map.drawMap();
        Scanner scn = new Scanner(System.in);
        System.out.println("Okay, let's go!");
        String str = scn.nextLine();
        while (!str.equals("KILEP")) {
            map.doCommand(str);
            map.drawMap();
            str = scn.nextLine();
        }
    }
}
