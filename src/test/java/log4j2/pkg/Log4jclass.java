package log4j2.pkg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Log4jclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Logger Log=(Logger) LogManager.getLogger();   
    System.out.println(" thid is logger");
    
    Log.info("for info only");
    Log.debug("for info only");
    Log.error("for info only");
	}

}
