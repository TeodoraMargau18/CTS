package ro.ase.cts.decorator.clase;

public class DecoratorCuMesajFelicitare extends DecoratorAbstract {

	public DecoratorCuMesajFelicitare(BiletAbstract biletAbstract) {
		super(biletAbstract);
		
	}
	
	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println (" - La multi ani");
	}

}
