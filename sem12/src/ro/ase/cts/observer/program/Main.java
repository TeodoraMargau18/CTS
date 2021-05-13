package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ClientAbonat;
import ro.ase.cts.observer.clase.ManagerSala;

public class Main {

	public static void main(String[] args) {
		Client c1 = new ClientAbonat("Gigel");
		Client c2 = new ClientAbonat("Cornel");
		Client c3 = new ClientAbonat("Marcel");
		Client c4 = new ClientAbonat("Viorica");

		ManagerSala manager = new ManagerSala();

		manager.adaugaAbonat(c1);
		manager.adaugaAbonat(c2);
		manager.adaugaAbonat(c3);
		manager.adaugaAbonat(c4);

		manager.anuntaMeci("Fotbal");

		System.out.println("----------");
		manager.stergeAbonat(c1);
		manager.anuntaMeci("Handbal");

	}

}
