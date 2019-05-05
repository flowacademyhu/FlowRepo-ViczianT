import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ButtonInWindow extends JFrame implements KeyListener, MouseListener, MouseMotionListener {

    private JButton button;
    private Random random;
    private int x = 100;
    private int y = 50;


    public ButtonInWindow() throws HeadlessException {
        setTitle(("D'vindó"));
        setSize(400, 400);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        this.button = new JButton("Hit me!");
        button.setBounds(x, y, 100, 50);
        add(button);
        button.addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        button.addMouseListener(this);
        random = new Random(1);
        setVisible(true);

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();
        System.err.println(mouseX + " " + mouseY);
        if (x <= mouseX && mouseX <= x + button.getWidth()) {
            if (y <= mouseY && mouseY <= y + button.getHeight()) {
                int newX = random.nextInt(this.getWidth() - button.getWidth());
                int newY = random.nextInt(this.getHeight() - button.getHeight());
                System.out.println(newX + " " + newY);
                button.setLocation(newX, newY);
            }
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getX() + " " + e.getY());
        System.out.println(getInsets());
        button.setLocation(e.getX(), e.getY() - 37);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        // System.out.println(e.getKeyChar());
        char c = e.getKeyChar();
        if (c == 'w') {
            y -= 10;
        } else if (c == 's') {
            y += 10;
            if (y + button.getHeight() > this.getHeight()) {
                this.setSize(getWidth(), button.getHeight() + y);
            }
        } else if (c == 'd') {
            x += 10;
            if (x + button.getWidth() > this.getWidth()) {
                this.setSize(x + button.getWidth(), getHeight());
            }
        } else if (c == 'a') {
            x -= 10;

        }
        this.button.setLocation(x, y);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

