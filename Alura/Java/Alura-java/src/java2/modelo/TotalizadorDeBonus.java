package java2.modelo;

public class TotalizadorDeBonus {

	private double total = 0;
	
	public void adiciona(double valor){
		total += valor;
	}
	
	
	public void adiciona(Funcionario f){
		total += f.getBonus();
	}
	
	public double getTotal(){
		return total;
	}
	
}
