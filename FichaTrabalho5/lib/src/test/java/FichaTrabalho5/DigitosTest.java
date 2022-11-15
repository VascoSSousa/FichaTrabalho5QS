package FichaTrabalho5;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


public class DigitosTest {

Digitos digito=new Digitos();
	
	@Test
	@DisplayName("Testar digitos de sum numero")
	public void testContaDigitos() {
		int numero=16513;
		int expected=5;
		assertTrue(digito.contaDigitos(numero)==expected);
	}
}
