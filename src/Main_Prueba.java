import javax.swing.JOptionPane;

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
		
		System.out.println("El resultado es de: " + dato.pop());
	}
}
