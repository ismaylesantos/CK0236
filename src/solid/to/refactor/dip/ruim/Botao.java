package solid.to.refactor.dip.ruim;

public class Botao {
	
	private Lampada lampada;
	
	public void acionar() {
		if (lampada.isLigada()) {
			lampada.desligar();
		} else {
			lampada.ligar();
		}
	}
	
}
