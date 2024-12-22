// File: Main.java
// Demonstrating Class, Object, State, and Methods in Java

// Class definition (blueprint for objects)
class Car {
    // State (Instance Variables)
    String color;
    String model;

    // Method (Behavior)
    void start() {
        System.out.println(model + " is starting.");
    }

    void stop() {
        System.out.println(model + " is stopping.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object (Instance of a class)
        Car myCar = new Car();

        // Setting state (attributes)
        myCar.color = "Red";
        myCar.model = "Tesla Model S";

        // Invoking methods
        myCar.start();
        myCar.stop();
    }
}
