package model;

public class Acessorio extends Equipamento{

	private String descricao ;
	
	public Acessorio(String identificador,int quantidade, String descricao) {
		super(identificador,quantidade);
		this.descricao = descricao; 
	}
	
	public Acessorio() {
		super();
	}
	
	public Acessorio(String identificador, int quantidade) {
		this(identificador, quantidade,null);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String toString() {
		return "Acessorio - " + super.toString() + " - " + this.getIdentificador();
	}
}
