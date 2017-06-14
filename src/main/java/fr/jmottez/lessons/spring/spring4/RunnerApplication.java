package fr.jmottez.lessons.spring.spring4;

import fr.jmottez.lessons.spring.spring4.service.AService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunnerApplication {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringAppConfiguration.class);

		AService aService = (AService) context.getBean("AService");
		aService.callBService();

	}

}
