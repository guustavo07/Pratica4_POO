package Questao4;

public class automovel {
	private boolean abs;
	private boolean airBag;
	private boolean alarme;
	private boolean som;
	private boolean conjuntoEletrico;
	private boolean computadorBordo;
	private double precoBase;
	private double precoFinal;
	
	automovel(double precobase, boolean abs, boolean airBag, boolean alarme, boolean som, boolean conjuntoEletrico, boolean computadorBordo){
		setAbs(abs);
		setAirBag(airBag);
		setAlarme(alarme);
		setSom(som);
		setConjuntoEletrico(conjuntoEletrico);
		setComputadorBordo(computadorBordo);
		this.precoBase = precobase;
	}

	public boolean isAbs() {
		return abs;
	}

	public void setAbs(boolean abs) {
		this.abs = abs;
		
	}

	public boolean isAirBag() {
		return airBag;
	}

	public void setAirBag(boolean airBag) {
		this.airBag = airBag;
	}

	public boolean isAlarme() {
		return alarme;
	}

	public void setAlarme(boolean alarme) {
		this.alarme = alarme;
	}

	public boolean isSom() {
		return som;
	}

	public void setSom(boolean som) {
		this.som = som;
	}

	public boolean isConjuntoEletrico() {
		return conjuntoEletrico;
	}

	public void setConjuntoEletrico(boolean conjuntoEletrico) {
		this.conjuntoEletrico = conjuntoEletrico;
	}

	public boolean isComputadorBordo() {
		return computadorBordo;
	}

	public void setComputadorBordo(boolean computadorBordo) {
		this.computadorBordo = computadorBordo;
	}

	public double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}

	public double getPrecoFinal() {
		return precoFinal;
	}

	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}
	
}