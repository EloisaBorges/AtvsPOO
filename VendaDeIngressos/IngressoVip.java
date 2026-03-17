package VendaDeIngressos;

public class IngressoVip extends Ingresso {
    protected double taxaVip;

    public IngressoVip(double valorBase, double taxaVip) {
        super(valorBase);
        this.taxaVip = taxaVip;
    }

    @Override
    public double consultarValor() {
        return valorBase + taxaVip;
    }

    public void mostrarValoresAdicionais() {
        System.out.println("Taxa VIP adicional: R$ " + taxaVip);
    }
}