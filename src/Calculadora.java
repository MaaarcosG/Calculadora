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
	
}
