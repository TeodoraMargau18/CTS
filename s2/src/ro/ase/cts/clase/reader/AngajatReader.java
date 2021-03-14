package ro.ase.cts.clase.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class AngajatReader extends Reader {
	
	public AngajatReader(String fileName) {
		super(fileName);
	}

	public  List<Aplicant> readAplicants() throws FileNotFoundException {
		Scanner input = new Scanner(new File(super.fileName));
		input.useDelimiter(",");
		List<Aplicant> listaAngajati = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Angajat a=new Angajat();
			super.readAplicant(input, a);
			int salariu = input.nextInt();
			String ocupatie = input.next();
			a.setSalariu(salariu);
			a.setOcupatie(ocupatie);
			listaAngajati.add(a);
		}
		input.close();
		return listaAngajati;
	}
}
