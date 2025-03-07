// Class declared as public: it can be accessed from anywhere
public class modifiers {
    
    // public variable: accessible from anywhere
    public String publicVar = "I am public";

    // protected variable: accessible within the same package or subclasses
    protected String protectedVar = "I am protected";

    // default (package-private) variable: accessible only within the same package
    String defaultVar = "I am default (package-private)";

    // private variable: accessible only within this class
    private String privateVar = "I am private";

    // public method: can be accessed from anywhere
    public void publicMethod() {
        System.out.println("Public method: " + publicVar);
    }

    // protected method: can be accessed within the same package or by subclasses
    protected void protectedMethod() {
        System.out.println("Protected method: " + protectedVar);
    }

    // default (package-private) method: accessible within the same package
    void defaultMethod() {
        System.out.println("Default (package-private) method: " + defaultVar);
    }

    // private method: can only be accessed within this class
    private void privateMethod() {
        System.out.println("Private method: " + privateVar);
    }

    // Method to show access to private members within the same class
    public void showPrivateAccess() {
        privateMethod();  // Private method can be called within the same class
        System.out.println("Accessing private variable within the class: " + privateVar);
    }

    public static void main(String[] args) {
        modifiers example = new modifiers();

        // Accessing public member
        example.publicMethod();  // Accessible from anywhere
        System.out.println(example.publicVar);  // Accessible from anywhere

        // Accessing protected member
        example.protectedMethod();  // Accessible within the same package or through inheritance
        System.out.println(example.protectedVar);  // Accessible within the same package

        // Accessing default member
        example.defaultMethod();  // Accessible within the same package
        System.out.println(example.defaultVar);  // Accessible within the same package

        // Accessing private member indirectly through a public method
        example.showPrivateAccess();  // Only private methods can be accessed within the class
        // System.out.println(example.privateVar); // Error: Not accessible outside the class
    }
}
