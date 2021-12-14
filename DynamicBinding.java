class Animal5 {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

public class DynamicBinding extends Animal5 {
    void eat() {
        System.out.println("Dog is eating...");
    }

    public static void main(String[] args) {
        Animal5 a = new DynamicBinding();
        a.eat();

    }

}
// Animal a -> compile
// DynamicBinding -> runtime
