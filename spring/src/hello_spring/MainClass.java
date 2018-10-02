package hello_spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {
	public static void main(String args[]) {
		//Object Construction | Done By Developer
		/*
		HelloSpring h1 = new HelloSpring();
		h1.setVal(101);
		h1.setName("Rachel");
		System.out.println("h1 = " + h1);
		*/
		
		//Spring Way | IOC (Inversion Of Control)
		/*
		//DEPRECATED
		Resource resource = new ClassPathResource("Beans.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
		
		HelloSpring h2 = (HelloSpring)factory.getBean("h2");
		HelloSpring h3 = factory.getBean("h3", HelloSpring.class);
		
		System.out.println("h2 = " + h2);
		System.out.println("h3 = " + h3);
		*/
		
		//All Objects Constructed
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloSpring h4 = (HelloSpring)context.getBean("h4");
		
		System.out.println("h4 = " + h4);
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();
		
	}
}
