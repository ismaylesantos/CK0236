package solid.to.refactor.lsp.ruim;

public class ContaDeEstudante extends Conta {	
	private int milhas;
	
	@Override
	public void deposita(double valor) {
		this.milhas += (int)valor;
		super.deposita(valor);
	}
	
	public int getMilhas() {
		return milhas;
	}	
	
}