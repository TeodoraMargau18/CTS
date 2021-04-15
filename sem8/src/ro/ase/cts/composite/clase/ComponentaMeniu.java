package ro.ase.cts.composite.clase;

public interface ComponentaMeniu {
	public void adaugareNod(ComponentaMeniu componentaMeniu);
	public void stergeNod(ComponentaMeniu componentaMeniu);
	public ComponentaMeniu getComponenta(int pozitie) throws Exception;
	public void afiseazaInformatii();
}
