package ro.ase.cts.clase;
//amana cat de mult initializarea obiectului
public class ManagerSpitalLazy {
	private String nume;
	private int marca;
	private int varsta;
	
	private static ManagerSpitalLazy instanta=null;
	public static synchronized ManagerSpitalLazy getInstaLazy(String nume, int varsta, int marca) {
		if(instanta==null) {
			instanta=new ManagerSpitalLazy(nume, marca, varsta);
		}
		return instanta;
	}


	private ManagerSpitalLazy(String nume, int marca, int varsta) {

		this.nume = nume;
		this.marca = marca;
		this.varsta = varsta;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setMarca(int marca) {
		this.marca = marca;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	@Override
	public String toString() {
		return "ManagerSpital [nume=" + nume + ", marca=" + marca + ", varsta=" + varsta + "]";
	}
	
}
