package exception;

public class TipoIncompativelException extends Exception{

	private String id;
	private String tipoEncontrado;
	private String tipoEsperado;
	
	public TipoIncompativelException(String id, String tipoEsperado, String tipoEncontrado) {
		this.id = id;
		this.tipoEncontrado = tipoEncontrado;
		this.tipoEsperado = tipoEsperado;
	}
	
	public String getTipoEncontrado() {
		return tipoEncontrado;
	}
	
	public String getTipoEperado() {
		return tipoEsperado;
	}
	
	public String getId() {
		return id;
	}
}
