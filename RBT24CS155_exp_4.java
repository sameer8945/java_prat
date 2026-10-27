import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RBT24CS155_exp_4 extends JFrame implements MouseListener {
    JLabel label;
    JTextArea area;

    RBT24CS155_exp_4() {
        setTitle("Mouse Events");
        setSize(400, 300);
        setLayout(new BorderLayout());

        label = new JLabel("Perform mouse actions here", JLabel.CENTER);
        area = new JTextArea(6, 30);
        area.setEditable(false);

        label.addMouseListener(this);

        add(label, BorderLayout.CENTER);
        add(new JScrollPane(area), BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        area.append("Mouse Clicked at: " + e.getX() + ", " + e.getY() + "\n");
    }

    public void mousePressed(MouseEvent e) {
        area.append("Mouse Pressed\n");
    }

    public void mouseReleased(MouseEvent e) {
        area.append("Mouse Released\n");
    }

    public void mouseEntered(MouseEvent e) {
        area.append("Mouse Entered\n");
    }

    public void mouseExited(MouseEvent e) {
        area.append("Mouse Exited\n");
    }

    public static void main(String[] args) {
        new RBT24CS155_exp_4();
    }
}
