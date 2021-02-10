package defensiveProgramming.aula17;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.mockito.internal.debugging.LoggingListener;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExemplosExce��es {

	public void chamaMetodosComExce��o() {
		
		//1 - bloco try-catch
		/*try {
			// Chamando um m�todo que dispara uma exce��o
			metodoComExce��o();
		} catch (FileNotFoundException e) {		
			// Tratamento da Exce��o
			System.out.println("Arquivo n�o encontrado");
		} 
		*/
		
		//2 - bloco try-catch-finally
		/*
		try {
			metodoComNullPointException();	
		}catch (NullPointerException e) {
			// Tratamento da Exce��o
			System.out.println("Exce��o foi tratada");
		} finally {
			System.out.println("Sempre � executado");
		}
		*/
		
		//3 - Exce��o que n�o � capturada
		exemploComExce��oN�oCapturada();
		
		//4 - Catch vazio
		//exemploComCatchVazio();
	}
	
	public void metodoComExce��o () throws FileNotFoundException {
		//Exemplo de m�todo que pode retornar uma Exce��o durante execu��o
		BufferedReader reader = new BufferedReader(new FileReader("C://local//naoexiste"));
	}
	
	public void metodoComNullPointException () {
		//Exemplo de m�todo que pode retornar uma Exce��o durante execu��o
		//throw new NullPointerException("exce��o disparada");		
	}
	
	public void exemploComCatchVazio() {
		
		//Errado - catch bloco vazio
		try {
			//C�digo
		}catch (Exception e) {			
		}
		
		//Sugerido - tratar a exce��o no bloco catch ou pelo menos registrar no log
		try {
			//C�digo
			throw new Exception();
		}catch (Exception e) {
			//Salvar no arquivo de Log a exce��o			
			Logger logger = Logger.getAnonymousLogger();
			//logger.log(Level.SEVERE, "exece��o grave");

			
			logger.log(Level.SEVERE, "exece��o grave",e);			
		}
		
	}
	
	public void exemploComExce��oN�oCapturada() {
		int[] vetor = new int[4];
		
		try {
			int i = vetor[4]; // vai disparar exce��o
			
			System.out.println("Comandos dentro do bloco try");
		}catch (NullPointerException e) {
			System.out.println("Exce��o capturada");
		} 
		
		System.out.println("Resto do Programa");
	}
	
}
