package br.com.dojo.jokenpo;

public class Jokenpo {
	
	public static final int PEDRA = 1;

	public static final int TESOURA = 2;
	
	public static final int PAPEL = 3;
	
	public int realizaJogada(int jogadaJogador1, int jogadaJogador2 ) {
		// SE ME RETORNAR 0, EMPATOU. SE 1, JOGADOR 1, SE 2 O JOGADOR 2;
		if (jogadaJogador1 == jogadaJogador2) {
			return 0;
		}
		
		if ((jogadaJogador1 ==  PAPEL) && (jogadaJogador2 ==  TESOURA) )
		{ return 2;}
		
		if (jogadaJogador1 ==  TESOURA)
		{ 
			if (jogadaJogador2 ==  PAPEL)
					
			return 1;
			if (jogadaJogador2 ==  PEDRA)
				return 2;
		}
		if (jogadaJogador2 == PAPEL) {
			return 2;
		}
		return 1;
	}
}
