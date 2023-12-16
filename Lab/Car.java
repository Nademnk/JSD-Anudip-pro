import java.util.Scanner;

public class Car {

    private String make;
    private String model;
    private short year;
    private int price;

    // Constructor
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Getters and setters (omitted for brevity)

    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year + ", Price: $" + price;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter car make:");
        String make = scanner.nextLine();

        System.out.println("Enter car model:");
        String model = scanner.nextLine();

        System.out.println("Enter car year:");
        short year = Short.parseShort(scanner.nextLine());

        System.out.println("Enter car price:");
        int price = Integer.parseInt(scanner.nextLine());

        Car myCar = new Car(make, model, year, price);

        System.out.println("You created a car:");
        System.out.println(myCar);

        scanner.close();
    }
}