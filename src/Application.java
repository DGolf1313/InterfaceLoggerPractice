
public class Application {

	public static void main(String[] args) {
		
		Logger logger = new FileLogger();
		
		logger.info("Hello:");
		logger.warning("this is a warning");
		logger.error("Opps error");
		logger.fatal("This is FATAL");
		
		logger.close();
	}

}
