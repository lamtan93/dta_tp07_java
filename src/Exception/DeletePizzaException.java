package Exception;

public class DeletePizzaException extends GlobalException{

public static final int ERRTYPE_DELETE_PIZZA = 30;
	
public static final String DELETEPIZZA_INDEX_NOT_CORRECT  = "Index non trouv�";	

	
	public DeletePizzaException(String message, int errType){
		super(message, errType);
		
	}
}
