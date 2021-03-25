package ro.ase.cts.simplefactory.program;

import ro.ase.cts.simplefactory.clase.Jucator;
import ro.ase.cts.simplefactory.clase.JucatorFactory;
import ro.ase.cts.simplefactory.clase.TipJucator;

public class Main {

	public static void main(String[] args) {
		
		
		try {
			Jucator atacant=JucatorFactory.createJucator(TipJucator.ATACANT, "Gigel");
			Jucator fundas=JucatorFactory.createJucator(TipJucator.FUNDAS, "Dorel");
			
			System.out.println(atacant.toString());
			System.out.println(fundas.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
