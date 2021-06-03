package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.dubluriClase.StudentDummy;

public class TestGrupaWithDummy {
	Grupa grupa;

	@Test
	public void testAdaugaStudenti() {
		grupa=new Grupa(1077);
		IStudent s1=new StudentDummy();
		IStudent s2=new StudentDummy();
		IStudent s3=new StudentDummy();
		
		grupa.adaugaStudent(s1);
		grupa.adaugaStudent(s2);
		grupa.adaugaStudent(s3);
		
		assertEquals(3, grupa.getStudenti().size());
	}
	

}
