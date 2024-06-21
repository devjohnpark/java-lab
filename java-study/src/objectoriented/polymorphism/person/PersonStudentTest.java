package objectoriented.polymorphism.person;

public class PersonStudentTest {
    public static void main(String[] args) {
        Person p = new Student("Sujin", 21, "CS", 0);
        Student s = new Student("Minsu", 20, "CS", 1);

        p = s; // 자식 타입 부모 타입으로 업 캐스팅 (타입 캐스팅 생략)
        s = (Student) p; // 부모 타입 자식 타입으로 다운 캐스팅 (타입 캐스팅 생략 불가)

        Person person = new Person("Sujin", 21);
        Student student = new Student("Minsu", 20, "CS", 1);

        student = (Student) person; // ClassCastException

//        System.out.println(student.major);

//        System.out.println(p.name + p.major); // compile error
//        System.out.println(s.name + s.major);
    }
}
