package cn.com.logback.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

public class LogbackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = LoggerFactory.getLogger(LogbackTest.class);
		for(int i=0;i<10000;i++){
			
			logger.debug("Hello world.");
		}
		
		// print internal state
		/*LoggerContext lc = (LoggerContext)
		LoggerFactory.getILoggerFactory();
		StatusPrinter.print(lc);*/
	}

}
