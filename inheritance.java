// Interface 1
interface ElectricVehicle {
    public void charge();
}

// Interface 2
interface FuelVehicle {
    public void refuel();
}

// Base class
class Vehicle {
    public void startEngine() {
        System.out.println("The engine is starting...");
    }
}

// Derived class using hybrid inheritance
// Car class inherits from Vehicle class (Single inheritance) and implements two interfaces (Multiple inheritance)
class HybridCar extends Vehicle implements ElectricVehicle, FuelVehicle {
    public void charge() {
        System.out.println("Charging the car battery...");
    }

    public void refuel() {
        System.out.println("Refueling the car...");
    }

    public void drive() {
        System.out.println("The hybrid car is driving...");
    }
}

public class inheritance {
    public static void main(String[] args) {
        HybridCar myHybridCar = new HybridCar();
        myHybridCar.startEngine();  // Inherited from Vehicle class
        myHybridCar.charge();       // From ElectricVehicle interface
        myHybridCar.refuel();       // From FuelVehicle interface
        myHybridCar.drive();        // Defined in HybridCar class
    }
}
