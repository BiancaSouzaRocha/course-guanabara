package application00;

public class Usuario {
		public static void main (String [] args) {
			
			ContaBanco p1 = new ContaBanco (); 
			
			p1.setNumConta(268); 
			p1.setDono("David");
			p1.abrirConta ("CC");
			p1.depositar(600);
			p1.sacar(250);
			
			p1.estadoAtual();
			
			
			ContaBanco p2 = new ContaBanco ();
			
			
			p2.setNumConta(264);
			p2.setDono("Daniela");
			p2.abrirConta("CP");
			p2.depositar(750);
			p2.sacar(300);
			
			
			p2.estadoAtual();
		}
}
