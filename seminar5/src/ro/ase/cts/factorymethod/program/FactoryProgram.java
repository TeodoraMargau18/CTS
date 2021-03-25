package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.clase.Jucator;
import ro.ase.cts.factorymethod.clase.JucatorFactory;

public class FactoryProgram {
	
	public static void printeazaJucatori(JucatorFactory jucatorFactory, String nume) {
		Jucator jucator=jucatorFactory.createJucator(nume);
		System.out.println(jucator.toString());
		
	}
	

	public static void main(String[] args) {

	}

}
