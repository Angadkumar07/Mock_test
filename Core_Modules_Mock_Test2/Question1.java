package Core_Modules_Mock_Test2;



// Superclass
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

// Subclass 3
class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cow mooes");
    }
}

// Main class
public class Question1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); 

        Animal dog = new Dog();
        dog.makeSound(); 

        Animal cat = new Cat();
        cat.makeSound(); 

        Animal cow = new Cow();
        cow.makeSound(); 
    }
}
