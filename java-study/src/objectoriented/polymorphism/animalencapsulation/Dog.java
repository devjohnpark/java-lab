package objectoriented.polymorphism.animalencapsulation;

class Dog extends Animal {
    private int x = 100;

    public int getX() {
        return x;
    }
    
    public void makeSound() {
        System.out.println(getX() + ", " + "Woof\n");
    }
}
