
public class Gerente extends Funcionario {
	
	public double salarioBonificacao = 10000;
	
	public double bonificacao(double salario){ 
		return salario += salarioBonificacao;
	}

}
