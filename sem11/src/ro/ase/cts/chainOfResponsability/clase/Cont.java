package ro.ase.cts.chainOfResponsability.clase;

public abstract class Cont {
	private String detinator;
	private float sold;
	private Cont succesor;
	
	

	public Cont(String detinator, float sold) {
		super();
		this.detinator = detinator;
		this.sold = sold;
		this.succesor=null;
	}

	public void setSuccesor(Cont succesor) {
		this.succesor = succesor;
	}

	public abstract void realizeazaPlata(float suma);

	public String getDetinator() {
		return detinator;
	}

	public float getSold() {
		return sold;
	}

	public Cont getSuccesor() {
		return succesor;
	}

	public void setSold(float sold) {
		this.sold = sold;
	}
	
	
}
