package unit.testing.aula06;

public class MockUFC implements Sigaa{

	@Override
	public double getMedia(int matricula) {
		// Cálculo da Média da UFC
		// acesso a banco de dados etc..
		return 2*matricula;
	}

}
