package Exception;

public class UpdatePizzaException extends GlobalException{

public static final int ERRTYPE_UPDATE_PIZZA = 20;

public static final String UPDATEPIZZA_INDEX_NOT_CORRECT  = "Index non trouv�";	
public static final String UPDATEPIZZA_DATA_NOT_CORRECT  = "Erreur de saisie de donn�es";	
	
	public UpdatePizzaException(String message, int errType){
		super(message, errType);
		
	}
	
	
}
