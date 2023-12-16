
class Animal {

    //Method in superclass to make animal sound.
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Dog is a subclass of animal
class Dog extends Animal {
    
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

//Cat is subclass of animal.
class Cat extends Animal {
    
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

//Main class.
public class AnimalEg{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animal = new Animal();

        // Displaying sounds of each object
        dog.makeSound(); // Output: The dog barks.
        cat.makeSound(); // Output: The cat meows.
        animal.makeSound(); //output: The animal makesound.
    }
}