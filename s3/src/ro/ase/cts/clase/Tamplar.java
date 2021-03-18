package ro.ase.cts.clase;

public class Tamplar{
	
	private String nume;
	private int vechime;
	private int varsta;
	
	public static Tamplar instance=null;
	public static synchronized Tamplar getInstance(String nume, int vechime, int varsta) {
		if(instance==null) {
			instance=new Tamplar(nume, vechime, varsta);
		}
		return instance;
	}
	
	private Tamplar(String nume, int vechime, int varsta) {
		super();
		this.nume = nume;
		this.vechime = vechime;
		this.varsta = varsta;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setVechime(int vechime) {
		this.vechime = vechime;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	@Override
	public String toString() {
		return "Tamplar [nume=" + nume + ", vechime=" + vechime + ", varsta=" + varsta + "]";
	}
}
