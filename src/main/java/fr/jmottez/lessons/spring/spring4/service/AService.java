package fr.jmottez.lessons.spring.spring4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "singleton")
public class AService {

	@Autowired
	private BService bService;

	private String value = "";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void callBService() {
		bService.call();
	}

}
