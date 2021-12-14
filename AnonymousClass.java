class Polygon1 {
    public void display() {
        System.out.println("Inside the Polygon class");
    }
}

class AnonymousDemo {
    public void createClass() {
        Polygon1 p1 = new Polygon1() {
            public void display() {
                System.out.println("Inside an anonymous class.");
            }
        };
        p1.display();
    }
}

public class AnonymousClass {

    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();

    }

}
