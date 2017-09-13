package javatpoint.java5.features;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target({ TYPE, METHOD })
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation1 {
}

@Target({ LOCAL_VARIABLE, FIELD })
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2 {
	int value() default 10;
}

@Inherited
@Target({ METHOD, TYPE })
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3 {
	String value2()

	default "cool";

	String value3();
}

@MyAnnotation3(value2 = "v2", value3 = "v3")
class AnnotationClass {
	@MyAnnotation2(value = 100)
	int i;

	@MyAnnotation1
	@MyAnnotation3(value2 = "hot", value3 = "damn")
	public void m2() {
		@MyAnnotation2(value = 20)
		int j;
		System.out.println("This is cool..");
	}
}

class SubClass extends AnnotationClass {

	public void m2() {
		System.out.println("tshst");
	}
}

public class AnnotationExample {

	public static void main(String[] args) throws Exception {

		AnnotationClass example = new AnnotationClass();
		Method m1 = example.getClass().getMethod("m2");
		MyAnnotation3 annotation3 = m1.getAnnotation(MyAnnotation3.class);
		System.out.println("Value2= " + annotation3.value2() + ", Value3=" + annotation3.value3());

		/*SubClass subClass = new SubClass();
		Method m2 = subClass.getClass().getMethod("m2");
		MyAnnotation3 annotation4 = m2.getAnnotation(MyAnnotation3.class);
		System.out.println("Value2= " + annotation4.value2() + ", Value3=" + annotation4.value3());*/
	}
}