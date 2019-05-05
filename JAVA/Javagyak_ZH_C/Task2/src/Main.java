import com.sun.source.tree.WhileLoopTree;
import haziallatok.Cat;
import haziallatok.Siamese;
import haziallatok.Tabby;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Cat karcsi = new Cat(14, 4);
        Cat aladar = new Cat(17, 4);
        Siamese leia = new Siamese(11, 4, true);
        Tabby cirmi = new Tabby(14, 4, 3);

        Scanner scn = new Scanner(System.in);
        List<Cat> cats = new ArrayList<>();
        while (!scn.nextLine().equals("done")) {
            if (scn.nextLine().equals("siamese")) {
                Siamese x = new Siamese(Double.parseDouble(scn.nextLine()), Integer.parseInt(scn.nextLine()), Boolean.parseBoolean(scn.nextLine()));
                cats.add(x);
            } else if (scn.nextLine().equals("tabby")) {
                Tabby y = new Tabby(Double.parseDouble(scn.next()), Integer.parseInt(scn.next()), Integer.parseInt(scn.next()));
                cats.add(y);
            }

        }
        scn.close();
        System.out.println(List.copyOf(cats));

    }

    public static Cat fight (Cat a, Cat b) {
        Cat winner = null;
        if (a.getLegCount() > b.getLegCount()) {
            winner = a;
        } else if (a.getLegCount() < b.getLegCount()) {
            winner = b;
        } else {
            if (a.getHeight() - b.getHeight() > 2.5) {
                winner = a;
            } else if (b.getHeight() - a.getHeight() > 2.5) {
                winner = b;
            } else {
                if (a instanceof Siamese) {
                    Siamese aMod = (Siamese) a;
                    if (aMod.isAdorable()) {
                        winner = a;
                    }
                } else if (b instanceof Siamese) {
                    Siamese bMod = (Siamese) b;
                    if (bMod.isAdorable()) {
                        winner = b;
                    }
                } else {
                    winner = a;
                }
            }
        }
        System.err.println(winner);
        return winner;
    }
}
