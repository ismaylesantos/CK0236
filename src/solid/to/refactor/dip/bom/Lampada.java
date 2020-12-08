package solid.to.refactor.dip.ruim;

public class Lampada {
	
	private boolean ligada;

	public boolean isLigada() {
		return ligada;
	}
	
	public void ligar() {
		System.out.println("Lâmpada ligada");
	}

	public void desligar() {
		System.out.println("Lâmpada desligada");
	}

}
