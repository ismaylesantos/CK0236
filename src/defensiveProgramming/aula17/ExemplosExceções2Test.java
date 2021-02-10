package defensiveProgramming.aula17;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class ExemplosExceções2Test {
	
	private ExemplosExceções2 exemploExceções2 = new ExemplosExceções2();

	@Test
	void testRecuperarTextoArquivoNãoExiste() {
		assertDoesNotThrow(() -> exemploExceções2.recuperarTexto("C:\\arquivo inválido"));
	}

	@Test
	void testParserErradoLançaExceção() throws FileNotFoundException {		
		Exception exception = assertThrows(NumberFormatException.class, () -> {
		    Integer.parseInt("One");
		  });
		
		assertEquals("For input string: \"One\"", exception.getMessage());
	}
}
