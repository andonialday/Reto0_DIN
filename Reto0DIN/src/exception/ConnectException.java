package exception;

/**
 * This class extends from the Exception class.
 * It is called when some method tries to connect to the BDA and fails
 * @author Enaitz
 */

public class ConnectException extends Exception{

	
	private static final long serialVersionUID = 1L;

        /**
         * It takes the Message from the super class when something fails 
         * @param message 
         */
	public ConnectException(String message) {
		super(message);
	}
	
}
