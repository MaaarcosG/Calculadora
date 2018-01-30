import javax.swing.JOptionPane;

public class Main_Prueba {
	private static Stack<String> datos;
	public static void main(String [] args) {
		
		Calculadora leer = new Calculadora();
		String line1 = "";
		String expresion = "";
		leer.abrirArchivo(line1, expresion);
		System.out.println("El resultado es de: " + datos.pop());
	}
}
