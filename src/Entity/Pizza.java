package Entity;

public class Pizza {

	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
	private int index;
	private String code;
	private String nom;
	private double prix;
	
	public Pizza (){}
		
	
	public Pizza(int index, String code, String nom, double prix) {
		super();
		this.index = index;
		this.code = code;
		this.nom = nom;
		this.prix = prix;
	}
	public Pizza(String code, String nom, double prix) {
		super();
		this.code = code;
		this.nom = nom;
		this.prix = prix;
	}
	
	
	public String toString (){
		 return index + "  " + code + "  " + nom + "  " + prix;
		
		
		
	}
	
}
