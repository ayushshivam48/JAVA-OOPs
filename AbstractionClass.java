// Abstract class representing a generic Shape
abstract class Shape {

    // Abstract method (no implementation)
    abstract void draw();

    // Concrete method (has implementation)
    public void printShapeType() {
        System.out.println("This is a shape.");
    }
}

// Concrete class Circle that extends abstract class Shape
class Circle extends Shape {

    // Providing implementation for the abstract method draw()
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Concrete class Rectangle that extends abstract class Shape
class Rectangle extends Shape {

    // Providing implementation for the abstract method draw()
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class AbstractionClass {
    public static void main(String[] args) {
        // Creating objects of concrete classes
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        // Calling abstract and concrete methods
        circle.draw();  // Calls Circle's draw method
        circle.printShapeType();  // Calls concrete method from abstract class

        rectangle.draw();  // Calls Rectangle's draw method
        rectangle.printShapeType();  // Calls concrete method from abstract class
    }
}
