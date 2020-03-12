package utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilsTest {

	@Test
	void testIntervaloInvalido() {
		Utils utils = new Utils();
		int retorno = utils.gerarNumeroAleatorio(20, 10);
		assertEquals(-1, retorno);
	}

	@Test
	void testInicioIgualAoFim() {
		Utils utils = new Utils();
		int retorno = utils.gerarNumeroAleatorio(10, 10);
		assertEquals(-1, retorno);
	}

	
	@Test
	void testInicioNegativo() {
		Utils utils = new Utils();
		int retorno = utils.gerarNumeroAleatorio(-20, 10);
		assertEquals(-1, retorno);
	}

	@Test
	void testFimNegativo() {
		Utils utils = new Utils();
		int retorno = utils.gerarNumeroAleatorio(20, -10);
		assertEquals(-1, retorno);
	}

	@Test
	void testIntervalo0a20() {
		Utils utils = new Utils();
		int retorno = utils.gerarNumeroAleatorio(0, 20);
		assertTrue(retorno >= 0 && retorno <= 20);
		//assertEquals(true,retorno >= 0 && retorno <= 20);
	}
	
	
	@Test
	void testComprimentoMenor() {
		Utils utils = new Utils();
		char [] cadeia = new char [] {'a', 'b', 'c', 'd'}; 
		String retorno = utils.acharCaracter(-5, cadeia, 'k');
		assertEquals("comprimento invalido",retorno);
	}
	
	@Test
	void testComprimentoMaior() {
		Utils utils = new Utils();
		char [] cadeia = new char [] {'a', 'b', 'c', 'd'}; 
		String retorno = utils.acharCaracter(22, cadeia, 'k');
		assertEquals("comprimento invalido",retorno);
	}

	@Test
	void testCaracterNaoEncontrado() {
		Utils utils = new Utils();
		char [] cadeia = new char [] {'a', 'b', 'c', 'd','e'}; 
		String retorno = utils.acharCaracter(4, cadeia, 'f');
		assertEquals("caracter nao encontrado",retorno);
	}
	
	@Test
	void testAcharCaracterExistente() {
		Utils utils = new Utils();
		char [] cadeia = new char [] {'a', 'b', 'c', 'd','e'};
		String retorno = utils.acharCaracter(5, cadeia, 'c');
		assertEquals("2",retorno);
	}
	
	@Test
	void testTamanhoDaCadeiaMenor() {
		Utils utils = new Utils();
		char [] cadeia = new char [] {'a', 'b', 'c', 'd'}; 
		String retorno = utils.acharCaracter(5, cadeia, 'k');
		assertEquals("comprimento fornecido diferente do comprimento real",retorno);
	}
	
	@Test
	void testTamanhoDaCadeiaMaior() {
		Utils utils = new Utils();
		char [] cadeia = new char [] {'a', 'b', 'c', 'd','e','f'}; 
		String retorno = utils.acharCaracter(5, cadeia, 'k');
		assertEquals("comprimento fornecido diferente do comprimento real",retorno);
	}
}
