package fr.jmottez.lessons.spring.spring4;

import fr.jmottez.lessons.spring.spring4.service.AService;
import fr.jmottez.lessons.spring.spring4.service.APropotypeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunnerApplication {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringAppConfiguration.class);

		AService aService = (AService) context.getBean("AService");
		aService.callBService();

		aService.setValue("any Value AService");
		System.out.println("AService:" + aService.getValue());

		aService = (AService) context.getBean("AService");
		System.out.println("AService:" + aService.getValue());

		APropotypeService aPropotypeService = (APropotypeService) context.getBean("a_prototype_service");
		aPropotypeService.callBService();

		aPropotypeService.setValue("any Value APropotypeService");
		System.out.println("ASingletonService:" + aPropotypeService.getValue());
		aPropotypeService = (APropotypeService) context.getBean("a_prototype_service");
		System.out.println("ASingletonService:" + aPropotypeService.getValue());

	} 

}
