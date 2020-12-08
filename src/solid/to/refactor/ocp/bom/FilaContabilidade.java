package solid.to.refactor.ocp.bom;

public class FilaContabilidade {
	
	public void enviarParaFilaProcessamento(Fatura fatura) {
		System.out.println("Enviando fatura " + fatura.getNumero() + " para a fila de processamento...");
	}

}
