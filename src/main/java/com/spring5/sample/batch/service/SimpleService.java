package com.spring5.sample.batch.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleService {

	private final static Logger logger = LoggerFactory.getLogger(SimpleService.class);
	
	public void printHelloWorld(){
		logger.info("Hello World");
	}
	
	public void sleepFor10seconds() throws InterruptedException{
		logger.info("Sleep Start");
		Thread.sleep(8000);
		logger.info("Sleep End");
	}
}
