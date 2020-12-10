package poo.aula04;

//Classe abstrata
public abstract class Funcionario {
	
	private String nome;
	
	private String identificar;

	//M�todo abstrato para ser implementado na classe base
	public abstract void imprimirSetor();
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdentificar() {
		return identificar;
	}

	public void setIdentificar(String identificar) {
		this.identificar = identificar;
	}	
}
