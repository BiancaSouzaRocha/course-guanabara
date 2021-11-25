package application04;

public class Livro implements Publicacao{
	
	private Pessoa leitor; 
	private String titulo; 
	private String autor;
	private int totPaginas; 
	private int pagAtual; 
	private boolean aberto;
	
	
	
	public String detalhes() {
		return "#### Livro #### " + "\nTitulo: " + titulo + "\nAutor: " + autor + "\nTotal de Páginas: " + totPaginas + "\nLeitor: " + leitor.getNome() +
				"\nPágina Atual: " + pagAtual + "\nEstá aberto? " + aberto;
	}
	




	public  Livro( String titulo, String autorString, int totPaginas, Pessoa leitor) {
		
		this.titulo = titulo;
		this.autor = autorString;
		this.totPaginas = totPaginas;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}



	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}






	@Override
	public void abrir() {
		this.aberto = true; 
		
	}






	@Override
	public void fechar() {
		this.aberto = false;
	}






	@Override
	public void folhear(int p) {
		if (p > this.getTotPaginas()) {
			this.pagAtual = 0;
		} else {
			this.pagAtual = p;
		}
		this.pagAtual = p;
		
	}






	@Override
	public void avançarPag() {
		this.pagAtual++;
		
	}






	@Override
	public void voltarPag() {
		this.pagAtual--;
	}

	
	
	

}
