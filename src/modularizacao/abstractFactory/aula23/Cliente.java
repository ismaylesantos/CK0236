package modularizacao.abstractFactory.aula23;

public class Cliente {

	//Observe que o cliente referencia apenas as classes abstratas dos produtos A e B
	private ProdutoAbstratoA produtoA;
    private ProdutoAbstratoB produtoB;

    //Cliente também só tem acesso a interface da Fábrica
    Cliente(FabricaAbstrata fabrica) {
        produtoA = fabrica.createProdutoA();
        produtoB = fabrica.createProdutoB();
    }

    void executar() {
        produtoB.interagir(produtoA);
    }
    
}
