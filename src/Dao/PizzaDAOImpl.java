package Dao;

import Entity.Pizza;
import Exception.DeletePizzaException;
import Exception.SavePizzaException;
import Exception.UpdatePizzaException;

public class PizzaDAOImpl implements PizzaDAO{

	private Pizza [] tableauPizza;
	
	public PizzaDAOImpl (){
		
		tableauPizza = new Pizza [100];
		Pizza p0 = new Pizza(0, "PEP", "Peperoni", 12.50);
	    Pizza p1 = new Pizza(1, "MAR", "Margherita", 14.00);
	    Pizza p2 = new Pizza(2, "REI", "La Reine", 11.50);
	    Pizza p3 = new Pizza(3, "FRO", "Les 4 fromages", 12.00);
	    Pizza p4 = new Pizza(4, "CAN", "La Cannibale", 12.50);
	    Pizza p5 = new Pizza(5, "SAV", "Savoyarde", 13.00);
	    Pizza p6 = new Pizza(6, "ORI", "L'orientale", 13.50);
	    Pizza p7 = new Pizza(7, "IND", "L'indienne", 14.00);
		
	    tableauPizza =  new Pizza [] {p0,p1,p2,p3,p4,p5,p6,p7};
	}
	
	
	public Pizza[] getTableauPizza(){
		return tableauPizza;
	}
	
	
	@Override
	public void displayAllPizza() {
		Pizza[] tabPizza = tableauPizza;
		
		for (Pizza pizza : tabPizza) {
			System.out.println(pizza + "\n");
		}
	}

	@Override
	public void addPizza(String code, String nom, double prix) throws SavePizzaException{
		
		if( (code.trim().isEmpty()) || (nom.trim().isEmpty()) || prix == 0){
			System.out.println("<-------------Attention ERREUR--------------->");
			throw new SavePizzaException(SavePizzaException.ADDPIZZA_DATA_NOT_CORRECT, SavePizzaException.ERRTYPE_SAVE_PIZZA);
			
		}else {
			Pizza newPizza = new Pizza(tableauPizza.length,code, nom, prix);
			Pizza [] tabPizzaTempo = new Pizza[tableauPizza.length+1];
			System.arraycopy(tableauPizza, 0, tabPizzaTempo, 0, tableauPizza.length);
			tabPizzaTempo[tabPizzaTempo.length-1] = newPizza;
			tableauPizza = tabPizzaTempo;
		}
		
		
	}

	
	@Override
	public void updatePizza(int index, String code, String nom, double prix) throws UpdatePizzaException {	
		
		boolean indexFound = false;
		boolean errorData = false;
		for (Pizza pizza : tableauPizza) {
			if(pizza.getIndex()==index){
				indexFound = true;
				
			}
		}
		
		if(indexFound){
			if( (code.trim().isEmpty()) || (nom.trim().isEmpty())  || (prix == 0)     ){
				throw new UpdatePizzaException(UpdatePizzaException.UPDATEPIZZA_DATA_NOT_CORRECT, UpdatePizzaException.ERRTYPE_UPDATE_PIZZA);
			}else{
				tableauPizza[index].setCode(code);
				tableauPizza[index].setNom(nom);
				tableauPizza[index].setPrix(prix);
			}
		}else{
			throw new UpdatePizzaException(UpdatePizzaException.UPDATEPIZZA_INDEX_NOT_CORRECT, UpdatePizzaException.ERRTYPE_UPDATE_PIZZA);
		}
		
	}

	@Override
	public void deletePizza(int indexPizza)throws DeletePizzaException {
		boolean OK = false;
		for (Pizza pizza : tableauPizza) {
			if(pizza.getIndex() == indexPizza){
				OK = true;
				pizza.setCode(null);
				pizza.setNom(null);
				pizza.setPrix(0);
				System.out.println("--> Supression OK !");
			}
		}
		
		if(OK == false){
			System.out.println("<-------------Attention ERREUR--------------->");
			throw new DeletePizzaException(DeletePizzaException.DELETEPIZZA_INDEX_NOT_CORRECT, DeletePizzaException.ERRTYPE_DELETE_PIZZA);
		}
	}
}
