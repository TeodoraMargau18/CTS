package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.dubluriClase.StudentDummy;
import ro.ase.cts.dubluriClase.StudentStub;

public class TestGrupaWithStub {

	Grupa grupa;
	@Test
	public void testGetPromovabilitate() {
		grupa=new Grupa(1077);
		IStudent s1=new StudentStub();
		
		grupa.adaugaStudent(s1);
		
		
		assertEquals(1,grupa.getPromovabilitate(),0.01);
	}

}
