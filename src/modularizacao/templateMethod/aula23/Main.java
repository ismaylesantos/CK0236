package modularizacao.templateMethod.aula23;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Same client code can work with different subclasses:");
		 Client.ClientCode(new ConcreteClass1());
		 
		 System.out.println("Same client code can work with different subclasses:");
		 Client.ClientCode(new ConcreteClass2());
		 
	}	

}
