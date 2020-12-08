package solid.to.refactor.ocp.bom;

public class Fatura {
	
	private int numero;
	private boolean paga;
	
	public int getNumero() {
		return numero;
	}

	public boolean isPaga() {
		return paga;
	}

	public void setPaga(boolean paga) {
		this.paga = paga;
	}

}
