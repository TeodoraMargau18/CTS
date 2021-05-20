package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {

	private Student student;
	
	
	
	@Test
	public void testConstructorCuParametru() {
		String nume = "Georgel";
		Student s1 = new Student(nume);

		assertEquals(nume, s1.getNume());

	}

	@Test
	public void testConstructorFaraParamestru() {
		Student s2 = new Student();
		assertEquals("Student", s2.getNume());
	}

	@Test
	public void testAreRestanta() {
		Student s3 = new Student();
		s3.setNume("Ionel");
		s3.adaugaNota(5);
		s3.adaugaNota(3);
		assertTrue("Studentul cu restanta este marcat ca neavand restanta", s3.areRestante());
	}

	@Test
	public void testNuAreRestanta() {
		Student s4 = new Student();
		s4.setNume("Ionel");
		s4.adaugaNota(5);
		s4.adaugaNota(5);
		assertFalse("Studentul fara restanta " + "este marcat ca avand restanta", s4.areRestante());
	}

	@Test
	public void testAdaugaNotaNumarNote() {
		Student s5 = new Student("George");
		s5.adaugaNota(5);
		assertEquals(1, s5.getNote().size());
	}

	@Test
	public void testNotaAdaugataCorecta() {
		Student s5 = new Student("George");
		int nota = 10;
		s5.adaugaNota(nota);
		assertEquals(nota, s5.getNota(0));
	}

	@Test
	public void testCalculeazaMedie() {
		Student student = new Student("George");
		int nota = 10;
		int nota2 = 9;
		student.adaugaNota(nota);
		student.adaugaNota(nota2);
		assertEquals(9.5, student.calculeazaMedie(), 0.01);
	}

	@Test
	public void testCalculeazaMedieFaraNote() {
		Student student = new Student("George");
		assertEquals(0, student.calculeazaMedie(), 0.01);
	}

	@Test
	public void testCalculeazaMedieONota() {

		Student student = new Student("George");
		int nota = 9;
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(), 0.01);
	}

	@Test
	public void testNotaIntrodusaEsteIncorecta() {

		Student student = new Student("George");
		int nota = 14;
//			1
		try {
//			2
			student.adaugaNota(nota);
//			3
			fail("Nu trebuia sa ajunga aici! "
					+ "Metoda trebuia sa arunce o exceptie sau orice alt mesaj!");

		} catch (IllegalArgumentException e) {
//			4
		}
//		5

	}
	@Test(expected=IllegalArgumentException.class)
	public void testNotaIntrodusaEsteIncorectaJU4() {
		Student student = new Student("George");
		int nota = -9;
		student.adaugaNota(nota);
	}
}