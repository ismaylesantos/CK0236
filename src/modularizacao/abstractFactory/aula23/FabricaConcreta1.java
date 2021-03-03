package modularizacao.abstractFactory.aula23;

public class FabricaConcreta1 implements FabricaAbstrata{
	
	@Override
    public ProdutoAbstratoA createProdutoA() {
        return new ProdutoA1();
    }
    @Override
    public ProdutoAbstratoB createProdutoB() {
        return new ProdutoB1();
    }
}
