import java.util.Scanner;

public class EmployeeEg {
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    public static void main(String[] args) {
        System.out.println("Successfully started");

        // Using Scanner to get user input for age
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee's age as a double: ");
        
        // Reading user input as a double
        double ageDouble = scanner.nextDouble();

        // Casting double to int
        int ageInt = (int) ageDouble; // Casting to int

        // Displaying the input values
        System.out.println("Age as double: " + ageDouble);
        System.out.println("Age as int (after casting): " + ageInt);

        // Close the scanner
        scanner.close();
    }
}