package model;

public class Halteres extends Equipamento{

	private double peso;
	
	public Halteres(String identificador, int quantidade, double peso) {
		super(identificador, quantidade);
		this.peso = peso;
	}
	
	public Halteres(String identificador, int quantidade) {
		this(identificador, quantidade, 0);
		this.peso = peso;
	}
	
	public Halteres() {
		super();
	}

	public double getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Helteres = " + super.toString() + " - "
				+ this.getPeso() + "Kg.";
	}
}
