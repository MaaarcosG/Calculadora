import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main_Prueba {
	public static void main(String [] args) {
		try {
			/*Abrimos el archivo de texto*/
			FileInputStream archivo = new FileInputStream("datos.txt");
			/*Objeto de entrada*/
			DataInputStream entrada = new DataInputStream(archivo);
			/*Buffer, que seriva para lectura*/
			BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
		} catch (Exception e) {
			/**/
			System.err.println("Ocurrio un error" + e.getMessage());
		}
	}
}
