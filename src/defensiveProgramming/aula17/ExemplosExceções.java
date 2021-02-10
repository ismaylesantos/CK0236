package defensiveProgramming.aula17;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.mockito.internal.debugging.LoggingListener;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExemplosExceções {

	public void chamaMetodosComExceção() {
		
		//1 - bloco try-catch
		/*try {
			// Chamando um método que dispara uma exceção
			metodoComExceção();
		} catch (FileNotFoundException e) {		
			// Tratamento da Exceção
			System.out.println("Arquivo não encontrado");
		} 
		*/
		
		//2 - bloco try-catch-finally
		/*
		try {
			metodoComNullPointException();	
		}catch (NullPointerException e) {
			// Tratamento da Exceção
			System.out.println("Exceção foi tratada");
		} finally {
			System.out.println("Sempre é executado");
		}
		*/
		
		//3 - Exceção que não é capturada
		exemploComExceçãoNãoCapturada();
		
		//4 - Catch vazio
		//exemploComCatchVazio();
	}
	
	public void metodoComExceção () throws FileNotFoundException {
		//Exemplo de método que pode retornar uma Exceção durante execução
		BufferedReader reader = new BufferedReader(new FileReader("C://local//naoexiste"));
	}
	
	public void metodoComNullPointException () {
		//Exemplo de método que pode retornar uma Exceção durante execução
		//throw new NullPointerException("exceção disparada");		
	}
	
	public void exemploComCatchVazio() {
		
		//Errado - catch bloco vazio
		try {
			//Código
		}catch (Exception e) {			
		}
		
		//Sugerido - tratar a exceção no bloco catch ou pelo menos registrar no log
		try {
			//Código
			throw new Exception();
		}catch (Exception e) {
			//Salvar no arquivo de Log a exceção			
			Logger logger = Logger.getAnonymousLogger();
			//logger.log(Level.SEVERE, "execeção grave");

			
			logger.log(Level.SEVERE, "execeção grave",e);			
		}
		
	}
	
	public void exemploComExceçãoNãoCapturada() {
		int[] vetor = new int[4];
		
		try {
			int i = vetor[4]; // vai disparar exceção
			
			System.out.println("Comandos dentro do bloco try");
		}catch (NullPointerException e) {
			System.out.println("Exceção capturada");
		} 
		
		System.out.println("Resto do Programa");
	}
	
}
