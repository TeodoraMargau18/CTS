package ro.ase.cts.clase;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static float sumaFinantata = 20;

	public Student() {
		super();
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public void setAn_studii(int an_studii) {
		this.anStudii = an_studii;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("Studentul:");
		str.append(super.toString()).append(" facultate =").append(facultate).append(" an studii =").append(anStudii);
		return str.toString();
	}

	@Override
	public float getSumaFinantata() {
		System.out.println(
				"Studentul " + getNume() + " " + getPrenume() + " primeste " + sumaFinantata + " Euro/zi in proiect.");
		return sumaFinantata;
	}

}
