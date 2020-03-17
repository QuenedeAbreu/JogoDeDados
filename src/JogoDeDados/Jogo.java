package JogoDeDados;



//import java.util.Scanner;
public class Jogo {
	
	//private static Scanner input;
		public static void main(String[] args) {
			//input = new Scanner(System.in);
			// Variavel conta quantas rodadas foram jogadas
			int contJogo = 0;
			
			
			//char jogarDeNovo ;
			
			//Instancia os jogadores
			InfoJogador jogador = new InfoJogador();
			
			//Instancia os dados da rodada
			Dado dado = new Dado();
			
			//Instancia os resultados
			Resultado resultado = new Resultado();
			
				
						
			
			
				//jogador.zeraJogador();
				//dado.zeraResultado();
				//resultado.zeraGanhador();
			
			//Recebe todos os jogadores
			jogador.recebeJogador(jogador);
			
			do {
			//zera o resultado da rodada
			dado.zeraResultado();
			
			//zera o resultado dos ganhadores da rodada
			resultado.zeraGanhador();
			
			System.out.println("\n\n==================================== Nova Rodada ====================================\n");
			
			//Chama a jogada de cada jogador
			jogador.jogada(dado, jogador);
			
			//Inclui os ganhadores em array de ganhadores 			
			resultado.ganhador(jogador,dado);
			
			//Mostra os ganhadores da rodada			
			resultado.mostraGanhador();
			
			
			
			//jogarDeNovo = input.next().charAt(0);
			contJogo++;
			System.out.println("\n\n");
		}while(contJogo < 7  /* jogarDeNovo == 's' || jogarDeNovo == 'S'*/ );
			
			
	}	
}
