package com.hrms.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j {
	
	private static Logger log = LogManager.getLogger(Log4j.class);

	public static void main(String[] args) {
		
		System.out.println("\n helloworld.... \n");
		
		log.trace("this trace message");
		log.info("this message is info ");
		log.warn("this warn message");
		log.error("this error is info ");
		log.fatal("this fatal message");
		
		System.out.println("completed");

	}

}
