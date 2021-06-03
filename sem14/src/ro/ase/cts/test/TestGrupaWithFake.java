package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.CategorieTestePromovabilitate;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.dubluriClase.StudentFake;

public class TestGrupaWithFake {
	Grupa grupa;

	@Test
	@Category(CategorieTestePromovabilitate.class)
	public void testPromovabiliateRight() {
		grupa = new Grupa(1076);
		for (int i = 0; i < 8; i++) {
			StudentFake s = new StudentFake();
			s.setValoareAreRestante(false);
			grupa.adaugaStudent(s);
		}
		for (int i = 0; i < 2; i++) {
			StudentFake s = new StudentFake();
			s.setValoareAreRestante(true);
			grupa.adaugaStudent(s);
		}
		assertEquals(0.8f, grupa.getPromovabilitate(),0.01);
	}
}