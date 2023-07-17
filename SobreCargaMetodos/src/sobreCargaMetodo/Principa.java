package sobreCargaMetodo;

public class Principa {
	public static void main(String[] args) {

		Robot elRobot = new Robot("javaBot"); // creando objeto

		elRobot.saludar("Ivor"); // invocando metodo saludar del objeto

		elRobot.saludar();

		System.out.println("12_this public class Principa ==> " + elRobot);

	}

}
