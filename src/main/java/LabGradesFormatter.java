import java.util.Map;

/**
 * LabGradesFormatter used to format the lab grades and make the ouput human readable.
 * Return:
 * String
 */
public class LabGradesFormatter {
    public String format(String courseName, Map<String, Integer> labGrades, double average) {
        // Use StringBuilder to connect the final output string.
        StringBuilder sb = new StringBuilder();
        sb.append("Course: ").append(courseName).append("\n");

        for (Map.Entry<String, Integer> entry : labGrades.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }

        sb.append("Average: ").append(average);
        return sb.toString();
    }
}
