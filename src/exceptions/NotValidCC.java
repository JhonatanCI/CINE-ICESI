package exceptions;

public class NotValidCC extends Exception {
	public NotValidCC() {
		super("Isn't a valid format for CC");
	}

}