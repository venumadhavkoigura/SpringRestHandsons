package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    private String code;
    private String name;
    
    private final static Logger LOGGER =LoggerFactory.getLogger(Country.class);
    
    public Country() {
    	LOGGER.info("inside Country Constructor");
    }
    
    public Country(String code,String name) {
    	super();
    	this.code=code;
    	this.name=name;	
    }

	public String getCode() {
		LOGGER.info("Inside getCode method");
		return code;
	}

	public void setCode(String code) {
		LOGGER.info("Inside setCode method");
		this.code = code;
	}

	public String getName() {
		LOGGER.info("Inside getName method");
     	return name;
	}

	public void setName(String name) {
		LOGGER.info("Inside setName method");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}
    
    
}
