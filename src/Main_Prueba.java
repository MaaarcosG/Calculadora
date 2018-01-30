import javax.swing.JOptionPane;
import java.io.*;

public class Main_Prueba {
	
	
	
	private static Stack<Integer> dato = new StackArrayList<Integer>(); 
	
	public static void main(String [] args) {
		
		Calculadora leer = new Calculadora();
		String line = "";
		try {
		
			/*Abrimos el archivo de texto*/
			FileInputStream archivo = new FileInputStream("datos.txt");
			/*Objeto de entrada*/
			DataInputStream entrada = new DataInputStream(archivo);
			/*Buffer, que servira para lectura*/
			BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
			/*Leer archivo*/
			
			if ((line=buffer.readLine()) != null) {
				line=line.replace("", "");
				System.err.println(leer.calcular(line));
			}
			else {
				System.err.println("El .txt esta vacio");
			}
			
			entrada.close();
		
		} 
		catch (Exception e) {
			/*Mensaje de error*/
			System.err.println("Ocurrio un error " + e.getMessage());
			System.out.println("estado 2");
		}
		
		System.out.print("resultado "  +  dato.pop());
	}
}
