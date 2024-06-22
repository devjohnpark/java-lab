package objectoriented.polymorphism.animalencapsulation;

class Cat extends Animal {
    private int x = 1000;

    public int getX() {
        return x;
    }

    public void makeSound() {
        System.out.println(getX() + ", " + "Meow\n");
    }
}