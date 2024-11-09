package designpattern.proxy.dynamicproxy.gglib.transactional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
@Retention(RetentionPolicy.RUNTIME): 애노테이션이 런타임 동안 유지되도록 하며, 리플렉션을 통해 애노테이션 정보를 조회할 수 있도록 설정 (리플렉션을 통해 런타임에 클래스, 메서드, 필드, 그리고 애노테이션과 같은 메타데이터에 접근 가능)
@Target(ElementType.METHOD): 애노테이션을 특정 메서드에 타겟할 수 있도록 설정
@Target(ElementType.TYPE): 애노테이션을 특정 클래스, 인터페이스 또는 열거형에 타겟 할수 있도록 설정
AnnotationTest 인터페이스 이며,
애노테이션은 @interface 키워드를 사용하여 선언되며, 내부적으로는 java.lang.annotation.AnnotationTest 인터페이스를 확장하는 특수한 인터페이스입니다.
Annotation은 클래스, 메서드, 필드, 매개변수 등에 메타데이터를 제공하는 역할을 한다.

 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Transactional {
}

