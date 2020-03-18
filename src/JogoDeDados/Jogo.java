package JogoDeDados;



//import java.util.Scanner;
public class Jogo {
	
	//private static Scanner input;
		public static void main(String[] args) {
			
			//input = new Scanner(System.in);
			// Variavel conta quantas rodadas foram jogadas
			int contJogo = 0,cont = 1;
			
			
			
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
			
			System.out.println("   /================================\\");
			System.out.println("  /            Bem Vindo             \\");
			System.out.println(" /           Jogo de Dados            \\");
			System.out.println("/======================================\\ \n");
			
			System.out.println("\\ Este jogo só é possível jogar \n \\ com dois jogadores ou mais.\n\n");
			
			
			
			
			//Recebe todos os jogadores
			jogador.recebeJogador(jogador);
			
			do {
			//zera o resultado da rodada
			dado.zeraResultado();
			
			//zera o resultado dos ganhadores da rodada
			resultado.zeraGanhador();
			
			System.out.println("==================================== "+cont+"º Rodada ====================================\n");
			
			//Chama a jogada de cada jogador
			jogador.jogada(dado, jogador);
			
			//Inclui os ganhadores em array de ganhadores 			
			resultado.ganhador(jogador,dado);
			
			//Mostra os ganhadores da rodada			
			resultado.mostraGanhador(cont);
			
			
			
			//jogarDeNovo = input.next().charAt(0);
			contJogo++;
			cont++;
			System.out.println("\n\n");
		}while(contJogo < 7  /* jogarDeNovo == 's' || jogarDeNovo == 'S'*/ );
			System.out.println("==================================== Ranking do jogo ====================================\n");
			resultado.ordenaRanking(jogador);
			resultado.ganhadoresDoJogo(jogador);
	}	
}
