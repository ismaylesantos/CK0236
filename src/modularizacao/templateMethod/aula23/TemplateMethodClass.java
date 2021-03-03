package modularizacao.templateMethod.aula23;

public abstract class TemplateMethodClass {

	public void TemplateMethod() {
		 this.BaseOperation1();
	     this.RequiredOperations1();
	     this.BaseOperation2();
	     this.Hook1();
	     this.RequiredOperations2();
	     this.BaseOperation3();	     
	}

	protected void BaseOperation1(){
         System.out.println("AbstractClass says: I am doing the bulk of the work");
     }

	protected void BaseOperation2() {
		System.out.println("AbstractClass says: But I let subclasses override some operations");
	}

	protected void BaseOperation3() {
		System.out.println("AbstractClass says: But I am doing the bulk of the work anyway");
	}

	protected abstract void RequiredOperations1();
	
	protected abstract void RequiredOperations2();

	protected abstract void Hook1(); 

}
