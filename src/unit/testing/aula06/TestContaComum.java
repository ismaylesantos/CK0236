package unit.testing.aula06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import solid.to.refactor.lsp.ruim.ContaComum;



class TestContaComum {

	ContaComum conta;
	
	@BeforeEach
	public void init() {
		conta = new ContaComum();		
	}
	
	@Test
	public void testContaVazia() {		
		double saldo = conta.getSaldo();
		assertEquals(0.0, saldo);
	}
	
	@Test
	public void testDeposita() {
		conta.deposita(3.0);
		assertEquals(6.0, conta.getSaldo());
	}
	
	@Test
	public void testeRende() throws Exception {
		conta.deposita(5.0);
		conta.rende();
		double novoValor = 5.0 *1.1;
		assertEquals(novoValor, conta.getSaldo());
	}
	
	@Test
	public void testeRendeComException() throws Exception {
		Assert.assertThrows(Exception.class, () -> {
		conta.rende();
		});		
	}
}
