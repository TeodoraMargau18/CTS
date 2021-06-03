package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.CategorieTesteNormale;
import ro.ase.cts.categorii.CategorieTestePromovabilitate;
import ro.ase.cts.categorii.CategorieTesteUrgente;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class TestGrupa {
	Grupa grupa;

	@Before
	public void setUp() {
		grupa = new Grupa(1076);
		for (int i = 0; i < 10; i++) {
			Student student = new Student("Marcel" + i);
			student.adaugaNota(5);
			student.adaugaNota(10);
			student.adaugaNota(4);
			grupa.adaugaStudent(student);
		}
	}

	@Test
	@Category(CategorieTestePromovabilitate.class)
	public void testgetPromovabilitateRight() {

		for (int i = 0; i < 2; i++) {
			Student student = new Student("Ionel" + i);
			student.adaugaNota(5);
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}

		assertEquals(0.16, grupa.getPromovabilitate(), 0.01);
	}

	@Test
	@Category(CategorieTestePromovabilitate.class)
	public void testgetPromovabilitateBounderyInferior() {

		assertEquals(0, grupa.getPromovabilitate(), 0.01);
	}

	@Test(expected = IllegalArgumentException.class)
	@Category(CategorieTestePromovabilitate.class)
	public void testgetPromovabilitateError() {

		grupa=new Grupa(1080);
		grupa.getPromovabilitate();
	}
	@Test(timeout = 500)
	@Category({CategorieTestePromovabilitate.class,CategorieTesteNormale.class})
	public void testgetPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}
	
	
	
	
	@Test
	@Category(CategorieTestePromovabilitate.class)
	public void testgetPromovabilitateBounderySuperior() {
		grupa = new Grupa(1077);
		for (int i = 0; i < 10; i++) {
			Student student = new Student("Marcel" + i);
			student.adaugaNota(5);
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}

		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}

	@Test
	@Category(CategorieTesteNormale.class)
	public void testConstructorRight() {
		int nrGrupa = 1076;
		Grupa grupa = new Grupa(nrGrupa);
		assertEquals(nrGrupa, grupa.getNrGrupa());
	}

	@Test
	@Category(CategorieTesteUrgente.class)
	public void testConstructorBounderyInferioara() {
		int nrGrupa = 1000;
		Grupa grupa = new Grupa(nrGrupa);
		assertEquals(nrGrupa, grupa.getNrGrupa());
	}

	@Test
	@Category(CategorieTesteUrgente.class)
	public void testConstructorBounderySuperioara() {
		int nrGrupa = 1100;
		Grupa grupa = new Grupa(nrGrupa);
		assertEquals(nrGrupa, grupa.getNrGrupa());
	}

	@Test(expected = IllegalArgumentException.class)
	@Category(CategorieTesteUrgente.class)
	public void testConstructorErrorMaiMic() {
		int nrGrupa = 100;
		Grupa grupa = new Grupa(nrGrupa);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorMaiMare() {
		int nrGrupa = 11001;
		Grupa grupa = new Grupa(nrGrupa);
	}

	@Test(timeout = 500)
	@Category(CategorieTesteNormale.class)
	public void testConstructorPerformance() {
		Grupa grupa = new Grupa(1077);
	}

	@Test
	public void testConstructorExistence() {
		Grupa grupa = new Grupa(1077);
		assertNotNull(grupa.getStudenti());
	}

}
