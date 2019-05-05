import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Book> books = new ArrayList<>();
    private static List<CD> cds = new ArrayList<>();

    public static void main (String... args) {
        takeOrder("orders.txt");
        order();
    }

    private static void takeOrder(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(new File(path)))) {
            String s = br.readLine();
            while (s != null) {
                String[] arr = s.split(";");
                if (arr[0].equalsIgnoreCase("exercisebook")) {
                    ExerciseBook p = new ExerciseBook(arr[1], arr[2], Integer.parseInt(arr[3]));
                    books.add(p);
                } else if (arr[0].equalsIgnoreCase("novel")) {
                    Novel p = new Novel(arr[1], arr[2], arr[3]);
                    books.add(p);
                } else {
                    CD p = new CD(arr[1], arr[2]);
                    cds.add(p);
                }
                s = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException d) {
            System.out.println(d);
        }
    }

    private static void order() {
        for (Book a : books) {
            if (a instanceof Orderable) {
                ((Novel) a).order(12);
            }
        }
        for (CD a : cds) {
            a.order(9);
        }
    }
}
