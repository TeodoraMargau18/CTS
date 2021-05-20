package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume = "Georgel";
		Student s1 = new Student(nume);

		assertEquals(nume,s1.getNume());
		
	}
	
	@Test
	public void testConstructorFaraParamestru() {
		Student s2=new Student();
		assertEquals("Student", s2.getNume());
	}
	
	
	@Test
	public void testAreRestanta() {
		Student s3=new Student();
		s3.setNume("Ionel");
		s3.adaugaNota(5);
		s3.adaugaNota(3);
		assertTrue("Studentul cu restanta este marcat ca neavand restanta",s3.areRestante());
	}
	@Test
	public void testNuAreRestanta() {
		Student s4=new Student();
		s4.setNume("Ionel");
		s4.adaugaNota(5);
		s4.adaugaNota(5);
		assertFalse("Studentul fara restanta "
				+ "este marcat ca avand restanta",
				s4.areRestante());
	}
	
	@Test
	public void testAdaugaNotaNumarNote() {
		Student s5=new Student("George");
		s5.adaugaNota(5);
		assertEquals(1, s5.getNote().size());
	}
	
	@Test
	public void testNotaAdaugataCorecta() {
		Student s5=new Student("George");
		int nota=10;
		s5.adaugaNota(nota);
		assertEquals(nota, s5.getNota(0));
	}
}