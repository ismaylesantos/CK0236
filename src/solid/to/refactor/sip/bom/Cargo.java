package solid.to.refactor.sip.bom;

public enum Cargo {
    DBA(1.2),
	GERENTE(1.3),
	DESENVOLVEDOR(1.1);

	private double multiplicadorSalario;

	Cargo(double multiplicadorSalario) {
		this.multiplicadorSalario = multiplicadorSalario;
	}

	public double getMultiplicadorSalario() {
		return this.multiplicadorSalario;
	}
}