import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author Marcos Gutierrez 			17909
 * @author Raul Monzon					17014
 * @since 26 de enero 2018
 */
public class Calculadora implements CalculadoraI {
	/*Atributos de la clase*/
	private static Stack<Integer> datos = new StackArrayList<Integer>();
	
	 /*Constructor de la clase*/
	public Calculadora() {
		
	}
	@Override
	public String calcular(String expresion) {
	
		return expresion;
	}
	/**
	 * Este metodo sirve para abrir el documento tipo texto
	 */
	public void abrirArchivo(String line1, String expresion) {
		try {
			/*Abrimos el archivo de texto*/
			FileInputStream archivo = new FileInputStream("datos.txt");
			/*Objeto de entrada*/
			DataInputStream entrada = new DataInputStream(archivo);
			/*Buffer, que servira para lectura*/
			BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
			/*Leer archivo*/
			while ((line1 = buffer.readLine()) != null) {
				/*Imprime linea*/
				expresion = line1;
				System.out.println("Operaciones ingresada " + line1);
			}
			entrada.close();
		} catch (Exception e) {
			/*Mensaje de error*/
			System.err.println("Ocurrio un error " + e.getMessage());
		}
	}
}
