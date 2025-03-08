// Base class
class Animal {
    // Method in base class (this will be overridden in the subclass)
    public void sound() {
        System.out.println("The animal makes a sound.");
    }
}

// Derived class (inherits Animal class)
class Dog extends Animal {
    // Overriding the sound method for Dog
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

// Another Derived class (inherits Animal class)
class Cat extends Animal {
    // Overriding the sound method for Cat
    @Override
    public void sound() {
        System.out.println("The cat meows.");
    }
}

// Class demonstrating Compile-time Polymorphism (Method Overloading)
class Calculator {
    // Overloaded method for addition of two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method for addition of three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method for addition of two double values
    public double add(double a, double b) {
        return a + b;
    }
}

public class polymorphism  {
    public static void main(String[] args) {
        // Compile-time Polymorphism: Method Overloading
        Calculator calc = new Calculator();
        System.out.println("Sum of two integers: " + calc.add(5, 10));      // Calls add(int, int)
        System.out.println("Sum of three integers: " + calc.add(5, 10, 15)); // Calls add(int, int, int)
        System.out.println("Sum of two doubles: " + calc.add(5.5, 7.5));    // Calls add(double, double)

        // Run-time Polymorphism: Method Overriding
        Animal myAnimal = new Animal();  // Base class reference
        myAnimal.sound();                // Calls Animal's sound method

        Animal myDog = new Dog();        // Base class reference, Dog object
        myDog.sound();                   // Calls Dog's overridden sound method

        Animal myCat = new Cat();        // Base class reference, Cat object
        myCat.sound();                   // Calls Cat's overridden sound method
    }
}
