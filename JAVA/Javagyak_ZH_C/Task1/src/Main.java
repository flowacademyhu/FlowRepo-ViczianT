import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main (String[] args) {

        int count = 0;
        String x = "fereg";

        for (int i = 0; i < args.length - 1; i++) {
            if (args[i].equals(x)) {
                if (!args[i + 1].equals(x)) {
                    count++;
                }
            } else {
                Collections.reverse(Arrays.asList(args));
            }
        }
        System.err.println(count);
        System.out.println(Arrays.toString(args));
    }
}
