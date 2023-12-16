// Drawable interface
interface Drawable {
  void draw();
}

// Shape interface
interface Shape extends Drawable {
  double getArea();
}

// Rectangle class
class Rectangle implements Shape {

  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public void draw() {
    System.out.println("Drawing a rectangle");
  }

  @Override
  public double getArea() {
    return width * height;
  }
}

// Circle class
class Circle implements Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public void draw() {
    System.out.println("Drawing a circle");
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }
}

// Main class
public class mulinterfaceEg {

  public static void main(String[] args) {

    // Create a rectangle object
    Shape rectangle = new Rectangle(5, 10);

    // Draw the rectangle
    rectangle.draw();

    // Get the area of the rectangle
    double area = rectangle.getArea();

    System.out.println("The area of the rectangle is: " + area);

    // Create a circle object
    Shape circle = new Circle(3);

    // Draw the circle
    circle.draw();

    // Get the area of the circle
    area = circle.getArea();

    System.out.println("The area of the circle is: " + area);
  }
}