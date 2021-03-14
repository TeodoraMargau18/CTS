package ro.ase.cts.clase;

public class Angajat extends Aplicant {
	private String ocupatie;
	private int salariu;
	private static float sumaFinantata = 10;

	public Angajat() {
		super();
	}

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	@Override
	public float getSumaFinantata() {
		System.out.println(
				"Angajatul " + getNume() + " " + getPrenume() + " primeste " + sumaFinantata + " Euro/zi in proiect.");
		return sumaFinantata;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("Angajat:");
		str.append(super.toString()).append(" ocupatie= ").append(ocupatie).append(" salariu= ").append(salariu);
		return str.toString();

	}

}
