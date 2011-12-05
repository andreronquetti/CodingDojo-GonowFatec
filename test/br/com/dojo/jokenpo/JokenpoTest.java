package br.com.dojo.jokenpo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class JokenpoTest {
	
	private Jokenpo jokenpo;
	
	@Before
	public void init() {
		jokenpo = new Jokenpo();
	}
	
	@Test
	public void shouldJogador1PedraJogador2Tesoura() {
		
		int jogador1 = Jokenpo.PEDRA;
		int jogador2 = Jokenpo.TESOURA;
		
		int resultado = jokenpo.realizaJogada(jogador1, jogador2);
		assertEquals("O jogador 1 deve ganhar do jogador 2", 1, resultado);
	}

	@Test
	public void shouldJogador1PedraJogador2Papel() {
		int jogador1 = Jokenpo.PEDRA;
		int jogador2 = Jokenpo.PAPEL;
		
		int resultado = jokenpo.realizaJogada(jogador1, jogador2);
		assertEquals("O jogador 2 deve ganhar do jogador 1", 2, resultado);
	}
	
	@Test
	public void shouldJogador1PedraJogador2Pedra() {
		int jogador1 = Jokenpo.PEDRA;
		int jogador2 = Jokenpo.PEDRA;
		
		int resultado = jokenpo.realizaJogada(jogador1, jogador2);
		assertEquals("Deve ocorrer empate", 0, resultado);
	}
	
	@Test
	public void shouldJogador1PapelJogador2Papel() {
		int jogador1 = Jokenpo.PAPEL;
		int jogador2 = Jokenpo.PAPEL;
		
		int resultado = jokenpo.realizaJogada(jogador1, jogador2);
		assertEquals("Deve ocorrer empate", 0, resultado);
	}
	
	@Test
	public void shouldJogador1PapelJogador2Tesoura() {
		int jogador1 = Jokenpo.PAPEL;
		int jogador2 = Jokenpo.TESOURA;
		
		int resultado = jokenpo.realizaJogada(jogador1, jogador2);
		assertEquals("jogador 2 deveria vencer, deveria retornar 2", 2, resultado);
	}
	
	@Test
	public void shouldJogador1PapelJogador2Pedra() {
		int jogador1 = Jokenpo.PAPEL;
		int jogador2 = Jokenpo.PEDRA;
		
		int resultado = jokenpo.realizaJogada(jogador1, jogador2);
		assertEquals("jogador 1 deveria vencer, deveria retornar 1", 1, resultado);
	}
	
	@Test
	public void shouldJogador1TesouraJogador2Papel() {
		int jogador1 = Jokenpo.TESOURA;
		int jogador2 = Jokenpo.PAPEL;
		
		int resultado = jokenpo.realizaJogada(jogador1, jogador2);
		assertEquals("jogador 1 deveria vencer, deveria retornar 1", 1, resultado);
	}
	
	@Test
	public void shouldJogador1TesouraJogador2Pedra() {
		int jogador1 = Jokenpo.TESOURA;
		int jogador2 = Jokenpo.PEDRA;
		
		int resultado = jokenpo.realizaJogada(jogador1, jogador2);
		assertEquals("jogador 2 deveria vencer, deveria retornar 2", 2, resultado);
	}
	
	@Test
	public void shouldJogador1TesouraJogador2Tesoura() {
		int jogador1 = Jokenpo.TESOURA;
		int jogador2 = Jokenpo.TESOURA;
		
		int resultado = jokenpo.realizaJogada(jogador1, jogador2);
		assertEquals("Deve correr Empate, retornar 0", 0, resultado);
	}
}
