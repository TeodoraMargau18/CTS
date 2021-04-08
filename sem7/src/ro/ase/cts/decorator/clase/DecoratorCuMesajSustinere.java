package ro.ase.cts.decorator.clase;

public class DecoratorCuMesajSustinere extends DecoratorAbstract {

	public DecoratorCuMesajSustinere(BiletAbstract biletAbstract) {
		super(biletAbstract);
		
	}
	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println(" - Sustinem "+((Bilet)(super.getBiletAbstract())).getNumeGazda());
	}

}
