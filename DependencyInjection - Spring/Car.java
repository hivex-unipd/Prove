package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component("Car")
public class Car {
	
	String getEngine(){
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Engine e = (Engine)context.getBean("Ferrari");
		return e.toString();
	}
}