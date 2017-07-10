package Exception;

public class SavePizzaException extends GlobalException{

	public static final int ERRTYPE_SAVE_PIZZA = 10;
	
	public static final String ADDPIZZA_DATA_NOT_CORRECT  = "Erreur de saisie de données";	
	
	public SavePizzaException(String message, int errType){
		super(message, errType);
		
	}
	
}
