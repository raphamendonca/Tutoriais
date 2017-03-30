package java2.programa;

import java2.modelo.Desenvolvedor;
import java2.modelo.Funcionario;
import java2.modelo.Gerente;
import java2.modelo.TotalizadorDeBonus;

public class teste {

	public static void main(String[] args) {
		Funcionario joao = new Funcionario();
		joao.setSalario(1000.0);
		
		System.out.println(joao.getBonus());
		
		Gerente joaquim = new Gerente();
		joaquim.setSalario(2000.0);
		joaquim.cobraEntrega();
		System.out.println(joaquim.getBonus());
		
		Desenvolvedor manuel = new Desenvolvedor();
		manuel.setSalario(1500.0);
		
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.adiciona(joao);
		totalizador.adiciona(joaquim);
		
		System.out.println(totalizador.getTotal());
		
	}

}
