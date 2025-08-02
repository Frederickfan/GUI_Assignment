import javax.swing.*;
import java.awt.*;

public class LabGradeFrame extends JFrame {
    private final JTextField[] labGrades = new JTextField[10];
    private final JLabel total = new JLabel("Total: ");
    private final JLabel average = new JLabel("Average: ");
    private final JLabel letter = new JLabel("Letter Grade: ");

    public LabGradeFrame() {
        openInterface();
    }

    public void openInterface() {

        JPanel input = new JPanel();
        input.setLayout(new GridLayout(12, 2, 3, 3));
        this.add(input);
        this.setTitle("Grade Display");

        // for each row, add label and input field.
        for (int i= 0; i < labGrades.length; i++) {
            input.add(new JLabel("Lab " + (i + 1) + " grade: "));
            labGrades[i] = new JTextField();
            input.add(labGrades[i]);
        }
        input.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));

        // add calculate button and showing result afterwards.
        JButton calculate = new JButton("Calculate");
        JPanel result = new JPanel(new GridLayout(3, 1));
        result.add(total);
        result.add(average);
        result.add(letter);

        input.add(calculate);
        input.add(result);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.pack();
    }

    public static void main(String[] args) {
        new LabGradeFrame();
    }
}
