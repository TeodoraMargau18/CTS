package ro.ase.cts.program;

import ro.ase.cts.clase.ComponentaMeniu;
import ro.ase.cts.clase.Item;
import ro.ase.cts.clase.Sectiune;

public class Main {

	public static void main(String[] args) {

		ComponentaMeniu meniu=new Sectiune("Meniu");
		
		ComponentaMeniu sectiuneBauturi=new Sectiune("bauturi");
		ComponentaMeniu sectiuneDesert=new Sectiune("Desert");
		
		ComponentaMeniu frappe=new Item("Frappe");
		ComponentaMeniu clatite=new Item("Clatite");
		ComponentaMeniu cola=new Item("Cola");
		
		meniu.adaugareNod(sectiuneDesert);
		meniu.adaugareNod(sectiuneBauturi);
		
		sectiuneBauturi.adaugareNod(frappe);
		sectiuneBauturi.adaugareNod(cola);
		sectiuneDesert.adaugareNod(clatite);
		
		meniu.afiseazaInformatii();
		
		System.out.println("-----------------------");
		sectiuneBauturi.stergeNod(frappe);
		sectiuneDesert.adaugareNod(frappe);
		meniu.afiseazaInformatii();
		
		
		

	}

}
