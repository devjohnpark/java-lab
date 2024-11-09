package annotation;

import java.lang.annotation.Annotation;


public class AnnotationTest {
    public static void main(String[] args) {
        try {
            // MyClass의 Class 객체 가져오기
            Class<MyClass> clazz = MyClass.class;
//            MyClass myClass = new MyClass();
//            System.out.println(myClass.getClass().get);

            // Annotation 타입 출력
            Annotation[] annotations = clazz.getAnnotations();
            for (Annotation a : annotations) {
                System.out.println(a.annotationType());
            }

            // 클래스에 선언된 애노테이션 가져오기
            MyAnnotation annotation = clazz.getAnnotation(MyAnnotation.class);

            // 애노테이션이 적용되어 있는지 확인
            if (annotation != null) {
                // value 값 출력
                System.out.println("Annotation value: " + annotation.value());
                System.out.println(annotation.getClass());
            } else {
                System.out.println("MyAnnotation is not present.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
