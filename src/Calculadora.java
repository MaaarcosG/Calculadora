/**
 * @author Marcos Gutierrez 			17909
 * @author Raul Monzon					17014
 * @since 26 de enero 2018
 */
public class Calculadora implements CalculadoraI {
	
	/*Atributos de la clase*/
	private int resultado;
	private int num1;
	private int num2;
	private static Stack<Integer> dato = new StackVector<Integer>();
	
	/*Constructor de la clase*/
	public Calculadora() {
		/*Inicializamos*/
		resultado = 0;
		num1 = 0;
		num2 = 0;
	}
	
	/*Metodo para calcular*/
	@Override
	public String calcular(String expresion) {
		for(int i=0; i < expresion.length(); i++) {
			/*Si encuentra u nsigno "+", se a�adara un dato utilizando pop y se la operacion 
			 * se guardara en el atributo resultado utilizando push*/
			if(expresion.charAt(i) == '+') {
				num1 = dato.pop();
				num2 = dato.pop();
				resultado = num1 + num2;
				dato.push(resultado);
			} 
			/*Si encuentra u nsigno "-", se a�adara un dato utilizando pop y se la operacion 
			 * se guardara en el atributo resultado utilizando push*/	
			if(expresion.charAt(i) == '-') {
				num1 = dato.pop();
				num2 = dato.pop();
				resultado = num1 - num2;
				dato.push(resultado);
			}
			/*Si encuentra u nsigno "*", se a�adara un dato utilizando pop y se la operacion 
			 * se guardara en el atributo resultado utilizando push*/	
			if(expresion.charAt(i) == '*') {
				num1 = dato.pop();
				num2 = dato.pop();
				resultado = num1 * num2;
				dato.push(resultado);
			}
			/*Si encuentra u nsigno "/", se a�adara un dato utilizando pop y se la operacion 
			 * se guardara en el atributo resultado utilizando push*/	
			if(expresion.charAt(i) == '/') {
				num1 = dato.pop();
				num2 = dato.pop();
				resultado = num2 / num1;
				dato.push(resultado);
			}
			/*Si el resultado es menor o igual a 0, se a�adira un valor numerico a la cadena
			 * para asi tener un dato integer dentro del resultado, y no devolvera un error*/
			if (Character.getNumericValue(expresion.charAt(i)) >= 0) {
				int datos = Character.getNumericValue(expresion.charAt(i));
				dato.push(datos);
			}
		}
		return String.valueOf(resultado);
	}
	
}
