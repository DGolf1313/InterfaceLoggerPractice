import java.util.Date;

//add different interfaces by implements Logger, other interface{
public class ConsoleLogger implements Logger{

	@Override
	public void info(String info) {
		Date date = new Date();
		System.out.println(date.toString() + " : " + info);
	}

	@Override
	public void warning(String warning) {
		Date date = new Date();
		System.out.println(date.toString() + " Warning - " + warning);
	}

	@Override
	public void error(String error) {
		Date date = new Date();
		System.err.println( date.toString() + " error " + error);
	}

	@Override
	public void fatal(String fatal) {
		Date date = new Date();
		System.err.println(date.toString() + " FATAL!!! - " + fatal);
	}

	
		


	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
