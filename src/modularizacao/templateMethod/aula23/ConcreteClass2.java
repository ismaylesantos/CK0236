package modularizacao.templateMethod.aula23;

public class ConcreteClass2 extends TemplateMethodClass{

	@Override
	protected void RequiredOperations1() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteClass2 says: Implemented Operation1");
	}
	
	@Override
	protected void RequiredOperations2() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteClass2 says: Implemented Operation2");
	}

	@Override
	protected void Hook1() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteClass2 says: Hook1 Operation1");
	}
	

}
