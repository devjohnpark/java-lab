package objectoriented.inheritance;

public interface Animal2 {
    void makeSound();
    void move();

    default void eat() {
        System.out.println("This animal is eating.");
    }

    // Static method in the interface
    static void sleep() {
        System.out.println("This animal is sleeping.");
    }
}