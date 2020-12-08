package solid.to.refactor.sip.bom;

public class CalculadoraSalario implements ICalculadoraSalario {
    public double CalcularSalario(Funcionario funcionario) {
        return funcionario.getCargo().getMultiplicadorSalario() * funcionario.getSalarioBase();
    }
}