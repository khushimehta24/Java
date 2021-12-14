class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

public class Method_Overriding extends Vehicle {
    void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Method_Overriding obj = new Method_Overriding();
        obj.run();
    }
}
// Parent class is also known as Super class and child class is known as sub
// class
// Rule 1
// The method of Child class must have same name as in Parent class method
// Rule 2
// Method of child class must have same parameter as in parent class
// Rule 3
// There must be inheritance(IS-A RELATIONSHIP)
