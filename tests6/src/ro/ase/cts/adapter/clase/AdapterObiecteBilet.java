package ro.ase.cts.adapter.clase;

public class AdapterObiecteBilet implements BiletOnline{

	Bilet bilet;
	

	public AdapterObiecteBilet(Bilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void vindeBiletOnline() {
		bilet.vinde();
	}

	@Override
	public void rezervaBiletOnline() {
		bilet.rezerva();
	}

}
