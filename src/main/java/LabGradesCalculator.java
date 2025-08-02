import java.util.Map;

/**
 * LabGradesCalculator used to calculate average lab grades.
 * Return:
 * - double
 */
public class LabGradesCalculator {
    public double computeAverage(Map<String, Integer> labGrades) {
        int sum = 0;
        int count = 0;

        for (Integer grade : labGrades.values()) {
            sum += grade;
            count++;
        }

        return (double) sum / count;
    }
}
