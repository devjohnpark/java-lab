package objectoriented.polymorphism.inner;

public class Annonymous {
    Object instanceVariable = new Object() {
        void method() {
            System.out.println("Annonymous class method");
        }
    };
    static Object staticVariable = new Object() {
        void method() {
            System.out.println("Annonymous class method");
        }
    };

    void instanceMethod() {
        Object instanceVariable = new Object() {
            void method() {
                System.out.println("Annonymous class method");
            }
        };
    }
}
