package debugging.aula10;

public class Main {

	public static void main(String[] args) {
		Soma soma = new Soma();
		int valorA = 2;
		int valorB = 5;
		int valorSoma = soma.soma(valorA, valorB);
		System.out.println(valorSoma);
	}
}
