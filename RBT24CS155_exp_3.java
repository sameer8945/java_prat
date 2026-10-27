import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RBT24CS155_exp_3 extends JFrame implements KeyListener {
    JTextField field;
    JTextArea area;

    RBT24CS155_exp_3() {
        setTitle("Keyboard Events");
        setSize(400, 300);
        setLayout(new FlowLayout());

        field = new JTextField(20);
        area = new JTextArea(8, 30);
        area.setEditable(false);

        add(new JLabel("Press any key:"));
        add(field);
        add(new JScrollPane(area));

        field.addKeyListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        area.append("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()) + "\n");
    }

    public void keyReleased(KeyEvent e) {
        area.append("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()) + "\n");
    }

    public void keyTyped(KeyEvent e) {
        area.append("Key Typed: " + e.getKeyChar() + "\n");
    }

    public static void main(String[] args) {
        new RBT24CS155_exp_3();
    }
}