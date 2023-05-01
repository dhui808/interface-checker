package interfacechecker;

import java.io.IOException;

public class InterfaceCheckerException extends RuntimeException {

	public InterfaceCheckerException(String s) {
		super(s);
	}

	public InterfaceCheckerException(IOException e) {
		super(e);
	}
}
