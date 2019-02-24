package annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

//An annotation type declaration
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
	String str();
	int val();
}

public class FirstAnno {
	
	//Annotate a method
	@MyAnno(str = "First Annotation", val=100)
	public static void myFunc() {
		FirstAnno f = new FirstAnno();
		
		//Obtain the annotation for this method and display the values
		try {
			//Get a class object that represents this class
			Class<?> c = f.getClass();
			
			//A method object that represents this method
			Method m = c.getMethod("myFunc");
			
			//Get the annotation for this method
			MyAnno anno = m.getAnnotation(MyAnno.class);
			
			//Display the values
			System.out.println(anno.str() + "; " + anno.val());
		}catch(NoSuchMethodException e) {
			System.out.println("Mehtod not found exception");
		}
	}

	public static void main(String[] args) {
		myFunc();
	}

}
