package tel_don_ask;


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

	// SETTERS Y GETTERS
	public void setMotor(Motor motor) {
		if (motor == null) {
			throw new IllegalArgumentException(" ERROR: Parametro imcorrecto");
		}
		this.motor = motor;
	}


	public Motor getMotor() {
		return this.motor;
	}



	public void acelerar() {
		/*
		 * // Codigo mal diseñado de baja calidad
		 * this.motor.setRpmActuales(this.motor.getRpmActuales() + 1000);
		 */

		// Codigo Bien realizado de buena calidad.
		this.motor.acelerar();
	}


}





