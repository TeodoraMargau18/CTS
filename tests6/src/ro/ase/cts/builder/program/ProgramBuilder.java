package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.BuilderRezervareV2;
import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;

public class ProgramBuilder {

	public static void main(String[] args) {
		RezervareBuilder builderRezervare=new RezervareBuilder();
		Rezervare rezervare1=builderRezervare.setAreBauturaInclusa(true)
				.build();

		Rezervare rezervare2=new RezervareBuilder()
				.setAreMuzicaAmbientala(true)
				.setGenMuzica("Rock")
				.setAreMancareInclusa(true)
				.build();
		
		BuilderRezervareV2 builderv2=new BuilderRezervareV2();
		Rezervare rezervare1V2=builderv2.setAreBauturaInclusa(true).build();
		Rezervare rezervare2V2=builderv2.setAreMancareInclusa(true).build();
		

		System.out.println(rezervare1);
		System.out.println(rezervare2); 
		
		System.out.println(rezervare1V2);
		System.out.println(rezervare2V2);
	}

}
