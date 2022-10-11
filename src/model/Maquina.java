package model;

public class Maquina extends Equipamento{

	private String descricao;
	private String marca;
	
	public Maquina(String identificador, int quantidade, String descricao,String marca) {
		super(identificador,quantidade);
		this.descricao = descricao;
		this.marca = marca;
	}
	
	public Maquina(String identificador, int quantidade) {
		this(identificador, quantidade,null,null);
	}
	
	public Maquina() {
		super();
	}

	public String getDescricao() {
		return descricao;
	}

	public String getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Maquina = " + super.toString()
							+ (this.getDescricao() != null ? " - " + this.getDescricao() : "")
									+ (this.getMarca() != null ? " - " + this.getMarca() : "");
	}
	
	
}






