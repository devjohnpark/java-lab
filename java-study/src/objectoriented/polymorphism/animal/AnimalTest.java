package objectoriented.polymorphism.animal;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.x); // Animal 클래스의 인스턴스 변수 x 값 출력
        animal.makeSound(); // 10 Animal sound 출력

        animal = new Dog(); // 부모 클래스 참조 변수로 자식 클래스 인스턴스를 참조
        System.out.println(animal.x); // Animal 클래스의 인스턴스 변수 x 값 출력
        animal.makeSound(); // 100 Woof 출력

        animal = new Cat(); // 다른 자식 클래스 인스턴스를 참조
        System.out.println(animal.x); // Animal 클래스의 인스턴스 변수 x 값 출력
        animal.makeSound(); // 1000 Meow 출력



    }
}

