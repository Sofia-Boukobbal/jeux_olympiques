package jo;

public class IncompatibleSportException extends Exception {


	private static final long serialVersionUID = 1L;
	
	public IncompatibleSportException() {
        super("Association pour sport incompatible");
    }
}
