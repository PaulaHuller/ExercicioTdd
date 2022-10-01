
public class Vendedor extends Funcionario {

	public double salarioBonificacao = 3000;
	
	public double bonificacao (double salario){ 
		return salario += salarioBonificacao;
	}

}
