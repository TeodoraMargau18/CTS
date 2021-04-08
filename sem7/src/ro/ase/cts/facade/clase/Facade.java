package ro.ase.cts.facade.clase;

public class Facade {
	public static boolean sePermiteAccesul(Persoana persoana, Bilet bilet) {
		if(persoana.getNume().equals(bilet.getNume())) {
			if(!Politie.esteUrmarita(persoana)) {
				if(!BazaDateHuligani.esteInListaDeHuligani(persoana)) {
					return true;
				}
			}
		}
		return false;
	}
	

}
