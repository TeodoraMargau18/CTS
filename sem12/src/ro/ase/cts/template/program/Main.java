package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.Spectator;
import ro.ase.cts.template.clase.SpectatorAbstract;
import ro.ase.cts.template.clase.SpectatorVIP;

public class Main {

	public static void main(String[] args) {
		SpectatorAbstract s1=new Spectator("Dorel");
		SpectatorAbstract s2=new Spectator("Marcel");
		SpectatorAbstract sVIP=new SpectatorVIP("John");
		
		s1.participaLaMeci();
		System.out.println("------------------");
		s2.participaLaMeci();
		System.out.println("------------------");
		sVIP.participaLaMeci();
	}

}
