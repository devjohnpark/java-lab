package objectoriented.polymorphism.animalencapsulation;

class Dog extends Animal {
    private int x = 100;

    // 인스턴스 변수에 접근하는 메서드
//    @Override
    public int getX() {
        return x;
    }

//    @Override
    public void makeSound() {
        System.out.println(getX() + ", " + "Woof\n");
    }
}
