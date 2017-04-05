package banco.teste;

import banco.conta.AtualizadorDeContas;
import banco.conta.Conta;
import banco.conta.ContaCorrente;
import banco.conta.ContaPoupanca;

public class TestaConta {

	public static void main(String[] args) {
		Conta c = new ContaCorrente();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		AtualizadorDeContas ac = new AtualizadorDeContas(0.01);

		ac.roda(c);
		ac.roda(cc);
		ac.roda(cp);
		
		System.out.println("-----------------------------------");
		System.out.println("Saldo Total: " + ac.getSaldoTotal());
//		System.out.printf("Seu saldo é %.2f \n" + cp.getSaldo());
	}

}
