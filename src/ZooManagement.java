import java.util.ArrayList;
// Superclass Animal
abstract class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

// Subclass Mammal
class Mammal extends Animal {
    public  int numberOfOffspring;

    public Mammal(String name, int age, int numberOfOffspring) {
        super(name, age);
        this.numberOfOffspring = numberOfOffspring;
    }

    public void nurse() {
        System.out.println(name + " is nursing " + numberOfOffspring + " offspring.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes a mammal sound.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Offspring: " + numberOfOffspring;
    }
}

// Subclass Bird
class Bird extends Animal {
    public  double wingSpan;

    public Bird(String name, int age, double wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }

    public void layEggs() {
        System.out.println(name + " is laying eggs.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Wing Span: " + wingSpan;
    }
}

// Subclass Reptile
class Reptile extends Animal {
    public  double tailLength;

    public Reptile(String name, int age, double tailLength) {
        super(name, age);
        this.tailLength = tailLength;
    }

    public void shedSkin() {
        System.out.println(name + " is shedding skin.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes a reptile sound.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Tail Length: " + tailLength;
    }
}

// Zoo class
class Zoo {
    public  ArrayList<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.name + " has been added to the zoo.");
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
        System.out.println(animal.name + " has been removed from the zoo.");
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void makeAllAnimalsSound() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

// Main class to test the zoo management system
public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Mammal lion = new Mammal("Lion", 5, 3);
        Bird parrot = new Bird("Parrot", 2, 0.5);
        Reptile snake = new Reptile("Snake", 4, 1.5);

        zoo.addAnimal(lion);
        zoo.addAnimal(parrot);
        zoo.addAnimal(snake);

        System.out.println("\nDisplaying all animals in the zoo:");
        zoo.displayAnimals();

        System.out.println("\nMaking all animals sound:");
        zoo.makeAllAnimalsSound();

        System.out.println("\nSpecific actions:");
        lion.nurse();
        parrot.layEggs();
        snake.shedSkin();
    }
}
