package JogoDeDados;



import java.util.Scanner;
public class Jogo {
	
	private static Scanner input;
		public static void main(String[] args) {
			String nomeJogador;
			int i=0;
			//int contJogador = 0;
			char s;
			String J = "d";
			char jogarDeNovo ;
			InfoJogador jogador = new InfoJogador();
			Dado dado = new Dado();
			Resultado resultado = new Resultado();
			
				
						
			input = new Scanner(System.in);
			do {
				//jogador.zeraJogador();
				//dado.zeraResultado();
				//resultado.zeraGanhador();
			
			do {
			System.out.println("Informe o nome do jogador: ");
							if(i>0) {
							input.nextLine();
							}
							
			nomeJogador = input.nextLine();
						 
			jogador.Inscrever(i, nomeJogador);
			
			i++;
			System.out.println("Deseja Incluir mais um jogador?:  ");
			s = input.next().charAt(0);
			}while(s == 's' || s == 'S');
			
			
			
			do {
				int cont=0;
				
				for (int p = 0;p<jogador.retornaArray().length;p++) {
			
			Jogador Jogador = jogador.retornaArray()[cont];
			
			if(Jogador == null)continue;
			
			if (Jogador!=null) {
				System.out.println("============ A vez de jogar é de: "+Jogador.getNome()+" =============");
				System.out.println(Jogador.getNome()+" precione enter para jogar!");
						if(cont == 0) {
							input.nextLine();
						}
						input.nextLine();
						dado.lancar(jogador,cont);
						}
						cont++;
					}
			}while(J == "");
			
			resultado.ganhador(jogador,dado);	
			resultado.mostraGanhador();
			
			System.out.println("Deseja jogar novamente?  ");
			jogarDeNovo = input.next().charAt(0);
		}while(jogarDeNovo == 's' || jogarDeNovo == 'S');
	}	
}
