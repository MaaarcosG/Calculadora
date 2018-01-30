import javax.swing.JOptionPane;
import java.io.*;

public class Main_Prueba {
	
	private static Stack<Integer> dato = new StackArrayList<Integer>(); 
	
	public static void main(String [] args) {
		
		Calculadora leer = new Calculadora();
		
		try {
		
			/*Abrimos el archivo de texto*/
			FileInputStream archivo = new FileInputStream("datos.txt");
			/*Objeto de entrada*/
			DataInputStream entrada = new DataInputStream(archivo);
			/*Buffer, que servira para lectura*/
			BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
			/*Leer archivo*/
			
			while (buffer.readLine() != null) {
				String line=buffer.readLine();
				System.out.println(line);
				System.out.println("estado 1");
			}
			System.out.println("estado 2");
			entrada.close();
		
		} 
		catch (Exception e) {
			/*Mensaje de error*/
			System.err.println("Ocurrio un error " + e.getMessage());
			System.out.println("estado 3");
		}
		
		//System.out.println("El resultado es de: " + dato.pop());
	}
}
