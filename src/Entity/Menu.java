package Entity;

import java.util.Scanner;

import Service.PizzaManage;

public class Menu {

	private OptionMenu [] actions;
	
	private ListerPizzasOptionMenu listerPizzaOptionMenu;
	private NouvellePizzaOptionMenu nouvellePizzaOptionMenu;
	private MisAJourOptionMenu MisAJourOptionMenu;
	private SupressionPizzaOptionMenu supressionPizzaOtionMenu;
	private PizzaManage pizzaManager;
	
	
	public Menu() {
		pizzaManager = new PizzaManage();
		actions = new OptionMenu[10];
		
		listerPizzaOptionMenu = new ListerPizzasOptionMenu(pizzaManager);
		nouvellePizzaOptionMenu = new NouvellePizzaOptionMenu(pizzaManager);
		MisAJourOptionMenu = new MisAJourOptionMenu(pizzaManager);
		supressionPizzaOtionMenu = new SupressionPizzaOptionMenu(pizzaManager);
		
		actions  = new OptionMenu [] { listerPizzaOptionMenu
									  ,nouvellePizzaOptionMenu
									  ,MisAJourOptionMenu
									  ,supressionPizzaOtionMenu };	
		 
	}
	
	
	public void afficher(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
		System.out.println("====================================");
        System.out.println("******Pizzeria Administration******");
        System.out.println("====================================");
        
        for (OptionMenu optionMenu : actions) {
        	System.out.print(optionMenu.getLibelle());
        	
        }
        
        System.out.println("99/ Sortir");
        System.out.print("====> Entrer votre choix : " + "\n");
		
        int choix = sc.nextInt();
        
        
        switch (choix) {
		case 1:
			listerPizzaOptionMenu.execute();
			break;
		case 2:
			nouvellePizzaOptionMenu.execute();
			break;
		case 3:
			MisAJourOptionMenu.execute();
			break;
		case 4:
			supressionPizzaOtionMenu.execute();
			break;
		case 99:
			System.exit(0);
			break;
		default:
			System.out.println("Vous n'avez pas saisi correctement !"+"\n");
			break;
		}
        
        
		
	}
	
	}
}
