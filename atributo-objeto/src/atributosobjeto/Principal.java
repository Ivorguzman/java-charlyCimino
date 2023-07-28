package atributosobjeto;

public class Principal {

	public static void main(String[] args) {




		// 2) Forma Corta de hacerlo
		Motor motor1 = new Motor("A-123", 1.3, "Nafta");
		Motor motor2 = new Motor("B-456", 1.6, "Nafta");
		Motor motor3 = new Motor("C-789", 2.3, "Nafta");
		Auto auto1 = new Auto("XYZ456", "Tiaft", 34136, "verde", motor1);
		Auto auto2 = new Auto("ABC456", "Prenault", 42136, "azul", motor2);
		Auto auto3 = new Auto("DEF151617", "Pinsubiche", 49800, "negro", motor1);


		System.out.println("motor1 ==> " + motor1);
		System.out.println("auto1 ==> " + auto1);
		System.out.println("");

		System.out.println("motor2 ==>" + motor2);
		System.out.println("auto2 ==> " + auto2);
		System.out.println("");

		System.out.println("motor1 ==>" + motor1);
		System.out.println("auto3 ==> " + auto3);



		motor2.setLitros(4, "D-101112");


		System.out.println("");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("");


		System.out.println("Nuevo  VALOR DE:  motor1 ==> " + motor1);
		System.out.println("auto1 ==> " + auto1);
		System.out.println("");

		System.out.println("motor2 ==> " + motor2);
		System.out.println("auto2 ==> " + auto2);
		System.out.println("");

		System.out.println("motor1 ==>" + motor1);
		System.out.println("auto3 ==> " + auto3);






	}


	

}

