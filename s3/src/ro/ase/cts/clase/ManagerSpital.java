package ro.ase.cts.clase;

public class ManagerSpital {
	private String nume;
	private int marca;
	private int varsta;
	
	private static ManagerSpital instance=new ManagerSpital("Dorel", 1066, 33);
	
	
	
	public static ManagerSpital getInstance() {
		return instance;
	}

	private ManagerSpital(String nume, int marca, int varsta) {
		super();
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
