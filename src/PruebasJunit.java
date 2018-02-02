import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PruebasJunit {

	@Test
	void pruebaStack() {
		StackVector<String> datos = new StackVector<String>();
		/* Prueba Push */
		datos.push("1");
		assertEquals(false, datos.empty());
		/* Prueba peek */
		assertEquals("1", datos.peek());
		/* Prubeba pop */
		datos.pop();
		assertEquals(true, datos.empty());
	}
	
	@Test
	void pruebaCalc() {
		Calculadora calcu = new Calculadora();
		String resultado = calcu.calcular("1 2 + 4 * 3 +");
		assertEquals("15", resultado);
		
	}

}
