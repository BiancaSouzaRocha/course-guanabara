package application04;

public class Pessoa {
	
	
	private String nome;
	private String sexo; 
	private int idade;
	
	
	
	public void fazerAniver () {
		this.idade = this.idade + 1;
	}

	

	public Pessoa(String nome, int idade, String sexo) {
		
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
