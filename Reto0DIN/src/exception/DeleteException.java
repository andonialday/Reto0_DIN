package exception;

/**
 * This class extends from the Exception class.
 * It is called when some method tries to Delete dates in the DDBB and fails
 * @author Enaitz Izagirre
 */
public class DeleteException extends Exception{

	private static final long serialVersionUID = 1L;
        
        /**
         * It takes the Message from the super class when something fails 
         * @param message message to be shown when the exception triggers
         */
	public DeleteException(String message) {
		super(message);
	}

	
	
}
