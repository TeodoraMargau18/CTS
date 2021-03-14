package ro.ase.cts.clase.reader;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class Reader {

	protected String fileName;

	public Reader(String fileName) {
		super();
		this.fileName = fileName;
	}

	public abstract List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException;

	public void readAplicant(Scanner input, Aplicant aplicant) {
		String nume = input.next();
		String prenume = (input.next()).toString();
		int varsta = Integer.valueOf(input.nextInt());
		int punctaj = Integer.valueOf(input.nextInt());
		int nrProiecte = Integer.valueOf(input.nextInt());
		String[] vectProiecte = new String[nrProiecte];
		for (int i = 0; i < nrProiecte; i++)
			vectProiecte[i] = input.next();

		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setDenumiriProiect(nrProiecte, vectProiecte);

	}

}
