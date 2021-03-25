package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.clase.Client;

public class Main {

	public static void main(String[] args) {
		Client client1=new Client("Marcel", 18, "romana", 220);
		Client client2=(Client) client1.copiaza();

		
		System.out.println(client1.toString());
		System.out.println(client2.toString());
	}

}
