import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RBT24CS155_exp_6 extends JFrame implements ActionListener {
    JTextField num, prev, next;

    RBT24CS155_exp_6() {
        setTitle("Previous and Next Number");
        setSize(400, 200);
        setLayout(new FlowLayout());

        add(new JLabel("Enter Number:"));
        num = new JTextField(10);
        add(num);

        add(new JLabel("Previous Number:"));
        prev = new JTextField(10);
        prev.setEditable(false);
        add(prev);

        add(new JLabel("Next Number:"));
        next = new JTextField(10);
        next.setEditable(false);
        add(next);

        num.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int n = Integer.parseInt(num.getText());
            prev.setText(String.valueOf(n - 1));
            next.setText(String.valueOf(n + 1));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter a valid number");
        }
    }

    public static void main(String[] args) {
        new RBT24CS155_exp_6();
    }
}