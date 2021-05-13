package ro.ase.cts.template.clase;

public class Spectator extends SpectatorAbstract {
	private String nume;

	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareLaCoada() {
		System.out.println(nume + " se aseaza la coada.");

	}

	@Override
	public void prezintaBilet() {
		System.out.println(nume + " prezinta biletul.");

	}

	@Override
	public void controlCorporal() {
		System.out.println(nume + " realizeaza controlul corporal.");

	}

	@Override
	public void intraPeStadio() {
		System.out.println(nume + " intra pe stadion.");

	}

	@Override
	public void ocupaLoc() {
		System.out.println(nume + " ocupa locul.");

	}

}
