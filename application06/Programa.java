package application06;

public class Programa {

	public static void main(String[] args) {
		
		
		Aluno a1 = new Aluno (); 
		
		a1.setNome ("Bianca");
		a1.setMatricula(1234);
		a1.setIdade(25);
		a1.setSexo("Feminino");
		a1.setCurso("TI");
		
		a1.fazerAniv();
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista (); 
		
		b1.setNome("Adriana");
		b1.pagarMensalidade();
		
		
		

	}

}
