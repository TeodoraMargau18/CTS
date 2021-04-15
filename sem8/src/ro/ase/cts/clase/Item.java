package ro.ase.cts.clase;

public class Item implements ComponentaMeniu {
	
	private String numeItem;

	

	public Item(String numeItem) {
		super();
		this.numeItem = numeItem;
	}

	@Override
	public void adaugareNod(ComponentaMeniu componentaMeniu) {
		throw new IllegalArgumentException("Metoda nu este implemetata");
		
	}

	@Override
	public void stergeNod(ComponentaMeniu componentaMeniu) {
		throw new IllegalArgumentException("Metoda nu este implemetata");
		
	}

	@Override
	public ComponentaMeniu getComponenta(int pozitie) throws Exception {

		throw new IllegalArgumentException("Metoda nu este implemetata");
	}

	@Override
	public void afiseazaInformatii() {
		System.out.println("Item "+numeItem);
		
	}

}
