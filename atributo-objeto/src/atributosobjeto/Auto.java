package atributosobjeto;

public class Auto {

	// VARIABLES DE INSTANCIA:(Solo pueden ser invocada por las instacias)
	private String patente;
	private String marca;
	private double precio;
	private String color;
	private Motor motor;






	/**
	 * @author Alexander
	 * @param patente
	 * @param marca
	 * @param precio
	 * @param color
	 * @param motor
	 */
	public Auto(String patente, String marca, double precio, String color, Motor motor) {
		this.patente = patente;
		this.marca = marca;
		this.precio = precio;
		this.color = color;
		this.motor = motor;
	}

	@Override public String toString() {
		return "Auto [patente=" + this.patente + ", marca=" + this.marca + ", precio=" + this.precio + ", color="
				+ this.color + ", motor=" + this.motor + "]";
	}






}





