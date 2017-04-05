package banco.conta;

public class AtualizadorDeContas {

	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double valor) {
		selic = valor;
	}
	
	public void roda(Conta c) {
		System.out.println("===================================");
		System.out.println("Saldo anterior :" + c.getSaldo());
        c.atualiza(selic);
        System.out.println("Saldo atualizado :" + c.getSaldo());
        this.saldoTotal += c.getSaldo();
	}
	
	public double getSaldoTotal() {
		return saldoTotal;
	}
	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
}
