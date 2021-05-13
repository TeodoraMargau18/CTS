package ro.ase.cts.observer.clase;

public class ManagerSala extends ManagerSalaAbstract {

	public void anuntaMeci( String tipMeci) {
		super.notificaAbonati("Incepe meciul de "+tipMeci+"!");
	}

}
