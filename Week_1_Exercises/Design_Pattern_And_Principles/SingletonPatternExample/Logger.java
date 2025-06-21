package digital.nurture;

public class Logger {
	  private static Logger instance;

	    // Step 2: Private constructor to prevent instantiation
	    private Logger() {
	        System.out.println("Logger Initialized");
	    }

	    // Step 3: Public method to provide access to the single instance
	    public static Logger getInstance() {
	        if (instance == null) {
	            instance = new Logger();  // create instance only once
	        }
	        return instance;
	    }

	    
	    public void log(String message) {
	        System.out.println("[LOG] " + message);
	    }
}
