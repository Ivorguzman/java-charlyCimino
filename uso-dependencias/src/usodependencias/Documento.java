package usodependencias;

public class Documento {
	private String titulo;
	private String cuerpo;

	/**
	 * @param titulo
	 * @param cuerpo
	 */
	public Documento(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public String getCuerpo() {
		return this.cuerpo;
	}






}
