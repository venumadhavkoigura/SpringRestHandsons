package com.cognizant.springlearn;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER =LoggerFactory.getLogger(SpringLearnApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		
		displayCountry();
		displayCountries();
		
	}

	private static void displayCountry() {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		Country country=(Country)context.getBean("country",Country.class);
		Country anotherCountry=(Country)context.getBean("country",Country.class);
		
		LOGGER.info("Country : {}",country.toString());
		LOGGER.info("Country : {}",anotherCountry.toString());

	}

	private static void displayCountries() {
		// TODO Auto-generated method stub
		
		LOGGER.info("start");
		ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		ArrayList<Country> countryList=(ArrayList<Country>) context.getBean("countryList");
		LOGGER.info("CountryList : {}",countryList.toString());
		LOGGER.info("End");
		
	}

}
