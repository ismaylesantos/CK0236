package unit.testing.aula06;

import poo.aula04.Aluno;

//aula 06
public class ImprimirNota {

	Sigaa sigaa;
	
	Aluno aluno = new Aluno();
	
	public ImprimirNota(Aluno aluno, Sigaa sigaa) {
		this.aluno = aluno;
		this.sigaa = sigaa;
	}
	
	public String print() {
		return new String(sigaa.getMedia(aluno.getMatricula()) +" - "+ aluno.getMatricula());
	}; 		
	
}
