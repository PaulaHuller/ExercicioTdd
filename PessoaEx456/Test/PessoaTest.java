import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PessoaTest {
	
	List<Pessoa> pessoaLista;

	@Before 
	public void setup () {
		
		pessoaLista = new ArrayList<>();
		pessoaLista.add(new Pessoa("Joao", 15));
		pessoaLista.add(new Pessoa("Leandro", 21));
		pessoaLista.add(new Pessoa("Paulo",17));
		pessoaLista.add(new Pessoa("Jessica",18));
	}
	
	@Test
	public void deveConferirMaisVelho() throws Exception {
		Pessoa pessoa = new Pessoa("Leandro", 21);
		int idadePessoaMaisVelha = 0;
		String nomePessoaMaisVelha = null;
		for(Pessoa p:pessoaLista) {
			if (p.getIdade() >= idadePessoaMaisVelha) {
				idadePessoaMaisVelha = p.getIdade();
				nomePessoaMaisVelha = p.getNome();
			}
		}
		 
		assertEquals(21, idadePessoaMaisVelha);
		assertEquals("Leandro",nomePessoaMaisVelha);
			
	}
	
	@Test
	public void deveRemoverOMenorDeIdade() throws Exception {
		
		for(int i = 0; i< pessoaLista.size();i++) {
			if (pessoaLista.get(i).getIdade() < 18 ) {
				pessoaLista.remove(i);
				i--;
			}
		
		}
		assertEquals(21, pessoaLista.get(0).getIdade());
		assertEquals(18, pessoaLista.get(1).getIdade());
		
		
	}
	
	@Test
	public void deveEncontrarAJessica() throws Exception {
		boolean encontrouJessica = false;
		for(Pessoa p:pessoaLista) {
			if(p.getNome() == "Jessica") {
				encontrouJessica = true;
				
			}
		}
		
		assertEquals(true, encontrouJessica);
		
	}
		
		
}

	

