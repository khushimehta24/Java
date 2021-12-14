class Animal {
    String name;

    public void eat() {
        System.out.println("I can eat");
    }
}

class Dog extends Animal {
    public void display() {
        System.out.println("My name is " + name);
    }
}

class Inheritance {

    public static void main(String[] args) {
        Dog labrador = new Dog();

        labrador.name = "Rohu";
        labrador.display();

        labrador.eat();

    }
}

// In inheritance we can call method or member of parent class using child class
// object
// It is neccesary to extend parent class after child class
