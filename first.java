class Student {
    String name;
    int age;
   
    public void getInfo() {
        System.out.println("The name of this Student is " + this.name);
        System.out.println("The age of this Student is " + this.age);
    }
 }
 
 
 public class first {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Diksha";
        s1.age = 19;
        s1.getInfo();
 
 
        Student s2 = new Student();
        s2.name = "Ayush Shivam";
        s2.age = 19;
        s2.getInfo();
    }
 }
 