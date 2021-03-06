package JogoDeDados;

public class Resultado {
		private String nomeJogador;
		private int dado01;
		private int dado02;
		private int resultado;
		
		
		
		Resultado [] arrayGanhedor = new Resultado[100];
		
		public Resultado(String nomeJogador, int dado01, int dado02, int resultado) {
			
			this.nomeJogador = nomeJogador;
			this.dado01 = dado01;
			this.dado02 = dado02;
			this.resultado = resultado;
		}

		
		public Resultado() {
			
		}

		public String getnomeJogador() {
			return nomeJogador;
		}

		public void setnomeJogador(String nomeJogador) {
			this.nomeJogador = nomeJogador;
		}

		public int getDado01() {
			return dado01;
		}

		public void setDado01(int dado01) {
			this.dado01 = dado01;
		}

		public int getDado02() {
			return dado02;
		}

		public void setDado02(int dado02) {
			this.dado02 = dado02;
		}

		public int getResultado() {
			return resultado;
		}

		public void setResultado(int resultado) {
			this.resultado = resultado;
		}
		
		
	public void ganhador(InfoJogador jogador, Dado dado) {
		
		for(int i = 0;i < dado.retornaArrayResultado().length;i++ ) {
			Resultado dados = dado.retornaArrayResultado()[i];
			if(dados == null) {continue;}
			
			if(dados != null) {
				if(dados.getResultado() == 7) {
					
					this.arrayGanhedor[i] = new Resultado (dado.retornaArrayResultado()[i].getnomeJogador(),dado.retornaArrayResultado()[i].getDado01(),
															dado.retornaArrayResultado()[i].getDado02(),dado.retornaArrayResultado()[i].getResultado());
				
					
				}
				
			}

		}
		
	}
			
	
	public void mostraGanhador(int cont) {
		int contGanhador = 0; 
		for(int i = 0;i < this.arrayGanhedor.length;i++ ) {
			Resultado dados = this.arrayGanhedor[i];
			if(dados == null) {continue;}
			if(dados != null) {
				contGanhador++;
			}
		}
		
		System.out.println("\n\n================================= Resultado da "+cont+"� Rodada ===============================");
		for(int i = 0;i < this.arrayGanhedor.length;i++ ) {
			Resultado dados = this.arrayGanhedor[i];
			if(dados == null) {continue;}
					
			if(dados != null) {
					if(contGanhador == 1) {
					System.out.println("=========== O ganhador foi: =============");
					System.out.println("Nome: "+dados.getnomeJogador());
					System.out.println("Dado 1 : "+ dados.getDado01());
					System.out.println("Dado 2 : "+ dados.getDado02());
					System.out.println("A soma de dois Dados � : "+ dados.getResultado());
					System.out.println("=========================================");
					} else if(contGanhador > 1) {
						System.out.println("=========== Empate: =============");
						System.out.println("Nome: "+dados.getnomeJogador());
						System.out.println("Dado 1 : "+ dados.getDado01());
						System.out.println("Dado 2 : "+ dados.getDado02());
						System.out.println("A soma de dois Dados � : "+ dados.getResultado());
						System.out.println("=========================================");
				}		
			}		
		}
		if(contGanhador == 0) {
			System.out.println("\n================================= N�o houve ganhador ================================\n");
		}
	}
	
	
	public void ordenaRanking(InfoJogador jogador) {
		 
	Jogador  aux;
	
	for(int i = 0; i < jogador.numeroJogadores(); i++){
		
		for(int j = i+1; j < jogador.numeroJogadores(); j++){

			
	         if(jogador.retornaArray()[i].getVitorias() < jogador.retornaArray()[j].getVitorias()){
	     
	            	aux = jogador.retornaArray()[i];
	                jogador.retornaArray()[i] = jogador.retornaArray()[j];
	                jogador.retornaArray()[j] = aux;
	            		}
	            		
					}
	        	}
			
	    
	}
	
	
	public void ganhadoresDoJogo(InfoJogador jogador) {
		
		int cont=0;
		
			for (int i = 0;i<jogador.retornaArray().length;i++) {
		
		Jogador Jogador = jogador.retornaArray()[cont];
		
		if(Jogador == null)continue;
		
		if (Jogador!=null) {
		System.out.println("\n==================== Jogador "+Jogador.getNome()+" ==============================\n");
		System.out.println("O id do jogador �: "+Jogador.getId());
		System.out.println("O nome do jogador �: "+Jogador.getNome());
		System.out.println("Numero de Vitorias do jogador: "+ Jogador.getVitorias());

		System.out.println("\n====================================================================\n");
		}
		
		cont++;
	}
	if(cont == 0) {
		System.out.println("\nAinda n�o temos Jogadores cadastrados!\n");
	}


}
	
	
	
	public void zeraGanhador() {
		for(int i = 0; i < this.arrayGanhedor.length;i++) {
			if(this.arrayGanhedor[i] == null) {
				continue;
			}else {
				this.arrayGanhedor[i] = null;
				}
			}
		}
	
	
}
