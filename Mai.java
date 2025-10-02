class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
    void bark() {
        System.out.println("Animal-specific method: bark");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog barks");
    }

    void bark() {
        System.out.println("Dog-specific method: bark");
    }
}

public class Mai {
    public static void main(String[] args) {
        Animal obj1 = new Dog();  // Parent reference, child object
        Dog obj2 = new Dog();     // Child reference, child object

        // Polymorphism: Calls Dog's speak method due to runtime binding
        obj1.speak();  // Output: "Dog barks"

        // Access Dog-specific method (downcasting required)
        obj1.bark();  // Output: "Dog-specific method: bark"

        // Direct access without downcasting
        obj2.speak();  // Output: "Dog barks"
        obj2.bark();   // Output: "Dog-specific method: bark"
    }
}
