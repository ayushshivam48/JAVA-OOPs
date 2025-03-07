// Interface representing a generic Animal
interface Animal {
    // Abstract methods (no implementation)
    void makeSound();
    void move();
}

// Concrete class Dog that implements the Animal interface
class Dog implements Animal {

    // Providing implementation for the abstract method makeSound()
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    // Providing implementation for the abstract method move()
    @Override
    public void move() {
        System.out.println("Dog runs");
    }
}

// Concrete class Bird that implements the Animal interface
class Bird implements Animal {

    // Providing implementation for the abstract method makeSound()
    @Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }

    // Providing implementation for the abstract method move()
    @Override
    public void move() {
        System.out.println("Bird flies");
    }
}

public class Interface {
    public static void main(String[] args) {
        // Creating objects of concrete classes
        Animal dog = new Dog();
        Animal bird = new Bird();

        // Calling methods defined in the interface
        dog.makeSound();  // Calls Dog's makeSound method
        dog.move();  // Calls Dog's move method

        bird.makeSound();  // Calls Bird's makeSound method
        bird.move();  // Calls Bird's move method
    }
}
