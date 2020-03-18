package JogoDeDados;

import java.util.Scanner;

public class InfoJogador extends Jogador {
	
	private static Scanner input;
	
	 private Jogador []JogadorArray = new Jogador [100];
	 
	 public String J = "d";
	 
	 private int nJogadores = 0;
	
	//Construtor sobrecarregado
	public InfoJogador(int id, String nome) {
		super(id, nome);
		
	}
	
	//Construtor sobrecarregado
	public InfoJogador(int id, String nome, int vitorias) {
		super(id, nome, vitorias);
		
	}
	
	//Construtor
	public InfoJogador() {
		
	}
	
	
	public void Inscrever(int id, String NomeJogador) {
			
			this.JogadorArray[nJogadores] = new InfoJogador(id,NomeJogador,0);
			
			nJogadores ++;
	}	
	
	public int numeroJogadores() {
		return nJogadores;
	}
	
	
	public void recebeJogador(InfoJogador jogador) {
			input = new Scanner(System.in);
			String nomeJogador;
				int i = 0;
				char s = 0;
				
				int soma = 0; 
				do {
					soma += 1;
					System.out.println("Informe o nome do "+soma+"�  jogador: ");
					
					if(i>1) {
						input.nextLine();
					}
								
					nomeJogador = input.nextLine();
							 
					jogador.Inscrever(i, nomeJogador);
						
					i++;
					if(i>=2) {
					System.out.println("Deseja Incluir mais um jogador?:  ");
					s = input.next().charAt(0);
				}
		}while(s == 's' || s == 'S' || i < 2);
	}
			
	
	public void jogada(Dado dado, InfoJogador jogador) {
		input = new Scanner(System.in);
		do {
			for (int p = 0;p<this.JogadorArray.length;p++) {
			
			Jogador Jogador = this.JogadorArray[p];
			
			if(Jogador == null)continue;
			
			if (Jogador!=null) {
				System.out.println("============ A vez de jogar � de: "+Jogador.getNome()+" =============");
				System.out.println(Jogador.getNome()+" precione enter para jogar!");	
				input.nextLine();
				dado.lancar(jogador,p);
					}	
				}
		}while(J == "");
	}	
	
		
		
	public Jogador[] retornaArray() {
			return this.JogadorArray;
		}
		
		
		
	public void zeraJogador() {
		for(int i = 0 ;i <JogadorArray.length;i++) {
			if(this.JogadorArray[i] == null) {
				continue;
			}else {
				this.JogadorArray[i] = null;
				}
			}
		}
	
	}
