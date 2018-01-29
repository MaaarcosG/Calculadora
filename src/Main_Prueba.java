import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main_Prueba {
	public static void main(String [] args) {
		String line1 = "";
		String line2 = "";
		try {
			/*Abrimos el archivo de texto*/
			FileInputStream archivo = new FileInputStream("datos.txt");
			/*Objeto de entrada*/
			DataInputStream entrada = new DataInputStream(archivo);
			/*Buffer, que seriva para lectura*/
			BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
			/*Leer archivo*/
			while ((line1 = buffer.readLine()) != null) {
				/*Imprime linea*/
				line2 = line1;
				System.out.println("Operaciones ingresada " + line1);
			}
			entrada.close();
		} catch (Exception e) {
			/*Mensaje de error*/
			System.err.println("Ocurrio un error " + e.getMessage());
		}
	}
}
