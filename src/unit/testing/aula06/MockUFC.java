package unit.testing.aula06;

public class MockUFC implements Sigaa{

	@Override
	public double getMedia(int matricula) {
		// C�lculo da M�dia da UFC
		// acesso a banco de dados etc..
		return 2*matricula;
	}

}
