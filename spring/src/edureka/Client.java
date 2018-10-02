package edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("Employees.xml");
		Employee e = (Employee) context.getBean("emp");
		
		System.out.println("Employee Details: " + e);
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext)context;
		ctx.close();
	}
}
