package clase;

//nu poate fi instantiata 
//poate fi folosita ca referenceType
public abstract class Animal {
	private String name;
	

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
