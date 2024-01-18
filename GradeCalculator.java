import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take marks obtained in each subject
        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        // Take marks for each subject
        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter marks for Subject " + i + ":");
            int marks = scanner.nextInt();
            
            // Validate marks
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Marks should be between 0 and 100.");
                return;
            }

            totalMarks += marks;
        }

        // Calculate Total Marks
        System.out.println("Total Marks: " + totalMarks);

        // Calculate Average Percentage
        double averagePercentage = (double) totalMarks / numSubjects;
        System.out.println("Average Percentage: " + averagePercentage + "%");

        // Grade Calculation
        char grade = calculateGrade(averagePercentage);

        // Display Results
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    // Helper method to calculate grade based on average percentage
    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}