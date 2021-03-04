package modularizacao.AOP.aula23;

import java.util.logging.Level;
import java.util.logging.Logger;

public aspect Logging {
	Logger logger = Logger.getAnonymousLogger();
	
	//pointcut call  captura a chamada a um m�todo (antes do fluxo de execu��o passar para o controle do m�todo chamado)
	pointcut pointOne() : call(void deposit(*));
	
	//pointcut execution captura o momento em que o controle de fluxo � passado para o m�todo
	pointcut pointTwo(int index) : execution(boolean withdraw (..)) && args(index);

	after(): pointOne(){
		logger.log(Level.ALL, "deposit amount: ");
		System.out.println("AOP working");
	}
			
	before(int index): pointTwo(index){
		System.out.println("AOP antes do withdraw - Amount: "+index);
	}
}
