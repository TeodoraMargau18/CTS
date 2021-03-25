package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.clase.Atacantfactory;
import ro.ase.cts.factorymethod.clase.Jucator;
import ro.ase.cts.factorymethod.clase.JucatorFactoryMethod;
import ro.ase.cts.factorymethod.clase.MijlocasFactory;
import ro.ase.cts.factorymethod.clase.PortarFactory;

public class FactoryProgram {
	
	public static void printeazaJucatori(JucatorFactoryMethod jucatorFactory, String nume) {
		Jucator jucator=jucatorFactory.createJucator(nume);
		System.out.println(jucator.toString());
		
	}
	

	public static void main(String[] args) {
		printeazaJucatori(new PortarFactory(), "Messi");
		printeazaJucatori(new Atacantfactory(), "Luca");
		printeazaJucatori(new MijlocasFactory(), "Dorel");
	}

}
