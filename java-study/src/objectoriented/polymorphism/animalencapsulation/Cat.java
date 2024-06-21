package objectoriented.polymorphism.animalencapsulation;

class Cat extends Animal {
    private int x = 1000;

    // 인스턴스 변수에 접근하는 메서드
//    @Override
    public int getX() {
        return x;
    }

//    @Override
    public void makeSound() {
        System.out.println(getX() + ", " + "Meow\n");
    }
}