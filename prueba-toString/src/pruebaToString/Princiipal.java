package pruebaToString;

public class Princiipal {

	public static void main(String[] args) {
		Persona per1 = new Persona("Fulano", "Perez", 25, false);
		Persona per2 = new Persona("Maria", "Perez", 28, false);
		Persona per3 = new Persona("Sutano", "Roriguez", 33, true);

		System.out.println(per1);
		System.out.println(per2);
		System.out.println(per3);
		System.out.println("Linea 13 " + per3.toString());

	}

}
