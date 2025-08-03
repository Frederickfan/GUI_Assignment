import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * LabGradesFrame: A JFrame that show input fields for lab grades and button for calculating lab grades:
 * Includes
 * - average
 * - total
 * - letter grade
 * */
public class LabGradeFrame extends JFrame implements ActionListener {
    private final JTextField[] labGrades = new JTextField[10];
    private final JLabel fullGrade = new JLabel("Full Grade:200");
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
        calculate.addActionListener(this);
        JPanel result = new JPanel(new GridLayout(3, 1));
        result.add(fullGrade);
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

    public double[] extractLabGrades() {
        double[] extractedGrades = new double[this.labGrades.length];

        for (int i = 0; i < this.labGrades.length; i++) {
            String labGradeText = this.labGrades[i].getText().trim();
            double grade = 0.0;

            try {
                if (!labGradeText.isBlank()) {
                    grade = Double.parseDouble(labGradeText);
                    // consider edge case out of range value.
                    if (grade < 0 || grade > LabGradesCalculator.FULL_GRADE) {
                        grade = 0;
                    }
                }
            } catch (NumberFormatException ex) {
                // for invalid format, just treat as 0.
                grade = 0.0;
            }

            extractedGrades[i] = grade;
        }

        return extractedGrades;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double[] labGrades = extractLabGrades();
        LabGradesCalculator calculator = new LabGradesCalculator();
        Result result = calculator.calculateLabResult(labGrades);

        total.setText("Total: " + result.total);
        average.setText("Average: " + result.average);
        letter.setText("Letter: " + result.letter);
    }
}
