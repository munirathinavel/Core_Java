package javatpoint.java5.features;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@interface Annotation007 {
	String printMessage() default "Hello There!";
}

@Annotation007
class SampleClass {
	int i = 10;

	@Annotation007(printMessage = "Message from Method..")
	public void m1() {
		System.out.println("This is m1..");
	}
}

public class ClassLevelAnnotation {

	public static void main(String[] args) throws Exception {
		SampleClass sampleClass = new SampleClass();

		Class<SampleClass> classAnnotation = SampleClass.class;

		readAnnotations(classAnnotation);

		Method methodAnnotation = classAnnotation.getMethod("m1");

		readAnnotations(methodAnnotation);
		
	  
	}

	private static void readAnnotations(AnnotatedElement element) {

		System.out.println("Element Name" + element.getClass().getName());

		Annotation[] annotations = element.getAnnotations();
		for (Annotation annotation : annotations) {
			if (annotation instanceof Annotation007) {
				Annotation007 annotation007 = (Annotation007) annotation;
				System.out.println("Printing Message" + annotation007.printMessage());
			}
		}
	}
}
