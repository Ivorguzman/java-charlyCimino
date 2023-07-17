package muestrastatic;

public class Principal {

	public static void main(String[] args) {
		
		Auto a1 = new Auto("XYZ123", "Tiaf", 30000, "Azul");
		Auto a2 = new Auto("XYZ234", "Drof", 40000, "Rojo");
		Auto a3 = new Auto("XYZ345", "Geupot", 60000, "Azul");
		Auto a4 = new Auto("XYZ456", "Tiaf", 50000, "Verde");
		

		a1.setDescuento(10);

		System.out.printf("Precio del auto %.2f$   |  Descuento:%.2f$   |  Precio Promocional %.2f$    ===>  ",
				a1.getPrecio(),
				a1.getDescuento(), a1.precioPromocional());// muestrastatic.Auto@626b2d4a
		System.out.println(a1);// muestrastatic.Auto@5e265ba4

		System.out.printf("Precio del auto %.2f$   |  Descuento:%.2f$   |  Precio Promocional %.2f$    ===>  ",
				a2.getPrecio(),
				a2.getDescuento(), a2.precioPromocional());
		System.out.println(a2);// muestrastatic.Auto@5e265ba4

		System.out.printf("Precio del auto %.2f$   |  Descuento:%.2f$   |  Precio Promocional %.2f$    ===>  ",
				a3.getPrecio(),
				a3.getDescuento(), a3.precioPromocional());
		System.out.println(a3);// muestrastatic.Auto@156643d4

		System.out.printf("Precio del auto %.2f$   |  Descuento:%.2f$   |  Precio Promocional %.2f$    ===>  ",
				a4.getPrecio(),
				a4.getDescuento(), a4.precioPromocional());
		System.out.println(a4);// muestrastatic.Auto@123a439b


		System.out.println("");
		System.out.println(
				"______________________________________________________________________________________________________________________________________");
		System.out.println("");


		Auto.setAnularDescuento();


		System.out.printf("Precio del auto %.2f$   |  Descuento:%.2f$   |  Precio Promocional %.2f$    ===>  ",
				a1.getPrecio(), a1.getDescuento(), a1.precioPromocional());// muestrastatic.Auto@626b2d4a
		System.out.println(a1);// muestrastatic.Auto@5e265ba4

		System.out.printf("Precio del auto %.2f$   |  Descuento:%.2f$   |  Precio Promocional %.2f$    ===>  ",
				a2.getPrecio(), a2.getDescuento(), a2.precioPromocional());
		System.out.println(a2);// muestrastatic.Auto@5e265ba4

		System.out.printf("Precio del auto %.2f$   |  Descuento:%.2f$   |  Precio Promocional %.2f$    ===>  ",
				a3.getPrecio(), a3.getDescuento(), a3.precioPromocional());
		System.out.println(a3);// muestrastatic.Auto@156643d4

		System.out.printf("Precio del auto %.2f$   |  Descuento:%.2f$   |  Precio Promocional %.2f$    ===>  ",
				a4.getPrecio(), a4.getDescuento(), a4.precioPromocional());
		System.out.println(a4);// muestrastatic.Auto@123a439b


	}


}
