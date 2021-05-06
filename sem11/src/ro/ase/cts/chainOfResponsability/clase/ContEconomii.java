package ro.ase.cts.chainOfResponsability.clase;

public class ContEconomii extends Cont {

	public ContEconomii(String detinator, float sold) {
		super(detinator, sold);
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold()>suma){
			System.out.println("S-a realizat plata de "+suma+" lei din contul de ECONOMII.");
			super.setSold(super.getSold()-suma);
		}
		else {
			super.getSuccesor().realizeazaPlata(suma);
		}
	}

}
