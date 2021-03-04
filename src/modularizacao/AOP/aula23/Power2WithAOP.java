package modularizacao.AOP.aula23;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Power2WithAOP {
   int balance;
   
   void deposit (int amount) {	  
	   System.out.println("Executing Deposito");
	   balance = balance + amount;
   }
   
   boolean withdraw(int amount) {
	   System.out.println("Executing WithDraw");
	   if(balance-amount > 0) {
		   balance = balance - amount;
		   return true;
	   }else return false;
   }
   
}
