package exceptions;

public class CCNotInTheSystem extends Exception {
	public CCNotInTheSystem() {
		super("CC is not register in the System");
	}

}