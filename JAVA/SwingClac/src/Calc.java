import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Calc extends JFrame {

    public Calc() throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Bender");
        this.setSize(500, 500);
        this.setLayout(null);

        JTextField num1 = new JTextField("Gimme a number");
        num1.setBounds(50,50, 100,50);
        num1.setBackground(Color.pink);
        JTextField num2 = new JTextField("And another");
        num2.setBounds(350,50,100, 50);
        num2.setBackground(Color.pink);

        JRadioButton add = new JRadioButton("add");
        add.setBounds(200,50,100,50);
        JRadioButton sub = new JRadioButton("sub");
        sub.setBounds(200,100,100,50);
        JRadioButton mul = new JRadioButton("mul");
        mul.setBounds(200,150,100,50);
        JRadioButton div = new JRadioButton("div");
        div.setBounds(200,200,100,50);
        ButtonGroup group = new ButtonGroup();
        group.add(add);
        group.add(sub);
        group.add(mul);
        group.add(div);

        JTextField result = new JTextField();
        result.setBounds(150, 400, 200, 50);
        result.setBackground(Color.pink);

        JButton ok = new JButton("PUSH ME");
        ok.setBounds(200,300,100,50);
        ok.setBackground(Color.pink);

        ok.addActionListener((e) -> {
            try {
                int number1 = Integer.parseInt(num1.getText());
                int number2 = Integer.parseInt(num2.getText());
                if (add.isSelected()) {
                    int calcResult = number1 + number2;
                    result.setText("Result:   " + calcResult);
                } else if (sub.isSelected()) {
                    int calcResult = number1 - number2;
                    result.setText("Result:   " + calcResult);
                } else if (mul.isSelected()) {
                    int calcResult = number1 * number2;
                    result.setText("Result:   " + calcResult);
                } else if (div.isSelected()) {
                    double calcResult = (double) number1 / number2;
                    result.setText("Result:   " + calcResult);
                }
            } catch (NumberFormatException f) {
                JOptionPane.showMessageDialog(this, "Elbasztad --> " + f);
            }
        });

        this.add(num1);
        this.add(num2);
        this.add(add);
        this.add(sub);
        this.add(mul);
        this.add(div);
        this.add(ok);
        this.add(result);
        this.setVisible(true);
    }


}
