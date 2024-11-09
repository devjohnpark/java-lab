package objectoriented.polymorphism.animalencapsulation;


public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.getX()); // 10
        animal.makeSound(); // 10, Animal sound

        animal = new Dog();
        System.out.println(animal.getX()); // 100
        animal.makeSound(); // 100, Woof

        animal = new Cat();
        System.out.println(animal.getX()); // 1000
        animal.makeSound(); // 1000, Meow

        Dog dog = new Dog();
        System.out.println(dog.getX()); // 100
        dog.makeSound(); // 100, Woof

        Cat cat = new Cat();
        System.out.println(cat.getX()); // 1000
        cat.makeSound(); // 1000, Meow
    }
}
