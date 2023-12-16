import java.util.Scanner;
public class scanner {
  public static void main(String[] args) {

    // creating a scanner
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter your first name: ");

    // read user input and store it in a string variable
    String firstName = scan.nextLine();

    System.out.print("Enter your last name: ");

    // read second input
    String lastName = scan.nextLine();

    // prints the user entered data
    System.out.println("Your Name is: "+firstName+" "+lastName);

    // close scanner
    scan.close();
  }
}