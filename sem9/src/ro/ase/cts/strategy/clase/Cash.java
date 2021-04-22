package ro.ase.cts.strategy.clase;

public class Cash implements ModPlata{

	@Override
	public void plateste(float suma) {
		System.out.println("S-a achitat CASH suma de "+suma+" lei");
		
		
	}

}
