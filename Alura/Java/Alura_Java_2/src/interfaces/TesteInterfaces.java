package interfaces;

public class TesteInterfaces {

	public static void main(String[] args) {
//		Quadrado q = new Quadrado(1);
//		Retangulo r = new Retangulo(2,3);
		
		
		AreaCalculavel a = new Retangulo(2, 3);
		
		System.out.println(a.calculaArea());
		
		
	}
	
	
}
