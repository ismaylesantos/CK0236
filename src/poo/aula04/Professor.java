package poo.aula04;

public class Professor extends Funcionario implements Beneficios{

	@Override
	public void imprimirSetor() {
		System.out.println("Trabalha na doc�ncia ... ");
		
	}

	@Override
	public boolean temValeAlimenta��o() {
		return true;
	}

	@Override
	public boolean temPlanoSaude() {		
		return true;
	}

}
