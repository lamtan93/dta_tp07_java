package Dao;

import Entity.Pizza;
import Exception.DeletePizzaException;
import Exception.SavePizzaException;
import Exception.UpdatePizzaException;

public interface PizzaDAO {
	
	public void displayAllPizza();
	
	public void addPizza(String code, String nom, double prix)throws SavePizzaException;
	
	public void updatePizza(int index ,String code, String nom, double prix)throws UpdatePizzaException;
	
	public void deletePizza( int indexPizza)throws DeletePizzaException;
}
