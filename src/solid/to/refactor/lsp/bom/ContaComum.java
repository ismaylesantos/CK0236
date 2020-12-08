package solid.to.refactor.lsp.ruim;

public class ContaComum extends Conta {
	public void rende() {
		double novoSaldo = super.saldo *= 1.1;
		super.setSaldo(novoSaldo);
	}
}
