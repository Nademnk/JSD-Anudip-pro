
import java.util.Scanner;

public class Employee{

    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    public Employee(int i, int ageDouble, String string, boolean b) {
    }

    public static void main(String[] args) {
        // Prompt the user for their age
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee age:");

        //getting input from user
        double userAgeInput = scanner.nextDouble();

        // Cast the user's age input to an integer
        int age = (int) userAgeInput;

        // Display a success message
        System.out.println("Successfully started!");
        System.out.println("Employee age is: " + age);
        scanner.close();
    }
}
