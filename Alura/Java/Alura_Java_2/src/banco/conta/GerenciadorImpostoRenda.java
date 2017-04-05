package banco.conta;

public class GerenciadorImpostoRenda {
	private double total;
	
	public void adiciona(Tributavel t){
		System.out.println("Adicionando Tributável: " + t);
		this.total += t.calculaTributos();
	}
	
	
	public double getTotal() {
		return total;
	}
	
}
