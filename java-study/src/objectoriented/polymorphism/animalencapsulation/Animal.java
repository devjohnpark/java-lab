package objectoriented.polymorphism.animalencapsulation;

class Animal {
    private int x = 10;

    public int getX() {
        return x;
    }

    public void makeSound() {
        System.out.println(getX() + ", " + "Animal sound\n");
    }
}