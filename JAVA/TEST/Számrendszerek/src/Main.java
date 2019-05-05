

public class Main {

    public static void main(String[] args) {

        // System.out.println(converter("1011001"));
        System.out.println(reverse(2342, 7));

    }

    static int converter(String input) {
        int result = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == '1') {
                result += Math.pow(2, i);
            }
        }
        return result;
    }

    /* static int anyConverter(String input, char x) {
        int result = 0;
        char givenChar;

        for (int i = 0; i < 10 ; i++) {
            givenChar = 48 + 'i';
            System.out.println(givenChar);
        }

        return result;
    } */

    static String reverse(int num, int szrsz) {
        StringBuilder reversed = new StringBuilder();
        String result = "";
        while (num > 0) {
            int chunk = num % szrsz;
            num = num / szrsz;
            result += chunk;

        }
        reversed.append(result);
        reversed = reversed.reverse();
        return reversed.toString();
    }
}
