package solid.to.refactor.ocp.ruim;

public class GerenciadorFaturas {
	
	private FilaContabilidade filaContabilidade;
	private EnviadorEmail enviadorEmail;
	
	public void pagarFatura(Fatura fatura) {
		fatura.setPaga(true);
		
		filaContabilidade.enviarParaFilaProcessamento(fatura);
		enviadorEmail.enviar("email@email.com");
	}

}
