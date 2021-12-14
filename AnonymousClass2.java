interface Polygon2 {
    public void display();
}

class AnonymousDemo1 {
    public void createClass() {
        Polygon2 p1 = new Polygon2() {
            public void display() {
                System.out.println("Inside an Anonymous Class.");
            }
        };
        p1.display();
    }
}

public class AnonymousClass2 {

    public static void main(String[] args) {
        AnonymousDemo1 an = new AnonymousDemo1();
        an.createClass();

    }

}
