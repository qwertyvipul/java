/*
 * Show all annotations from a class and a method
 * */

package annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno2{
	String str();
	int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What{
	String description();
}

@What(description = "An annotation test class.")
@MyAnno2(str = "Testing", val = 99)
class ObtainAllAnnotations{
	@What(description = "An annotation test method")
	@MyAnno2(str = "Testing", val = 100)
	public static void myMethod() {
		try {
			//class annotations
			Annotation annos[] = (new ObtainAllAnnotations()).getClass().getAnnotations();
			System.out.println("All annotations for the class - ");
			for(Annotation a : annos) System.out.println(a);
			
			//method annotations
			annos = (new ObtainAllAnnotations()).getClass().getMethod("myMethod").getAnnotations();
			System.out.println("All annotations for the method - ");
			for(Annotation a : annos) System.out.println(a);
		}catch(NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		myMethod();
	}
}
