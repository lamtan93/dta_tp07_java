package Exception;

public class GlobalException extends Exception{

	public static final int ERR_SERVER = 10;
	
	public GlobalException(String message, int codeErreur){
		
		super(message);
		System.out.println("Code d'erreur: " + codeErreur);
		
	}
	
}
