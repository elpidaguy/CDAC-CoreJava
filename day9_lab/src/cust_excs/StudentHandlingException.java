package cust_excs;

@SuppressWarnings("serial")
public class StudentHandlingException extends Exception {

	//to check args of custom exceptions - check super classes ctor
	public StudentHandlingException(String msg) {
		super(msg);
	}

}
