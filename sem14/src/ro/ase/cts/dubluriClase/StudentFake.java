package ro.ase.cts.dubluriClase;

import java.util.List;

import ro.ase.cts.clase.IStudent;

public class StudentFake implements IStudent {
	
	private String valoareGetNume;
	private float valoareGetMedie;
	private int valoareGetNota;
	private boolean valoareAreRestante;
	
	
//Setteri prnetru Fake
	public void setValoareGetNume(String valoareGetNume) {
		this.valoareGetNume = valoareGetNume;
	}

	public void setValoareGetMedie(float valoareGetMedie) {
		this.valoareGetMedie = valoareGetMedie;
	}

	public void setValoareGetNota(int valoareGetNota) {
		this.valoareGetNota = valoareGetNota;
	}

	public void setValoareAreRestante(boolean valoareAreRestante) {
		this.valoareAreRestante = valoareAreRestante;
	}
//--End setteri Fake
	@Override
	public String getNume() {
		return this.valoareGetNume;
	}

	@Override
	public void setNume(String nume) {
		this.valoareGetNume=nume;
		
	}

	@Override
	public List<Integer> getNote() {
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public float calculeazaMedie() {
		return valoareGetMedie;
	}

	@Override
	public int getNota(int index) {
		return valoareGetNota;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return valoareAreRestante;
	}

}
