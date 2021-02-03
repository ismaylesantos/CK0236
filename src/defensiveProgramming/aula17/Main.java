package defensiveProgramming.aula17;

public class Main {
	
	
	public static void main(String[] args) {
				
		//1 - Exemplo de Verificação de Entradas  
		//Esse método que não verifica a entrada de forma adequada
		//fatorial(5);
		
		//2 - Exemplo de Asserções
		int num = 6;
		assert num > 0 : "Deveria ser maior que 0";
		
		//Asserção dentro do método
		System.out.println(divide(5, 1));
		
		
		ExemplosExceções exemplos = new ExemplosExceções();
		exemplos.chamaMetodosComExceção();
	  
	}
	
	//Exemplo de método com validação INEFICIENTE da entrada
	public static int fatorial(int num) {		
		if(num == 0)
			return 1;
		else
				return num * fatorial(num-1);
	}
	
	//Exemplo de método com asserção
	public static double divide(int num1, int num2) {
		assert num2 > 0 : "Deveria ser maior que 0";
		return num1/num2;
	}	
	
	
	

}
