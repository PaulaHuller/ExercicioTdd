import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FuncionarioTest {
	
	@Test
	public void deveCalcularBonificacaoGerente() {
		Gerente gerente = new Gerente();
		assertEquals(11000.0, gerente.bonificacao(1000), 0.003);
	} 
	
	@Test
	public void deveCalcularBonificacaoSupervisor() {
		Supervisor supervisor = new Supervisor();
		assertEquals(5800.0, supervisor.bonificacao(800), 0.003);
	} 
	
	@Test
	public void deveCalcularBonificacaoVendedor() {
		Vendedor vendedor= new Vendedor();
		assertEquals(3500.0, vendedor.bonificacao(500), 0.003);
	} 
	
	
}
