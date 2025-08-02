import java.util.Map;

/**
 * LabGradesCalculator used to calculate average lab grades.
 * Return:
 * - double
 */
public class LabGradesCalculator {


    public double computeAverage(double[] labGrades) {
        int sum = 0;
        int count = 0;

        for (double grade : labGrades) {
            sum += grade;
            count++;
        }

        return (double) sum / count;
    }


}
