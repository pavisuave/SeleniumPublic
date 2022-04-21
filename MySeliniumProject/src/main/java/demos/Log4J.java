package demos;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4J {
	
	
	//instance for logger class
	private static Logger logger=LogManager.getLogger(Log4J.class);

	public static void main(String[] args) {
		
     System.out.println("\n  My new Logger Project....\n");
      
      logger.info("this id information message");
      logger.debug("this is debug message");
      logger.error("this is error message");
      logger.warn("this is warner message");
      logger.fatal("this is fatal message");
     
      System.out.println("completed");
	}

}
