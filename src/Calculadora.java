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

		int resultado = 0;
		int num1 = 0;
		int num2 =0;
		
		for (int i =0; i<expresion.length();i++) {
			if(expresion == "+") {
				num1 = dato.pop();
				num2 = dato.pop();
				resultado = num1 + num2;
				dato.push(resultado);
				
			} 
			if(line.charAt(i) == '-') {
				num1 = dato.pop();
				num2 = dato.pop();
				resultado = num1 - num2;
				dato.push(resultado);
			} 
			if(line.charAt(i) == '*') {
				num1 = dato.pop();
				num2 = dato.pop();
				resultado = num1 * num2;
				dato.push(resultado);
			} 
			if(line.charAt(i) == '/') {
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
		return resultado;
	}
	
}
