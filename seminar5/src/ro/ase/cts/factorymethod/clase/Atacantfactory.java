package ro.ase.cts.factorymethod.clase;

public class Atacantfactory implements JucatorFactory{

	@Override
	public Jucator createJucator(String nume) {
		return new Atacant(nume);
	}

}
