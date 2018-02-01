import java.io.*;

public class Main_Prueba {
	
	
	
	private static Stack<Integer> dato = new StackVector<Integer>(); 
	
	public static void main(String [] args) {
		
		Calculadora leer = new Calculadora();
		String line = "";
		int resultado = 0;
		int num1 = 0;
		int num2 =0;
		try {
		
			/*Abrimos el archivo de texto*/
			FileInputStream archivo = new FileInputStream("datos.txt");
			/*Objeto de entrada*/
			DataInputStream entrada = new DataInputStream(archivo);
			/*Buffer, que servira para lectura*/
			BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
			/*Leer archivo*/
			
			if ((line=buffer.readLine()) != null) {
				System.out.println(line.replace("", ""));
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
		
		for(int i=0; i < line.length(); i++) {
			if(line.charAt(i) == '+') {
				num1 = dato.pop();
				num2 = dato.pop();
				resultado = num1 + num2;
				dato.push(resultado);
				
			} if(line.charAt(i) == '-') {
				num1 = dato.pop();
				num2 = dato.pop();
				resultado = num1 - num2;
				dato.push(resultado);
			} if(line.charAt(i) == '*') {
				num1 = dato.pop();
				num2 = dato.pop();
				resultado = num1 * num2;
				dato.push(resultado);
			} if(line.charAt(i) == '/') {
				num1 = dato.pop();
				num2 = dato.pop();
				resultado = num2 / num1;
				dato.push(resultado);
			}
			if (Character.getNumericValue(line.charAt(i)) >= 0) {
				int datos = Character.getNumericValue(line.charAt(i));
				dato.push(datos);
			}
		}
		System.out.print("resultado "  +  dato.pop());
	}
}
