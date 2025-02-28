
class Animal {
    // Parent class method
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overridden method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overridden method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class RunPolymorphism {
    public static void main(String[] args) {
        // Parent class reference holding subclass objects
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calls the overridden methods at runtime
        myDog.sound();  // Output: Dog barks
        myCat.sound();  // Output: Cat meows
    }
}

