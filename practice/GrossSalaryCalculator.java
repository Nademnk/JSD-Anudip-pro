import java.util.Scanner;

public class GrossSalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user
        boolean continueLoop = true; // Flag to control the loop

        while (continueLoop) { // Loop for calculating gross salary of multiple employees
            System.out.print("Enter basic salary: "); // Prompt the user to enter basic salary
            double basicSalary = scanner.nextDouble(); // Read the basic salary

            double hra, da, grossSalary; // Declare variables for HRA, DA, and gross salary

            if (basicSalary > 15000) { // Check if basic salary is above 15000
                hra = 0.2 * basicSalary; // Calculate HRA as 20% of basic salary
                da = 0.6 * basicSalary; // Calculate DA as 60% of basic salary
            } else { // If basic salary is below 15000
                hra = 3000; // Set fixed HRA to 3000
                da = 0.7 * basicSalary; // Calculate DA as 70% of basic salary
            }

            grossSalary = basicSalary + hra + da; // Calculate gross salary
            System.out.println("Gross salary: " + grossSalary); // Display gross salary

            System.out.print("Enter -1 to continue or any other number to exit: "); // Prompt the user to continue or exit
            int choice = scanner.nextInt(); // Read the user's choice

            if (choice != -1) { // If the user chooses not to continue
                continueLoop = false; // Exit the loop
            }
        }

        scanner.close(); // Close the Scanner object
    }
}
