import java.util.Scanner;

public class Student {
  private String studentName;
  private String collegeName;
  private int studentID;
public Student(String studentName, String collegeName, int studentID) {
    this.studentName = studentName;
    this.collegeName = collegeName;
    this.studentID = studentID;
  }

  public String getStudentName() {
    return studentName;
  }

  public String getCollegeName() {
    return collegeName;
  }

  public int getStudentID() {
    return studentID;
  }

  public static void main(String[] args) {
    // Get input from the user
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the student name: ");
    String studentName = scanner.nextLine();
    System.out.println("Enter the college name: ");
    String collegeName = scanner.nextLine();
    System.out.println("Enter the student ID: ");
    int studentID = scanner.nextInt();

    new Student(studentName, collegeName, studentID);

    // Print a message "Successful"
    System.out.println("Successful");
    scanner.close();
  }
}
