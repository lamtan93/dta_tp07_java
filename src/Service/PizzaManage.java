package Service;

import Dao.PizzaDAOImpl;
import Exception.DeletePizzaException;
import Exception.SavePizzaException;
import Exception.UpdatePizzaException;

public class PizzaManage {

	private PizzaDAOImpl pizzaDAOImpl;

	public PizzaManage() {
		pizzaDAOImpl = new PizzaDAOImpl();
	};

	// Check infos
	public boolean checkInfos(String code, String nom, double prix) {
		boolean infosOK = true;
		if ((code.trim().isEmpty()) || (nom.trim().isEmpty()) || (prix == 0)) {

			System.out.println("Infos incorrectes, veuillez resaisir !");
			infosOK = false;

		}
		return infosOK;

	}

	public void displayListPizza() {
		pizzaDAOImpl.displayAllPizza();

	}

	public void addPizza(String code, String nom, double prix) {
		
		try {
			pizzaDAOImpl.addPizza(code, nom, prix);
		} catch (SavePizzaException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}

	}

	public void updatePizza(int index, String code, String nom, double prix) {
		try {
			pizzaDAOImpl.updatePizza(index, code, nom, prix);
		} catch (UpdatePizzaException e) {
			System.out.println(e.getMessage());
		}

	}

	public void deletePizza(int indexPizza) {
		try {
			pizzaDAOImpl.deletePizza(indexPizza);
		} catch (DeletePizzaException e) {
			System.out.println(e.getMessage());
			
		}

	}

}
