package modularizacao.AOP.aula23;

import java.util.logging.Level;
import java.util.logging.Logger;

public aspect Logging {
	Logger logger = Logger.getAnonymousLogger();
	
	//pointcut call  captura a chamada a um método (antes do fluxo de execução passar para o controle do método chamado)
	pointcut pointOne() : call(void deposit(*));
	
	//pointcut execution captura o momento em que o controle de fluxo é passado para o método
	pointcut pointTwo(int index) : execution(boolean withdraw (..)) && args(index);

	after(): pointOne(){
		logger.log(Level.ALL, "deposit amount: ");
		System.out.println("AOP working");
	}
			
	before(int index): pointTwo(index){
		System.out.println("AOP antes do withdraw - Amount: "+index);
	}
}
