package ro.ase.cts.observer.clase;

public class ClientAbonat implements Client {

	private String numeClient;
	
	
	
	public ClientAbonat(String numeClient) {
		super();
		this.numeClient = numeClient;
	}



	@Override
	public void primesteNotificare(String mesaj) {
		System.out.print(numeClient+", ai primit mesajul: ");
		System.out.println(mesaj);
	}

}
