package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdapterObiecteBilet;
import ro.ase.cts.adapter.clase.Bilet;
import ro.ase.cts.adapter.clase.BiletAdapter;
import ro.ase.cts.adapter.clase.BiletOnline;

public class ProgramAdapter {
	
	public static void rezeervaSiVindeBiletOnline(BiletOnline biletOnline) {
		biletOnline.rezervaBiletOnline();
		biletOnline.vindeBiletOnline();
	}
	public static void rezeervaSiVindeBiletCasa(Bilet bilet) {
		bilet.rezerva();
		bilet.vinde();
	}

	public static void main(String[] args) {

		BiletOnline biletOnline=new BiletAdapter(12);
		Bilet bilet=new BiletAdapter(22);
		rezeervaSiVindeBiletOnline(biletOnline);
		rezeervaSiVindeBiletCasa(bilet);
		
		AdapterObiecteBilet adapterObiecte=new AdapterObiecteBilet(bilet);
		rezeervaSiVindeBiletOnline(adapterObiecte);
	}

}
