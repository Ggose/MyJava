package p01.annotaions;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)//유지정책 - annnotation정보를 유지하는 기간
@Target(METHOD)//annotation을 적용하는 대상
public @interface PrintAnnotaion {
	String value() default "-";//기본 element
	int number() default 15;
}
