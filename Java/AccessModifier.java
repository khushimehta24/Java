class MyClass2 {
    public int num1;
    private int num2;

    public MyClass2() {
        num1 = 100;
    }

    private void Allocator() {
        num2 = 200;
    }

    public void newClass2() {
        Allocator();
        System.out.println("Value of num2 is: " + num2);
    }
}

public class AccessModifier {

    public static void main(String[] args) {
        MyClass2 t1 = new MyClass2();
        MyClass2 t2 = new MyClass2();
        System.out.println(t1.num1 + " " + t2.num1);

        t1.newClass2();
    }

}