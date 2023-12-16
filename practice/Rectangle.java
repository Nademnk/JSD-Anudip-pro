import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the length and width of the first rectangle from the user.
        System.out.println("Enter the length of the first rectangle: ");
        int length1 = scanner.nextInt();
        System.out.println("Enter the width of the first rectangle: ");
        int width1 = scanner.nextInt();

        // Get the length and width of the second rectangle from the user.
        System.out.println("Enter the length of the second rectangle: ");
        int length2 = scanner.nextInt();
        System.out.println("Enter the width of the second rectangle: ");
        int width2 = scanner.nextInt();

        // Calculate the area of the first rectangle.
        int area1 = length1 * width1;

        // Calculate the area of the second rectangle.
        int area2 = length2 * width2;

        // Compare the areas of the two rectangles using a relational operator.
        if (area1 > area2) {
            System.out.println("The first rectangle has a larger area than the second rectangle.");
        } else if (area1 < area2) {
            System.out.println("The second rectangle has a larger area than the first rectangle.");
        } else {
            System.out.println("The two rectangles have the same area.");
        }
    }
}