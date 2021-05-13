package ro.ase.cts.template.clase;

public class SpectatorVIP extends SpectatorAbstract {

	private String nume;
	
	public SpectatorVIP(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareLaCoada() {
		System.out.println(nume+" nu mai asteapta la coada.");
	}

	@Override
	public void prezintaBilet() {
		System.out.println(nume+" prezinta bilet.");

	}

	@Override
	public void controlCorporal() {
		System.out.println(nume+" realizeaza control corporal.");

	}

	@Override
	public void intraPeStadio() {
		System.out.println(nume+" intra in loja VIP.");

	}

	@Override
	public void ocupaLoc() {
		System.out.println(nume+" ocupa loc in LOJA");

	}

}
