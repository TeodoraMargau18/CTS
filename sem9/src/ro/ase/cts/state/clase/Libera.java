package ro.ase.cts.state.clase;

public class Libera implements Stare {

	@Override
	public void actualizezazaStare(Masa masa) {
		if (masa.getStare() instanceof Libera) {
			System.out.println("Masa cu numarul" + masa.getNrMasa() + " este deja libera");
		} else {
			System.out.println("Masa cu numarul" + masa.getNrMasa() + " a fost ELIBERATA");
			masa.setStare(this);
		}

	}

}
