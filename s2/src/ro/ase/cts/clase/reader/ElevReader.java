package ro.ase.cts.clase.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class ElevReader extends Reader {
	public ElevReader(String fileName) {
		super(fileName);
	}

	public List<Aplicant> readAplicants() throws FileNotFoundException {
		Scanner input = new Scanner(new File(super.fileName));
		input.useDelimiter(",|\n");
		List<Aplicant> listaElevi = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Elev e = new Elev();
			super.readAplicant(input, e);
			int clasa = input.nextInt();
			String tutore = input.next();
			e.setClasa(clasa);
			e.setTutore(tutore);
			listaElevi.add(e);
		}

		input.close();
		return listaElevi;
	}
}
