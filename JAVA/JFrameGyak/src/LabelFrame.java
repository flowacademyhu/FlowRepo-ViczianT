import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class LabelFrame extends JFrame implements MouseMotionListener, KeyListener {

    JLabel[][] labels;
    int row = 20;
    int col = 20;

    public LabelFrame() throws HeadlessException {
        setSize(400, 400);
        setTitle("vindó 2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        GridLayout grid = new GridLayout(row, col);
        setLayout(grid);

        setBackground(Color.pink);
        addMouseMotionListener(this);
        addKeyListener(this);


        labels = new JLabel[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                labels[i][j] = new JLabel("#");
                labels[i][j].setOpaque(true);
                labels[i][j].setBackground(Color.pink);
                labels[i][j].addMouseMotionListener(this);
                add(labels[i][j]);

            }
        }
        white();
        setVisible(true);
    }

    public void white () {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        labels[i][j].setBackground(Color.black);
                    } else {
                        labels[i][j].setBackground(Color.white);
                    }
                } else {
                    if (j % 2 != 0) {
                        labels[i][j].setBackground(Color.black);
                    } else {
                        labels[i][j].setBackground(Color.white);
                    }
                }
            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // System.out.println(e.getSource());
        if (e.getSource() instanceof JLabel) {
            ((JLabel) e.getSource()).setBackground(Color.pink);
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 'r') {
            white();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
