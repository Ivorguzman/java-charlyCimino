package pruebaToString;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private boolean tieneHijos;

	public Persona(String nombre, String apellido, int edad, boolean tieneHijos) {
		System.out.println("10_ public Persona(...)" + this);
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.tieneHijos = tieneHijos;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public int getEdad() {
		return this.edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + this.nombre + ", apellido=" + this.apellido + ", edad=" + this.edad
				+ ", tieneHijos=" + this.tieneHijos + "]";
	}

}
