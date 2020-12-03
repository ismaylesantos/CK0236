package poo;

public class Professor extends Funcionario implements Beneficios{

	@Override
	public void imprimirSetor() {
		System.out.println("Trabalha na docência ... ");
		
	}

	@Override
	public boolean temValeAlimentação() {
		return true;
	}

	@Override
	public boolean temPlanoSaude() {		
		return true;
	}

}
