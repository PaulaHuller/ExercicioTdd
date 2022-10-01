
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.gft.model.Livro;


public class ProdutoTest {
	List<Livro> qtdDeLivros;

	@Before 
	public void setup () {
		
		qtdDeLivros = new ArrayList<>();
		qtdDeLivros.add(new Livro("Harry Potter 1", true));
		qtdDeLivros.add(new Livro("Harry Potter 2", true));
		qtdDeLivros.add(new Livro("Harry Potter 3", true));
		qtdDeLivros.add(new Livro("O código Limpo", false));
		
	}
	
	@Test
	public void deveCalcularImpostoNoLIvro() throws Exception {
		Livro livro = new Livro("Harry Potter 1");
		int qtdDeLivros = 0;
		for(Livro l:qtdDeLivros) {
			if (l.getQtdDeLivros() >= qtdDeLivros) {
				qtdDeLivros = l.getqtdDeLivros();
			}
			
		}
