
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Veiculo;


public class VeiculoTest {
	
	private Veiculo veiculo;
	
	
	@Before
	public void setup() {
		veiculo =new Veiculo();
	}
	
	@Test
	public void velocidade() throws Exception {
		veiculo.acelerar();
		assertEquals(20, veiculo.getVelocidade());
	}
	
	@Test
	public void deveCalcularLitroCombustivel() throws Exception {	
		veiculo.abastecer(55);
		assertEquals(55, veiculo.getLitroCombustivel());
	
		
	}
	
	@Test
	public void deveDiminuirVelocidade() throws Exception {
		veiculo.acelerar();
		veiculo.frear();
		assertEquals(0, veiculo.getVelocidade());
	}
	
	@Test
	public void devePintarCarro() throws Exception {
		veiculo.pintar("rosa");
		assertEquals("rosa", veiculo.getCor());
		
	}
	
	@Test
	public void deveLigarOcarro() throws Exception {
		veiculo.ligar();
		assertEquals(true, veiculo.isLigado());
		
		
	}
	

	
}
