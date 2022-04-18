package Questao4;

public class Automovel {
	public boolean abs, airBag, alarme, som, conjuntoEletrico, compDeBordo;
	public double valBase;
	public Automovel(boolean abs, boolean airBag, boolean alarme, boolean som, boolean conjuntoEletrico,
			boolean compDeBordo, double valBase) {
		super();
		this.abs = abs;
		this.airBag = airBag;
		this.alarme = alarme;
		this.som = som;
		this.conjuntoEletrico = conjuntoEletrico;
		this.compDeBordo = compDeBordo;
		this.valBase = valBase;
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
	public boolean isCompDeBordo() {
		return compDeBordo;
	}
	public void setCompDeBordo(boolean compDeBordo) {
		this.compDeBordo = compDeBordo;
	}
	public double getValBase() {
		return valBase;
	}
	public void setValBase(double valBase) {
		this.valBase = valBase;
	}
	public void calcularPrecoFinal() {
		
	}

}
