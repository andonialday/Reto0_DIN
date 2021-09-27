package exception;

/**
 * This class extends from the Exception class.
 * It is called when some method tries to Delete dates in the BDA and fails
 * @author Enaitz
 */
public class DeleteException extends Exception{

	private static final long serialVersionUID = 1L;
        
        /**
         * It takes the Message from the super class when something fails 
         * @param message 
         */
	public DeleteException(String message) {
		super(message);
	}

	
	
}
