package solid.to.refactor.lsp.ruim;

public class ContaComum {
	
	protected double saldo;
	
	public ContaComum() {
		this.saldo = 0;
	}
	
	public void deposita(double valor) {
		if (valor >= 5.0)			 
			this.saldo += valor;
		else
			this.saldo += 2*valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void rende() throws Exception {
		if(saldo <= 0.0) {
			throw new Exception("valor menor ou igual a 0");
		}		
		this.saldo *= 1.1;
	}
}
