package comportamientoObjetos;


public class CuentaBancaria {

	String CTA;
	String alias;
	double saldo;
	private String moneda;
	private String tipo;

	/*
	 * CONTRUCTOR: No tiene tipo de retorno, por definicón debuelve la referencia
	 * (...@626b2d4a) del objeto que crea, se ejecuta una sola vez en el ciclo de
	 * vida del objeto.
	 */

	public CuentaBancaria(String alias, String moneda, String tipo) {
		System.out.println("this cb ==> " + this);
		this.CTA = this.generarCTA();
		this.setAlias(alias);
		this.setMoneda(moneda);
		this.setTipo(tipo);

	}


	// SOBRE CARGA DE CONSTRUCTORES 1
	public CuentaBancaria(String moneda, String tipo) {
		this("Alias.por.defecto", moneda, tipo); // INVOCANDO CONSRUCTOR

		/*
		 * this.CTA = this.generarCTA(); this.setAlias("ALIAS.POR.DEFECTO");
		 * this.setMoneda(moneda); this.setTipo(tipo);
		 */

		System.out.println("this cb2 ==> " + this);
	}

	// SOBRE CARGA DE CONSTRUCTORES 2 **Parecido al que se crea en forma implicita**
	public CuentaBancaria() {
		System.out.println("this cb3 ==> " + this);
	}

	// FIN SOBRE CARGA DE CONSTRUCTORES


	private String generarCTA() {
		return "123-1233-2123-4432-1111";
	}


	public void mostrarDatos() {
		System.out.println("CTA ==> " + this.CTA);
		System.out.println("alias ==> " + this.alias);
		System.out.println("saldo ==> " + this.saldo);
		System.out.println("moneda ==> " + this.moneda);
		System.out.println("tipo ==> " + this.tipo);
		System.out.println("");
	}

	double obtenerSaldo() {
		System.out.print("Saldo Disponible  : ==> ");
		return this.saldo; // metodo que debuelve algo distinto de void
	}

// GETERS Y SETTERS

	public String getAlias() {
		return this.alias;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setMoneda(String moneda) {
		if (moneda != null) {
			this.moneda = moneda;
		} else {
			System.out.println("Verifique parametro moneda");
		}
	}

	public void setTipo(String tipo) {
		if (tipo != null) {
			this.tipo = tipo;
		} else {
			System.out.println("Verifique parametro tipo");
		}
	}

	public void setAlias(String alias) {
		if (alias != null) {
			this.alias = alias;
		} else {
			System.out.println("Verifique parametro alias");
		}
	}



}
