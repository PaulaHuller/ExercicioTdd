
public class Supervisor extends Funcionario {

	public double salarioBonificacao = 5000;
	
	public double bonificacao (double salario){ 
		return salario += salarioBonificacao;
	}

}
