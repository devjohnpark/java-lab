package objectoriented.polymorphism.casting;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

