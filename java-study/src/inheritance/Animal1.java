package inheritance;

public interface Animal1 {
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
