package in.madhu.junit_practice;


import org.slf4j.*;

public class LoggerUtil {
	 private static final Logger logger = LoggerFactory.getLogger(LoggerUtil.class);

	    public static void main(String[] args) {
	        logger.info("App started");
	        logger.warn("This is a warning");
	        logger.error("Oops! Something went wrong");
	    }
}
