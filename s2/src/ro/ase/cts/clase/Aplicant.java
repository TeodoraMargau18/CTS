package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant {
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumireProiecte;

	public Aplicant() {
		super();
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public void setDenumiriProiect(int nrProiecte, String[] denumiriProiect) {
		this.nrProiecte = nrProiecte;
		this.denumireProiecte = denumiriProiect;
	}

	public void afisareStatutProiect(Proiect proiect) {
		StringBuilder str = new StringBuilder("Aplicantul ");
		str.append(nume).append(" ").append(prenume).append(" ")
				.append((punctaj > proiect.getPragAcceptare()) ? " a fost acceptat." : "nu a fost acceptat.");
		System.out.println(str.toString());
	}

	public abstract float getSumaFinantata();

	@Override
	public String toString() {
		return " nume=" + nume + ", prenume=" + prenume + ", varsta=" + varsta + ", punctaj=" + punctaj
				+ ", nr_proiecte=" + nrProiecte + ", denumireProiect=" + Arrays.toString(denumireProiecte);
	}

}
