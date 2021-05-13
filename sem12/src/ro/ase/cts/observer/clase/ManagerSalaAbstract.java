package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerSalaAbstract {
	private List<Client> listaClienti;

	public ManagerSalaAbstract() {
		super();
		this.listaClienti = new ArrayList<>();
	}

	public void adaugaAbonat(Client client) {
		listaClienti.add(client);
	}

	public void stergeAbonat(Client client) {
		listaClienti.remove(client);
	}

	public Client getAbonat(int index) {
		return listaClienti.get(index);
	}

	public void notificaAbonati(String mesaj) {
		if (!listaClienti.isEmpty()) {
			for (Client c : listaClienti) {
				c.primesteNotificare(mesaj);
			}
		}
	}

}
