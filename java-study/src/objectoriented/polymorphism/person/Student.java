package objectoriented.polymorphism.person;

class Student extends Person {
    String major;
    int studentId;

    Student(String name, int age, String major, int studentId) {
        super(name, age); // 부모 클래스의 생성자 호출
        this.major = major;
        this.studentId = studentId;
    }

    void printStudentInfo() {
        System.out.println("Student ID: " + studentId + ", Major: " + major);
    }
}