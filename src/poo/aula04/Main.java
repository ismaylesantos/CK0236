package poo.aula04;

public class Main {

	public static void main(String[] args) {
					
		Aluno aluno  = new Aluno();
		
		//fun��o da super classe - Pessoa
		aluno.setNome("Ana Maria");
		//fun��o da classe Aluno
		aluno.setMatricula(234);
		
		
		Funcionario analista = new Analista();
		analista.setNome("Rafael");
		analista.imprimirSetor();
		
		Funcionario professor = new Professor();
		professor.setNome("Lara");
		professor.imprimirSetor();
		
	}
}
