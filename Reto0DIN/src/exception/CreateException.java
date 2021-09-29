package exception;

/**
 * This class extends from the Exception class.
 * It is called when some method tries to Insert dates in the database and fails
 * @author Enaitz
 */
public class CreateException extends Exception{

	
	private static final long serialVersionUID = 1L;

        /**
         * It takes the Message from the super class when something fails 
         * @param message message to be shown when the exception triggers
         */
	public CreateException(String message) {
		super(message);
	}

	
	
}
