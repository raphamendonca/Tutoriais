package banco.conta;

public class ContaCorrente  extends Conta implements Tributavel{

	
	public void atualiza(double taxa) {
		setSaldo(getSaldo() + getSaldo() * taxa *2); 
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
	
}
