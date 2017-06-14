package fr.jmottez.lessons.spring.spring4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AService {

	@Autowired
	private BService bService;

	public void callBService() {
		bService.call();
	}

}
