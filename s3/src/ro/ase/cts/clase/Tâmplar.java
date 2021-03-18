package ro.ase.cts.clase;

public class T�mplar{
	
	private String nume;
	private int vechime;
	private int varsta;
	
	public static T�mplar instance=null;
	public static synchronized T�mplar getInstance(String nume, int vechime, int varsta) {
		if(instance==null) {
			instance=new T�mplar(nume, vechime, varsta);
		}
		return instance;
	}
	
	private T�mplar(String nume, int vechime, int varsta) {
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
