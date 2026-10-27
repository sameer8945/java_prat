import java.awt.*;
import java.awt.event.*;

public class RBT24CS155_exp_5 extends Frame {

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 30));

        g.setColor(Color.RED);
        g.drawString("AllTheBest", 100, 100);

        g.setColor(Color.BLUE);
        g.drawString("AllTheBest", 100, 150);

        g.setColor(Color.GREEN);
        g.drawString("AllTheBest", 100, 200);

        g.setColor(Color.ORANGE);
        g.drawString("AllTheBest", 100, 250);

        g.setColor(Color.MAGENTA);
        g.drawString("AllTheBest", 100, 300);
    }

    RBT24CS155_exp_5() {
        setTitle("All The Best");
        setSize(400, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new RBT24CS155_exp_5();
    }
}