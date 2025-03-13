package AbstractClass;

// Concrete subclass Dog that extends Animal
class Dog extends AbstractClass {
    // Overriding makeSound method
    @Override
    void makeSound() {
        System.out.println("The Dog is barking...");
    }
}
