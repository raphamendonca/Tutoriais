package banco.conta;

public abstract class Conta {

	protected double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposita(double valor) {
		atualiza(0.03);
		saldo += valor;
	}

	public void saca(double valor) {
		saldo -= valor;
	}

	public abstract void atualiza(double taxa);

}
