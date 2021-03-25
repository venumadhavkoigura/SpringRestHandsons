package com.cognizant.springlearn.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.exception.CountryNotFoundException;
import com.cognizant.springlearn.service.CountryService;

@RestController
public class CountryController {
	public static Logger LOGGER=LoggerFactory.getLogger(CountryController.class);
	
	@Autowired
	public CountryService countryService;
	
	@RequestMapping("/country")
	public Country getCountryIndia() {
		LOGGER.info("Inside Controller getCountryIndia");
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		Country country=context.getBean("in",Country.class);
		return country;
	}
	
	@GetMapping("/countries")
	public List<Country> getAllCountries(){
		LOGGER.info("inside Controller getAllCountries");
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		List<Country> countries =(List<Country>)context.getBean("countryList");
		return countries;
	}
	
	@GetMapping("/countries/{code}")
	public Country getCountry(@PathVariable String code) throws CountryNotFoundException {
		LOGGER.info("Inside Controller getCountry");
		Country country=countryService.getCountry(code);
		return country;
	}
	
	
}
