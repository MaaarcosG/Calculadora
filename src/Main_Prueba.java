import java.io.*;

public class Main_Prueba {
	
	
	
	private static Stack<Integer> dato = new StackVector<Integer>(); 
	
	public static void main(String [] args) {
		
		Calculadora leer = new Calculadora();
		String expresion = "";
		try {
		
			/*Abrimos el archivo de texto*/
			FileInputStream archivo = new FileInputStream("datos.txt");
			/*Objeto de entrada*/
			DataInputStream entrada = new DataInputStream(archivo);
			/*Buffer, que servira para lectura*/
			BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
			/*Leer archivo*/
			
			if ((expresion=buffer.readLine()) != null) {
				System.out.println(expresion.replace("",""));
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
		/*Metodo*/
		leer.calcular(expresion);
		System.out.print("resultado "  +  dato.pop());
	}
}
