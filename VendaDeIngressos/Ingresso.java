package VendaDeIngressos;

public class Ingresso {
    protected double valorBase;

    public Ingresso(double valorBase) {
        this.valorBase = valorBase;
    }

    public double consultarValor() {
        return valorBase;
    }

    public void exibirInformacoes() {
        System.out.println("Tipo: Ingresso Padrão");
        System.out.println("Valor: R$ " + valorBase);
    }
}