import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args) {
        // Create a Scanner object to read i78nput from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the student's score
        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();

        // Close the Scanner
        scanner.close();

        // Determine the grade based on the score
        char grade;

        if (score >= 75) {
            grade = 'A';
        } else if (score >= 50) {
            grade = 'B';
        } else if (score >= 25) {
            grade = 'C';
        } else if (score >= 0) {
            grade = 'F';
        } else {
            System.out.println("Invalid input!");
            return; // Exit the program if input is invalid
        }

        // Display the grade to the user
        System.out.println("Student's grade: " + grade);
    }
}
