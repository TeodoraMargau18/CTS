package ro.ase.cts.program;

import ro.ase.cts.clase.ManagerSpital;
import ro.ase.cts.clase.ManagerSpitalLazy;

public class Main {

	public static void main(String[] args) {
		//1.Eager
		ManagerSpital manager1=ManagerSpital.getInstance();
		ManagerSpital manager2=ManagerSpital.getInstance();
		
		System.out.println( manager1.toString());
		System.out.println(manager2.toString());
		
		//2.Lazy
		System.out.println("Lazy initialization");
		ManagerSpitalLazy managerLazy1=ManagerSpitalLazy.getInstaLazy("Marcel", 30, 1067);
		ManagerSpitalLazy managerLazy2=ManagerSpitalLazy.getInstaLazy("Gigi", 34, 1068);

		managerLazy2.setVarsta(40);
		managerLazy2.setNume("Ionel");
		
		
		System.out.println( managerLazy1.toString());
		System.out.println(managerLazy2.toString());
		
	}

}
