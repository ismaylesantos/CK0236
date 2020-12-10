package unit.testing.aula06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import poo.aula04.Aluno;

class TestImprimirNotaComMockito {

    ImprimirNota imprimirNota;
    
	@BeforeEach
	public void init() {		
		Sigaa sigaaMock = Mockito.mock(Sigaa.class);		
		Mockito.when(sigaaMock.getMedia(5)).thenReturn(10.0);
		Aluno aluno = new Aluno();
		aluno.setMatricula(5);
		imprimirNota = new ImprimirNota(aluno, sigaaMock);
	}
	
	@Test
	void testPrint() {
		assertEquals("10.0 - 5",imprimirNota.print());		
	}

}
