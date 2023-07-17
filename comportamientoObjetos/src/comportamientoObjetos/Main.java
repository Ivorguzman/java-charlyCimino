package comportamientoObjetos;

public class Main {

	public static void main(String[] args) {

		CuentaBancaria cb = new CuentaBancaria("miAlias", "Dolar", "Cuenta de ahorro");

		CuentaBancaria cb2 = new CuentaBancaria("Dolar", "Cuenta de ahorro");

		CuentaBancaria cb3 = new CuentaBancaria();

		System.out.println("");
		// cb.mostrarDatos();
		cb2.mostrarDatos();
		cb3.mostrarDatos();

}
}