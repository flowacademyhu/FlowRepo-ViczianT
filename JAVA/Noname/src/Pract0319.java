public class Pract0319 {

    public static void main(String[] args) {

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
