package objectoriented.polymorphism.animalencapsulation;

class Animal {
    private int x = 10;

    // 인스턴스 변수에 접근하는 메서드
    public int getX() {
        return x;
    }

    public void makeSound() {
        System.out.println(getX() + ", " + "Animal sound\n");
    }
}