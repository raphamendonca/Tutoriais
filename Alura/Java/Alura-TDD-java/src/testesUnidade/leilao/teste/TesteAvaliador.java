package testesUnidade.leilao.teste;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import testesUnidade.leilao.servico.Avaliador;
import testesUnidade.leilao.servico.Lance;
import testesUnidade.leilao.servico.Leilao;
import testesUnidade.leilao.servico.Usuario;

public class TesteAvaliador {

	/*
	 * Teste: - Pensar em um cen�rio - Eecuta uma a��o - Verifica a saida
	 */
	@Test
	public void main() {
		/* passo 1: Cen�rio */
		Usuario joao = new Usuario("Jo�o");
		Usuario jose = new Usuario("Jos�");
		Usuario maria = new Usuario("Maria");

		Leilao leilao = new Leilao("Playstation 3 novo");

		leilao.propoe(new Lance(joao, 300.0));
		leilao.propoe(new Lance(jose, 400.0));
		leilao.propoe(new Lance(maria, 250.0));

		/* passo 2: A�a� */
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);

		/* passo 3: Valida��o */
		double maiorEsperado = 400;
		double menorEsperado = 250;

		// System.out.println(leiloeiro.getMaiorLance());
		// System.out.println(maiorEsperado == leiloeiro.getMaiorLance());
		//
		// System.out.println(leiloeiro.getMenorLance());
		// System.out.println(menorEsperado == leiloeiro.getMenorLance());

		assertEquals(400.0, leiloeiro.getMaiorLance(), 0.0001);
		assertEquals(250.0, leiloeiro.getMenorLance(), 0.0001);

	}

	@Test
	public void deveEntenderLeilaoComApenasUmLance() {
		Usuario joao = new Usuario("Jo�o");

		Leilao leilao = new Leilao("Playstation 3 um lance");
		leilao.propoe(new Lance(joao, 1000.0));

		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);

		System.out.println(leiloeiro.getMaiorLance());
		System.out.println(leiloeiro.getMenorLance());

		assertEquals(1000.0, leiloeiro.getMaiorLance(), 0.00001);
		assertEquals(1000.0, leiloeiro.getMenorLance(), 0.00001);
	}

	@Test
	public void deveEncontrarOsTresMaioresLances() {
		Usuario joao = new Usuario("Jo�o");
		Usuario maria = new Usuario("Maria");

		Leilao leilao = new Leilao("Playstation 3 novo");
		leilao.propoe(new Lance(joao, 100.0));
		leilao.propoe(new Lance(maria, 200.0));
		leilao.propoe(new Lance(joao, 300.0));
		leilao.propoe(new Lance(maria, 400.0));

		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);

		List<Lance> maiores = leiloeiro.getTresMaiores();
		assertEquals(3, maiores.size());
		assertEquals(400.0, maiores.get(0).getValor(), 0.00001);
		assertEquals(300.0, maiores.get(1).getValor(), 0.00001);
		assertEquals(200.0, maiores.get(2).getValor(), 0.00001);

	}

	/*
	 * Classe de equivalencia
	 * 
	 * Cenarios: - ordem crescente - ordem decrescente - ordem randomica -
	 * apenas um lance
	 * 
	 */

}
