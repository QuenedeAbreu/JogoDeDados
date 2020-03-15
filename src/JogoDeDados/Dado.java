package JogoDeDados;

import java.util.Random;

public class Dado {
	private int valorFace;


	Random gerador = new Random();
	
	private Resultado [] resultado = new Resultado[100];
	
	
	public Dado(int valorFace) {
		
		this.valorFace = valorFace;
	}

	
	public Dado() {
	
	}


	public int getValorFace() {
		return valorFace;
	}

	public void setValorFace(int valorFace) {
		this.valorFace = valorFace;
	}
	
	
	
	public void lancar (InfoJogador jogador , int cont) {
		 int face,soma = 0,dado1 = 0, dado2 = 0 ;
		 System.out.println("O lance do jogador(a) "+jogador.retornaArray()[cont].getNome()+" Foi: ");
	        //imprime sequência de 2 números inteiros aleatórios entre 1 e 6
	        for (int i = 0; i < 2; i++) {
	            face = gerador.nextInt((6 - 1) + 1) + 1;
	            setValorFace(face); 
	            
	            if(i == 0) {
	            	dado1 = getValorFace();
	            }else {
	            	dado2 = getValorFace();
	            }
	            
	            soma = dado1 + dado2;
	           
	         }
	        this.resultado[cont] = new Resultado (jogador.retornaArray()[cont].getNome(),dado1,dado2,soma);
	        System.out.println("Dado 01 :" + dado1);
	        System.out.println("Dado 02 :" + dado2);
	        System.out.println("A soma dos dados foi: "+soma+"\n");
	        
	       
	        
	}
	
	
	
	public Resultado [] retornaArrayResultado() {
		return this.resultado;
	}
	
	
	
}
