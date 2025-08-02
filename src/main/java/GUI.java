import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;
    public int count;

    public GUI() {
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton();

        button = new JButton("Click");

        label = new JLabel("Number of clicks: " + count);
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
         JFrame frame = new JFrame();
         frame.setTitle("JFrame title");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setResizable(false);
         frame.setSize(420, 420);
         frame.setVisible(true);






    }
}
