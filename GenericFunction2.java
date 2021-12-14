class DemoClass {
    public <T> void genericsMethod(T data) {
        System.out.println("Data Passed: " + data);
    }
}

public class GenericFunction2 {

    public static void main(String[] args) {
        DemoClass demo = new DemoClass();

        demo.<String>genericsMethod("Java Programming");

        demo.<Integer>genericsMethod(25);

    }

}