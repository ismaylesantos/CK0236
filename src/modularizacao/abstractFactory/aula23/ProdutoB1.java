package modularizacao.abstractFactory.aula23;

public class ProdutoB1 implements ProdutoAbstratoB {

    @Override
    public void interagir(ProdutoAbstratoA a) {
        System.out.println(this.getClass().getName() + " interage com " + a.getClass().getName());
    }

}
