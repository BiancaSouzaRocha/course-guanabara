package application02; 

public class Lutador {
	
	//Atributos
	private String nome;
	private String nacionalidade; 
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates; 
	
	
	//metodos publicos 
	
	public void apresentar () {
		
		System.out.println ();
		System.out.println ("CHEGOU A HORA! A luta vai começar....");
		System.out.println("Lutador: " + this.getNome());
		System.out.println ("Origem: " + this.getNacionalidade());
		System.out.println (this.getIdade() + " anos");
		System.out.println (this.getAltura() + " m de altura");
		System.out.println ("Peso: " + this.getPeso() + "KG");
		System.out.println ("Ganhou: " + this.getVitorias() + " vezes");
		System.out.println ("Perdeu: " + this.getDerrotas() + " vezes");
		System.out.println ("Empatou: "+ this.getEmpates() + " vezes");
		System.out.println ();
		
	}
	public void status () {
		System.out.println ();
		System.out.println (this.getNome());
		System.out.println ("Está na categoria..." + this.getCategoria());
		System.out.println ("Vitórias: " + this.getVitorias());
		System.out.println ("Derrotas: " + this.getDerrotas());
		System.out.println ("Empates: " + this.getEmpates());
		
	}
	public void ganharLuta () {
		this.setVitorias (getVitorias () + 1);
		
	}
	public void perderLuta () {
		this.setDerrotas (getDerrotas () + 1);
		
	}
	public void empatarLuta () {
		this.setEmpates (getEmpates () + 1);
		
	}
	
	
	// metodos especiais
	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
		super();
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe); 
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Peso inválido"; 
		} else if (this.peso <= 70.3) {
			this.categoria= "Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Médio"; 
		} else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Peso inválido!";
		}
	}
	
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
	
	
}