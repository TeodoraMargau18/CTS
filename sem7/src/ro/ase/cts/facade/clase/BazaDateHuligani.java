package ro.ase.cts.facade.clase;

public class BazaDateHuligani {

	public static boolean esteInListaDeHuligani(Persoana persoana)	{
		return Integer.parseInt(""+persoana.getCnp().charAt(11))%2==0; 
	}
}
