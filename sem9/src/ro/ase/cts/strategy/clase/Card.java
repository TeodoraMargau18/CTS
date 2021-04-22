package ro.ase.cts.strategy.clase;

public class Card implements ModPlata {

	private float sumaSold;

	public Card(float sumaSold) {
		super();
		this.sumaSold = sumaSold;
	}

	@Override
	public void plateste(float suma) {
		if (suma <= sumaSold) {
			System.out.println("S-a achitat plata cu CARDUL suma de " + suma + " lei");
			sumaSold -= suma;
		} else
			System.out.println("Sold insuficient");
	}

}
