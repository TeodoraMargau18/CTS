package ro.ase.cts.factorymethod.clase;

public class FundasFactory implements JucatorFactoryMethod {

	@Override
	public Jucator createJucator(String nume) {
		return new Fundas(nume);
	}

}
