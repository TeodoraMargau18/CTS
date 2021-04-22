package ro.ase.cts.state.clase;

public class Rezervata implements Stare {

	@Override
	public void actualizezazaStare(Masa masa) {
		if (masa.getStare() instanceof Rezervata||masa.getStare() instanceof Ocupata) {
			System.out.println("Masa cu numarul " + masa.getNrMasa() + " NU POATE FI REZERVATA");
		} else {
			System.out.println("Masa cu numarul " + masa.getNrMasa() + " a fost REZERVATA");
			masa.setStare(this);
		}
	}

}
