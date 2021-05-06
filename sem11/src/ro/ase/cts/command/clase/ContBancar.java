package ro.ase.cts.command.clase;

public class ContBancar {
	private String detinator;
	private float sold;

	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
		this.sold = 0;
	}

	public void constituire(float sold) {
		this.sold=sold;
		System.out.println("S-a constituit contul cu suma de " + sold + " lei.");
	}

	public void retragere(float sold) {
		if (this.sold > sold) {
			this.sold-=sold;
			System.out.println("S-a retras suma de " + sold + " din cont.");
		} else {
			System.out.println("Sold insuficient.");
		}
	}

	public void depunere(float sold) {
		this.sold+=sold;
		System.out.println("S-a depus in cont suma de " + sold + " lei.");
	}
}
