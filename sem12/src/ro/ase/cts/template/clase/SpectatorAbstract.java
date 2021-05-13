package ro.ase.cts.template.clase;

public abstract class SpectatorAbstract {
	 
	public abstract void asezareLaCoada();

	public abstract void prezintaBilet();

	public abstract void controlCorporal();

	public abstract void intraPeStadio();

	public abstract void ocupaLoc();

	public final void participaLaMeci() {
		asezareLaCoada();
		prezintaBilet();
		controlCorporal();
		intraPeStadio();
		ocupaLoc();
	}

}
