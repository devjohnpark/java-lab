package objectoriented.polymorphism.animal;

class Dog extends Animal {
    int x = 100;

    void makeSound() {
        System.out.println(x + ", " + "Woof\n");
    }
}
