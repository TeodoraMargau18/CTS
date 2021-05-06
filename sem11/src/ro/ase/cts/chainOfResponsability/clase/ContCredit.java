package ro.ase.cts.chainOfResponsability.clase;

public class ContCredit extends Cont {

	public ContCredit(String detinator, float sold) {
		super(detinator, sold);
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(suma<super.getSold()) {
			System.out.println("S-a realizat plata pentru suma de "+suma+" lei din contul de CREDIT!");
			super.setSold(super.getSold()-suma);
		}
		else {
			super.getSuccesor().realizeazaPlata(suma);
		}
	}

}
