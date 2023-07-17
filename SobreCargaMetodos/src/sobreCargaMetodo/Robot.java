package sobreCargaMetodo;

public class Robot {

	private String nombre;

	public Robot(String nombre) { // CONSTRUCTOR
		System.out.println("8_this public class Robot ==> " + this);
		this.setNombre(nombre);

	}

	// SETTERS

	public void setNombre(String nombre) {

		if (nombre != null) {
			this.nombre = nombre;
		}
	}

//************************************************************************************************

	public void saludar(String nombrePresona) { // metodo saludar

		System.out.println("Hola , " + nombrePresona + " soy un Robot y me llamo " + this.nombre);

	}

	/*
	 * SOBRE CARGA DE METODO metodo saludar sin parametro llama metodo saludar con
	 * parametro
	 * 
	 */
	public void saludar() { // metodo saludar
		System.out.println("36_this public void saludar() ==>" + this);
		this.saludar("desconocido, USANDO METODO SOBRECARGADO saludar()");
		// System.out.println("Hola, no te conosco soy un Robot y me llamo " +
		// this.nombre);

	}

}

