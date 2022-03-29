package main.java.calc.model;

@SuppressWarnings("serial")
public class NumeroException extends RuntimeException {

	public NumeroException() {
	}

	public NumeroException(String message) {
		super(message);
	}

	public NumeroException(Throwable cause) {
		super(cause);
	}


}
