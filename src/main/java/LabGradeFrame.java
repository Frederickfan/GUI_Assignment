import javax.swing.*;
import java.awt.*;
import java.util.jar.JarEntry;

public class LabGradeFrame extends JFrame {
    private final JTextField[] labGrades = new JTextField[10];
    private final JLabel total = new JLabel();
    private final JLabel average = new JLabel();
    private final JLabel letter = new JLabel();

    public LabGradeFrame() {
        openInterface();
    }

    public void openInterface() {

        JPanel input = new JPanel();
        input.setLayout(new GridLayout(10, 2, 3, 3));
        this.add(input);

        // for each row, add label and input field.
        for (int i= 0; i < labGrades.length; i++) {
            input.add(new JLabel("Lab " + (i + 1) + " grade: "));
            labGrades[i] = new JTextField();
            input.add(labGrades[i]);
        }


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();

    }

    public static void main(String[] args) {
        new LabGradeFrame();
    }
}
