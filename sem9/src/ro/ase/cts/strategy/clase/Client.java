package ro.ase.cts.strategy.clase;

public class Client {
	private String numeClient;
	private ModPlata modPlata;

	public Client(String numeClient, ModPlata modPlata) {
		super();
		this.numeClient = numeClient;
		this.modPlata = modPlata;
	}

	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}

	public void platesteNota(float suma) {
		System.out.println(numeClient+" are de plata "+suma+" lei.");
		modPlata.plateste(suma);
	}
}
