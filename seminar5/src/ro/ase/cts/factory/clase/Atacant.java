package ro.ase.cts.factory.clase;

public class Atacant extends Jucator {

	public Atacant(String nume) {
		super(nume);
	}
	
	@Override
	public String toString() {
		return "Atacantul cu numele " + getNume() ;
	}
	

}
