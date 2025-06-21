package digital.nurture;

public class Main {
	public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started");
        logger2.log("Performing some operation...");

        
        // Check if both loggers are same instance
        if (logger1 == logger2) {
            System.out.println("Only one instance of Logger is used.");
        } else {
            System.out.println("Different instances of Logger found.");
        }
    }
}
