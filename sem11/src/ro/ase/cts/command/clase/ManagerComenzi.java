package ro.ase.cts.command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {

	private List<Command> comenzi;

	public ManagerComenzi() {
		super();
		this.comenzi = new ArrayList<>();
	}

	public void invoca(Command comanda) {
		comenzi.add(comanda);
		System.out.println("Am adaugat comanda.");
	}

	public void executa() {
		if (comenzi != null) {
			comenzi.get(0).executa();
			comenzi.remove(0);
		}
	}
}
