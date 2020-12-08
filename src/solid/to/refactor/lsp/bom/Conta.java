

public class Conta {
    	
	protected double saldo;
	
	public ContaComum() {
		this.saldo = 0;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
