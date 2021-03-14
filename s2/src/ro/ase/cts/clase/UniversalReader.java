package ro.ase.cts.clase;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.reader.Reader;

public class UniversalReader {
	// TO DO: punct de legatura catre reader-ele noastre

	public static List<Aplicant> readAplicants(Reader reader) throws NumberFormatException, FileNotFoundException {
		return reader.readAplicants();
	}

}
