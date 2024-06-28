package objectoriented.polymorphism.inner;

public class AnnonymousExample {
    // Annonymous Class
    Object instanceVariable = new Object() {
        void method() {
            System.out.println("AnnonymousExample class method");
        }
    };

    // Annonymous Class
    static Object staticVariable = new Object() {
        void method() {
            System.out.println("AnnonymousExample class method");
        }
    };

    void instanceMethod() {
        // Annonymous Class
        Object instanceVariable = new Object() {
            void method() {
                System.out.println("AnnonymousExample class method");
            }
        };
    }
}
