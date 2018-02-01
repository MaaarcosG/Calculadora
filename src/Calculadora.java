/**
 * @author Marcos Gutierrez 			17909
 * @author Raul Monzon					17014
 * @since 26 de enero 2018
 */
public class Calculadora implements CalculadoraI {
	
	/*Atributos de la clase*/
	private static Stack<Integer> dato = new StackVector<Integer>();
	
	/*Constructor de la clase*/
	public Calculadora() {
		
	}
	
	/*Metodo para calcular*/
	@Override
	public String calcular(String expresion) {
		int num2=0;
		int num1=0;
		int resultado=0;
		for(int i=0; i < expresion.length(); i++) {
			
			/*Si encuentra u nsigno "+", se añadara un dato utilizando pop y se la operacion 
			 * se guardara en el atributo resultado utilizando push*/
			if(expresion.charAt(i) == '+') {
				num1 = dato.pop();
				num2 = dato.pop();
				resultado = num1 + num2;
				dato.push(resultado);
			} 
			
			/*Si encuentra u nsigno "-", se añadara un dato utilizando pop y se la operacion 
			 * se guardara en el atributo resultado utilizando push*/	
			if(expresion.charAt(i) == '-') {
				num1 = dato.pop();
				num2 = dato.pop();
				resultado = num2 - num1;
				dato.push(resultado);
			}
			
			/*Si encuentra u nsigno "*", se añadara un dato utilizando pop y se la operacion 
			 * se guardara en el atributo resultado utilizando push*/	
			if(expresion.charAt(i) == '*') {
				num1 = dato.pop();
				num2 = dato.pop();
				resultado = num1 * num2;
				dato.push(resultado);
			}

			/*Si encuentra u nsigno "/", se añadara un dato utilizando pop y se la operacion 
			 * se guardara en el atributo resultado utilizando push*/	
			if(expresion.charAt(i) == '/') {
				num1 = dato.pop();
				num2 = dato.pop();
				resultado = num2 / num1;
				dato.push(resultado);
			}
			
			/*Si el resultado es menor o igual a 0, se añadira un valor numerico a la cadena
			 * para asi tener un dato integer dentro del resultado, y no devolvera un error*/
			if (Character.getNumericValue(expresion.charAt(i)) >= 0) {
				int datos = Character.getNumericValue(expresion.charAt(i));
				dato.push(datos);
			}
			
		}
		
		return String.valueOf(resultado);
	}
	
}
