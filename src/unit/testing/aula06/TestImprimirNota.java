package unit.testing.aula06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import poo.aula04.Aluno;

class TestImprimirNota {

	ImprimirNota imprimirNota;
	
	@BeforeEach
	public void init() {
		MockUFC mock = new MockUFC();	
		Aluno aluno = new Aluno();
		aluno.setMatricula(5);
		imprimirNota = new ImprimirNota(aluno, mock);
	}
	
	@Test
	void testPrint() {
		assertEquals("10.0 - 5",imprimirNota.print());		
	}

}
