package JogoDeDados;



public class Jogador {
	private int id;
	private String nome;
	
	

	
	
	public Jogador(int id, String nome) {
		
		this.id = id;
		this.nome = nome;
	}
	
	
	
	public Jogador() {
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	/*
	
	public void lista(InfoJogador jogador) {
		
		int cont=0,cont2=1;
		
			for (int i = 0;i<jogador.retornaArray().length;i++) {
		
		Jogador Jogador = jogador.retornaArray()[cont];
		
		if(Jogador == null)continue;
		
		if (Jogador!=null) {
		System.out.println("\n==================== Jogador "+cont2+" ==============================\n");
		System.out.println("O id do jogador é: "+Jogador.getId());
		System.out.println("O nome do jogador é: "+Jogador.getNome());

		System.out.println("\n====================================================================\n");
		}
		cont2++;
		cont++;
	}
	if(cont == 0) {
		System.out.println("\nAinda não temos funcionarios cadastrados!\n");
	}


}
	
	
public void lista(int id,InfoJogador jogador) {
		
	
		int soma = id +1;
			
		
				Jogador Jogador = jogador.retornaArray()[id];
		
		
		
		if (Jogador!=null ) {
		System.out.println("\n==================== Jogador "+soma+" ==============================\n");
		System.out.println("O id do jogador é: "+Jogador.getId());
		System.out.println("O nome do jogador é: "+Jogador.getNome());

		System.out.println("\n====================================================================\n");
		}
	
	
	if(Jogador == null) {
		System.out.println("\nAinda não temos funcionarios cadastrados!\n");
	}


}
	*/
}
