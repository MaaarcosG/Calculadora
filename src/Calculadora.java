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
	String raul= "es bien hueco";
	/*Atributos de la clase*/
	private static Stack<Integer> datos = new StackArrayList<Integer>();
	
	
	/*Constructor de la clase*/
	public Calculadora() {
		
	}
	
	@Override
	public String calcular(String expresion) {
	
		return expresion;
	}
	
}
