package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private Zookeeper zookeeper;
	private List<Animal> animals;

	// Constructor
	public Zoo(Zookeeper zookeeper, List<Animal> animals) {
		super();
		this.zookeeper = zookeeper;
		this.animals = animals;
	}

	public Zoo() {
		this.zookeeper = new Zookeeper("Gigel");
//		this.zookeeper.setName("George");
		// ArrayList mosteneste List
		this.animals = new ArrayList<>();

	}

	// Getter and setter
	public Zookeeper getZookeeper() {
		return zookeeper;
	}

	public void setZookeeper(Zookeeper zookeeper) {
		this.zookeeper = zookeeper;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public void addAnimal(Animal animal) {
		this.animals.add(animal);
	}
	
	public void feedAllAnimals()
	{
		for(Animal a : this.animals)
		{
			zookeeper.feed(a);
		}
	}
	

}
