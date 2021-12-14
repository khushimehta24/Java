interface Polygon {
    void getArea(int length, int breadth);
}

class Rectangle implements Polygon {
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}

public class Interface {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(5, 6);
    }

}

// extends -> Inheritance
// implents -> Interface

// In interface we can declare implemented method in our class

// PROBLEM OF INTERFACE
// To create object of interface firstly we need to create different class with
// interface implementation
