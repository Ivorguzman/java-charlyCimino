package atributosobjeto;

public class Motor {
	// VARIAVLES DE CLASE ( Atributos )
	private String numero;
	private double litros;
	private String tipo;




	/**
	 * CONSTRUCTOR
	 * @author Alexander
	 * @param numero
	 * @param litros
	 * @param tipo
	 */
	public Motor(String numero, double litros, String tipo) {
		this.numero = numero;
		this.litros = litros;
		this.tipo = tipo;
	}


	@Override public String toString() {
		return "Motor [numero=" + this.numero + ", litros=" + this.litros + ", tipo=" + this.tipo + "]";
	}


	public double getLitros() {
		return this.litros;
	}


	public void setLitros(double litros, String numero) {
		if (litros != 1.3 && litros != 1.6 && litros != 2.3 && litros != 3.0 && litros != 4.0) {
			throw new IllegalArgumentException(" ERROR : Litros aceptados = 1.3 | 1.6 | 2.3 | 3.0 | 4.0 | ");
		}
		if (numero == "" || numero == null) {
			throw new IllegalArgumentException(" ERROR: Indique serial del Motor");
		}
		this.litros = litros;
		this.numero = numero;
	}






}
