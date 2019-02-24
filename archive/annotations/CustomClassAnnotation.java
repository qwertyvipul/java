package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface OS{
	String name() default "Windows";
	double version() default 10;
}

@OS(name = "Ubuntu", version = 16.04)
class Ubuntu{
	final String kernel = "Linux";
	void printDetails() {
		/*
		Ubuntu u = new Ubuntu();
		Class<?> c = u.getClass();
		OS anno = c.getAnnotation(OS.class);
		*/
		OS anno = (new Ubuntu()).getClass().getAnnotation(OS.class);
		
		System.out.println("Name = " + anno.name());
		System.out.println("Version = " + anno.version());
		System.out.println("Kernel = " + this.kernel);
	}
}

public class CustomClassAnnotation {

	public static void main(String[] args) {
		Ubuntu u = new Ubuntu();
		u.printDetails();
	}

}
