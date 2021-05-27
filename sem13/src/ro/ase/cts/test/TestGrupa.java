package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;

public class TestGrupa {

	@Test
	public void testConstructorRight() {
		int nrGrupa=1076;
		Grupa grupa=new Grupa(nrGrupa);
		assertEquals(nrGrupa, grupa.getNrGrupa());
	}
	@Test
	public void testConstructorBounderyInferioara() {
		int nrGrupa=1000;
		Grupa grupa=new Grupa(nrGrupa);
		assertEquals(nrGrupa, grupa.getNrGrupa());
	}
	@Test
	public void testConstructorBounderySuperioara() {
		int nrGrupa=1100;
		Grupa grupa=new Grupa(nrGrupa);
		assertEquals(nrGrupa, grupa.getNrGrupa());
	}
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorMaiMic() {
		int nrGrupa=100;
		Grupa grupa=new Grupa(nrGrupa);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorMaiMare() {
		int nrGrupa=11001;
		Grupa grupa=new Grupa(nrGrupa);
	}
	@Test(timeout = 500)
	public void testConstructorPerformance() {
		Grupa grupa=new Grupa(1077);
	}
	@Test
	public void testConstructorExistence() {
		Grupa grupa=new Grupa(1077);
		assertNotNull(grupa.getStudenti());
	}
	

}
