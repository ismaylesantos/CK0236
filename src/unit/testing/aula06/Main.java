package unit.testing.aula06;

import poo.aula04.Aluno;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MockUFC ufc = new MockUFC();
		Aluno aluno1 = new Aluno();
		ImprimirNota impressora = new ImprimirNota(aluno1, ufc);
		impressora.print();
		System.out.println("ok");
				

	}

}
