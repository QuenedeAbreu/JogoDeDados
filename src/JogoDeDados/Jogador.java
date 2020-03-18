package JogoDeDados;



public class Jogador {
	private int id;
	private String nome;
	private int vitorias;
	
	//Construtor sobrecarregado

	public Jogador(int id, String nome) {
		
		this.id = id;
		this.nome = nome;
	}
	
	//Construtor sobrecarregado
	public Jogador(int id, String nome, int vitorias) {
		this.id = id;
		this.nome = nome;
		this.vitorias = vitorias;
	}



	//Construtor 
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

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias += vitorias;
	}
	
	

}
