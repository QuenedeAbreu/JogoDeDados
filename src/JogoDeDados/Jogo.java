package JogoDeDados;


import java.util.Scanner;
public class Jogo {
	
	private static Scanner input;
		public static void main(String[] args) {
			String nomeJogador;
		
			
			input = new Scanner(System.in);
			
			System.out.println("Informe o nome do jogador: ");
			nomeJogador = input.nextLine();
			
			
			System.out.println(nomeJogador);
		}
		
		
}
