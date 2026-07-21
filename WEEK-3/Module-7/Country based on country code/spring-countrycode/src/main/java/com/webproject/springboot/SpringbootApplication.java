package com.webproject.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
		
	//displayCountry();
}
public static void displayCountry() {

	ApplicationContext context =
			new ClassPathXmlApplicationContext("country.xml");

	Country country = context.getBean("country", Country.class);

	System.out.println(country);

}
}
