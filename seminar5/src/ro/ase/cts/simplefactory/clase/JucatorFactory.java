package ro.ase.cts.simplefactory.clase;

public class JucatorFactory {

	public static Jucator createJucator(TipJucator tipJucator,String nume) throws Exception {
		
		switch (tipJucator) {
		case PORTAR:
			return new Portar(nume);
		case ATACANT:
			return new Atacant(nume);
			case FUNDAS:
				return new Fundas(nume);
		default:
			throw new Exception("Tipul nu este definit");
		}
		
		
	}
	
}
