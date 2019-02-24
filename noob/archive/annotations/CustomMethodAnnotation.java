package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MethodAnno{
	int one() default -1;
	int two() default -2;
}

public class CustomMethodAnnotation{
	
	@MethodAnno(one = 1, two = 2)
	public static void printNum() {
		CustomMethodAnnotation custom = new CustomMethodAnnotation();
		Class<?> c = custom.getClass();
		try {
			/*
			Method m = c.getMethod("printNum");
			MethodAnno anno = m.getAnnotation(MethodAnno.class);
			*/
			MethodAnno anno = (new CustomMethodAnnotation()).getClass()
					.getMethod("printNum").getAnnotation(MethodAnno.class);
			System.out.println("ONE = " + anno.one());
			System.out.println("TWO = " + anno.two());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		printNum();
	}

}
