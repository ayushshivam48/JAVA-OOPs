class Pen {
    String color;
    String brand;

    // Default Constructor (no parameters)
    public Pen() {
        this.color = "Black";   
        this.brand = "Link Glacier";
        System.out.println("Default constructor called.");
    }

    // Parameterized Constructor (with parameters)
    public Pen(String color, String brand) {
        this.color = color;       
        this.brand = brand;
        System.out.println("Parameterized constructor called.");
    }

    // Copy Constructor (takes an object of the same class as a parameter)
    public Pen(Pen pen2) {
        this.color = pen2.color;   
        this.brand = pen2.brand;
        System.out.println("Copy constructor called.");
    }

    // Method to print details of the Pen
    public void printDetails() {
        System.out.println("Pen Color: " + this.color + ", Brand: " + this.brand);
    }
}

public class constructor {
    public static void main(String[] args) {
        // Using Default Constructor
        Pen pen1 = new Pen();
        pen1.printDetails();  // Should show default values

        // Using Parameterized Constructor
        Pen pen2 = new Pen("Blue", "Parker");
        pen2.printDetails();  // Should show the values passed in

        // Using Copy Constructor
        Pen pen3 = new Pen(pen2);  // Copy details of pen2 to pen3
        pen3.printDetails();  // Should show the same values as pen2
    }
}
