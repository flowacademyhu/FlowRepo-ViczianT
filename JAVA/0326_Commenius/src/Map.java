import java.util.Arrays;

public class Map {

    private char[][] array;
    private Turtle turtle;

    public Map (int a, int b) {
        this.array = new char[a][b];
        this.turtle = new Turtle(a, b);
        for (char[] row : this.array)
            Arrays.fill(row, ' ');
        this.array[0][0] = '$';
    }
    public void drawMap() {
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                System.out.print(String.valueOf(array[i][j]));
            }
            System.out.println();
        }
    }
    public void doCommand (String command) {
        if (command.equals("TOLL LE")) {
            turtle.changePen(true);
        } else if (command.equals(("TOLL FEL"))) {
            turtle.changePen(false);
        } else if (command.equals("TOROL")) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] == '#') {
                        array[i][j] = ' ';
                    }
                }
            }
        } else if (command.startsWith("FEL ")) {
            moveDirection(command);
        } else if (command.startsWith("LE ")) {
            moveDirection(command);
        } else if (command.startsWith("JOBB ")) {
            moveDirection(command);
        } else if (command.startsWith("BAL ")) {
            moveDirection(command);
        }
    }
    public void moveDirection (String command) {
        String[] str = command.split(" ");
        int n = Integer.parseInt(str[1]);
        for (int i = 0; i < n; i++) {
            int x = turtle.getPosX();
            int y = turtle.getPosY();
            if (turtle.isTollStatus()) {
                this.array[x][y] = '#';
            } else {
                this.array[x][y] = ' ';
            }
            turtle.move(str[0]);
            this.array[turtle.getPosX()][turtle.getPosY()] = '$';

        }
    }

}
