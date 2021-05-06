package ro.ase.cts.chainOfResponsability.clase;

public class ContIndisponibil extends Cont{

	public ContIndisponibil(String detinator) {
		super(detinator, 0);
	}

	@Override
	public void realizeazaPlata(float suma) {
		System.out.println("Plata nu poate fi realizata!");
		
	}

}
