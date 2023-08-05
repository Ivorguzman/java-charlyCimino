package usodependencias;

public class Principal {

	public static void main(String[] args) {
		Documento doc1 = new Documento("Prueba", "Este es un \ntexto de prueba");
		Impresora imp = new Impresora();


		imp.encender();
		imp.setEstadoDeLaImpresora();
		imp.imprimir(doc1);


		// System.out.println("Imprimir doc" + doc1.getTitulo());

	}
}
