package muestrastatic;

public class Auto {
	// VARIABLES DE INSTANCIA:(Solo pueden ser invocada por las instacias)
	private String patente;
	private String marca;
	private double precio;
	private String color;
	// private double dcto;

	// VARIABLE DE CLASE: (Solo puede ser invocada por la clase)
	private static double dcto;

	// CONTRUCTOR:
	public Auto(String patente, String marca, double precio, String color) {

		this.patente = patente;
		this.marca = marca;
		this.precio = precio;
		this.color = color;

		// this.dcto = 10;// representa el descuento del 10%
		// Auto.dcto = 10;// representa el descuento del 10%

		/*
		 * System.out.println("Linea 10 " + this); System.out.println("Linea 11 " + *
		 * Auto.dcto);
		 */
	}

	@Override
	public String toString() {
		return "Auto [patente=" + this.patente + ", marca=" + this.marca + ", color=" + this.color + "]";
	}
	/*
	 * @Override public String toString() { return "Auto [patente=" + this.patente +
	 * ", marca=" + this.marca + ", precio=" + this.precio + ", color=" + this.color
	 * + "]"; }
	 */

	/*
	 * @Override public String toString() { return "Auto [patente=" + this.patente +
	 * ", marca=" + this.marca + ", precio=" + this.precio + ", color=" + this.color
	 * + ", dcto=" + this.dcto + "]"; }
	 */


	public double getDescuento() {
		return this.precio * Auto.dcto / 100;
	}

	public void setDescuento(double dcto) {
		Auto.dcto = dcto;
	}

	public static void setAnularDescuento() {
		Auto.dcto = 0;
	}
	public double getPrecio() {
		return this.precio;
	}

	public double precioPromocional() {
		return this.precio - this.precio * Auto.dcto / 100;
	}



}
