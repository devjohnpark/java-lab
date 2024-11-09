package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)  // 런타임에 접근할 수 있도록 설정
@interface MyAnnotation {
    String value();
}
