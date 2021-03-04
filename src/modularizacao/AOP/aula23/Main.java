package modularizacao.AOP.aula23;

public class Main {

	public static void main(String[] args) {
		Power2WithAOP power2withAOP = new Power2WithAOP();
		power2withAOP.deposit(3);
		
		power2withAOP.withdraw(2);
	}
}
