package objectOrientedConcepts.encapsulation;

public class Car {  // Class (template of an object)

    private final String brand; // Property
    private final String model; // Property
    private final String color; // Property

    public Car(String brand, String model, String color) {  // Constructor (method for creating an object)
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public void start() { // Method
        System.out.println("Starting engine...");
    }

    public void stop() { // Method
        System.out.println("Stopping engine...");
    }

    public void move() { // Method
        System.out.println("Moving car with brand " + this.brand +
                " and model " + this.model +
                " and color " + this.color);
    }

}
