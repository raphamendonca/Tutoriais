package banco.teste;

import banco.conta.ContaCorrente;
import banco.conta.GerenciadorImpostoRenda;
import banco.conta.SeguroDeVida;

public class TesteGerenciadorImpostoRenda {

	public static void main(String[] args) {
		GerenciadorImpostoRenda gerenciador = new GerenciadorImpostoRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		gerenciador.adiciona(cc);
		
		
		System.out.println("O seu saldo é: " + gerenciador.getTotal());
//		System.out.printf("O seu saldo é: %.2f" + cc.getSaldo());
	}
	
}
