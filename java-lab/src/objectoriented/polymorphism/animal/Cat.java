package objectoriented.polymorphism.animal;

class Cat extends Animal {
    int x = 1000;

    void makeSound() {
        System.out.println(x + ", " + "Meow\n");
    }
}
