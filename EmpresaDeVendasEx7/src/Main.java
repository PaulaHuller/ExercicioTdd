
public class Main {
	
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		double sa =gerente.bonificacao(1000);
		System.out.println(sa);
		
		Supervisor supervisor = new Supervisor();
		double sa1 =supervisor.bonificacao(800);
		System.out.println(sa1);
		
		Vendedor vendedor= new Vendedor();
		double sa2 =vendedor.bonificacao(500);
		System.out.println(sa2);
	}

}
