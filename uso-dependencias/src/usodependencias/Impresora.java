package usodependencias;

public class Impresora {

	public boolean estaEncendida;


	public void setEstadoDeLaImpresora() {
		System.out.println("9 Estado de la Impresora\n" + this.estaEncendida);
	}

	public void encender() {
		this.estaEncendida = true;
	}

	public void imprimir(Documento documento) { // Relacion de Uso ó Dependencia entre clase Impresora y Documento
		if (this.estaEncendida) {
			System.out.println("Imprimir doc" + documento.getTitulo());
			System.out.println("*************************");
			System.out.println(documento.getCuerpo());
			System.out.println("*************************");
		} else {
			System.out.println("Impresora apagada");
		}

	}



}
