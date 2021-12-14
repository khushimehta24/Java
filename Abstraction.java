abstract class Animal1 {
    abstract void makeSound();
}

class Dog1 extends Animal1 {
    public void makeSound() {
        System.out.println("Bark bark. ");
    }
}

class Cat extends Animal1 {
    public void makeSound() {
        System.out.println("Meows ");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        Animal1 d1 = new Dog1();
        d1.makeSound();

        Animal1 c1 = new Cat();
        c1.makeSound();
    }

}