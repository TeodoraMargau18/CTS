package ro.ase.cts.factory.clase;

public class Portar extends Jucator {

	
	public Portar(String nume) {
		super(nume);
	}

	@Override
	public String toString() {
		return "Portarul cu numele " + getNume() ;
	}

}
