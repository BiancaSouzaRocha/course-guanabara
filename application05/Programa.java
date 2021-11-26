package application05;

public class Programa {

	public static void main(String[] args) {
		 Pessoa p1 = new Pessoa (); 
		 Aluno p2 = new Aluno (); 
		 Professor p3 = new Professor ();
		 Funcionario p4 = new Funcionario ();
		 
		 
		 p1.setNome("Bianca");
		 p2.setNome("Pedro");
		 p3.setNome("Adriana");
		 p4.setNome("Renata");
		 
		 p1.setIdade(25);
		 p2.setIdade(31);
		 p3.setIdade(29);
		 p4.setIdade(18);
		 
		 p1.setSexo("Feminino");
		 p2.setSexo("Masculino");
		 p3.setSexo("Feminino");
		 p4.setSexo("Feminino");
		 
		 p2.setCurso("Informática");
		 p3.setSalario(2500.00f);
		 p4.setSetor("Estoque");
		 
		 
		 System.out.println (p1.toString());
		 System.out.println (p2.toString());
		 System.out.println (p3.toString());
		 System.out.println (p4.toString());
	}

}
