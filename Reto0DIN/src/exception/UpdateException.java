package exception;

/**
 * This class extends from the Exception class.
 * It is called when some method tries to Update Dates of the the BDA and fails
 * @author 2dam
 */
public class UpdateException extends Exception{

	private static final long serialVersionUID = 1L;

        /**
         * It takes the Message from the super class when something fails 
         * @param message 
         */
	public UpdateException(String message) {
		super(message);
	}

	
	
}
