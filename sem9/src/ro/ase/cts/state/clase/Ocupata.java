package ro.ase.cts.state.clase;

public class Ocupata implements Stare {

	@Override
	public void actualizezazaStare(Masa masa) {
		if (masa.getStare() instanceof Ocupata)
			System.out.println("Masa cu numarul" + masa.getNrMasa() + " NU poate fi ocupata.");
		else {
			System.out.println("Ati ocupat masa cu numarul " + masa.getNrMasa());
			masa.setStare(this);
		}

	}

}
