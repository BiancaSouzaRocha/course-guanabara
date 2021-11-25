package application04;

public class ProjetoLivro {

	public static void main(String[] args) {
		
		Pessoa [] p = new Pessoa [3];
		Livro [] l = new Livro [4]; 
				
		p[0] = new Pessoa ("Bianca", 25, "Feminino");
		p[1] = new Pessoa ("Renata", 27, "Feminino");
		p[2] = new Pessoa ("Lucca", 20, "Masculino");
		
		l[0] = new Livro ("POO em Java", "José Maria", 300, p[0]);
		l[1] = new Livro ("POO para Iniciantes", "Marcelo Silva", 260, p[1]);
		l[0] = new Livro ("Java Intermediário", "Antônio Morais", 450, p[2]);
		l[0] = new Livro ("POO em Java", "José Maria", 300, p[1]);
		
		System.out.println(l[0].detalhes());

	}

}
