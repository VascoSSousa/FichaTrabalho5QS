package FichaTrabalho5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class RetanguloTest {
	
	
	Retangulo ret=new Retangulo();
	
	
	@ParameterizedTest
	@DisplayName("Teste calcular Area")
	@CsvSource(value= {"3,5,15","5,8,40","2,4,8"})
	public void testArea(int comp,int larg,int expected) {
		assertEquals(ret.area(comp, larg),expected);
	}
	
	
	@ParameterizedTest
	@DisplayName("Teste calcular Area")
	@CsvSource(value= {"3,5,16","5,8,26","2,4,12"})
	public void testPerimetro(int comp,int larg,int expected) {
		assertEquals(ret.perimetro(comp, larg),expected);
	}
	
	@ParameterizedTest
	@DisplayName("Verificar se e trianglo(1-sim | 0-nao")
	@CsvSource(value={"16,20,30,1"})
	public void testIsTriangle(int a,int b,int c,int expected) {
		assertEquals(ret.isTriangle(a, b,c),expected);
	}
	
}
