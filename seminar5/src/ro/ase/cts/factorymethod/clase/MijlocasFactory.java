package ro.ase.cts.factorymethod.clase;

public class MijlocasFactory implements JucatorFactoryMethod{

	@Override
	public Jucator createJucator(String nume) {
		return new Mijlocas(nume);
	}

}
