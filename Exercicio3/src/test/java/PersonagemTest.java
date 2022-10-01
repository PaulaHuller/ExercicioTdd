import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
public class PersonagemTest {
	
	Guerreiro guerreiro;
	@Mock
	random randomTest;
	
	Mago mago;
	
	
	@Before 
	public void setup () { 
		MockitoAnnotations.openMocks(this);
		when(randomTest.RandomNumero(301)).thenReturn(160);
		guerreiro = new Guerreiro("nome", 100,200, 200.0, 50, 100, 1, randomTest);
		mago = new Mago("nome", 100, 200, 200.0, 50, 100, 1, randomTest);
	}
	
	@Test
	public void deveCalcularAumentoVidaEForca() {
		guerreiro.lvlUp();
		assertEquals(105, guerreiro.getVida());
		assertEquals(105, guerreiro.getForca());
	}
	
	@Test
	public void deveFazerOGuerreiroAtacar() {
		int Dano = guerreiro.attack();
		assertEquals(260, Dano);

}
	
	@Test
	public void deveCalcularAumentoManaEInteligencia() {
		mago.lvlUp();
		assertEquals(205, mago.getMana());
		assertEquals(55, mago.getInteligencia());
		
	}
	
	@Test
	public void deveFazerOMagooAtacar() {
		int Dano = mago.attack();
		assertEquals(210, Dano);
	}	
	
}
