package tel_don_ask;


public class Principal {


	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Motor motor = new Motor("A-123", 1.3, "Nafta");
		Auto auto = new Auto("XYZ456", "Tiaft", 34136, "verde", motor);



		/*
		 * // Codigo mal diseñado de baja calidad
		 * 
		 * System.out.println(auto.getMotor().getRpmActuales());
		 * 
		 * auto.getMotor().setRpmActuales(auto.getMotor().getRpmActuales() + 1000);
		 * System.out.println(auto.getMotor().getRpmActuales());
		 * 
		 * auto.getMotor().setRpmActuales(auto.getMotor().getRpmActuales() + 1000);
		 * System.out.println(auto.getMotor().getRpmActuales());
		 * 
		 * auto.getMotor().setRpmActuales(auto.getMotor().getRpmActuales() + 1000);
		 * System.out.println(auto.getMotor().getRpmActuales());
		 */


		// Codigo Bien realizado de buena calidad.
		System.out.println(auto);

		auto.acelerar();
		System.out.println(auto);

		auto.acelerar();
		System.out.println(auto);

		auto.acelerar();
		System.out.println(auto);

		auto.acelerar();
		System.out.println(auto);



	}



}
