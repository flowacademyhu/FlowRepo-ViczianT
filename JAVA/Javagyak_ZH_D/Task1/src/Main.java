import java.util.Arrays;

public class Main {

    public static void main (String[] args) {

        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }

        int[] piramNums = new int[20];
        int result = 0;
        for (int i = 1; i < piramNums.length; i++) {
            result += Math.pow(i, 2);
            piramNums[i - 1] = result;
        }
        String a = "";
        for (int i = 0; i < args.length; i++) {
            a = Integer.parseInt(args[i]) == piramNums[i] ? "piramis" : "túrót";
            System.out.println(a);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(piramNums));
    }
}
