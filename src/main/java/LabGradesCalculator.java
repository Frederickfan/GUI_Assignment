import java.util.Arrays;

/**
 * LabGradesCalculator: A calculator that can calculate average, total and letter grade from an ArrayList of lab grades.
 * Each method in the class has a single responsibility and separation of concern.
 * Return:
 * - Result object that encapsulates average, total, and letter grade.
 */
public class LabGradesCalculator {

    public final static double FULL_GRADE = 20.0;

    public double computeAverage(double[] labGrades) {
        int sum = 0;
        int count = 0;

        // Naive way of calculating sum.
        for (double grade : labGrades) {
            sum += grade;
            count++;
        }
        return (double) sum / count;
    }

    public double computeTotal(double[] labGrades) {
        // Practicing usage of stream concept.
        // Simpler code and easier to maintain compared to computeAverageMethod.
        return Arrays.stream(labGrades).sum();
    }

    public Grade computeLetterGrade(double totalLabGrades, int numOfLabs) {
        double maxGrade = numOfLabs * FULL_GRADE;
        double percentage = (totalLabGrades / maxGrade) * 100.0;

        // Applying lambda and stream for better readability and composed code.
        return Arrays.stream(Grade.values())
                .filter(grade -> percentage >= grade.getMinumumPercentage() && percentage <= grade.getMaximumPercentage())
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No valid percentage data!"));
    }

    public Result calculateLabResult(double[] labGrades) {
        // invalid data, null check.
        if (labGrades == null || labGrades.length == 0) {
            throw new IllegalArgumentException("No valid grades data provided!");
        }

        int numOfLabs = labGrades.length;
        double average = computeAverage(labGrades);
        double totalLabGrades = computeTotal(labGrades);
        Grade letterGrade = computeLetterGrade(totalLabGrades, numOfLabs);

        return new Result(average, letterGrade, totalLabGrades);
    }

    public static void main(String[] args) {
        double[] grades = {20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 16};
        LabGradesCalculator calculator = new LabGradesCalculator();
        Result result = calculator.calculateLabResult(grades);

        System.out.printf("Total: %.2f\n", result.total);
        System.out.printf("Average: %.2f\n", result.average);
        System.out.printf("Grade: %s\n", result.letter);
    }


}
