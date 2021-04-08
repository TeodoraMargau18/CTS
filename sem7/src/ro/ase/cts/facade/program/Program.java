package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.BazaDateHuligani;
import ro.ase.cts.facade.clase.Bilet;
import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Persoana;
import ro.ase.cts.facade.clase.Politie;

public class Program {

	public static void main(String[] args) {
		Persoana p1=new Persoana("Gigel", "1900000000011");
		Bilet b1=new Bilet("Gigel", "1A");
//		Fara facade
		if(p1.getNume().equals(b1.getNume())) {
			if(!Politie.esteUrmarita(p1)) {
				if(!BazaDateHuligani.esteInListaDeHuligani(p1)) {
					
					System.out.println("Este permisa intrarea "+p1.getNume());
				}
			}
		}
		
//		Cu facade
		Persoana p2=new Persoana("Maria","6900000000002");
		Bilet b2=new Bilet("Maria", "2C");
		
		if(Facade.sePermiteAccesul(p2, b2))
			System.out.println("Este permisa intrarea "+p2.getNume());
		else {

			System.out.println("NU este permisa intrarea "+p2.getNume());
		}
	
		
		
	}
	
}
