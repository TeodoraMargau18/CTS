package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Bilet;
import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorCuMesajFelicitare;
import ro.ase.cts.decorator.clase.DecoratorCuMesajSustinere;

public class Program {

	public static void main(String[] args) {
		Bilet bilet=new Bilet("FCSB","Dianmo", "Gigel");
		bilet.rezervaBilet();
		DecoratorCuMesajSustinere decorator=new DecoratorCuMesajSustinere(bilet);
		decorator.rezervaBilet();
		
		DecoratorCuMesajFelicitare decorator2=new DecoratorCuMesajFelicitare(bilet);
		decorator2.rezervaBilet();
		
		System.out.println();
		DecoratorAbstract decoratorNou=new DecoratorCuMesajFelicitare(decorator);
		decoratorNou.rezervaBilet();
		
	}

}
