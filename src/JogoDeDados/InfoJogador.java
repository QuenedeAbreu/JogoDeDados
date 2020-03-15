package JogoDeDados;

public class InfoJogador extends Jogador {
		
	 private Jogador []JogadorArray = new Jogador [100];
	
	
		
	public InfoJogador(int id, String nome) {
		super(id, nome);
		
	}
	
	

	public InfoJogador() {
		
	}



	public void Inscrever(int id, String NomeJogador) {
		int i = 0;
		for(int k = 0; k < this.JogadorArray.length; k++) {
			if(this.JogadorArray[k] != null) {
				i += 1;
			}
		}
		this.JogadorArray[i] = new InfoJogador(id,NomeJogador); 
		
		
	}
	

	
	public Jogador[] retornaArray() {
			
		return this.JogadorArray;
	}
	

	
	
	


	
	
	
}
