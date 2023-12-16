import java.util.Scanner;

public class Calculator {

     // Method to add two integers and return their sum as int
    public int add(int num1, int num2) {
        return num1 + num2;
    }

     // Method to add three integers and return their sum as int
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Method to add two doubles and return their sum as double
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        
        //Adding two integers
        System.out.print("Enter two integers to add: ");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();

        System.out.println("Result of adding two integers: " + calculator.add(int1, int2));

        //Adding three integers
        System.out.print("\nEnter three integers to add: ");
        int int3 = scanner.nextInt();
        int int4 = scanner.nextInt();
        int int5 = scanner.nextInt();

        System.out.println("Result of adding three integers: " + calculator.add(int3, int4, int5));

        //Adding two double
        System.out.print("\nEnter two doubles to add: ");
        double double1 = scanner.nextDouble();
        double double2 = scanner.nextDouble();

        System.out.println("Result of adding two doubles: " + calculator.add(double1, double2));

        scanner.close();
    }
}
