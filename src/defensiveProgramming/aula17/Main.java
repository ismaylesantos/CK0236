package defensiveProgramming.aula17;

public class Main {
	
	
	public static void main(String[] args) {
				
		//1 - Exemplo de Verifica��o de Entradas  
		//Esse m�todo que n�o verifica a entrada de forma adequada
		//fatorial(5);
		
		//2 - Exemplo de Asser��es
		int num = 6;
		assert num > 0 : "Deveria ser maior que 0";
		
		//Asser��o dentro do m�todo
		System.out.println(divide(5, 1));
		
		
		ExemplosExce��es exemplos = new ExemplosExce��es();
		exemplos.chamaMetodosComExce��o();
	  
	}
	
	//Exemplo de m�todo com valida��o INEFICIENTE da entrada
	public static int fatorial(int num) {		
		if(num == 0)
			return 1;
		else
				return num * fatorial(num-1);
	}
	
	//Exemplo de m�todo com asser��o
	public static double divide(int num1, int num2) {
		assert num2 > 0 : "Deveria ser maior que 0";
		return num1/num2;
	}	
	
	
	

}
