package ro.ase.cts.clase;

public class Elev extends Aplicant {
	private int clasa;
	private String tutore;
	private static float sumaFinantata = 30;

	public Elev() {
		super();
	}

	public void setClasa(int i) {
		this.clasa = i;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	@Override
	public float getSumaFinantata() {
		System.out.println(
				"Elevul " + getNume() + " " + getPrenume() + " primeste " + sumaFinantata + " Euro/zi in proiect.");
		return sumaFinantata;
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("Elevul :");
		str.append(super.toString()).append(" clasa= ").append(clasa).append(" tutore =").append(tutore);
		return str.toString();
	}


}
