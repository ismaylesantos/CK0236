package modularizacao.AOP.aula23;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Power {
   int balance;
   Logger logger = Logger.getAnonymousLogger();
   
   void deposit (int amount) {
	   logger.log(Level.ALL, "deposit amount: "+ amount);
	   balance = balance + amount;
   }
   
   boolean withdraw(int amount) {
	   logger.log(Level.ALL, "withdraw amount: "+ amount);
	   if(balance-amount > 0) {
		   balance = balance - amount;
		   return true;
	   }else return false;
   }
   
}
