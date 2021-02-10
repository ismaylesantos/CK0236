package defensiveProgramming.aula17;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class ExemplosExce��es2Test {
	
	private ExemplosExce��es2 exemploExce��es2 = new ExemplosExce��es2();

	@Test
	void testRecuperarTextoArquivoN�oExiste() {
		assertDoesNotThrow(() -> exemploExce��es2.recuperarTexto("C:\\arquivo inv�lido"));
	}

	@Test
	void testParserErradoLan�aExce��o() throws FileNotFoundException {		
		Exception exception = assertThrows(NumberFormatException.class, () -> {
		    Integer.parseInt("One");
		  });
		
		assertEquals("For input string: \"One\"", exception.getMessage());
	}
}
