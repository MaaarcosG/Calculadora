import javax.swing.JOptionPane;
import java.io.*;

public class Main_Prueba {
	
	private static Stack<Integer> dato = new StackArrayList<Integer>(); 
	
	public static void main(String [] args) {
		String linea1 = "";
		String linea2 = "";
		Calculadora leer = new Calculadora();
		
		try {
		
			/*Abrimos el archivo de texto*/
			FileInputStream archivo = new FileInputStream("datos.txt");
			/*Objeto de entrada*/
			DataInputStream entrada = new DataInputStream(archivo);
			/*Buffer, que servira para lectura*/
			BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
			/*Leer archivo*/
			linea1 = buffer.readLine();
			if (linea1 == null) {
				System.err.println("El .txt esta vacio");
			}
			else {
				linea2 = linea1;
				System.out.println("Lo que esta en el archivo del texto: " + linea2);
			}
			
			entrada.close();
		
		} 
		catch (Exception e) {
			/*Mensaje de error*/
			System.err.println("Ocurrio un error " + e.getMessage());
			System.out.println("estado 2");
		}
		
		//System.out.println("El resultado es de: " + dato.pop());
	}
}
