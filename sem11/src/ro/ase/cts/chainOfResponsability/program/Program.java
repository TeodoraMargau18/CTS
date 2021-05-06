package ro.ase.cts.chainOfResponsability.program;

import ro.ase.cts.chainOfResponsability.clase.Cont;
import ro.ase.cts.chainOfResponsability.clase.ContCredit;
import ro.ase.cts.chainOfResponsability.clase.ContCurent;
import ro.ase.cts.chainOfResponsability.clase.ContEconomii;
import ro.ase.cts.chainOfResponsability.clase.ContIndisponibil;

public class Program {

	public static void main(String[] args) {
		
		Cont contCurent=new ContCurent("Gigel", 100);
		Cont contEconomii=new ContEconomii("Gigel", 200);
		Cont contCredit=new ContCredit("Gigel", 500);
		Cont contIndisponibil=new ContIndisponibil("Gigel");
		
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(contIndisponibil);
		contCurent.realizeazaPlata(70);
		contCurent.realizeazaPlata(100);
		contCurent.realizeazaPlata(490);
		contCurent.realizeazaPlata(700);
		
	}

}
