package modularizacao.abstractFactory.aula23;

public class Cliente {

	//Observe que o cliente referencia apenas as classes abstratas dos produtos A e B
	private ProdutoAbstratoA produtoA;
    private ProdutoAbstratoB produtoB;

    //Cliente tamb�m s� tem acesso a interface da F�brica
    Cliente(FabricaAbstrata fabrica) {
        produtoA = fabrica.createProdutoA();
        produtoB = fabrica.createProdutoB();
    }

    void executar() {
        produtoB.interagir(produtoA);
    }
    
}
