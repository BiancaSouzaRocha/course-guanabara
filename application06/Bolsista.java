package application06;

public class Bolsista  extends Aluno{
	
	private int bolsa; 
	
	
	public void renovarBolsa () {
		System.out.println ("Renovando bolsa de " + this.getNome());
	}
	
	
	public void pagarMensalidade () {
		System.out.println (this.getNome() + " � bolsista, pagamento facilidado!");
	}

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
	
}

