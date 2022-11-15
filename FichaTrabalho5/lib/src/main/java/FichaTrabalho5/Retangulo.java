package FichaTrabalho5;

public class Retangulo {
	
	public int area(int base, int altura) {
		return base*altura;
	}
	
	public int perimetro(int base, int altura) {
		return base*2+altura*2;
	}
	
	public int isTriangle(int a,int b,int c) {
		if(a<b+c || b<a+c || c<a+b) {
			return 1;
			
		}else return 0;
	}
}
