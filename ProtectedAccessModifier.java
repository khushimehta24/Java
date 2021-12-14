import pack.A2;

class A {
    void display() {
        System.out.println("Hello World!!");
    }
}

public class ProtectedAccessModifier extends A2 {

    public static void main(String[] args) {
        ProtectedAccessModifier obj = new ProtectedAccessModifier();
        obj.display();

        A obj1 = new A();
        obj1.display();

        A2 obj2 = new A2();
        // obj2.display();

    }

}

// PROTECTED IS ONLY ACCESSABLE BY SUB CLASS
